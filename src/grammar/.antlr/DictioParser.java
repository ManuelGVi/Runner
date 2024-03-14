// Generated from c:/Users/neoge/Documents/automatas/Runner/src/grammar/Dictio.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DictioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LETS=2, RUN=3, COMP=4, IMP=5, ASTE=6, DIA=7, RES=8, SUM=9, EQU=10, 
		LLAVEA=11, LLAVEC=12, DOT=13, ID=14, INT=15, PARA=16, PARC=17, SC=18, 
		COMA=19, COMID=20, TEXTO=21;
	public static final int
		RULE_main = 0, RULE_content = 1, RULE_imprime = 2, RULE_declara = 3, RULE_asigna = 4, 
		RULE_expr = 5, RULE_textobteiner = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "content", "imprime", "declara", "asigna", "expr", "textobteiner"
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

	@Override
	public String getGrammarFileName() { return "Dictio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DictioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode LETS() { return getToken(DictioParser.LETS, 0); }
		public TerminalNode RUN() { return getToken(DictioParser.RUN, 0); }
		public TerminalNode LLAVEA() { return getToken(DictioParser.LLAVEA, 0); }
		public TerminalNode LLAVEC() { return getToken(DictioParser.LLAVEC, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(LETS);
			setState(15);
			match(RUN);
			setState(16);
			match(LLAVEA);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16432L) != 0)) {
				{
				setState(17);
				content();
				}
			}

			setState(20);
			match(LLAVEC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public List<ImprimeContext> imprime() {
			return getRuleContexts(ImprimeContext.class);
		}
		public ImprimeContext imprime(int i) {
			return getRuleContext(ImprimeContext.class,i);
		}
		public List<DeclaraContext> declara() {
			return getRuleContexts(DeclaraContext.class);
		}
		public DeclaraContext declara(int i) {
			return getRuleContext(DeclaraContext.class,i);
		}
		public List<AsignaContext> asigna() {
			return getRuleContexts(AsignaContext.class);
		}
		public AsignaContext asigna(int i) {
			return getRuleContext(AsignaContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(25);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMP:
					{
					setState(22);
					imprime();
					}
					break;
				case COMP:
					{
					setState(23);
					declara();
					}
					break;
				case ID:
					{
					setState(24);
					asigna();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16432L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimeContext extends ParserRuleContext {
		public TerminalNode IMP() { return getToken(DictioParser.IMP, 0); }
		public TerminalNode PARA() { return getToken(DictioParser.PARA, 0); }
		public TextobteinerContext textobteiner() {
			return getRuleContext(TextobteinerContext.class,0);
		}
		public TerminalNode PARC() { return getToken(DictioParser.PARC, 0); }
		public TerminalNode SC() { return getToken(DictioParser.SC, 0); }
		public TerminalNode COMA() { return getToken(DictioParser.COMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imprime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(IMP);
			setState(30);
			match(PARA);
			setState(31);
			textobteiner();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(32);
				match(COMA);
				setState(33);
				expr(0);
				}
			}

			setState(36);
			match(PARC);
			setState(37);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaraContext extends ParserRuleContext {
		public TerminalNode COMP() { return getToken(DictioParser.COMP, 0); }
		public TerminalNode ID() { return getToken(DictioParser.ID, 0); }
		public TerminalNode SC() { return getToken(DictioParser.SC, 0); }
		public TerminalNode EQU() { return getToken(DictioParser.EQU, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(COMP);
			setState(40);
			match(ID);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQU) {
				{
				setState(41);
				match(EQU);
				setState(42);
				expr(0);
				}
			}

			setState(45);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DictioParser.ID, 0); }
		public TerminalNode EQU() { return getToken(DictioParser.EQU, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(DictioParser.SC, 0); }
		public AsignaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asigna; }
	}

	public final AsignaContext asigna() throws RecognitionException {
		AsignaContext _localctx = new AsignaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asigna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ID);
			setState(48);
			match(EQU);
			setState(49);
			expr(0);
			setState(50);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public TerminalNode PARA() { return getToken(DictioParser.PARA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARC() { return getToken(DictioParser.PARC, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddsubContext extends ExprContext {
		public Token operation;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUM() { return getToken(DictioParser.SUM, 0); }
		public TerminalNode RES() { return getToken(DictioParser.RES, 0); }
		public AddsubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public Token operation;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTE() { return getToken(DictioParser.ASTE, 0); }
		public TerminalNode DIA() { return getToken(DictioParser.DIA, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(DictioParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(DictioParser.INT, 0); }
		public TerminalNode RES() { return getToken(DictioParser.RES, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RES:
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RES) {
					{
					setState(53);
					match(RES);
					}
				}

				setState(56);
				match(INT);
				}
				break;
			case PARA:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(PARA);
				setState(58);
				expr(0);
				setState(59);
				match(PARC);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(65);
						((MulDivContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ASTE || _la==DIA) ) {
							((MulDivContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(66);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddsubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(68);
						((AddsubContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==RES || _la==SUM) ) {
							((AddsubContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(69);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextobteinerContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(DictioParser.TEXTO, 0); }
		public TextobteinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textobteiner; }
	}

	public final TextobteinerContext textobteiner() throws RecognitionException {
		TextobteinerContext _localctx = new TextobteinerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_textobteiner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TEXTO);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015N\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001a\b\u0001\u000b\u0001\f"+
		"\u0001\u001b\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002#\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003,\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u00057\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005?\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005G\b\u0005\n\u0005\f\u0005J\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0000\u0001\n\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0002"+
		"\u0001\u0000\u0006\u0007\u0001\u0000\b\tQ\u0000\u000e\u0001\u0000\u0000"+
		"\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004\u001d\u0001\u0000\u0000"+
		"\u0000\u0006\'\u0001\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000\n>\u0001"+
		"\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0002"+
		"\u0000\u0000\u000f\u0010\u0005\u0003\u0000\u0000\u0010\u0012\u0005\u000b"+
		"\u0000\u0000\u0011\u0013\u0003\u0002\u0001\u0000\u0012\u0011\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0005\f\u0000\u0000\u0015\u0001\u0001\u0000\u0000"+
		"\u0000\u0016\u001a\u0003\u0004\u0002\u0000\u0017\u001a\u0003\u0006\u0003"+
		"\u0000\u0018\u001a\u0003\b\u0004\u0000\u0019\u0016\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005\u0005\u0000\u0000\u001e\u001f\u0005\u0010\u0000\u0000"+
		"\u001f\"\u0003\f\u0006\u0000 !\u0005\u0013\u0000\u0000!#\u0003\n\u0005"+
		"\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$%\u0005\u0011\u0000\u0000%&\u0005\u0012\u0000\u0000&\u0005"+
		"\u0001\u0000\u0000\u0000\'(\u0005\u0004\u0000\u0000(+\u0005\u000e\u0000"+
		"\u0000)*\u0005\n\u0000\u0000*,\u0003\n\u0005\u0000+)\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0012"+
		"\u0000\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0005\u000e\u0000\u0000"+
		"01\u0005\n\u0000\u000012\u0003\n\u0005\u000023\u0005\u0012\u0000\u0000"+
		"3\t\u0001\u0000\u0000\u000046\u0006\u0005\uffff\uffff\u000057\u0005\b"+
		"\u0000\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008?\u0005\u000f\u0000\u00009:\u0005\u0010\u0000\u0000"+
		":;\u0003\n\u0005\u0000;<\u0005\u0011\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=?\u0005\u000e\u0000\u0000>4\u0001\u0000\u0000\u0000>9\u0001\u0000\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?H\u0001\u0000\u0000\u0000@A\n\u0005\u0000"+
		"\u0000AB\u0007\u0000\u0000\u0000BG\u0003\n\u0005\u0006CD\n\u0004\u0000"+
		"\u0000DE\u0007\u0001\u0000\u0000EG\u0003\n\u0005\u0005F@\u0001\u0000\u0000"+
		"\u0000FC\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000I\u000b\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KL\u0005\u0015\u0000\u0000L\r\u0001\u0000\u0000"+
		"\u0000\t\u0012\u0019\u001b\"+6>FH";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}