// Generated from StrLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link StrLangVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <Boolean> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
// boolean -> T (ha erros semanticos) F (ha erros)
public class StrLangSemCheck extends StrLangBaseVisitor<Boolean> {

	public void resetError(){
		error = false;
	}

	public boolean error(){
		return error;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitMain(StrLangParser.MainContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitInstruction(StrLangParser.InstructionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitPrint(StrLangParser.PrintContext ctx) { 
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitDeclaration(StrLangParser.DeclarationContext ctx) { 
		boolean res = visit(ctx.expression());
		if(!res){ // se usar uma var que nao existe
			String id = ctx.ID().getText();
			if(StrLangParser.symbolTable.exists(id)){
				err.println("ERROR: name " + id + " already exist.");
				res = false;
			}
			else{
				StrLangParser.symbolTable.put(id);
			}
			
		}
		return res;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitExprStr(StrLangParser.ExprStrContext ctx) { return true; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitExprVar(StrLangParser.ExprVarContext ctx) { 
		boolean res;
		String id = ctx.ID().getText();
		res = StrLangParser.symbolTable.exists(id);

		if(!res){
			err.println("ERROR: var " + id + " does no exist.");
			res = false;
		}

		return res;
	}

	@Override public Boolean visitExprInput(StrLangParser.ExprInputContext ctx) { 

		String prompt = visit(ctx.expression());
		out.println(prompt);

		return true;
	}
}