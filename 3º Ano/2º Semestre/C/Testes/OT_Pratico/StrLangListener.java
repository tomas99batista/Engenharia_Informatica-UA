// Generated from StrLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StrLangParser}.
 */
public interface StrLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StrLangParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(StrLangParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(StrLangParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrLangParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(StrLangParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(StrLangParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(StrLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(StrLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(StrLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(StrLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprStr(StrLangParser.ExprStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprStr(StrLangParser.ExprStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(StrLangParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(StrLangParser.ExprVarContext ctx);
}