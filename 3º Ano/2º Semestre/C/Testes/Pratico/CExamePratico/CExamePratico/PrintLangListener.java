// Generated from PrintLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrintLangParser}.
 */
public interface PrintLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrintLangParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(PrintLangParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrintLangParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(PrintLangParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrintLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PrintLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrintLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PrintLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrintLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PrintLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrintLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PrintLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrintLangParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(PrintLangParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrintLangParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(PrintLangParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrintLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PrintLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrintLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PrintLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrintLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(PrintLangParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrintLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(PrintLangParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrintLangParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcat(PrintLangParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrintLangParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcat(PrintLangParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrintLangParser#replace}.
	 * @param ctx the parse tree
	 */
	void enterReplace(PrintLangParser.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrintLangParser#replace}.
	 * @param ctx the parse tree
	 */
	void exitReplace(PrintLangParser.ReplaceContext ctx);
}