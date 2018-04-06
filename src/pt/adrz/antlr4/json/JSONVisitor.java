// Generated from C:/Users/adrianot/git/antlr/src\JSON.g4 by ANTLR 4.6
package pt.adrz.antlr4.json;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JSONParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraynotempty}
	 * labeled alternative in {@link JSONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraynotempty(JSONParser.ArraynotemptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayempty}
	 * labeled alternative in {@link JSONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayempty(JSONParser.ArrayemptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(JSONParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectempty}
	 * labeled alternative in {@link JSONParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectempty(JSONParser.ObjectemptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectnotempty}
	 * labeled alternative in {@link JSONParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectnotempty(JSONParser.ObjectnotemptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(JSONParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(JSONParser.KeyContext ctx);
}