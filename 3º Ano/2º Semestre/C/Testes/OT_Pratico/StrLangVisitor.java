// Generated from StrLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StrLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StrLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StrLangParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(StrLangParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrLangParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(StrLangParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(StrLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(StrLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStr(StrLangParser.ExprStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(StrLangParser.ExprVarContext ctx);
}