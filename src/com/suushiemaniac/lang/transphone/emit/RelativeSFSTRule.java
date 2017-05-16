package com.suushiemaniac.lang.transphone.emit;

import java.util.Map;

public class RelativeSFSTRule implements SFSTRule {
	protected SFSTRule referenceRule;

	public RelativeSFSTRule(SFSTRule referenceRule) {
		this.referenceRule = referenceRule;
	}

	@Override
	public String toTransducerString(Map<SFSTRule, String> symbolTable) {
		return symbolTable.get(this.referenceRule);
	}
}
