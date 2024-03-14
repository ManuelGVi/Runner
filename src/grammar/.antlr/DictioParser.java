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
		WS=1, LETS=2, RUN=3, COMP=4, IMP=5, IF=6, ELSE=7, ASTE=8, DIA=9, RES=10, 
		SUM=11, EQU=12, LLAVEA=13, LLAVEC=14, DOT=15, ID=16, INT=17, PARA=18, 
		PARC=19, SC=20, COMA=21, COMID=22, MAYORQUE=23, MENORQUE=24, IGUAL=25, 
		DIFERENTE=26, TEXTO=27;
	public static final int
		RULE_main = 0, RULE_content = 1, RULE_condif = 2, RULE_siono = 3, RULE_deotro = 4, 
		RULE_imprime = 5, RULE_declara = 6, RULE_asigna = 7, RULE_expr = 8, RULE_textobteiner = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "content", "condif", "siono", "deotro", "imprime", "declara", 
			"asigna", "expr", "textobteiner"
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
			setState(20);
			match(LETS);
			setState(21);
			match(RUN);
			setState(22);
			match(LLAVEA);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65648L) != 0)) {
				{
				setState(23);
				content();
				}
			}

			setState(26);
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
		public List<CondifContext> condif() {
			return getRuleContexts(CondifContext.class);
		}
		public CondifContext condif(int i) {
			return getRuleContext(CondifContext.class,i);
		}
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
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(32);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(28);
					condif();
					}
					break;
				case IMP:
					{
					setState(29);
					imprime();
					}
					break;
				case COMP:
					{
					setState(30);
					declara();
					}
					break;
				case ID:
					{
					setState(31);
					asigna();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65648L) != 0) );
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
	public static class CondifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DictioParser.IF, 0); }
		public TerminalNode PARA() { return getToken(DictioParser.PARA, 0); }
		public SionoContext siono() {
			return getRuleContext(SionoContext.class,0);
		}
		public TerminalNode PARC() { return getToken(DictioParser.PARC, 0); }
		public TerminalNode LLAVEA() { return getToken(DictioParser.LLAVEA, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(DictioParser.LLAVEC, 0); }
		public DeotroContext deotro() {
			return getRuleContext(DeotroContext.class,0);
		}
		public CondifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condif; }
	}

	public final CondifContext condif() throws RecognitionException {
		CondifContext _localctx = new CondifContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(IF);
			setState(37);
			match(PARA);
			setState(38);
			siono();
			setState(39);
			match(PARC);
			setState(40);
			match(LLAVEA);
			setState(41);
			content();
			setState(42);
			match(LLAVEC);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(43);
				deotro();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SionoContext extends ParserRuleContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYORQUE() { return getToken(DictioParser.MAYORQUE, 0); }
		public TerminalNode MENORQUE() { return getToken(DictioParser.MENORQUE, 0); }
		public TerminalNode IGUAL() { return getToken(DictioParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(DictioParser.DIFERENTE, 0); }
		public SionoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siono; }
	}

	public final SionoContext siono() throws RecognitionException {
		SionoContext _localctx = new SionoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_siono);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			expr(0);
			setState(47);
			((SionoContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
				((SionoContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(48);
			expr(0);
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
	public static class DeotroContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(DictioParser.ELSE, 0); }
		public TerminalNode LLAVEA() { return getToken(DictioParser.LLAVEA, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(DictioParser.LLAVEC, 0); }
		public DeotroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deotro; }
	}

	public final DeotroContext deotro() throws RecognitionException {
		DeotroContext _localctx = new DeotroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deotro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ELSE);
			setState(51);
			match(LLAVEA);
			setState(52);
			content();
			setState(53);
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
		enterRule(_localctx, 10, RULE_imprime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(IMP);
			setState(56);
			match(PARA);
			setState(57);
			textobteiner();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(58);
				match(COMA);
				setState(59);
				expr(0);
				}
			}

			setState(62);
			match(PARC);
			setState(63);
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
		enterRule(_localctx, 12, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(COMP);
			setState(66);
			match(ID);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQU) {
				{
				setState(67);
				match(EQU);
				setState(68);
				expr(0);
				}
			}

			setState(71);
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
		enterRule(_localctx, 14, RULE_asigna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
			setState(74);
			match(EQU);
			setState(75);
			expr(0);
			setState(76);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RES:
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RES) {
					{
					setState(79);
					match(RES);
					}
				}

				setState(82);
				match(INT);
				}
				break;
			case PARA:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(PARA);
				setState(84);
				expr(0);
				setState(85);
				match(PARC);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(91);
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
						setState(92);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddsubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94);
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
						setState(95);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 18, RULE_textobteiner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		case 8:
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
		"\u0004\u0001\u001bh\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u0019\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001!\b\u0001\u000b\u0001\f\u0001\"\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005=\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006F\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0003\bQ\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bY\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\ba\b\b\n\b\f\bd\t\b\u0001\t\u0001\t\u0001\t\u0000\u0001\u0010\n\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0003\u0001\u0000\u0017"+
		"\u001a\u0001\u0000\b\t\u0001\u0000\n\u000bj\u0000\u0014\u0001\u0000\u0000"+
		"\u0000\u0002 \u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006"+
		".\u0001\u0000\u0000\u0000\b2\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000"+
		"\u0000\fA\u0001\u0000\u0000\u0000\u000eI\u0001\u0000\u0000\u0000\u0010"+
		"X\u0001\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014\u0015\u0005"+
		"\u0002\u0000\u0000\u0015\u0016\u0005\u0003\u0000\u0000\u0016\u0018\u0005"+
		"\r\u0000\u0000\u0017\u0019\u0003\u0002\u0001\u0000\u0018\u0017\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0005\u000e\u0000\u0000\u001b\u0001\u0001\u0000"+
		"\u0000\u0000\u001c!\u0003\u0004\u0002\u0000\u001d!\u0003\n\u0005\u0000"+
		"\u001e!\u0003\f\u0006\u0000\u001f!\u0003\u000e\u0007\u0000 \u001c\u0001"+
		"\u0000\u0000\u0000 \u001d\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0003\u0001\u0000\u0000"+
		"\u0000$%\u0005\u0006\u0000\u0000%&\u0005\u0012\u0000\u0000&\'\u0003\u0006"+
		"\u0003\u0000\'(\u0005\u0013\u0000\u0000()\u0005\r\u0000\u0000)*\u0003"+
		"\u0002\u0001\u0000*,\u0005\u000e\u0000\u0000+-\u0003\b\u0004\u0000,+\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0005\u0001\u0000\u0000"+
		"\u0000./\u0003\u0010\b\u0000/0\u0007\u0000\u0000\u000001\u0003\u0010\b"+
		"\u00001\u0007\u0001\u0000\u0000\u000023\u0005\u0007\u0000\u000034\u0005"+
		"\r\u0000\u000045\u0003\u0002\u0001\u000056\u0005\u000e\u0000\u00006\t"+
		"\u0001\u0000\u0000\u000078\u0005\u0005\u0000\u000089\u0005\u0012\u0000"+
		"\u00009<\u0003\u0012\t\u0000:;\u0005\u0015\u0000\u0000;=\u0003\u0010\b"+
		"\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>?\u0005\u0013\u0000\u0000?@\u0005\u0014\u0000\u0000@\u000b"+
		"\u0001\u0000\u0000\u0000AB\u0005\u0004\u0000\u0000BE\u0005\u0010\u0000"+
		"\u0000CD\u0005\f\u0000\u0000DF\u0003\u0010\b\u0000EC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u0014"+
		"\u0000\u0000H\r\u0001\u0000\u0000\u0000IJ\u0005\u0010\u0000\u0000JK\u0005"+
		"\f\u0000\u0000KL\u0003\u0010\b\u0000LM\u0005\u0014\u0000\u0000M\u000f"+
		"\u0001\u0000\u0000\u0000NP\u0006\b\uffff\uffff\u0000OQ\u0005\n\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RY\u0005\u0011\u0000\u0000ST\u0005\u0012\u0000\u0000TU\u0003\u0010"+
		"\b\u0000UV\u0005\u0013\u0000\u0000VY\u0001\u0000\u0000\u0000WY\u0005\u0010"+
		"\u0000\u0000XN\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000\u0000XW\u0001"+
		"\u0000\u0000\u0000Yb\u0001\u0000\u0000\u0000Z[\n\u0005\u0000\u0000[\\"+
		"\u0007\u0001\u0000\u0000\\a\u0003\u0010\b\u0006]^\n\u0004\u0000\u0000"+
		"^_\u0007\u0002\u0000\u0000_a\u0003\u0010\b\u0005`Z\u0001\u0000\u0000\u0000"+
		"`]\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\u0011\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000ef\u0005\u001b\u0000\u0000f\u0013\u0001\u0000\u0000"+
		"\u0000\n\u0018 \",<EPX`b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}