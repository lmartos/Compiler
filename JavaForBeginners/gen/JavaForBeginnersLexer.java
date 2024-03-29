// Generated from C:/Users/Nyuu-PC/Desktop/CompilerLaurensMartos/JavaForBeginners\JavaForBeginners.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaForBeginnersLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, DATATYPE=12, INT=13, FLOAT=14, BOOLEAN=15, STRING=16, 
		VAR_NAME=17, COMMENT=18, SPACE=19, ASSIGN=20, SEMICOLON=21, GREATERTHAN=22, 
		SMALLERTHAN=23, GREATEROREQUALS=24, SMALLEROREQUALS=25, EQUALS=26, NOTEQUALS=27, 
		AND=28, OR=29, NOT=30, ABSOLUTE=31, EXTREME=32, PLUS=33, MINUS=34, MULTIPLY=35, 
		DIVIDE=36, ADDASSIGN=37, MINUSASSIGN=38, MULTIPLYASSIGN=39, DIVIDEASSIGN=40, 
		MODULUS=41, PLUSPLUS=42, MINMIN=43, OPEN_FUNC_OR_COND=44, CLOSE_FUNC_OR_COND=45, 
		RETURN=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "DATATYPE", "INT", "FLOAT", "BOOLEAN", "STRING", "VAR_NAME", 
		"COMMENT", "SPACE", "ASSIGN", "SEMICOLON", "GREATERTHAN", "SMALLERTHAN", 
		"GREATEROREQUALS", "SMALLEROREQUALS", "EQUALS", "NOTEQUALS", "AND", "OR", 
		"NOT", "ABSOLUTE", "EXTREME", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "ADDASSIGN", 
		"MINUSASSIGN", "MULTIPLYASSIGN", "DIVIDEASSIGN", "MODULUS", "PLUSPLUS", 
		"MINMIN", "OPEN_FUNC_OR_COND", "CLOSE_FUNC_OR_COND", "RETURN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'read_user_input_of_type('", "'display_this('", "'if_this_is_true'", 
		"'else_if_this_is_true'", "'else_if_it_is_false'", "'while_this_is_true'", 
		"'for_this_duration'", "'{'", "'}'", "'function'", "','", null, null, 
		null, null, null, null, null, null, "'='", "';'", "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'|'", "'$'", "'+'", "'-'", 
		"'*'", "'/'", null, null, null, null, "'%'", "'++'", "'--'", "'('", "')'", 
		"'give_this_back'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"DATATYPE", "INT", "FLOAT", "BOOLEAN", "STRING", "VAR_NAME", "COMMENT", 
		"SPACE", "ASSIGN", "SEMICOLON", "GREATERTHAN", "SMALLERTHAN", "GREATEROREQUALS", 
		"SMALLEROREQUALS", "EQUALS", "NOTEQUALS", "AND", "OR", "NOT", "ABSOLUTE", 
		"EXTREME", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "ADDASSIGN", "MINUSASSIGN", 
		"MULTIPLYASSIGN", "DIVIDEASSIGN", "MODULUS", "PLUSPLUS", "MINMIN", "OPEN_FUNC_OR_COND", 
		"CLOSE_FUNC_OR_COND", "RETURN"
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


	public JavaForBeginnersLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaForBeginners.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u01ba\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u011b\n\r\3\16\6\16\u011e\n\16\r\16\16\16\u011f\3\17"+
		"\6\17\u0123\n\17\r\17\16\17\u0124\3\17\3\17\7\17\u0129\n\17\f\17\16\17"+
		"\u012c\13\17\3\17\3\17\6\17\u0130\n\17\r\17\16\17\u0131\5\17\u0134\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u013f\n\20\3\21\3\21"+
		"\3\21\3\21\7\21\u0145\n\21\f\21\16\21\u0148\13\21\3\21\3\21\3\22\3\22"+
		"\7\22\u014e\n\22\f\22\16\22\u0151\13\22\3\23\3\23\7\23\u0155\n\23\f\23"+
		"\16\23\u0158\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3&\3&\5&\u018c\n&\3\'\3\'\3\'\3\'\5\'\u0192\n\'"+
		"\3(\3(\3(\3(\5(\u0198\n(\3)\3)\3)\3)\5)\u019e\n)\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\2\2\60\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\b\3\2\62;\5\2\f\f\17\17$$\4"+
		"\2C\\c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u01cb\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5x\3\2\2\2"+
		"\7\u0086\3\2\2\2\t\u0096\3\2\2\2\13\u00ab\3\2\2\2\r\u00bf\3\2\2\2\17\u00d2"+
		"\3\2\2\2\21\u00e4\3\2\2\2\23\u00e6\3\2\2\2\25\u00e8\3\2\2\2\27\u00f1\3"+
		"\2\2\2\31\u011a\3\2\2\2\33\u011d\3\2\2\2\35\u0133\3\2\2\2\37\u013e\3\2"+
		"\2\2!\u0140\3\2\2\2#\u014b\3\2\2\2%\u0152\3\2\2\2\'\u015b\3\2\2\2)\u015f"+
		"\3\2\2\2+\u0161\3\2\2\2-\u0163\3\2\2\2/\u0165\3\2\2\2\61\u0167\3\2\2\2"+
		"\63\u016a\3\2\2\2\65\u016d\3\2\2\2\67\u0170\3\2\2\29\u0173\3\2\2\2;\u0176"+
		"\3\2\2\2=\u0179\3\2\2\2?\u017b\3\2\2\2A\u017d\3\2\2\2C\u017f\3\2\2\2E"+
		"\u0181\3\2\2\2G\u0183\3\2\2\2I\u0185\3\2\2\2K\u018b\3\2\2\2M\u0191\3\2"+
		"\2\2O\u0197\3\2\2\2Q\u019d\3\2\2\2S\u019f\3\2\2\2U\u01a1\3\2\2\2W\u01a4"+
		"\3\2\2\2Y\u01a7\3\2\2\2[\u01a9\3\2\2\2]\u01ab\3\2\2\2_`\7t\2\2`a\7g\2"+
		"\2ab\7c\2\2bc\7f\2\2cd\7a\2\2de\7w\2\2ef\7u\2\2fg\7g\2\2gh\7t\2\2hi\7"+
		"a\2\2ij\7k\2\2jk\7p\2\2kl\7r\2\2lm\7w\2\2mn\7v\2\2no\7a\2\2op\7q\2\2p"+
		"q\7h\2\2qr\7a\2\2rs\7v\2\2st\7{\2\2tu\7r\2\2uv\7g\2\2vw\7*\2\2w\4\3\2"+
		"\2\2xy\7f\2\2yz\7k\2\2z{\7u\2\2{|\7r\2\2|}\7n\2\2}~\7c\2\2~\177\7{\2\2"+
		"\177\u0080\7a\2\2\u0080\u0081\7v\2\2\u0081\u0082\7j\2\2\u0082\u0083\7"+
		"k\2\2\u0083\u0084\7u\2\2\u0084\u0085\7*\2\2\u0085\6\3\2\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7h\2\2\u0088\u0089\7a\2\2\u0089\u008a\7v\2\2\u008a"+
		"\u008b\7j\2\2\u008b\u008c\7k\2\2\u008c\u008d\7u\2\2\u008d\u008e\7a\2\2"+
		"\u008e\u008f\7k\2\2\u008f\u0090\7u\2\2\u0090\u0091\7a\2\2\u0091\u0092"+
		"\7v\2\2\u0092\u0093\7t\2\2\u0093\u0094\7w\2\2\u0094\u0095\7g\2\2\u0095"+
		"\b\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099"+
		"\u009a\7g\2\2\u009a\u009b\7a\2\2\u009b\u009c\7k\2\2\u009c\u009d\7h\2\2"+
		"\u009d\u009e\7a\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7j\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7a\2\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7a\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7t\2\2"+
		"\u00a8\u00a9\7w\2\2\u00a9\u00aa\7g\2\2\u00aa\n\3\2\2\2\u00ab\u00ac\7g"+
		"\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7a\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7a\2\2\u00b3"+
		"\u00b4\7k\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7a\2\2\u00b6\u00b7\7k\2\2"+
		"\u00b7\u00b8\7u\2\2\u00b8\u00b9\7a\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb"+
		"\7c\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\f\3\2\2\2\u00bf\u00c0\7y\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7n\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7a\2\2\u00c5\u00c6\7v\2\2"+
		"\u00c6\u00c7\7j\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca"+
		"\7a\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7a\2\2\u00cd"+
		"\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7g\2\2"+
		"\u00d1\16\3\2\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7"+
		"t\2\2\u00d5\u00d6\7a\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7j\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7a\2\2\u00db\u00dc\7f\2\2\u00dc"+
		"\u00dd\7w\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7v\2\2"+
		"\u00e0\u00e1\7k\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7p\2\2\u00e3\20\3\2"+
		"\2\2\u00e4\u00e5\7}\2\2\u00e5\22\3\2\2\2\u00e6\u00e7\7\177\2\2\u00e7\24"+
		"\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7p\2\2\u00eb"+
		"\u00ec\7e\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7q\2\2"+
		"\u00ef\u00f0\7p\2\2\u00f0\26\3\2\2\2\u00f1\u00f2\7.\2\2\u00f2\30\3\2\2"+
		"\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7z\2\2\u00f6\u011b"+
		"\7v\2\2\u00f7\u00f8\7y\2\2\u00f8\u00f9\7j\2\2\u00f9\u00fa\7q\2\2\u00fa"+
		"\u00fb\7n\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7a\2\2\u00fd\u00fe\7p\2\2"+
		"\u00fe\u00ff\7w\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7d\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u011b\7t\2\2\u0103\u0104\7f\2\2\u0104\u0105\7g\2\2\u0105"+
		"\u0106\7e\2\2\u0106\u0107\7k\2\2\u0107\u0108\7o\2\2\u0108\u0109\7c\2\2"+
		"\u0109\u011b\7n\2\2\u010a\u010b\7e\2\2\u010b\u010c\7q\2\2\u010c\u010d"+
		"\7p\2\2\u010d\u010e\7f\2\2\u010e\u010f\7k\2\2\u010f\u0110\7v\2\2\u0110"+
		"\u0111\7k\2\2\u0111\u0112\7q\2\2\u0112\u011b\7p\2\2\u0113\u0114\7p\2\2"+
		"\u0114\u0115\7q\2\2\u0115\u0116\7v\2\2\u0116\u0117\7j\2\2\u0117\u0118"+
		"\7k\2\2\u0118\u0119\7p\2\2\u0119\u011b\7i\2\2\u011a\u00f3\3\2\2\2\u011a"+
		"\u00f7\3\2\2\2\u011a\u0103\3\2\2\2\u011a\u010a\3\2\2\2\u011a\u0113\3\2"+
		"\2\2\u011b\32\3\2\2\2\u011c\u011e\t\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\34\3\2\2\2\u0121"+
		"\u0123\t\2\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012a\7\60\2\2\u0127"+
		"\u0129\t\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u0134\3\2\2\2\u012c\u012a\3\2\2\2\u012d"+
		"\u012f\7\60\2\2\u012e\u0130\t\2\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0122\3\2\2\2\u0133\u012d\3\2\2\2\u0134\36\3\2\2\2\u0135\u0136\7v\2\2"+
		"\u0136\u0137\7t\2\2\u0137\u0138\7w\2\2\u0138\u013f\7g\2\2\u0139\u013a"+
		"\7h\2\2\u013a\u013b\7c\2\2\u013b\u013c\7n\2\2\u013c\u013d\7u\2\2\u013d"+
		"\u013f\7g\2\2\u013e\u0135\3\2\2\2\u013e\u0139\3\2\2\2\u013f \3\2\2\2\u0140"+
		"\u0146\7$\2\2\u0141\u0145\n\3\2\2\u0142\u0143\7$\2\2\u0143\u0145\7$\2"+
		"\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014a\7$\2\2\u014a\"\3\2\2\2\u014b\u014f\t\4\2\2\u014c\u014e\t\5\2\2"+
		"\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150$\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0156\7%\2\2\u0153\u0155"+
		"\n\6\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\b\23"+
		"\2\2\u015a&\3\2\2\2\u015b\u015c\t\7\2\2\u015c\u015d\3\2\2\2\u015d\u015e"+
		"\b\24\2\2\u015e(\3\2\2\2\u015f\u0160\7?\2\2\u0160*\3\2\2\2\u0161\u0162"+
		"\7=\2\2\u0162,\3\2\2\2\u0163\u0164\7@\2\2\u0164.\3\2\2\2\u0165\u0166\7"+
		">\2\2\u0166\60\3\2\2\2\u0167\u0168\7@\2\2\u0168\u0169\7?\2\2\u0169\62"+
		"\3\2\2\2\u016a\u016b\7>\2\2\u016b\u016c\7?\2\2\u016c\64\3\2\2\2\u016d"+
		"\u016e\7?\2\2\u016e\u016f\7?\2\2\u016f\66\3\2\2\2\u0170\u0171\7#\2\2\u0171"+
		"\u0172\7?\2\2\u01728\3\2\2\2\u0173\u0174\7(\2\2\u0174\u0175\7(\2\2\u0175"+
		":\3\2\2\2\u0176\u0177\7~\2\2\u0177\u0178\7~\2\2\u0178<\3\2\2\2\u0179\u017a"+
		"\7#\2\2\u017a>\3\2\2\2\u017b\u017c\7~\2\2\u017c@\3\2\2\2\u017d\u017e\7"+
		"&\2\2\u017eB\3\2\2\2\u017f\u0180\7-\2\2\u0180D\3\2\2\2\u0181\u0182\7/"+
		"\2\2\u0182F\3\2\2\2\u0183\u0184\7,\2\2\u0184H\3\2\2\2\u0185\u0186\7\61"+
		"\2\2\u0186J\3\2\2\2\u0187\u0188\7-\2\2\u0188\u018c\7?\2\2\u0189\u018a"+
		"\7?\2\2\u018a\u018c\7-\2\2\u018b\u0187\3\2\2\2\u018b\u0189\3\2\2\2\u018c"+
		"L\3\2\2\2\u018d\u018e\7/\2\2\u018e\u0192\7?\2\2\u018f\u0190\7?\2\2\u0190"+
		"\u0192\7/\2\2\u0191\u018d\3\2\2\2\u0191\u018f\3\2\2\2\u0192N\3\2\2\2\u0193"+
		"\u0194\7,\2\2\u0194\u0198\7?\2\2\u0195\u0196\7?\2\2\u0196\u0198\7,\2\2"+
		"\u0197\u0193\3\2\2\2\u0197\u0195\3\2\2\2\u0198P\3\2\2\2\u0199\u019a\7"+
		"\61\2\2\u019a\u019e\7?\2\2\u019b\u019c\7?\2\2\u019c\u019e\7\61\2\2\u019d"+
		"\u0199\3\2\2\2\u019d\u019b\3\2\2\2\u019eR\3\2\2\2\u019f\u01a0\7\'\2\2"+
		"\u01a0T\3\2\2\2\u01a1\u01a2\7-\2\2\u01a2\u01a3\7-\2\2\u01a3V\3\2\2\2\u01a4"+
		"\u01a5\7/\2\2\u01a5\u01a6\7/\2\2\u01a6X\3\2\2\2\u01a7\u01a8\7*\2\2\u01a8"+
		"Z\3\2\2\2\u01a9\u01aa\7+\2\2\u01aa\\\3\2\2\2\u01ab\u01ac\7i\2\2\u01ac"+
		"\u01ad\7k\2\2\u01ad\u01ae\7x\2\2\u01ae\u01af\7g\2\2\u01af\u01b0\7a\2\2"+
		"\u01b0\u01b1\7v\2\2\u01b1\u01b2\7j\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4"+
		"\7u\2\2\u01b4\u01b5\7a\2\2\u01b5\u01b6\7d\2\2\u01b6\u01b7\7c\2\2\u01b7"+
		"\u01b8\7e\2\2\u01b8\u01b9\7m\2\2\u01b9^\3\2\2\2\22\2\u011a\u011f\u0124"+
		"\u012a\u0131\u0133\u013e\u0144\u0146\u014f\u0156\u018b\u0191\u0197\u019d"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}