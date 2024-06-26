// Generated from c:/Users/neoge/Documents/automatas/Runner/src/graccar/CDictio.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CDictioLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMENTARIO=2, SKIPRETUNR=3, VOID=4, MAIN=5, INT=6, PRINTF=7, SI=8, 
		SINO=9, TRUE=10, FALSE=11, WHILE=12, MUL=13, DIV=14, SUB=15, ADD=16, EQUAL=17, 
		LLAVEO=18, LLAVECL=19, PUNTO=20, IDS=21, NUM=22, PARENO=23, PARENC=24, 
		SEMICOLON=25, COMMA=26, COMILLAS=27, GREATERTHAN=28, GREATEREQUAL=29, 
		LOWEREQUAL=30, LOWER=31, COMPARISON=32, NOTEQUAL=33, Y=34, O=35, INCREMENT=36, 
		DECREMENT=37, PER=38, RETURN=39, TEXT=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMENTARIO", "SKIPRETUNR", "VOID", "MAIN", "INT", "PRINTF", "SI", 
			"SINO", "TRUE", "FALSE", "WHILE", "MUL", "DIV", "SUB", "ADD", "EQUAL", 
			"LLAVEO", "LLAVECL", "PUNTO", "IDS", "NUM", "PARENO", "PARENC", "SEMICOLON", 
			"COMMA", "COMILLAS", "GREATERTHAN", "GREATEREQUAL", "LOWEREQUAL", "LOWER", 
			"COMPARISON", "NOTEQUAL", "Y", "O", "INCREMENT", "DECREMENT", "PER", 
			"RETURN", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'void'", "'main'", "'int'", "'printf'", "'if'", 
			"'else'", "'true'", "'false'", "'while'", "'*'", "'/'", "'-'", "'+'", 
			"'='", "'{'", "'}'", "'.'", null, null, "'('", "')'", "';'", "','", "'\"'", 
			"'>'", "'>='", "'<='", "'<'", "'=='", "'!='", "'&&'", "'||'", "'++'", 
			"'--'", "'%'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMENTARIO", "SKIPRETUNR", "VOID", "MAIN", "INT", "PRINTF", 
			"SI", "SINO", "TRUE", "FALSE", "WHILE", "MUL", "DIV", "SUB", "ADD", "EQUAL", 
			"LLAVEO", "LLAVECL", "PUNTO", "IDS", "NUM", "PARENO", "PARENC", "SEMICOLON", 
			"COMMA", "COMILLAS", "GREATERTHAN", "GREATEREQUAL", "LOWEREQUAL", "LOWER", 
			"COMPARISON", "NOTEQUAL", "Y", "O", "INCREMENT", "DECREMENT", "PER", 
			"RETURN", "TEXT"
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


	public CDictioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CDictio.g4"; }

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
		"\u0004\u0000(\u00ed\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0001\u0000\u0004\u0000S\b\u0000\u000b\u0000\f\u0000"+
		"T\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001]\b\u0001\n\u0001\f\u0001`\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0004\u0014\u00a7\b\u0014\u000b\u0014\f\u0014\u00a8\u0001\u0014"+
		"\u0005\u0014\u00ac\b\u0014\n\u0014\f\u0014\u00af\t\u0014\u0001\u0015\u0004"+
		"\u0015\u00b2\b\u0015\u000b\u0015\f\u0015\u00b3\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0005\'\u00e7\b\'\n\'\f\'\u00ea\t\'\u0001\'\u0001\'\u0000\u0000"+
		"(\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"K&M\'O(\u0001\u0000\u0006\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0003"+
		"\u0000AZ^^az\u0003\u000009AZaz\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u00f2"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0001R\u0001\u0000\u0000\u0000\u0003X\u0001\u0000\u0000\u0000"+
		"\u0005c\u0001\u0000\u0000\u0000\u0007g\u0001\u0000\u0000\u0000\tl\u0001"+
		"\u0000\u0000\u0000\u000bq\u0001\u0000\u0000\u0000\ru\u0001\u0000\u0000"+
		"\u0000\u000f|\u0001\u0000\u0000\u0000\u0011\u007f\u0001\u0000\u0000\u0000"+
		"\u0013\u0084\u0001\u0000\u0000\u0000\u0015\u0089\u0001\u0000\u0000\u0000"+
		"\u0017\u008f\u0001\u0000\u0000\u0000\u0019\u0095\u0001\u0000\u0000\u0000"+
		"\u001b\u0097\u0001\u0000\u0000\u0000\u001d\u0099\u0001\u0000\u0000\u0000"+
		"\u001f\u009b\u0001\u0000\u0000\u0000!\u009d\u0001\u0000\u0000\u0000#\u009f"+
		"\u0001\u0000\u0000\u0000%\u00a1\u0001\u0000\u0000\u0000\'\u00a3\u0001"+
		"\u0000\u0000\u0000)\u00a6\u0001\u0000\u0000\u0000+\u00b1\u0001\u0000\u0000"+
		"\u0000-\u00b5\u0001\u0000\u0000\u0000/\u00b7\u0001\u0000\u0000\u00001"+
		"\u00b9\u0001\u0000\u0000\u00003\u00bb\u0001\u0000\u0000\u00005\u00bd\u0001"+
		"\u0000\u0000\u00007\u00bf\u0001\u0000\u0000\u00009\u00c1\u0001\u0000\u0000"+
		"\u0000;\u00c4\u0001\u0000\u0000\u0000=\u00c7\u0001\u0000\u0000\u0000?"+
		"\u00c9\u0001\u0000\u0000\u0000A\u00cc\u0001\u0000\u0000\u0000C\u00cf\u0001"+
		"\u0000\u0000\u0000E\u00d2\u0001\u0000\u0000\u0000G\u00d5\u0001\u0000\u0000"+
		"\u0000I\u00d8\u0001\u0000\u0000\u0000K\u00db\u0001\u0000\u0000\u0000M"+
		"\u00dd\u0001\u0000\u0000\u0000O\u00e4\u0001\u0000\u0000\u0000QS\u0007"+
		"\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VW\u0006\u0000\u0000\u0000W\u0002\u0001\u0000\u0000\u0000XY\u0005"+
		"/\u0000\u0000YZ\u0005/\u0000\u0000Z^\u0001\u0000\u0000\u0000[]\b\u0001"+
		"\u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ab\u0006\u0001\u0000\u0000b\u0004\u0001\u0000"+
		"\u0000\u0000cd\u0003M&\u0000de\u0001\u0000\u0000\u0000ef\u0006\u0002\u0000"+
		"\u0000f\u0006\u0001\u0000\u0000\u0000gh\u0005v\u0000\u0000hi\u0005o\u0000"+
		"\u0000ij\u0005i\u0000\u0000jk\u0005d\u0000\u0000k\b\u0001\u0000\u0000"+
		"\u0000lm\u0005m\u0000\u0000mn\u0005a\u0000\u0000no\u0005i\u0000\u0000"+
		"op\u0005n\u0000\u0000p\n\u0001\u0000\u0000\u0000qr\u0005i\u0000\u0000"+
		"rs\u0005n\u0000\u0000st\u0005t\u0000\u0000t\f\u0001\u0000\u0000\u0000"+
		"uv\u0005p\u0000\u0000vw\u0005r\u0000\u0000wx\u0005i\u0000\u0000xy\u0005"+
		"n\u0000\u0000yz\u0005t\u0000\u0000z{\u0005f\u0000\u0000{\u000e\u0001\u0000"+
		"\u0000\u0000|}\u0005i\u0000\u0000}~\u0005f\u0000\u0000~\u0010\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005e\u0000\u0000\u0080\u0081\u0005l\u0000\u0000"+
		"\u0081\u0082\u0005s\u0000\u0000\u0082\u0083\u0005e\u0000\u0000\u0083\u0012"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005t\u0000\u0000\u0085\u0086\u0005"+
		"r\u0000\u0000\u0086\u0087\u0005u\u0000\u0000\u0087\u0088\u0005e\u0000"+
		"\u0000\u0088\u0014\u0001\u0000\u0000\u0000\u0089\u008a\u0005f\u0000\u0000"+
		"\u008a\u008b\u0005a\u0000\u0000\u008b\u008c\u0005l\u0000\u0000\u008c\u008d"+
		"\u0005s\u0000\u0000\u008d\u008e\u0005e\u0000\u0000\u008e\u0016\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005w\u0000\u0000\u0090\u0091\u0005h\u0000\u0000"+
		"\u0091\u0092\u0005i\u0000\u0000\u0092\u0093\u0005l\u0000\u0000\u0093\u0094"+
		"\u0005e\u0000\u0000\u0094\u0018\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"*\u0000\u0000\u0096\u001a\u0001\u0000\u0000\u0000\u0097\u0098\u0005/\u0000"+
		"\u0000\u0098\u001c\u0001\u0000\u0000\u0000\u0099\u009a\u0005-\u0000\u0000"+
		"\u009a\u001e\u0001\u0000\u0000\u0000\u009b\u009c\u0005+\u0000\u0000\u009c"+
		" \u0001\u0000\u0000\u0000\u009d\u009e\u0005=\u0000\u0000\u009e\"\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005{\u0000\u0000\u00a0$\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005}\u0000\u0000\u00a2&\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0005.\u0000\u0000\u00a4(\u0001\u0000\u0000\u0000\u00a5\u00a7\u0007"+
		"\u0002\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ad\u0001\u0000\u0000\u0000\u00aa\u00ac\u0007"+
		"\u0003\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae*\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b2\u0007\u0004\u0000\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4,\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005(\u0000\u0000\u00b6.\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005)\u0000\u0000\u00b80\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		";\u0000\u0000\u00ba2\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005,\u0000"+
		"\u0000\u00bc4\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\"\u0000\u0000"+
		"\u00be6\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005>\u0000\u0000\u00c08"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005>\u0000\u0000\u00c2\u00c3\u0005"+
		"=\u0000\u0000\u00c3:\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005<\u0000"+
		"\u0000\u00c5\u00c6\u0005=\u0000\u0000\u00c6<\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0005<\u0000\u0000\u00c8>\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"=\u0000\u0000\u00ca\u00cb\u0005=\u0000\u0000\u00cb@\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0005!\u0000\u0000\u00cd\u00ce\u0005=\u0000\u0000\u00ce"+
		"B\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005&\u0000\u0000\u00d0\u00d1\u0005"+
		"&\u0000\u0000\u00d1D\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005|\u0000"+
		"\u0000\u00d3\u00d4\u0005|\u0000\u0000\u00d4F\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005+\u0000\u0000\u00d6\u00d7\u0005+\u0000\u0000\u00d7H\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005-\u0000\u0000\u00d9\u00da\u0005-\u0000"+
		"\u0000\u00daJ\u0001\u0000\u0000\u0000\u00db\u00dc\u0005%\u0000\u0000\u00dc"+
		"L\u0001\u0000\u0000\u0000\u00dd\u00de\u0005r\u0000\u0000\u00de\u00df\u0005"+
		"e\u0000\u0000\u00df\u00e0\u0005t\u0000\u0000\u00e0\u00e1\u0005u\u0000"+
		"\u0000\u00e1\u00e2\u0005r\u0000\u0000\u00e2\u00e3\u0005n\u0000\u0000\u00e3"+
		"N\u0001\u0000\u0000\u0000\u00e4\u00e8\u00035\u001a\u0000\u00e5\u00e7\b"+
		"\u0005\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u00035\u001a\u0000\u00ecP\u0001\u0000\u0000"+
		"\u0000\u0007\u0000T^\u00a8\u00ad\u00b3\u00e8\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}