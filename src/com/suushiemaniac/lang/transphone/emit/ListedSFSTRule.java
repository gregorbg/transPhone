package com.suushiemaniac.lang.transphone.emit;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class ListedSFSTRule implements SFSTRule {
	protected List<SFSTRule> components;
	protected String join;

	protected ListedSFSTRule(List<SFSTRule> components, String join) {
		this.components = components;
		this.join = join;
	}

	@Override
	public String toTransducerString(Map<SFSTRule, String> symbolTable) {
		return String.join(this.join, this.components
				.stream().map(r -> r instanceof ListedSFSTRule ? "(" + r.toTransducerString(symbolTable) + ")" : r.toTransducerString(symbolTable))
				.collect(Collectors.toList()));
	}
}
