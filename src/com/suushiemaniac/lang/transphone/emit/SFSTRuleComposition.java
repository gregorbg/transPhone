package com.suushiemaniac.lang.transphone.emit;

import java.util.Arrays;
import java.util.List;

public class SFSTRuleComposition extends ListedSFSTRule {
	public SFSTRuleComposition(List<SFSTRule> composites) {
		super(composites, " || ");
	}

	public SFSTRuleComposition(SFSTRule... composites) {
		this(Arrays.asList(composites));
	}
}
