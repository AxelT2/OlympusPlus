package java;

// Generated from C:/Users/baton/IdeaProjects/olympus\olympus.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class olympusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PROGRAM=6, VAR=7, INT=8, DECIMAL=9, 
		STRING=10, CHARACTER=11, BOOL=12, LET=13, PLUS=14, MINUS=15, MULT=16, 
		DIV=17, PERCENT=18, EXP=19, ARRAY=20, AND=21, OR=22, NOT=23, FOR=24, WHILE=25, 
		IF=26, ELSE=27, IN=28, GT=29, LT=30, GEQ=31, LEQ=32, EQ=33, NEQ=34, ASSIGN=35, 
		VOID=36, CLASS=37, IMPORT=38, PACKAGE=39, FUNCTION=40, HERENCIA=41, BRACKET_OPEN=42, 
		BRACKET_CLOSE=43, PAR_OPEN=44, PAR_CLOSE=45, KEY_OPEN=46, KEY_CLOSE=47, 
		SEMICOLON=48, QUOTES=49, DOT=50, IDENTIFIER=51, NUMBER=52, BOOL_V=53, 
		CHAR=54, WHITESPACE=55;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_sentence = 2, RULE_dlc_int = 3, 
		RULE_dlc_deci = 4, RULE_dlc_string = 5, RULE_dlc_char = 6, RULE_dlc_bool = 7, 
		RULE_empty_string = 8, RULE_if_exception_sentence = 9, RULE_dlc_int2 = 10, 
		RULE_dlc_deci2 = 11, RULE_dlc_string2 = 12, RULE_dlc_char2 = 13, RULE_dlc_bool2 = 14, 
		RULE_dlc_array = 15, RULE_println2 = 16, RULE_print2 = 17, RULE_var_deci = 18, 
		RULE_var_assign = 19, RULE_println = 20, RULE_print = 21, RULE_show = 22, 
		RULE_aritmetic_sentences = 23, RULE_olim_sum = 24, RULE_olim_min = 25, 
		RULE_olim_mult = 26, RULE_olim_div = 27, RULE_olim_per = 28, RULE_dlc_for = 29, 
		RULE_dlc_while = 30, RULE_dlc_if = 31, RULE_if_sentences = 32, RULE_gt_than = 33, 
		RULE_gt_eq_than = 34, RULE_ls_than = 35, RULE_ls_eq_than = 36, RULE_eq_eq = 37, 
		RULE_ne_than = 38, RULE_decitions = 39, RULE_class_type = 40, RULE_public_class = 41, 
		RULE_private_class = 42, RULE_array = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "sentence", "dlc_int", "dlc_deci", "dlc_string", 
			"dlc_char", "dlc_bool", "empty_string", "if_exception_sentence", "dlc_int2", 
			"dlc_deci2", "dlc_string2", "dlc_char2", "dlc_bool2", "dlc_array", "println2", 
			"print2", "var_deci", "var_assign", "println", "print", "show", "aritmetic_sentences", 
			"olim_sum", "olim_min", "olim_mult", "olim_div", "olim_per", "dlc_for", 
			"dlc_while", "dlc_if", "if_sentences", "gt_than", "gt_eq_than", "ls_than", 
			"ls_eq_than", "eq_eq", "ne_than", "decitions", "class_type", "public_class", 
			"private_class", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stampln'", "'stamp'", "'show'", "'pb'", "'pv'", "'program'", 
			"'var'", "'zeus'", "'kratos'", "'ares'", "'hera'", "'artemis'", "'let'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'[]'", "'and'", "'or'", "'not'", 
			"'sysiphus'", "'while'", "'if'", "'elses'", "'Is'", "'>'", "'<'", "'=>'", 
			"'=<'", "'=='", "'!='", "'='", "'chaos'", "'class'", "'nemesis'", "'pck'", 
			"'func'", "'Ext'", "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "'\"'", 
			"'\u00C2\u00B0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "PROGRAM", "VAR", "INT", "DECIMAL", 
			"STRING", "CHARACTER", "BOOL", "LET", "PLUS", "MINUS", "MULT", "DIV", 
			"PERCENT", "EXP", "ARRAY", "AND", "OR", "NOT", "FOR", "WHILE", "IF", 
			"ELSE", "IN", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "VOID", 
			"CLASS", "IMPORT", "PACKAGE", "FUNCTION", "HERENCIA", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "KEY_OPEN", "KEY_CLOSE", "SEMICOLON", 
			"QUOTES", "DOT", "IDENTIFIER", "NUMBER", "BOOL_V", "CHAR", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "olympus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public olympusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(olympusParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(olympusParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(olympusParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(olympusParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(olympusParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			class_type();
			setState(91);
			match(CLASS);
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(PAR_OPEN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << VAR) | (1L << INT) | (1L << DECIMAL) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOL) | (1L << IF) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(94);
				sentence();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(PAR_CLOSE);
			setState(101);
			match(BRACKET_OPEN);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << VAR) | (1L << INT) | (1L << DECIMAL) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOL) | (1L << IF) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(102);
				sentence();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(BRACKET_CLOSE);
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

	public static class SentenceContext extends ParserRuleContext {
		public Var_deciContext var_deci() {
			return getRuleContext(Var_deciContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public Dlc_intContext dlc_int() {
			return getRuleContext(Dlc_intContext.class,0);
		}
		public Dlc_deciContext dlc_deci() {
			return getRuleContext(Dlc_deciContext.class,0);
		}
		public Dlc_stringContext dlc_string() {
			return getRuleContext(Dlc_stringContext.class,0);
		}
		public Dlc_charContext dlc_char() {
			return getRuleContext(Dlc_charContext.class,0);
		}
		public Dlc_ifContext dlc_if() {
			return getRuleContext(Dlc_ifContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Aritmetic_sentencesContext aritmetic_sentences() {
			return getRuleContext(Aritmetic_sentencesContext.class,0);
		}
		public Dlc_boolContext dlc_bool() {
			return getRuleContext(Dlc_boolContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				var_deci();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				var_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				println();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				dlc_int();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				dlc_deci();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				dlc_string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				dlc_char();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				dlc_if();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				print();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				aritmetic_sentences();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				dlc_bool();
				}
				break;
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

	public static class Dlc_intContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(olympusParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public Dlc_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_intContext dlc_int() throws RecognitionException {
		Dlc_intContext _localctx = new Dlc_intContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dlc_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(INT);
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(ASSIGN);
			setState(126);
			match(NUMBER);
			setState(127);
			match(SEMICOLON);
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

	public static class Dlc_deciContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(olympusParser.DECIMAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public Dlc_deciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_deci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_deci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_deci(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_deci(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_deciContext dlc_deci() throws RecognitionException {
		Dlc_deciContext _localctx = new Dlc_deciContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dlc_deci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(DECIMAL);
			setState(130);
			match(IDENTIFIER);
			setState(131);
			match(ASSIGN);
			setState(132);
			match(NUMBER);
			setState(133);
			match(SEMICOLON);
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

	public static class Dlc_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(olympusParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public List<TerminalNode> QUOTES() { return getTokens(olympusParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(olympusParser.QUOTES, i);
		}
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public Dlc_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_stringContext dlc_string() throws RecognitionException {
		Dlc_stringContext _localctx = new Dlc_stringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dlc_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(STRING);
			setState(136);
			match(IDENTIFIER);
			setState(137);
			match(ASSIGN);
			setState(138);
			match(QUOTES);
			setState(139);
			match(IDENTIFIER);
			setState(140);
			match(QUOTES);
			setState(141);
			match(SEMICOLON);
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

	public static class Dlc_charContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(olympusParser.CHARACTER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public TerminalNode CHAR() { return getToken(olympusParser.CHAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public Dlc_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_charContext dlc_char() throws RecognitionException {
		Dlc_charContext _localctx = new Dlc_charContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dlc_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(CHARACTER);
			setState(144);
			match(IDENTIFIER);
			setState(145);
			match(ASSIGN);
			setState(146);
			match(CHAR);
			setState(147);
			match(SEMICOLON);
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

	public static class Dlc_boolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(olympusParser.BOOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public TerminalNode BOOL_V() { return getToken(olympusParser.BOOL_V, 0); }
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public Dlc_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_boolContext dlc_bool() throws RecognitionException {
		Dlc_boolContext _localctx = new Dlc_boolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dlc_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(BOOL);
			setState(150);
			match(IDENTIFIER);
			setState(151);
			match(ASSIGN);
			setState(152);
			match(BOOL_V);
			setState(153);
			match(SEMICOLON);
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

	public static class Empty_stringContext extends ParserRuleContext {
		public List<TerminalNode> QUOTES() { return getTokens(olympusParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(olympusParser.QUOTES, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Empty_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterEmpty_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitEmpty_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitEmpty_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_stringContext empty_string() throws RecognitionException {
		Empty_stringContext _localctx = new Empty_stringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_empty_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(QUOTES);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(156);
				match(IDENTIFIER);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(QUOTES);
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

	public static class If_exception_sentenceContext extends ParserRuleContext {
		public Var_deciContext var_deci() {
			return getRuleContext(Var_deciContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Println2Context println2() {
			return getRuleContext(Println2Context.class,0);
		}
		public Dlc_int2Context dlc_int2() {
			return getRuleContext(Dlc_int2Context.class,0);
		}
		public Dlc_deci2Context dlc_deci2() {
			return getRuleContext(Dlc_deci2Context.class,0);
		}
		public Dlc_string2Context dlc_string2() {
			return getRuleContext(Dlc_string2Context.class,0);
		}
		public Dlc_char2Context dlc_char2() {
			return getRuleContext(Dlc_char2Context.class,0);
		}
		public Dlc_ifContext dlc_if() {
			return getRuleContext(Dlc_ifContext.class,0);
		}
		public Print2Context print2() {
			return getRuleContext(Print2Context.class,0);
		}
		public Aritmetic_sentencesContext aritmetic_sentences() {
			return getRuleContext(Aritmetic_sentencesContext.class,0);
		}
		public Dlc_bool2Context dlc_bool2() {
			return getRuleContext(Dlc_bool2Context.class,0);
		}
		public If_exception_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_exception_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterIf_exception_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitIf_exception_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitIf_exception_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_exception_sentenceContext if_exception_sentence() throws RecognitionException {
		If_exception_sentenceContext _localctx = new If_exception_sentenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_exception_sentence);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				var_deci();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				var_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				println2();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				dlc_int2();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				dlc_deci2();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				dlc_string2();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				dlc_char2();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				dlc_if();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(172);
				print2();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(173);
				aritmetic_sentences();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(174);
				dlc_bool2();
				}
				break;
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

	public static class Dlc_int2Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(olympusParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public Dlc_int2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_int2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_int2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_int2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_int2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_int2Context dlc_int2() throws RecognitionException {
		Dlc_int2Context _localctx = new Dlc_int2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_dlc_int2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(INT);
			setState(178);
			match(IDENTIFIER);
			setState(179);
			match(ASSIGN);
			setState(180);
			match(NUMBER);
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

	public static class Dlc_deci2Context extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(olympusParser.DECIMAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public Dlc_deci2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_deci2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_deci2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_deci2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_deci2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_deci2Context dlc_deci2() throws RecognitionException {
		Dlc_deci2Context _localctx = new Dlc_deci2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_dlc_deci2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(DECIMAL);
			setState(183);
			match(IDENTIFIER);
			setState(184);
			match(ASSIGN);
			setState(185);
			match(NUMBER);
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

	public static class Dlc_string2Context extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(olympusParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public List<TerminalNode> QUOTES() { return getTokens(olympusParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(olympusParser.QUOTES, i);
		}
		public Dlc_string2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_string2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_string2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_string2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_string2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_string2Context dlc_string2() throws RecognitionException {
		Dlc_string2Context _localctx = new Dlc_string2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_dlc_string2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(STRING);
			setState(188);
			match(IDENTIFIER);
			setState(189);
			match(ASSIGN);
			setState(190);
			match(QUOTES);
			setState(191);
			match(IDENTIFIER);
			setState(192);
			match(QUOTES);
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

	public static class Dlc_char2Context extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(olympusParser.CHARACTER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public TerminalNode CHAR() { return getToken(olympusParser.CHAR, 0); }
		public Dlc_char2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_char2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_char2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_char2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_char2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_char2Context dlc_char2() throws RecognitionException {
		Dlc_char2Context _localctx = new Dlc_char2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_dlc_char2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(CHARACTER);
			setState(195);
			match(IDENTIFIER);
			setState(196);
			match(ASSIGN);
			setState(197);
			match(CHAR);
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

	public static class Dlc_bool2Context extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(olympusParser.BOOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public TerminalNode BOOL_V() { return getToken(olympusParser.BOOL_V, 0); }
		public Dlc_bool2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_bool2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_bool2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_bool2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_bool2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_bool2Context dlc_bool2() throws RecognitionException {
		Dlc_bool2Context _localctx = new Dlc_bool2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_dlc_bool2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(BOOL);
			setState(200);
			match(IDENTIFIER);
			setState(201);
			match(ASSIGN);
			setState(202);
			match(BOOL_V);
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

	public static class Dlc_arrayContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(olympusParser.CHARACTER, 0); }
		public TerminalNode ARRAY() { return getToken(olympusParser.ARRAY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Dlc_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_arrayContext dlc_array() throws RecognitionException {
		Dlc_arrayContext _localctx = new Dlc_arrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dlc_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(CHARACTER);
			setState(205);
			match(ARRAY);
			setState(206);
			match(IDENTIFIER);
			setState(207);
			match(ASSIGN);
			setState(208);
			array();
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

	public static class Println2Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public Empty_stringContext empty_string() {
			return getRuleContext(Empty_stringContext.class,0);
		}
		public Println2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterPrintln2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitPrintln2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitPrintln2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Println2Context println2() throws RecognitionException {
		Println2Context _localctx = new Println2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_println2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__0);
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(211);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				{
				setState(212);
				match(IDENTIFIER);
				}
				break;
			case QUOTES:
				{
				setState(213);
				empty_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Print2Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public Empty_stringContext empty_string() {
			return getRuleContext(Empty_stringContext.class,0);
		}
		public Print2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterPrint2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitPrint2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitPrint2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print2Context print2() throws RecognitionException {
		Print2Context _localctx = new Print2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_print2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__1);
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(217);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				{
				setState(218);
				match(IDENTIFIER);
				}
				break;
			case QUOTES:
				{
				setState(219);
				empty_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Var_deciContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(olympusParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public Var_deciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_deci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterVar_deci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitVar_deci(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitVar_deci(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_deciContext var_deci() throws RecognitionException {
		Var_deciContext _localctx = new Var_deciContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_deci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(VAR);
			setState(223);
			match(IDENTIFIER);
			setState(224);
			match(SEMICOLON);
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

	public static class Var_assignContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(olympusParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(olympusParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitVar_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(VAR);
			setState(227);
			match(IDENTIFIER);
			setState(228);
			match(ASSIGN);
			setState(229);
			match(NUMBER);
			setState(230);
			match(SEMICOLON);
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_println);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__0);
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(234);
			match(SEMICOLON);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__1);
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(238);
			match(SEMICOLON);
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

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public TerminalNode INT() { return getToken(olympusParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitShow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__2);
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(242);
			match(SEMICOLON);
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

	public static class Aritmetic_sentencesContext extends ParserRuleContext {
		public Olim_sumContext olim_sum() {
			return getRuleContext(Olim_sumContext.class,0);
		}
		public Olim_minContext olim_min() {
			return getRuleContext(Olim_minContext.class,0);
		}
		public Olim_multContext olim_mult() {
			return getRuleContext(Olim_multContext.class,0);
		}
		public Olim_divContext olim_div() {
			return getRuleContext(Olim_divContext.class,0);
		}
		public Olim_perContext olim_per() {
			return getRuleContext(Olim_perContext.class,0);
		}
		public Aritmetic_sentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetic_sentences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterAritmetic_sentences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitAritmetic_sentences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitAritmetic_sentences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritmetic_sentencesContext aritmetic_sentences() throws RecognitionException {
		Aritmetic_sentencesContext _localctx = new Aritmetic_sentencesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_aritmetic_sentences);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				olim_sum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				olim_min();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				olim_mult();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				olim_div();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				olim_per();
				}
				break;
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

	public static class Olim_sumContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(olympusParser.PLUS, 0); }
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(olympusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(olympusParser.NUMBER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Olim_sumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olim_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterOlim_sum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitOlim_sum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitOlim_sum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Olim_sumContext olim_sum() throws RecognitionException {
		Olim_sumContext _localctx = new Olim_sumContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_olim_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(252);
			match(PLUS);
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(254);
			match(SEMICOLON);
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

	public static class Olim_minContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(olympusParser.MINUS, 0); }
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(olympusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(olympusParser.NUMBER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Olim_minContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olim_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterOlim_min(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitOlim_min(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitOlim_min(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Olim_minContext olim_min() throws RecognitionException {
		Olim_minContext _localctx = new Olim_minContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_olim_min);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(257);
			match(MINUS);
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(259);
			match(SEMICOLON);
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

	public static class Olim_multContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(olympusParser.MULT, 0); }
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(olympusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(olympusParser.NUMBER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Olim_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olim_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterOlim_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitOlim_mult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitOlim_mult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Olim_multContext olim_mult() throws RecognitionException {
		Olim_multContext _localctx = new Olim_multContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_olim_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(262);
			match(MULT);
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(264);
			match(SEMICOLON);
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

	public static class Olim_divContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(olympusParser.DIV, 0); }
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(olympusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(olympusParser.NUMBER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Olim_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olim_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterOlim_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitOlim_div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitOlim_div(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Olim_divContext olim_div() throws RecognitionException {
		Olim_divContext _localctx = new Olim_divContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_olim_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
			match(DIV);
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(269);
			match(SEMICOLON);
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

	public static class Olim_perContext extends ParserRuleContext {
		public TerminalNode PERCENT() { return getToken(olympusParser.PERCENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(olympusParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(olympusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(olympusParser.NUMBER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Olim_perContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olim_per; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterOlim_per(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitOlim_per(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitOlim_per(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Olim_perContext olim_per() throws RecognitionException {
		Olim_perContext _localctx = new Olim_perContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_olim_per);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(272);
			match(PERCENT);
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(274);
			match(SEMICOLON);
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

	public static class Dlc_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(olympusParser.FOR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(olympusParser.PAR_OPEN, 0); }
		public If_sentencesContext if_sentences() {
			return getRuleContext(If_sentencesContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(olympusParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(olympusParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(olympusParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Dlc_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_forContext dlc_for() throws RecognitionException {
		Dlc_forContext _localctx = new Dlc_forContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dlc_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(FOR);
			setState(277);
			match(PAR_OPEN);
			setState(278);
			if_sentences();
			setState(279);
			match(PAR_CLOSE);
			setState(280);
			match(BRACKET_OPEN);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << VAR) | (1L << INT) | (1L << DECIMAL) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOL) | (1L << IF) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(281);
				sentence();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(BRACKET_CLOSE);
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

	public static class Dlc_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(olympusParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(olympusParser.PAR_OPEN, 0); }
		public If_sentencesContext if_sentences() {
			return getRuleContext(If_sentencesContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(olympusParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(olympusParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(olympusParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Dlc_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_whileContext dlc_while() throws RecognitionException {
		Dlc_whileContext _localctx = new Dlc_whileContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dlc_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(WHILE);
			setState(290);
			match(PAR_OPEN);
			setState(291);
			if_sentences();
			setState(292);
			match(PAR_CLOSE);
			setState(293);
			match(BRACKET_OPEN);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << VAR) | (1L << INT) | (1L << DECIMAL) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOL) | (1L << IF) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(294);
				sentence();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			match(BRACKET_CLOSE);
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

	public static class Dlc_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(olympusParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(olympusParser.PAR_OPEN, 0); }
		public If_sentencesContext if_sentences() {
			return getRuleContext(If_sentencesContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(olympusParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(olympusParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(olympusParser.BRACKET_CLOSE, 0); }
		public List<If_exception_sentenceContext> if_exception_sentence() {
			return getRuleContexts(If_exception_sentenceContext.class);
		}
		public If_exception_sentenceContext if_exception_sentence(int i) {
			return getRuleContext(If_exception_sentenceContext.class,i);
		}
		public Dlc_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlc_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDlc_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDlc_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDlc_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlc_ifContext dlc_if() throws RecognitionException {
		Dlc_ifContext _localctx = new Dlc_ifContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dlc_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(IF);
			setState(303);
			match(PAR_OPEN);
			setState(304);
			if_sentences();
			setState(305);
			match(PAR_CLOSE);
			setState(306);
			match(BRACKET_OPEN);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << VAR) | (1L << INT) | (1L << DECIMAL) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOL) | (1L << IF) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(307);
				if_exception_sentence();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(BRACKET_CLOSE);
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

	public static class If_sentencesContext extends ParserRuleContext {
		public Gt_thanContext gt_than() {
			return getRuleContext(Gt_thanContext.class,0);
		}
		public Gt_eq_thanContext gt_eq_than() {
			return getRuleContext(Gt_eq_thanContext.class,0);
		}
		public Ls_eq_thanContext ls_eq_than() {
			return getRuleContext(Ls_eq_thanContext.class,0);
		}
		public Ls_thanContext ls_than() {
			return getRuleContext(Ls_thanContext.class,0);
		}
		public Eq_eqContext eq_eq() {
			return getRuleContext(Eq_eqContext.class,0);
		}
		public Ne_thanContext ne_than() {
			return getRuleContext(Ne_thanContext.class,0);
		}
		public DecitionsContext decitions() {
			return getRuleContext(DecitionsContext.class,0);
		}
		public If_sentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sentences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterIf_sentences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitIf_sentences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitIf_sentences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sentencesContext if_sentences() throws RecognitionException {
		If_sentencesContext _localctx = new If_sentencesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_if_sentences);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				gt_than();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				gt_eq_than();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				ls_eq_than();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				ls_than();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				eq_eq();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				ne_than();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(321);
				decitions();
				}
				break;
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

	public static class Gt_thanContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(olympusParser.GT, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Gt_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterGt_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitGt_than(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitGt_than(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gt_thanContext gt_than() throws RecognitionException {
		Gt_thanContext _localctx = new Gt_thanContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_gt_than);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(324);
			match(IDENTIFIER);
			}
			setState(325);
			match(GT);
			setState(326);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Gt_eq_thanContext extends ParserRuleContext {
		public TerminalNode GEQ() { return getToken(olympusParser.GEQ, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Gt_eq_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt_eq_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterGt_eq_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitGt_eq_than(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitGt_eq_than(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gt_eq_thanContext gt_eq_than() throws RecognitionException {
		Gt_eq_thanContext _localctx = new Gt_eq_thanContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_gt_eq_than);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(328);
			match(IDENTIFIER);
			}
			setState(329);
			match(GEQ);
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Ls_thanContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(olympusParser.LT, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Ls_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ls_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterLs_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitLs_than(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitLs_than(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ls_thanContext ls_than() throws RecognitionException {
		Ls_thanContext _localctx = new Ls_thanContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ls_than);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(332);
			match(IDENTIFIER);
			}
			setState(333);
			match(LT);
			setState(334);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Ls_eq_thanContext extends ParserRuleContext {
		public TerminalNode LEQ() { return getToken(olympusParser.LEQ, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Ls_eq_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ls_eq_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterLs_eq_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitLs_eq_than(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitLs_eq_than(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ls_eq_thanContext ls_eq_than() throws RecognitionException {
		Ls_eq_thanContext _localctx = new Ls_eq_thanContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ls_eq_than);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(336);
			match(IDENTIFIER);
			}
			setState(337);
			match(LEQ);
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Eq_eqContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(olympusParser.EQ, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Eq_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterEq_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitEq_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitEq_eq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_eqContext eq_eq() throws RecognitionException {
		Eq_eqContext _localctx = new Eq_eqContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_eq_eq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(340);
			match(IDENTIFIER);
			}
			setState(341);
			match(EQ);
			setState(342);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Ne_thanContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(olympusParser.NEQ, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(olympusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(olympusParser.IDENTIFIER, i);
		}
		public Ne_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ne_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterNe_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitNe_than(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitNe_than(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ne_thanContext ne_than() throws RecognitionException {
		Ne_thanContext _localctx = new Ne_thanContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ne_than);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(344);
			match(IDENTIFIER);
			}
			setState(345);
			match(NEQ);
			setState(346);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class DecitionsContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(olympusParser.IN, 0); }
		public TerminalNode BOOL_V() { return getToken(olympusParser.BOOL_V, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public DecitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterDecitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitDecitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitDecitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecitionsContext decitions() throws RecognitionException {
		DecitionsContext _localctx = new DecitionsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_decitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(348);
			match(IDENTIFIER);
			}
			setState(349);
			match(IN);
			setState(350);
			match(BOOL_V);
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

	public static class Class_typeContext extends ParserRuleContext {
		public Private_classContext private_class() {
			return getRuleContext(Private_classContext.class,0);
		}
		public Public_classContext public_class() {
			return getRuleContext(Public_classContext.class,0);
		}
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterClass_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitClass_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitClass_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_class_type);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				private_class();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				public_class();
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

	public static class Public_classContext extends ParserRuleContext {
		public Public_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_public_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterPublic_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitPublic_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitPublic_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Public_classContext public_class() throws RecognitionException {
		Public_classContext _localctx = new Public_classContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_public_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__3);
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

	public static class Private_classContext extends ParserRuleContext {
		public Private_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_private_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterPrivate_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitPrivate_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitPrivate_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Private_classContext private_class() throws RecognitionException {
		Private_classContext _localctx = new Private_classContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_private_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__4);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode KEY_OPEN() { return getToken(olympusParser.KEY_OPEN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(olympusParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(olympusParser.NUMBER, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof olympusListener ) ((olympusListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof olympusVisitor ) return ((olympusVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(KEY_OPEN);
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3b\n\3\f\3\16\3e\13\3\3\3\3\3"+
		"\3\3\7\3j\n\3\f\3\16\3m\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4|\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\7\n\u00a0\n\n\f\n\16\n\u00a3\13\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b2\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\5\22\u00d9\n\22\3\23\3\23\3\23\3\23\5\23\u00df"+
		"\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00fc\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u011d\n\37\f\37\16\37\u0120\13\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u012a\n \f \16 \u012d\13 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\7!\u0137\n!\f!\16!\u013a\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u0145\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\5*\u0165\n*\3+\3+\3,\3,\3"+
		"-\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVX\2\4\3\2\65\66\4\2\n\n\65\65\2\u016a\2Z\3\2\2\2"+
		"\4\\\3\2\2\2\6{\3\2\2\2\b}\3\2\2\2\n\u0083\3\2\2\2\f\u0089\3\2\2\2\16"+
		"\u0091\3\2\2\2\20\u0097\3\2\2\2\22\u009d\3\2\2\2\24\u00b1\3\2\2\2\26\u00b3"+
		"\3\2\2\2\30\u00b8\3\2\2\2\32\u00bd\3\2\2\2\34\u00c4\3\2\2\2\36\u00c9\3"+
		"\2\2\2 \u00ce\3\2\2\2\"\u00d4\3\2\2\2$\u00da\3\2\2\2&\u00e0\3\2\2\2(\u00e4"+
		"\3\2\2\2*\u00ea\3\2\2\2,\u00ee\3\2\2\2.\u00f2\3\2\2\2\60\u00fb\3\2\2\2"+
		"\62\u00fd\3\2\2\2\64\u0102\3\2\2\2\66\u0107\3\2\2\28\u010c\3\2\2\2:\u0111"+
		"\3\2\2\2<\u0116\3\2\2\2>\u0123\3\2\2\2@\u0130\3\2\2\2B\u0144\3\2\2\2D"+
		"\u0146\3\2\2\2F\u014a\3\2\2\2H\u014e\3\2\2\2J\u0152\3\2\2\2L\u0156\3\2"+
		"\2\2N\u015a\3\2\2\2P\u015e\3\2\2\2R\u0164\3\2\2\2T\u0166\3\2\2\2V\u0168"+
		"\3\2\2\2X\u016a\3\2\2\2Z[\5\4\3\2[\3\3\2\2\2\\]\5R*\2]^\7\'\2\2^_\7\65"+
		"\2\2_c\7.\2\2`b\5\6\4\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2"+
		"\2\2ec\3\2\2\2fg\7/\2\2gk\7,\2\2hj\5\6\4\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7-\2\2o\5\3\2\2\2p|\5&\24\2q|\5(\25"+
		"\2r|\5*\26\2s|\5\b\5\2t|\5\n\6\2u|\5\f\7\2v|\5\16\b\2w|\5@!\2x|\5,\27"+
		"\2y|\5\60\31\2z|\5\20\t\2{p\3\2\2\2{q\3\2\2\2{r\3\2\2\2{s\3\2\2\2{t\3"+
		"\2\2\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\7"+
		"\3\2\2\2}~\7\n\2\2~\177\7\65\2\2\177\u0080\7%\2\2\u0080\u0081\7\66\2\2"+
		"\u0081\u0082\7\62\2\2\u0082\t\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u0085"+
		"\7\65\2\2\u0085\u0086\7%\2\2\u0086\u0087\7\66\2\2\u0087\u0088\7\62\2\2"+
		"\u0088\13\3\2\2\2\u0089\u008a\7\f\2\2\u008a\u008b\7\65\2\2\u008b\u008c"+
		"\7%\2\2\u008c\u008d\7\63\2\2\u008d\u008e\7\65\2\2\u008e\u008f\7\63\2\2"+
		"\u008f\u0090\7\62\2\2\u0090\r\3\2\2\2\u0091\u0092\7\r\2\2\u0092\u0093"+
		"\7\65\2\2\u0093\u0094\7%\2\2\u0094\u0095\78\2\2\u0095\u0096\7\62\2\2\u0096"+
		"\17\3\2\2\2\u0097\u0098\7\16\2\2\u0098\u0099\7\65\2\2\u0099\u009a\7%\2"+
		"\2\u009a\u009b\7\67\2\2\u009b\u009c\7\62\2\2\u009c\21\3\2\2\2\u009d\u00a1"+
		"\7\63\2\2\u009e\u00a0\7\65\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a4\u00a5\7\63\2\2\u00a5\23\3\2\2\2\u00a6\u00b2\5&\24\2\u00a7"+
		"\u00b2\5(\25\2\u00a8\u00b2\5\"\22\2\u00a9\u00b2\5\26\f\2\u00aa\u00b2\5"+
		"\30\r\2\u00ab\u00b2\5\32\16\2\u00ac\u00b2\5\34\17\2\u00ad\u00b2\5@!\2"+
		"\u00ae\u00b2\5$\23\2\u00af\u00b2\5\60\31\2\u00b0\u00b2\5\36\20\2\u00b1"+
		"\u00a6\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00a9\3\2"+
		"\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\7\n\2\2\u00b4\u00b5\7\65\2\2\u00b5\u00b6"+
		"\7%\2\2\u00b6\u00b7\7\66\2\2\u00b7\27\3\2\2\2\u00b8\u00b9\7\13\2\2\u00b9"+
		"\u00ba\7\65\2\2\u00ba\u00bb\7%\2\2\u00bb\u00bc\7\66\2\2\u00bc\31\3\2\2"+
		"\2\u00bd\u00be\7\f\2\2\u00be\u00bf\7\65\2\2\u00bf\u00c0\7%\2\2\u00c0\u00c1"+
		"\7\63\2\2\u00c1\u00c2\7\65\2\2\u00c2\u00c3\7\63\2\2\u00c3\33\3\2\2\2\u00c4"+
		"\u00c5\7\r\2\2\u00c5\u00c6\7\65\2\2\u00c6\u00c7\7%\2\2\u00c7\u00c8\78"+
		"\2\2\u00c8\35\3\2\2\2\u00c9\u00ca\7\16\2\2\u00ca\u00cb\7\65\2\2\u00cb"+
		"\u00cc\7%\2\2\u00cc\u00cd\7\67\2\2\u00cd\37\3\2\2\2\u00ce\u00cf\7\r\2"+
		"\2\u00cf\u00d0\7\26\2\2\u00d0\u00d1\7\65\2\2\u00d1\u00d2\7%\2\2\u00d2"+
		"\u00d3\5X-\2\u00d3!\3\2\2\2\u00d4\u00d8\7\3\2\2\u00d5\u00d9\7\66\2\2\u00d6"+
		"\u00d9\7\65\2\2\u00d7\u00d9\5\22\n\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3"+
		"\2\2\2\u00d8\u00d7\3\2\2\2\u00d9#\3\2\2\2\u00da\u00de\7\4\2\2\u00db\u00df"+
		"\7\66\2\2\u00dc\u00df\7\65\2\2\u00dd\u00df\5\22\n\2\u00de\u00db\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df%\3\2\2\2\u00e0\u00e1"+
		"\7\t\2\2\u00e1\u00e2\7\65\2\2\u00e2\u00e3\7\62\2\2\u00e3\'\3\2\2\2\u00e4"+
		"\u00e5\7\t\2\2\u00e5\u00e6\7\65\2\2\u00e6\u00e7\7%\2\2\u00e7\u00e8\7\66"+
		"\2\2\u00e8\u00e9\7\62\2\2\u00e9)\3\2\2\2\u00ea\u00eb\7\3\2\2\u00eb\u00ec"+
		"\t\2\2\2\u00ec\u00ed\7\62\2\2\u00ed+\3\2\2\2\u00ee\u00ef\7\4\2\2\u00ef"+
		"\u00f0\t\2\2\2\u00f0\u00f1\7\62\2\2\u00f1-\3\2\2\2\u00f2\u00f3\7\5\2\2"+
		"\u00f3\u00f4\t\3\2\2\u00f4\u00f5\7\62\2\2\u00f5/\3\2\2\2\u00f6\u00fc\5"+
		"\62\32\2\u00f7\u00fc\5\64\33\2\u00f8\u00fc\5\66\34\2\u00f9\u00fc\58\35"+
		"\2\u00fa\u00fc\5:\36\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\61\3\2\2\2\u00fd"+
		"\u00fe\t\2\2\2\u00fe\u00ff\7\20\2\2\u00ff\u0100\t\2\2\2\u0100\u0101\7"+
		"\62\2\2\u0101\63\3\2\2\2\u0102\u0103\t\2\2\2\u0103\u0104\7\21\2\2\u0104"+
		"\u0105\t\2\2\2\u0105\u0106\7\62\2\2\u0106\65\3\2\2\2\u0107\u0108\t\2\2"+
		"\2\u0108\u0109\7\22\2\2\u0109\u010a\t\2\2\2\u010a\u010b\7\62\2\2\u010b"+
		"\67\3\2\2\2\u010c\u010d\t\2\2\2\u010d\u010e\7\23\2\2\u010e\u010f\t\2\2"+
		"\2\u010f\u0110\7\62\2\2\u01109\3\2\2\2\u0111\u0112\t\2\2\2\u0112\u0113"+
		"\7\24\2\2\u0113\u0114\t\2\2\2\u0114\u0115\7\62\2\2\u0115;\3\2\2\2\u0116"+
		"\u0117\7\32\2\2\u0117\u0118\7.\2\2\u0118\u0119\5B\"\2\u0119\u011a\7/\2"+
		"\2\u011a\u011e\7,\2\2\u011b\u011d\5\6\4\2\u011c\u011b\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0122\7-\2\2\u0122=\3\2\2\2\u0123\u0124\7\33\2\2"+
		"\u0124\u0125\7.\2\2\u0125\u0126\5B\"\2\u0126\u0127\7/\2\2\u0127\u012b"+
		"\7,\2\2\u0128\u012a\5\6\4\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012e\u012f\7-\2\2\u012f?\3\2\2\2\u0130\u0131\7\34\2\2\u0131\u0132"+
		"\7.\2\2\u0132\u0133\5B\"\2\u0133\u0134\7/\2\2\u0134\u0138\7,\2\2\u0135"+
		"\u0137\5\24\13\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\7-\2\2\u013cA\3\2\2\2\u013d\u0145\5D#\2\u013e\u0145\5F$\2\u013f"+
		"\u0145\5J&\2\u0140\u0145\5H%\2\u0141\u0145\5L\'\2\u0142\u0145\5N(\2\u0143"+
		"\u0145\5P)\2\u0144\u013d\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u013f\3\2\2"+
		"\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143"+
		"\3\2\2\2\u0145C\3\2\2\2\u0146\u0147\7\65\2\2\u0147\u0148\7\37\2\2\u0148"+
		"\u0149\t\2\2\2\u0149E\3\2\2\2\u014a\u014b\7\65\2\2\u014b\u014c\7!\2\2"+
		"\u014c\u014d\t\2\2\2\u014dG\3\2\2\2\u014e\u014f\7\65\2\2\u014f\u0150\7"+
		" \2\2\u0150\u0151\t\2\2\2\u0151I\3\2\2\2\u0152\u0153\7\65\2\2\u0153\u0154"+
		"\7\"\2\2\u0154\u0155\t\2\2\2\u0155K\3\2\2\2\u0156\u0157\7\65\2\2\u0157"+
		"\u0158\7#\2\2\u0158\u0159\t\2\2\2\u0159M\3\2\2\2\u015a\u015b\7\65\2\2"+
		"\u015b\u015c\7$\2\2\u015c\u015d\t\2\2\2\u015dO\3\2\2\2\u015e\u015f\7\65"+
		"\2\2\u015f\u0160\7\36\2\2\u0160\u0161\7\67\2\2\u0161Q\3\2\2\2\u0162\u0165"+
		"\5V,\2\u0163\u0165\5T+\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		"S\3\2\2\2\u0166\u0167\7\6\2\2\u0167U\3\2\2\2\u0168\u0169\7\7\2\2\u0169"+
		"W\3\2\2\2\u016a\u016b\7\60\2\2\u016b\u016c\t\2\2\2\u016cY\3\2\2\2\17c"+
		"k{\u00a1\u00b1\u00d8\u00de\u00fb\u011e\u012b\u0138\u0144\u0164";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}