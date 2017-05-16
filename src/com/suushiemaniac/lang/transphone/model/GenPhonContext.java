package com.suushiemaniac.lang.transphone.model;

public class GenPhonContext {
	public String mask(String input) {
		return input.replace("#", "\\b");
	}

	protected String pattern;

	public GenPhonContext(String pattern) {
		this.pattern = pattern;
	}

	public String getPattern() {
		return pattern;
	}

	public String getRegExp() {
		return mask(this.getPattern());
	}

	public boolean matches(String input) {
		return input.matches(this.getRegExp());
	}
}
