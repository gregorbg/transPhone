package com.suushiemaniac.lang.transphone.emit;

import java.util.Map;

public interface SFSTRule {
	String toTransducerString(Map<SFSTRule, String> symbolTable);
}
