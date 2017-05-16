package com.suushiemaniac.lang.transphone.model;

public class GenPhonRule {
	protected String from;
	protected String to;

	protected GenPhonContext leftContext;
	protected GenPhonContext rightContext;

	protected boolean isBilateral;

	public GenPhonRule(String from, String to, GenPhonContext leftContext, GenPhonContext rightContext, boolean isBilateral) {
		this.from = from;
		this.to = to;

		this.leftContext = leftContext;
		this.rightContext = rightContext;

		this.isBilateral = isBilateral;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public GenPhonContext getLeftContext() {
		return leftContext;
	}

	public GenPhonContext getRightContext() {
		return rightContext;
	}

	public boolean isBilateral() {
		return isBilateral;
	}

	public String apply(String input) {
		StringBuilder output = new StringBuilder();
		String[] parts = input.split("");

		for (int i = 0; i < parts.length; i++) {
			if (parts[i].equals(this.getFrom())) {
				if (i > 0 && this.getLeftContext().matches(parts[i - 1])
						&& (i < parts.length - 1 && this.getRightContext().matches(parts[i + 1]))
							|| (i == parts.length - 1 && this.getRightContext().getPattern().equals("#"))) {
					output.append(this.getTo());
				}
			} else if (!parts[i].equals("^")) {
				output.append(parts[i]);
			}
		}

		return output.toString();
	}
}
