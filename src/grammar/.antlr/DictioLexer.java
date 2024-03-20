// Generated from c:/Users/neoge/Documents/automatas/Runner/src/grammar/Dictio.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DictioLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMENTARIO=2, LETS=3, RUN=4, COMP=5, IMP=6, IF=7, ELSE=8, VERDAD=9, 
		FALSO=10, ASTE=11, DIA=12, RES=13, SUM=14, EQU=15, LLAVEA=16, LLAVEC=17, 
		DOT=18, ID=19, INT=20, PARA=21, PARC=22, SC=23, COMA=24, COMID=25, MAYORQUE=26, 
		MENORQUE=27, IGUAL=28, DIFERENTE=29, TEXTO=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMENTARIO", "LETS", "RUN", "COMP", "IMP", "IF", "ELSE", "VERDAD", 
			"FALSO", "ASTE", "DIA", "RES", "SUM", "EQU", "LLAVEA", "LLAVEC", "DOT", 
			"ID", "INT", "PARA", "PARC", "SC", "COMA", "COMID", "MAYORQUE", "MENORQUE", 
			"IGUAL", "DIFERENTE", "TEXTO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'lets'", "'run'", "'comp'", "'imp'", "'si'", "'sino'", 
			"'true'", "'false'", "'*'", "'/'", "'-'", "'+'", "'='", "'{'", "'}'", 
			"'.'", null, null, "'('", "')'", "';'", "','", "'\"'", "'>'", "'<'", 
			"'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMENTARIO", "LETS", "RUN", "COMP", "IMP", "IF", "ELSE", 
			"VERDAD", "FALSO", "ASTE", "DIA", "RES", "SUM", "EQU", "LLAVEA", "LLAVEC", 
			"DOT", "ID", "INT", "PARA", "PARC", "SC", "COMA", "COMID", "MAYORQUE", 
			"MENORQUE", "IGUAL", "DIFERENTE", "TEXTO"
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


	public DictioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dictio.g4"; }

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
		"\u0004\u0000\u001e\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0004\u0000?\b\u0000\u000b\u0000\f\u0000@\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001I\b"+
		"\u0001\n\u0001\f\u0001L\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012"+
		"\u0086\b\u0012\u000b\u0012\f\u0012\u0087\u0001\u0013\u0004\u0013\u008b"+
		"\b\u0013\u000b\u0013\f\u0013\u008c\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u00a5\b\u001d\n\u001d\f\u001d\u00a8\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0000\u0000\u001e\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e\u0001\u0000\u0005\u0003\u0000\t\n\r\r  \u0002\u0000\n\n"+
		"\r\r\u0002\u0000AZaz\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u00af\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0001>"+
		"\u0001\u0000\u0000\u0000\u0003D\u0001\u0000\u0000\u0000\u0005O\u0001\u0000"+
		"\u0000\u0000\u0007T\u0001\u0000\u0000\u0000\tX\u0001\u0000\u0000\u0000"+
		"\u000b]\u0001\u0000\u0000\u0000\ra\u0001\u0000\u0000\u0000\u000fd\u0001"+
		"\u0000\u0000\u0000\u0011i\u0001\u0000\u0000\u0000\u0013n\u0001\u0000\u0000"+
		"\u0000\u0015t\u0001\u0000\u0000\u0000\u0017v\u0001\u0000\u0000\u0000\u0019"+
		"x\u0001\u0000\u0000\u0000\u001bz\u0001\u0000\u0000\u0000\u001d|\u0001"+
		"\u0000\u0000\u0000\u001f~\u0001\u0000\u0000\u0000!\u0080\u0001\u0000\u0000"+
		"\u0000#\u0082\u0001\u0000\u0000\u0000%\u0085\u0001\u0000\u0000\u0000\'"+
		"\u008a\u0001\u0000\u0000\u0000)\u008e\u0001\u0000\u0000\u0000+\u0090\u0001"+
		"\u0000\u0000\u0000-\u0092\u0001\u0000\u0000\u0000/\u0094\u0001\u0000\u0000"+
		"\u00001\u0096\u0001\u0000\u0000\u00003\u0098\u0001\u0000\u0000\u00005"+
		"\u009a\u0001\u0000\u0000\u00007\u009c\u0001\u0000\u0000\u00009\u009f\u0001"+
		"\u0000\u0000\u0000;\u00a2\u0001\u0000\u0000\u0000=?\u0007\u0000\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0006"+
		"\u0000\u0000\u0000C\u0002\u0001\u0000\u0000\u0000DE\u0005/\u0000\u0000"+
		"EF\u0005/\u0000\u0000FJ\u0001\u0000\u0000\u0000GI\b\u0001\u0000\u0000"+
		"HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000MN\u0006\u0001\u0000\u0000N\u0004\u0001\u0000\u0000\u0000"+
		"OP\u0005l\u0000\u0000PQ\u0005e\u0000\u0000QR\u0005t\u0000\u0000RS\u0005"+
		"s\u0000\u0000S\u0006\u0001\u0000\u0000\u0000TU\u0005r\u0000\u0000UV\u0005"+
		"u\u0000\u0000VW\u0005n\u0000\u0000W\b\u0001\u0000\u0000\u0000XY\u0005"+
		"c\u0000\u0000YZ\u0005o\u0000\u0000Z[\u0005m\u0000\u0000[\\\u0005p\u0000"+
		"\u0000\\\n\u0001\u0000\u0000\u0000]^\u0005i\u0000\u0000^_\u0005m\u0000"+
		"\u0000_`\u0005p\u0000\u0000`\f\u0001\u0000\u0000\u0000ab\u0005s\u0000"+
		"\u0000bc\u0005i\u0000\u0000c\u000e\u0001\u0000\u0000\u0000de\u0005s\u0000"+
		"\u0000ef\u0005i\u0000\u0000fg\u0005n\u0000\u0000gh\u0005o\u0000\u0000"+
		"h\u0010\u0001\u0000\u0000\u0000ij\u0005t\u0000\u0000jk\u0005r\u0000\u0000"+
		"kl\u0005u\u0000\u0000lm\u0005e\u0000\u0000m\u0012\u0001\u0000\u0000\u0000"+
		"no\u0005f\u0000\u0000op\u0005a\u0000\u0000pq\u0005l\u0000\u0000qr\u0005"+
		"s\u0000\u0000rs\u0005e\u0000\u0000s\u0014\u0001\u0000\u0000\u0000tu\u0005"+
		"*\u0000\u0000u\u0016\u0001\u0000\u0000\u0000vw\u0005/\u0000\u0000w\u0018"+
		"\u0001\u0000\u0000\u0000xy\u0005-\u0000\u0000y\u001a\u0001\u0000\u0000"+
		"\u0000z{\u0005+\u0000\u0000{\u001c\u0001\u0000\u0000\u0000|}\u0005=\u0000"+
		"\u0000}\u001e\u0001\u0000\u0000\u0000~\u007f\u0005{\u0000\u0000\u007f"+
		" \u0001\u0000\u0000\u0000\u0080\u0081\u0005}\u0000\u0000\u0081\"\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005.\u0000\u0000\u0083$\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0007\u0002\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088&\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\u0007\u0003\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d(\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005(\u0000\u0000\u008f*\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		")\u0000\u0000\u0091,\u0001\u0000\u0000\u0000\u0092\u0093\u0005;\u0000"+
		"\u0000\u0093.\u0001\u0000\u0000\u0000\u0094\u0095\u0005,\u0000\u0000\u0095"+
		"0\u0001\u0000\u0000\u0000\u0096\u0097\u0005\"\u0000\u0000\u00972\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005>\u0000\u0000\u00994\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005<\u0000\u0000\u009b6\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005=\u0000\u0000\u009d\u009e\u0005=\u0000\u0000\u009e8\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005!\u0000\u0000\u00a0\u00a1\u0005=\u0000"+
		"\u0000\u00a1:\u0001\u0000\u0000\u0000\u00a2\u00a6\u00031\u0018\u0000\u00a3"+
		"\u00a5\b\u0004\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u00031\u0018\u0000\u00aa<\u0001\u0000"+
		"\u0000\u0000\u0006\u0000@J\u0087\u008c\u00a6\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}