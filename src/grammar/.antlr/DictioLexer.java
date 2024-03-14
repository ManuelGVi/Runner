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
		WS=1, LETS=2, RUN=3, COMP=4, IMP=5, ASTE=6, DIA=7, RES=8, SUM=9, EQU=10, 
		LLAVEA=11, LLAVEC=12, DOT=13, ID=14, INT=15, PARA=16, PARC=17, SC=18, 
		COMA=19, COMID=20, TEXTO=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LETS", "RUN", "COMP", "IMP", "ASTE", "DIA", "RES", "SUM", "EQU", 
			"LLAVEA", "LLAVEC", "DOT", "ID", "INT", "PARA", "PARC", "SC", "COMA", 
			"COMID", "TEXTO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'lets'", "'run'", "'comp'", "'imp'", "'*'", "'/'", "'-'", 
			"'+'", "'='", "'{'", "'}'", "'.'", null, null, "'('", "')'", "';'", "','", 
			"'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LETS", "RUN", "COMP", "IMP", "ASTE", "DIA", "RES", "SUM", 
			"EQU", "LLAVEA", "LLAVEC", "DOT", "ID", "INT", "PARA", "PARC", "SC", 
			"COMA", "COMID", "TEXTO"
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
		"\u0004\u0000\u0015q\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0004\u0000-\b\u0000\u000b\u0000\f\u0000.\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0004\rV\b\r\u000b\r\f\rW\u0001\u000e\u0004\u000e"+
		"[\b\u000e\u000b\u000e\f\u000e\\\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0005\u0014k\b\u0014\n\u0014\f\u0014n\t"+
		"\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015\u0001\u0000\u0004\u0003\u0000\t\n\r\r  "+
		"\u0002\u0000AZaz\u0001\u000009\u0003\u0000\n\n\r\r\"\"t\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001,\u0001\u0000"+
		"\u0000\u0000\u00032\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000"+
		"\u0007;\u0001\u0000\u0000\u0000\t@\u0001\u0000\u0000\u0000\u000bD\u0001"+
		"\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000fH\u0001\u0000\u0000"+
		"\u0000\u0011J\u0001\u0000\u0000\u0000\u0013L\u0001\u0000\u0000\u0000\u0015"+
		"N\u0001\u0000\u0000\u0000\u0017P\u0001\u0000\u0000\u0000\u0019R\u0001"+
		"\u0000\u0000\u0000\u001bU\u0001\u0000\u0000\u0000\u001dZ\u0001\u0000\u0000"+
		"\u0000\u001f^\u0001\u0000\u0000\u0000!`\u0001\u0000\u0000\u0000#b\u0001"+
		"\u0000\u0000\u0000%d\u0001\u0000\u0000\u0000\'f\u0001\u0000\u0000\u0000"+
		")h\u0001\u0000\u0000\u0000+-\u0007\u0000\u0000\u0000,+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000001\u0006\u0000\u0000\u00001\u0002"+
		"\u0001\u0000\u0000\u000023\u0005l\u0000\u000034\u0005e\u0000\u000045\u0005"+
		"t\u0000\u000056\u0005s\u0000\u00006\u0004\u0001\u0000\u0000\u000078\u0005"+
		"r\u0000\u000089\u0005u\u0000\u00009:\u0005n\u0000\u0000:\u0006\u0001\u0000"+
		"\u0000\u0000;<\u0005c\u0000\u0000<=\u0005o\u0000\u0000=>\u0005m\u0000"+
		"\u0000>?\u0005p\u0000\u0000?\b\u0001\u0000\u0000\u0000@A\u0005i\u0000"+
		"\u0000AB\u0005m\u0000\u0000BC\u0005p\u0000\u0000C\n\u0001\u0000\u0000"+
		"\u0000DE\u0005*\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005/\u0000"+
		"\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005-\u0000\u0000I\u0010\u0001"+
		"\u0000\u0000\u0000JK\u0005+\u0000\u0000K\u0012\u0001\u0000\u0000\u0000"+
		"LM\u0005=\u0000\u0000M\u0014\u0001\u0000\u0000\u0000NO\u0005{\u0000\u0000"+
		"O\u0016\u0001\u0000\u0000\u0000PQ\u0005}\u0000\u0000Q\u0018\u0001\u0000"+
		"\u0000\u0000RS\u0005.\u0000\u0000S\u001a\u0001\u0000\u0000\u0000TV\u0007"+
		"\u0001\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u001c\u0001\u0000"+
		"\u0000\u0000Y[\u0007\u0002\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]\u001e\u0001\u0000\u0000\u0000^_\u0005(\u0000\u0000_ \u0001\u0000\u0000"+
		"\u0000`a\u0005)\u0000\u0000a\"\u0001\u0000\u0000\u0000bc\u0005;\u0000"+
		"\u0000c$\u0001\u0000\u0000\u0000de\u0005,\u0000\u0000e&\u0001\u0000\u0000"+
		"\u0000fg\u0005\"\u0000\u0000g(\u0001\u0000\u0000\u0000hl\u0003\'\u0013"+
		"\u0000ik\b\u0003\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0003\'\u0013\u0000p*\u0001\u0000"+
		"\u0000\u0000\u0005\u0000.W\\l\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}