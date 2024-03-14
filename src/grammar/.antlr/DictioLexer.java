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
		WS=1, LETS=2, RUN=3, COMP=4, IMP=5, IF=6, ELSE=7, ASTE=8, DIA=9, RES=10, 
		SUM=11, EQU=12, LLAVEA=13, LLAVEC=14, DOT=15, ID=16, INT=17, PARA=18, 
		PARC=19, SC=20, COMA=21, COMID=22, MAYORQUE=23, MENORQUE=24, IGUAL=25, 
		DIFERENTE=26, TEXTO=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LETS", "RUN", "COMP", "IMP", "IF", "ELSE", "ASTE", "DIA", "RES", 
			"SUM", "EQU", "LLAVEA", "LLAVEC", "DOT", "ID", "INT", "PARA", "PARC", 
			"SC", "COMA", "COMID", "MAYORQUE", "MENORQUE", "IGUAL", "DIFERENTE", 
			"TEXTO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'lets'", "'run'", "'comp'", "'imp'", "'si'", "'sino'", "'*'", 
			"'/'", "'-'", "'+'", "'='", "'{'", "'}'", "'.'", null, null, "'('", "')'", 
			"';'", "','", "'\"'", "'>'", "'<'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LETS", "RUN", "COMP", "IMP", "IF", "ELSE", "ASTE", "DIA", 
			"RES", "SUM", "EQU", "LLAVEA", "LLAVEC", "DOT", "ID", "INT", "PARA", 
			"PARC", "SC", "COMA", "COMID", "MAYORQUE", "MENORQUE", "IGUAL", "DIFERENTE", 
			"TEXTO"
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
		"\u0004\u0000\u001b\u008f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0004\u00009\b\u0000\u000b\u0000\f\u0000:\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000fj\b"+
		"\u000f\u000b\u000f\f\u000fk\u0001\u0010\u0004\u0010o\b\u0010\u000b\u0010"+
		"\f\u0010p\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0089\b\u001a\n\u001a\f\u001a\u008c\t\u001a\u0001\u001a\u0001\u001a\u0000"+
		"\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b\u0001\u0000\u0004\u0003\u0000\t\n"+
		"\r\r  \u0002\u0000AZaz\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0092\u0000"+
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
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00018\u0001\u0000\u0000\u0000"+
		"\u0003>\u0001\u0000\u0000\u0000\u0005C\u0001\u0000\u0000\u0000\u0007G"+
		"\u0001\u0000\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000bP\u0001\u0000"+
		"\u0000\u0000\rS\u0001\u0000\u0000\u0000\u000fX\u0001\u0000\u0000\u0000"+
		"\u0011Z\u0001\u0000\u0000\u0000\u0013\\\u0001\u0000\u0000\u0000\u0015"+
		"^\u0001\u0000\u0000\u0000\u0017`\u0001\u0000\u0000\u0000\u0019b\u0001"+
		"\u0000\u0000\u0000\u001bd\u0001\u0000\u0000\u0000\u001df\u0001\u0000\u0000"+
		"\u0000\u001fi\u0001\u0000\u0000\u0000!n\u0001\u0000\u0000\u0000#r\u0001"+
		"\u0000\u0000\u0000%t\u0001\u0000\u0000\u0000\'v\u0001\u0000\u0000\u0000"+
		")x\u0001\u0000\u0000\u0000+z\u0001\u0000\u0000\u0000-|\u0001\u0000\u0000"+
		"\u0000/~\u0001\u0000\u0000\u00001\u0080\u0001\u0000\u0000\u00003\u0083"+
		"\u0001\u0000\u0000\u00005\u0086\u0001\u0000\u0000\u000079\u0007\u0000"+
		"\u0000\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<=\u0006\u0000\u0000\u0000=\u0002\u0001\u0000\u0000\u0000>?\u0005l\u0000"+
		"\u0000?@\u0005e\u0000\u0000@A\u0005t\u0000\u0000AB\u0005s\u0000\u0000"+
		"B\u0004\u0001\u0000\u0000\u0000CD\u0005r\u0000\u0000DE\u0005u\u0000\u0000"+
		"EF\u0005n\u0000\u0000F\u0006\u0001\u0000\u0000\u0000GH\u0005c\u0000\u0000"+
		"HI\u0005o\u0000\u0000IJ\u0005m\u0000\u0000JK\u0005p\u0000\u0000K\b\u0001"+
		"\u0000\u0000\u0000LM\u0005i\u0000\u0000MN\u0005m\u0000\u0000NO\u0005p"+
		"\u0000\u0000O\n\u0001\u0000\u0000\u0000PQ\u0005s\u0000\u0000QR\u0005i"+
		"\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005s\u0000\u0000TU\u0005i"+
		"\u0000\u0000UV\u0005n\u0000\u0000VW\u0005o\u0000\u0000W\u000e\u0001\u0000"+
		"\u0000\u0000XY\u0005*\u0000\u0000Y\u0010\u0001\u0000\u0000\u0000Z[\u0005"+
		"/\u0000\u0000[\u0012\u0001\u0000\u0000\u0000\\]\u0005-\u0000\u0000]\u0014"+
		"\u0001\u0000\u0000\u0000^_\u0005+\u0000\u0000_\u0016\u0001\u0000\u0000"+
		"\u0000`a\u0005=\u0000\u0000a\u0018\u0001\u0000\u0000\u0000bc\u0005{\u0000"+
		"\u0000c\u001a\u0001\u0000\u0000\u0000de\u0005}\u0000\u0000e\u001c\u0001"+
		"\u0000\u0000\u0000fg\u0005.\u0000\u0000g\u001e\u0001\u0000\u0000\u0000"+
		"hj\u0007\u0001\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l \u0001\u0000"+
		"\u0000\u0000mo\u0007\u0002\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"q\"\u0001\u0000\u0000\u0000rs\u0005(\u0000\u0000s$\u0001\u0000\u0000\u0000"+
		"tu\u0005)\u0000\u0000u&\u0001\u0000\u0000\u0000vw\u0005;\u0000\u0000w"+
		"(\u0001\u0000\u0000\u0000xy\u0005,\u0000\u0000y*\u0001\u0000\u0000\u0000"+
		"z{\u0005\"\u0000\u0000{,\u0001\u0000\u0000\u0000|}\u0005>\u0000\u0000"+
		"}.\u0001\u0000\u0000\u0000~\u007f\u0005<\u0000\u0000\u007f0\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005=\u0000\u0000\u0081\u0082\u0005=\u0000\u0000"+
		"\u00822\u0001\u0000\u0000\u0000\u0083\u0084\u0005!\u0000\u0000\u0084\u0085"+
		"\u0005=\u0000\u0000\u00854\u0001\u0000\u0000\u0000\u0086\u008a\u0003+"+
		"\u0015\u0000\u0087\u0089\b\u0003\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0003+\u0015\u0000"+
		"\u008e6\u0001\u0000\u0000\u0000\u0005\u0000:kp\u008a\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}