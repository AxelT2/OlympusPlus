package java;

// Generated from C:/Users/baton/IdeaProjects/olympus\olympus.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class olympusLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "PROGRAM", "VAR", "INT", "DECIMAL", 
			"STRING", "CHARACTER", "BOOL", "LET", "PLUS", "MINUS", "MULT", "DIV", 
			"PERCENT", "EXP", "ARRAY", "AND", "OR", "NOT", "FOR", "WHILE", "IF", 
			"ELSE", "IN", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "VOID", 
			"CLASS", "IMPORT", "PACKAGE", "FUNCTION", "HERENCIA", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "KEY_OPEN", "KEY_CLOSE", "SEMICOLON", 
			"QUOTES", "DOT", "IDENTIFIER", "NUMBER", "BOOL_V", "CHAR", "WHITESPACE"
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


	public olympusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "olympus.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0155\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\7\64\u0136\n\64\f\64\16\64\u0139\13\64\3\65\6\65"+
		"\u013c\n\65\r\65\16\65\u013d\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\5\66\u014b\n\66\3\67\3\67\38\68\u0150\n8\r8\168\u0151\3"+
		"8\38\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9\3\2\6\4\2C\\c|\4\2\62;C|\3\2\62;\7\2\13\f\17\17\"\"))~~\2"+
		"\u0158\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5y\3\2\2\2\7\177\3\2\2\2\t\u0084\3\2\2"+
		"\2\13\u0087\3\2\2\2\r\u008a\3\2\2\2\17\u0092\3\2\2\2\21\u0096\3\2\2\2"+
		"\23\u009b\3\2\2\2\25\u00a2\3\2\2\2\27\u00a7\3\2\2\2\31\u00ac\3\2\2\2\33"+
		"\u00b4\3\2\2\2\35\u00b8\3\2\2\2\37\u00ba\3\2\2\2!\u00bc\3\2\2\2#\u00be"+
		"\3\2\2\2%\u00c0\3\2\2\2\'\u00c2\3\2\2\2)\u00c4\3\2\2\2+\u00c7\3\2\2\2"+
		"-\u00cb\3\2\2\2/\u00ce\3\2\2\2\61\u00d2\3\2\2\2\63\u00db\3\2\2\2\65\u00e1"+
		"\3\2\2\2\67\u00e4\3\2\2\29\u00ea\3\2\2\2;\u00ed\3\2\2\2=\u00ef\3\2\2\2"+
		"?\u00f1\3\2\2\2A\u00f4\3\2\2\2C\u00f7\3\2\2\2E\u00fa\3\2\2\2G\u00fd\3"+
		"\2\2\2I\u00ff\3\2\2\2K\u0105\3\2\2\2M\u010b\3\2\2\2O\u0113\3\2\2\2Q\u0117"+
		"\3\2\2\2S\u011c\3\2\2\2U\u0120\3\2\2\2W\u0122\3\2\2\2Y\u0124\3\2\2\2["+
		"\u0126\3\2\2\2]\u0128\3\2\2\2_\u012a\3\2\2\2a\u012c\3\2\2\2c\u012e\3\2"+
		"\2\2e\u0130\3\2\2\2g\u0133\3\2\2\2i\u013b\3\2\2\2k\u014a\3\2\2\2m\u014c"+
		"\3\2\2\2o\u014f\3\2\2\2qr\7u\2\2rs\7v\2\2st\7c\2\2tu\7o\2\2uv\7r\2\2v"+
		"w\7n\2\2wx\7p\2\2x\4\3\2\2\2yz\7u\2\2z{\7v\2\2{|\7c\2\2|}\7o\2\2}~\7r"+
		"\2\2~\6\3\2\2\2\177\u0080\7u\2\2\u0080\u0081\7j\2\2\u0081\u0082\7q\2\2"+
		"\u0082\u0083\7y\2\2\u0083\b\3\2\2\2\u0084\u0085\7r\2\2\u0085\u0086\7d"+
		"\2\2\u0086\n\3\2\2\2\u0087\u0088\7r\2\2\u0088\u0089\7x\2\2\u0089\f\3\2"+
		"\2\2\u008a\u008b\7r\2\2\u008b\u008c\7t\2\2\u008c\u008d\7q\2\2\u008d\u008e"+
		"\7i\2\2\u008e\u008f\7t\2\2\u008f\u0090\7c\2\2\u0090\u0091\7o\2\2\u0091"+
		"\16\3\2\2\2\u0092\u0093\7x\2\2\u0093\u0094\7c\2\2\u0094\u0095\7t\2\2\u0095"+
		"\20\3\2\2\2\u0096\u0097\7|\2\2\u0097\u0098\7g\2\2\u0098\u0099\7w\2\2\u0099"+
		"\u009a\7u\2\2\u009a\22\3\2\2\2\u009b\u009c\7m\2\2\u009c\u009d\7t\2\2\u009d"+
		"\u009e\7c\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7u\2\2"+
		"\u00a1\24\3\2\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7"+
		"g\2\2\u00a5\u00a6\7u\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7c\2\2\u00ab\30\3\2\2\2\u00ac\u00ad"+
		"\7c\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7o\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7u\2\2\u00b3\32\3\2\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7v\2\2\u00b7\34\3\2\2\2\u00b8"+
		"\u00b9\7-\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb \3\2\2\2\u00bc"+
		"\u00bd\7,\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf$\3\2\2\2\u00c0"+
		"\u00c1\7\'\2\2\u00c1&\3\2\2\2\u00c2\u00c3\7`\2\2\u00c3(\3\2\2\2\u00c4"+
		"\u00c5\7]\2\2\u00c5\u00c6\7_\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7c\2\2\u00c8"+
		"\u00c9\7p\2\2\u00c9\u00ca\7f\2\2\u00ca,\3\2\2\2\u00cb\u00cc\7q\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7q\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7{\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7j\2\2"+
		"\u00d8\u00d9\7w\2\2\u00d9\u00da\7u\2\2\u00da\62\3\2\2\2\u00db\u00dc\7"+
		"y\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7n\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\64\3\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7h\2\2\u00e3\66"+
		"\3\2\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7u\2\2\u00e98\3\2\2\2\u00ea\u00eb\7K\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec:\3\2\2\2\u00ed\u00ee\7@\2\2\u00ee<\3\2\2\2\u00ef\u00f0"+
		"\7>\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f3\7@\2\2\u00f3@\3"+
		"\2\2\2\u00f4\u00f5\7?\2\2\u00f5\u00f6\7>\2\2\u00f6B\3\2\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f8\u00f9\7?\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc"+
		"\7?\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7?\2\2\u00feH\3\2\2\2\u00ff\u0100\7"+
		"e\2\2\u0100\u0101\7j\2\2\u0101\u0102\7c\2\2\u0102\u0103\7q\2\2\u0103\u0104"+
		"\7u\2\2\u0104J\3\2\2\2\u0105\u0106\7e\2\2\u0106\u0107\7n\2\2\u0107\u0108"+
		"\7c\2\2\u0108\u0109\7u\2\2\u0109\u010a\7u\2\2\u010aL\3\2\2\2\u010b\u010c"+
		"\7p\2\2\u010c\u010d\7g\2\2\u010d\u010e\7o\2\2\u010e\u010f\7g\2\2\u010f"+
		"\u0110\7u\2\2\u0110\u0111\7k\2\2\u0111\u0112\7u\2\2\u0112N\3\2\2\2\u0113"+
		"\u0114\7r\2\2\u0114\u0115\7e\2\2\u0115\u0116\7m\2\2\u0116P\3\2\2\2\u0117"+
		"\u0118\7h\2\2\u0118\u0119\7w\2\2\u0119\u011a\7p\2\2\u011a\u011b\7e\2\2"+
		"\u011bR\3\2\2\2\u011c\u011d\7G\2\2\u011d\u011e\7z\2\2\u011e\u011f\7v\2"+
		"\2\u011fT\3\2\2\2\u0120\u0121\7}\2\2\u0121V\3\2\2\2\u0122\u0123\7\177"+
		"\2\2\u0123X\3\2\2\2\u0124\u0125\7*\2\2\u0125Z\3\2\2\2\u0126\u0127\7+\2"+
		"\2\u0127\\\3\2\2\2\u0128\u0129\7]\2\2\u0129^\3\2\2\2\u012a\u012b\7_\2"+
		"\2\u012b`\3\2\2\2\u012c\u012d\7=\2\2\u012db\3\2\2\2\u012e\u012f\7$\2\2"+
		"\u012fd\3\2\2\2\u0130\u0131\7\u00c4\2\2\u0131\u0132\7\u00b2\2\2\u0132"+
		"f\3\2\2\2\u0133\u0137\t\2\2\2\u0134\u0136\t\3\2\2\u0135\u0134\3\2\2\2"+
		"\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138h\3"+
		"\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\t\4\2\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013ej\3\2\2\2"+
		"\u013f\u0140\7v\2\2\u0140\u0141\7t\2\2\u0141\u0142\7w\2\2\u0142\u0143"+
		"\7g\2\2\u0143\u014b\7-\2\2\u0144\u0145\7h\2\2\u0145\u0146\7c\2\2\u0146"+
		"\u0147\7n\2\2\u0147\u0148\7u\2\2\u0148\u0149\7g\2\2\u0149\u014b\7/\2\2"+
		"\u014a\u013f\3\2\2\2\u014a\u0144\3\2\2\2\u014bl\3\2\2\2\u014c\u014d\t"+
		"\2\2\2\u014dn\3\2\2\2\u014e\u0150\t\5\2\2\u014f\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\b8\2\2\u0154p\3\2\2\2\7\2\u0137\u013d\u014a\u0151\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}