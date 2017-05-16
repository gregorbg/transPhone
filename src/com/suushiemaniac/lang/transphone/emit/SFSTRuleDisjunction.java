package com.suushiemaniac.lang.transphone.emit;

import java.util.Arrays;
import java.util.List;

public class SFSTRuleDisjunction extends ListedSFSTRule {
	public SFSTRuleDisjunction(List<SFSTRule> alternatives) {
		super(alternatives, " | ");
	}

	public SFSTRuleDisjunction(SFSTRule... alternatives) {
		this(Arrays.asList(alternatives));
	}
}
