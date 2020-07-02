// Generated from StrLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import static java.lang.System.*;
import java.util.Scanner;

/**
 * This class provides an empty implementation of {@link StrLangVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <String> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class StrLangExecute extends StrLangBaseVisitor<String>{

	private Scanner input = new Scanner(in);

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitMain(StrLangParser.MainContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitInstruction(StrLangParser.InstructionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitPrint(StrLangParser.PrintContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitDeclaration(StrLangParser.DeclarationContext ctx) { 
		String res = visit(ctx.expression());
		String id = ctx.ID().getText();

		StrLangParser.symbolTable.put(id, res);

		return res;

	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitExprStr(StrLangParser.ExprStrContext ctx) { 
		String res = ctx.STRING().getText();
		return res.substring(1,res.length()-1);
	
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitExprVar(StrLangParser.ExprVarContext ctx) { 
		String id = ctx.ID().getText();
		StrLangParser.symbolTable.get(id);
	
	}
}