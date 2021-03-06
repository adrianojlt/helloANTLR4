// Generated from C:/Users/adrianot/git/antlr/src\CSV.g4 by ANTLR 4.6
package pt.adrz.antlr4.csv;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSVParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSVVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CSVParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(CSVParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(CSVParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link CSVParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(CSVParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CSVParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(CSVParser.EmptyContext ctx);
}