// Generated from C:/Users/adrianot/git/antlr/src\JSON.g4 by ANTLR 4.6
package pt.adrz.antlr4.json.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSONParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSONParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraynotempty}
	 * labeled alternative in {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArraynotempty(JSONParser.ArraynotemptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraynotempty}
	 * labeled alternative in {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArraynotempty(JSONParser.ArraynotemptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayempty}
	 * labeled alternative in {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayempty(JSONParser.ArrayemptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayempty}
	 * labeled alternative in {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayempty(JSONParser.ArrayemptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(JSONParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(JSONParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectempty}
	 * labeled alternative in {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectempty(JSONParser.ObjectemptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectempty}
	 * labeled alternative in {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectempty(JSONParser.ObjectemptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectnotempty}
	 * labeled alternative in {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectnotempty(JSONParser.ObjectnotemptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectnotempty}
	 * labeled alternative in {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectnotempty(JSONParser.ObjectnotemptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JSONParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JSONParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(JSONParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(JSONParser.KeyContext ctx);
}