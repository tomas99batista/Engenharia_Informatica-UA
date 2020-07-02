// Generated from Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code greetingsMain}
	 * labeled alternative in {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void enterGreetingsMain(HelloParser.GreetingsMainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greetingsMain}
	 * labeled alternative in {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void exitGreetingsMain(HelloParser.GreetingsMainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code byeMain}
	 * labeled alternative in {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void enterByeMain(HelloParser.ByeMainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code byeMain}
	 * labeled alternative in {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void exitByeMain(HelloParser.ByeMainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greeting}
	 * labeled alternative in {@link HelloParser#greetings}.
	 * @param ctx the parse tree
	 */
	void enterGreeting(HelloParser.GreetingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greeting}
	 * labeled alternative in {@link HelloParser#greetings}.
	 * @param ctx the parse tree
	 */
	void exitGreeting(HelloParser.GreetingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodbye}
	 * labeled alternative in {@link HelloParser#bye}.
	 * @param ctx the parse tree
	 */
	void enterGoodbye(HelloParser.GoodbyeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodbye}
	 * labeled alternative in {@link HelloParser#bye}.
	 * @param ctx the parse tree
	 */
	void exitGoodbye(HelloParser.GoodbyeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code name}
	 * labeled alternative in {@link HelloParser#names}.
	 * @param ctx the parse tree
	 */
	void enterName(HelloParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code name}
	 * labeled alternative in {@link HelloParser#names}.
	 * @param ctx the parse tree
	 */
	void exitName(HelloParser.NameContext ctx);
}