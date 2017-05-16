package com.suushiemaniac.lang.transphone.emit;

import java.util.Map;

public class ModifierSFSTRule implements SFSTRule {
	protected SFSTRule base;
	protected String modifier;

	public ModifierSFSTRule(SFSTRule base, String modifier) {
		this.base = base;
		this.modifier = modifier;
	}

	@Override
	public String toTransducerString(Map<SFSTRule, String> symbolTable) {
		return (this.base instanceof ListedSFSTRule
				? "(" + this.base.toTransducerString(symbolTable) + ")"
				: this.base.toTransducerString(symbolTable))
				+ this.modifier;
	}
}
