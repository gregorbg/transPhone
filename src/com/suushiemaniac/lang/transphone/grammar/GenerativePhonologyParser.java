// Generated from /jvdocs/transPhone/src/com/suushiemaniac/lang/transphone/grammar/res/antlr/GenerativePhonology.g4 by ANTLR 4.7
package com.suushiemaniac.lang.transphone.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GenerativePhonologyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BR_LEFT=1, BR_RIGHT=2, RANGE_BR_LEFT=3, RANGE_BR_RIGHT=4, PHONEME_BR_LEFT_RIGHT=5, 
		MAPS=6, IF=7, IFF=8, LETTER=9, PHONEME=10, INPUT=11, WORD_BORDER=12, MORPH_BORDER=13, 
		EMPTY=14, WHITESPACE=15;
	public static final int
		RULE_transposition = 0, RULE_in = 1, RULE_out = 2, RULE_phoneme = 3, RULE_fullCtx = 4, 
		RULE_ctxPart = 5;
	public static final String[] ruleNames = {
		"transposition", "in", "out", "phoneme", "fullCtx", "ctxPart"
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

	@Override
	public String getGrammarFileName() { return "GenerativePhonology.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GenerativePhonologyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranspositionContext extends ParserRuleContext {
		public TranspositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transposition; }
	 
		public TranspositionContext() { }
		public void copyFrom(TranspositionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BilateralContext extends TranspositionContext {
		public List<TerminalNode> BR_LEFT() { return getTokens(GenerativePhonologyParser.BR_LEFT); }
		public TerminalNode BR_LEFT(int i) {
			return getToken(GenerativePhonologyParser.BR_LEFT, i);
		}
		public List<CtxPartContext> ctxPart() {
			return getRuleContexts(CtxPartContext.class);
		}
		public CtxPartContext ctxPart(int i) {
			return getRuleContext(CtxPartContext.class,i);
		}
		public List<TerminalNode> BR_RIGHT() { return getTokens(GenerativePhonologyParser.BR_RIGHT); }
		public TerminalNode BR_RIGHT(int i) {
			return getToken(GenerativePhonologyParser.BR_RIGHT, i);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public TerminalNode IFF() { return getToken(GenerativePhonologyParser.IFF, 0); }
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public BilateralContext(TranspositionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenerativePhonologyVisitor ) return ((GenerativePhonologyVisitor<? extends T>)visitor).visitBilateral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnilateralContext extends TranspositionContext {
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public TerminalNode MAPS() { return getToken(GenerativePhonologyParser.MAPS, 0); }
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public TerminalNode IF() { return getToken(GenerativePhonologyParser.IF, 0); }
		public FullCtxContext fullCtx() {
			return getRuleContext(FullCtxContext.class,0);
		}
		public UnilateralContext(TranspositionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenerativePhonologyVisitor ) return ((GenerativePhonologyVisitor<? extends T>)visitor).visitUnilateral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranspositionContext transposition() throws RecognitionException {
		TranspositionContext _localctx = new TranspositionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_transposition);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PHONEME_BR_LEFT_RIGHT:
			case LETTER:
			case MORPH_BORDER:
			case EMPTY:
				_localctx = new UnilateralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				in();
				setState(13);
				match(MAPS);
				setState(14);
				out();
				setState(15);
				match(IF);
				setState(16);
				fullCtx();
				}
				break;
			case BR_LEFT:
				_localctx = new BilateralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(BR_LEFT);
				setState(19);
				ctxPart();
				setState(20);
				match(BR_RIGHT);
				setState(21);
				in();
				setState(22);
				match(IFF);
				setState(23);
				out();
				setState(24);
				match(BR_LEFT);
				setState(25);
				ctxPart();
				setState(26);
				match(BR_RIGHT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InContext extends ParserRuleContext {
		public PhonemeContext phoneme() {
			return getRuleContext(PhonemeContext.class,0);
		}
		public TerminalNode LETTER() { return getToken(GenerativePhonologyParser.LETTER, 0); }
		public TerminalNode MORPH_BORDER() { return getToken(GenerativePhonologyParser.MORPH_BORDER, 0); }
		public TerminalNode EMPTY() { return getToken(GenerativePhonologyParser.EMPTY, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenerativePhonologyVisitor ) return ((GenerativePhonologyVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_in);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PHONEME_BR_LEFT_RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				phoneme();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(LETTER);
				}
				break;
			case MORPH_BORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(MORPH_BORDER);
				}
				break;
			case EMPTY:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(EMPTY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutContext extends ParserRuleContext {
		public PhonemeContext phoneme() {
			return getRuleContext(PhonemeContext.class,0);
		}
		public TerminalNode LETTER() { return getToken(GenerativePhonologyParser.LETTER, 0); }
		public TerminalNode MORPH_BORDER() { return getToken(GenerativePhonologyParser.MORPH_BORDER, 0); }
		public TerminalNode EMPTY() { return getToken(GenerativePhonologyParser.EMPTY, 0); }
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenerativePhonologyVisitor ) return ((GenerativePhonologyVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_out);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PHONEME_BR_LEFT_RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				phoneme();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(LETTER);
				}
				break;
			case MORPH_BORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(MORPH_BORDER);
				}
				break;
			case EMPTY:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(EMPTY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhonemeContext extends ParserRuleContext {
		public List<TerminalNode> PHONEME_BR_LEFT_RIGHT() { return getTokens(GenerativePhonologyParser.PHONEME_BR_LEFT_RIGHT); }
		public TerminalNode PHONEME_BR_LEFT_RIGHT(int i) {
			return getToken(GenerativePhonologyParser.PHONEME_BR_LEFT_RIGHT, i);
		}
		public List<TerminalNode> PHONEME() { return getTokens(GenerativePhonologyParser.PHONEME); }
		public TerminalNode PHONEME(int i) {
			return getToken(GenerativePhonologyParser.PHONEME, i);
		}
		public PhonemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phoneme; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenerativePhonologyVisitor ) return ((GenerativePhonologyVisitor<? extends T>)visitor).visitPhoneme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhonemeContext phoneme() throws RecognitionException {
		PhonemeContext _localctx = new PhonemeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_phoneme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(PHONEME_BR_LEFT_RIGHT);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				match(PHONEME);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PHONEME );
			setState(48);
			match(PHONEME_BR_LEFT_RIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullCtxContext extends ParserRuleContext {
		public List<CtxPartContext> ctxPart() {
			return getRuleContexts(CtxPartContext.class);
		}
		public CtxPartContext ctxPart(int i) {
			return getRuleContext(CtxPartContext.class,i);
		}
		public TerminalNode INPUT() { return getToken(GenerativePhonologyParser.INPUT, 0); }
		public FullCtxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullCtx; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenerativePhonologyVisitor ) return ((GenerativePhonologyVisitor<? extends T>)visitor).visitFullCtx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullCtxContext fullCtx() throws RecognitionException {
		FullCtxContext _localctx = new FullCtxContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fullCtx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			ctxPart();
			setState(51);
			match(INPUT);
			setState(52);
			ctxPart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtxPartContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(GenerativePhonologyParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(GenerativePhonologyParser.LETTER, i);
		}
		public TerminalNode RANGE_BR_LEFT() { return getToken(GenerativePhonologyParser.RANGE_BR_LEFT, 0); }
		public TerminalNode RANGE_BR_RIGHT() { return getToken(GenerativePhonologyParser.RANGE_BR_RIGHT, 0); }
		public TerminalNode WORD_BORDER() { return getToken(GenerativePhonologyParser.WORD_BORDER, 0); }
		public CtxPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctxPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenerativePhonologyVisitor ) return ((GenerativePhonologyVisitor<? extends T>)visitor).visitCtxPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtxPartContext ctxPart() throws RecognitionException {
		CtxPartContext _localctx = new CtxPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ctxPart);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(LETTER);
				}
				break;
			case RANGE_BR_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(RANGE_BR_LEFT);
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					match(LETTER);
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETTER );
				setState(61);
				match(RANGE_BR_RIGHT);
				}
				break;
			case WORD_BORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(WORD_BORDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\3\3\3\3\3\3\5\3%\n\3\3\4\3"+
		"\4\3\4\3\4\5\4+\n\4\3\5\3\5\6\5/\n\5\r\5\16\5\60\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\6\7<\n\7\r\7\16\7=\3\7\3\7\5\7B\n\7\3\7\2\2\b\2\4\6\b\n"+
		"\f\2\2\2H\2\36\3\2\2\2\4$\3\2\2\2\6*\3\2\2\2\b,\3\2\2\2\n\64\3\2\2\2\f"+
		"A\3\2\2\2\16\17\5\4\3\2\17\20\7\b\2\2\20\21\5\6\4\2\21\22\7\t\2\2\22\23"+
		"\5\n\6\2\23\37\3\2\2\2\24\25\7\3\2\2\25\26\5\f\7\2\26\27\7\4\2\2\27\30"+
		"\5\4\3\2\30\31\7\n\2\2\31\32\5\6\4\2\32\33\7\3\2\2\33\34\5\f\7\2\34\35"+
		"\7\4\2\2\35\37\3\2\2\2\36\16\3\2\2\2\36\24\3\2\2\2\37\3\3\2\2\2 %\5\b"+
		"\5\2!%\7\13\2\2\"%\7\17\2\2#%\7\20\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2"+
		"$#\3\2\2\2%\5\3\2\2\2&+\5\b\5\2\'+\7\13\2\2(+\7\17\2\2)+\7\20\2\2*&\3"+
		"\2\2\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\7\3\2\2\2,.\7\7\2\2-/\7\f\2\2."+
		"-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7"+
		"\7\2\2\63\t\3\2\2\2\64\65\5\f\7\2\65\66\7\r\2\2\66\67\5\f\7\2\67\13\3"+
		"\2\2\28B\7\13\2\29;\7\5\2\2:<\7\13\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2="+
		">\3\2\2\2>?\3\2\2\2?B\7\6\2\2@B\7\16\2\2A8\3\2\2\2A9\3\2\2\2A@\3\2\2\2"+
		"B\r\3\2\2\2\b\36$*\60=A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}