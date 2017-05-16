package com.suushiemaniac.lang.transphone.emit;

import com.suushiemaniac.lang.transphone.model.GenPhonRule;

import java.util.*;
import java.util.stream.Collectors;

public class StuttgartFiniteStateTransducer {
	public static final String SFST_ALPHABET = "[a-zäöüßA-ZÄÖÜ]";

	public static StuttgartFiniteStateTransducer from(GenPhonRule genPhon) {
		List<SFSTRule> rules = new ArrayList<>();
		Map<SFSTRule, String> symbolTable = new HashMap<>();

		SFSTRule alphabet = new AbsoluteSFSTRule(SFST_ALPHABET);
		rules.add(alphabet);
		symbolTable.put(alphabet, "ALPHABET");

		SFSTRule defaultMorph = new AbsoluteSFSTRule("^", "");
		rules.add(defaultMorph);
		symbolTable.put(defaultMorph, "$default_morpheme_bounds$");

		SFSTRule defaultRule = new SFSTRuleDisjunction(new ModifierSFSTRule(new AbsoluteSFSTRule("."), "*"), new RelativeSFSTRule(defaultMorph));
		rules.add(defaultRule);
		symbolTable.put(defaultRule, "$default$");

		SFSTRule replacementCore = new AbsoluteSFSTRule(genPhon.getFrom(), genPhon.getTo());
		SFSTRule innerReplacement = new SFSTRuleConcatenation(
				new AbsoluteSFSTRule(genPhon.getLeftContext().getPattern()),
				replacementCore,
				new AbsoluteSFSTRule(genPhon.getRightContext().getPattern())
		);
		SFSTRule replacement = SFSTRuleConcatenation.wrapAny(innerReplacement);
		rules.add(replacement);
		symbolTable.put(replacement, "$gen_phon_replace$");

		return new StuttgartFiniteStateTransducer(
				rules,
				symbolTable,
				new SFSTRuleDisjunction(new RelativeSFSTRule(replacement), new RelativeSFSTRule(defaultRule))
		);
	}

	protected List<SFSTRule> rules;
	protected Map<SFSTRule, String> symbolTable;

	protected SFSTRule startRule;

	public StuttgartFiniteStateTransducer(List<SFSTRule> rules, Map<SFSTRule, String> symbolTable, SFSTRule startRule) {
		this.rules = rules;
		this.symbolTable = symbolTable;
		this.startRule = startRule;
	}

	public List<SFSTRule> getRules() {
		return rules;
	}

	public Map<SFSTRule, String> getSymbolTable() {
		return symbolTable;
	}

	public SFSTRule getStartRule() {
		return startRule;
	}

	@Override
	public String toString() {
		String sfst = String.join("\n\n", this.getRules().stream()
				.map(r -> this.getSymbolTable().get(r) + " = " + r.toTransducerString(this.getSymbolTable()))
				.collect(Collectors.toList())) +
					"\n\n\n" +
				this.getStartRule().toTransducerString(this.symbolTable);

		return sfst.trim();
	}
}
