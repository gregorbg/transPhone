package com.suushiemaniac.lang.transphone.emit;

import java.util.Map;

public class AbsoluteSFSTRule implements SFSTRule {
	public static boolean isRegExp(String expression) {
		return expression.matches("((\\[\\S+])|\\.)[+*?]?\\??");
	}

	public static String mask(String content) {
		return content.length() == 0 ? "<>" : content.replace("^", "\\^").replace("#", "\\ ");
	}

	protected String from;
	protected String to;

	public AbsoluteSFSTRule(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public AbsoluteSFSTRule(String identity) {
		this(identity, identity);
	}

	public String getMaskedFrom() {
		return mask(this.from);
	}

	public String getMaskedTo() {
		return mask(this.to);
	}

	@Override
	public String toTransducerString(Map<SFSTRule, String> symbolTable) {
		String from = this.from.length() > 1 && !this.from.equals("<>") && !AbsoluteSFSTRule.isRegExp(this.from) ? "{" + this.getMaskedFrom() + "}" : this.getMaskedFrom();
		String to = this.to.length() > 1 && !this.to.equals("<>") && !AbsoluteSFSTRule.isRegExp(this.to) ? "{" + this.getMaskedTo() + "}" : this.getMaskedTo();

		return from.equals(to) ? from : from + ":" + to;
	}
}
