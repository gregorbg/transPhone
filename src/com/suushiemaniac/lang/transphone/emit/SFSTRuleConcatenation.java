package com.suushiemaniac.lang.transphone.emit;

import java.util.Arrays;
import java.util.List;

public class SFSTRuleConcatenation extends ListedSFSTRule {
	public static SFSTRuleConcatenation wrapAny(SFSTRule rule) {
		return new SFSTRuleConcatenation(
				new ModifierSFSTRule(new AbsoluteSFSTRule("."), "*"),
				rule,
				new ModifierSFSTRule(new AbsoluteSFSTRule("."), "*")
		);
	}

	public SFSTRuleConcatenation(List<SFSTRule> rules) {
		super(rules, " ");
	}

	public SFSTRuleConcatenation(SFSTRule... rules) {
		this(Arrays.asList(rules));
	}
}