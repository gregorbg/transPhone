// Generated from /jvdocs/transPhone/src/com/suushiemaniac/lang/transphone/grammar/res/antlr/GenerativePhonology.g4 by ANTLR 4.7
package com.suushiemaniac.lang.transphone.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GenerativePhonologyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GenerativePhonologyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code unilateral}
	 * labeled alternative in {@link GenerativePhonologyParser#transposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnilateral(GenerativePhonologyParser.UnilateralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bilateral}
	 * labeled alternative in {@link GenerativePhonologyParser#transposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBilateral(GenerativePhonologyParser.BilateralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenerativePhonologyParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(GenerativePhonologyParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenerativePhonologyParser#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(GenerativePhonologyParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenerativePhonologyParser#phoneme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhoneme(GenerativePhonologyParser.PhonemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenerativePhonologyParser#fullCtx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullCtx(GenerativePhonologyParser.FullCtxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenerativePhonologyParser#ctxPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtxPart(GenerativePhonologyParser.CtxPartContext ctx);
}