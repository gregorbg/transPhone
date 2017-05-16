// Generated from /jvdocs/transPhone/src/com/suushiemaniac/lang/transphone/grammar/res/antlr/GenerativePhonology.g4 by ANTLR 4.7
package com.suushiemaniac.lang.transphone.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GenerativePhonologyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BR_LEFT=1, BR_RIGHT=2, RANGE_BR_LEFT=3, RANGE_BR_RIGHT=4, PHONEME_BR_LEFT_RIGHT=5, 
		MAPS=6, IF=7, IFF=8, LETTER=9, PHONEME=10, INPUT=11, WORD_BORDER=12, MORPH_BORDER=13, 
		EMPTY=14, WHITESPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BR_LEFT", "BR_RIGHT", "RANGE_BR_LEFT", "RANGE_BR_RIGHT", "PHONEME_BR_LEFT_RIGHT", 
		"MAPS", "IF", "IFF", "LETTER", "PHONEME", "INPUT", "WORD_BORDER", "MORPH_BORDER", 
		"EMPTY", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'['", "']'", "'/'", "':'", null, null, null, null, 
		null, "'#'", "'^'", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BR_LEFT", "BR_RIGHT", "RANGE_BR_LEFT", "RANGE_BR_RIGHT", "PHONEME_BR_LEFT_RIGHT", 
		"MAPS", "IF", "IFF", "LETTER", "PHONEME", "INPUT", "WORD_BORDER", "MORPH_BORDER", 
		"EMPTY", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GenerativePhonologyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GenerativePhonology.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21S\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\66\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t>\n\t\3\n\3\n\3\13\3\13\3\f\6\fE\n\f\r\f"+
		"\16\fF\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\2\2\21\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"\3\2\5\13\2C\\c|\u00c6\u00c6\u00d8\u00d8\u00de\u00de\u00e1\u00e1\u00e6"+
		"\u00e6\u00f8\u00f8\u00fe\u00fe\23\2kk\u00e9\u00e9\u00f2\u00f2\u00fa\u00fa"+
		"\u014d\u014d\u0155\u0155\u0252\u0252\u0256\u0256\u025b\u025b\u025d\u025d"+
		"\u026c\u026c\u0285\u0285\u028c\u028c\u0291\u0291\u0294\u0294\u0296\u0296"+
		"\u03ba\u03ba\4\2\13\f\"\"\2W\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3"+
		"\2\2\2\17\65\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27D\3\2\2\2\31"+
		"H\3\2\2\2\33J\3\2\2\2\35L\3\2\2\2\37O\3\2\2\2!\"\7*\2\2\"\4\3\2\2\2#$"+
		"\7+\2\2$\6\3\2\2\2%&\7]\2\2&\b\3\2\2\2\'(\7_\2\2(\n\3\2\2\2)*\7\61\2\2"+
		"*\f\3\2\2\2+,\7<\2\2,\16\3\2\2\2-\66\5\13\6\2./\7?\2\2/\66\7@\2\2\60\61"+
		"\7/\2\2\61\66\7@\2\2\62\63\7`\2\2\63\64\7/\2\2\64\66\7@\2\2\65-\3\2\2"+
		"\2\65.\3\2\2\2\65\60\3\2\2\2\65\62\3\2\2\2\66\20\3\2\2\2\678\7>\2\289"+
		"\7/\2\29>\7@\2\2:;\7>\2\2;<\7?\2\2<>\7@\2\2=\67\3\2\2\2=:\3\2\2\2>\22"+
		"\3\2\2\2?@\t\2\2\2@\24\3\2\2\2AB\t\3\2\2B\26\3\2\2\2CE\7a\2\2DC\3\2\2"+
		"\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\30\3\2\2\2HI\7%\2\2I\32\3\2\2\2JK\7"+
		"`\2\2K\34\3\2\2\2LM\7>\2\2MN\7@\2\2N\36\3\2\2\2OP\t\4\2\2PQ\3\2\2\2QR"+
		"\b\20\2\2R \3\2\2\2\6\2\65=F\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}