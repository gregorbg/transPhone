package com.suushiemaniac.lang.transphone.parse;

import com.suushiemaniac.lang.transphone.grammar.GenerativePhonologyBaseVisitor;
import com.suushiemaniac.lang.transphone.grammar.GenerativePhonologyLexer;
import com.suushiemaniac.lang.transphone.grammar.GenerativePhonologyParser;
import com.suushiemaniac.lang.transphone.model.GenPhonRule;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.stream.Collectors;

public class GenPhonRuleReader extends GenerativePhonologyBaseVisitor<GenPhonRule> {
	protected GenPhonContextReader contextReader;

	public GenPhonRuleReader() {
		this.contextReader = new GenPhonContextReader();
	}

	public GenPhonRule parse(String input) {
		GenerativePhonologyLexer lexer = new GenerativePhonologyLexer(CharStreams.fromString(input));
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		GenerativePhonologyParser parser = new GenerativePhonologyParser(tokens);
		ParseTree tree = parser.transposition();

		return this.visit(tree);
	}

	@Override
	public GenPhonRule visitUnilateral(GenerativePhonologyParser.UnilateralContext ctx) {
		return new GenPhonRule(
				ctx.in().getText(),
				ctx.out().getText(),
				this.contextReader.visit(ctx.fullCtx().ctxPart(0)),
				this.contextReader.visit(ctx.fullCtx().ctxPart(1)),
				false
		);
	}

	@Override
	public GenPhonRule visitBilateral(GenerativePhonologyParser.BilateralContext ctx) {
		return new GenPhonRule(
				ctx.in().getText(),
				ctx.out().getText(),
				this.contextReader.visit(ctx.ctxPart(0)),
				this.contextReader.visit(ctx.ctxPart(1)),
				true
		);
	}
}