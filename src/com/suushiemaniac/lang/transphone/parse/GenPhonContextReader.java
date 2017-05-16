package com.suushiemaniac.lang.transphone.parse;

import com.suushiemaniac.lang.transphone.grammar.GenerativePhonologyBaseVisitor;
import com.suushiemaniac.lang.transphone.grammar.GenerativePhonologyParser;
import com.suushiemaniac.lang.transphone.model.GenPhonContext;

public class GenPhonContextReader extends GenerativePhonologyBaseVisitor<GenPhonContext> {
	@Override
	public GenPhonContext visitCtxPart(GenerativePhonologyParser.CtxPartContext ctx) {
		return new GenPhonContext(ctx.getText());
	}
}
