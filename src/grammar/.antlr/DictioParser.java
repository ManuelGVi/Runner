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
		WS=1, COMENTARIO=2, LETS=3, RUN=4, COMP=5, IMP=6, IF=7, ELSE=8, WHILE=9, 
		VERDAD=10, FALSO=11, ASTE=12, DIA=13, RES=14, SUM=15, EQU=16, LLAVEA=17, 
		LLAVEC=18, DOT=19, ID=20, INT=21, PARA=22, PARC=23, SC=24, COMA=25, COMID=26, 
		MAYORQUE=27, MENORQUE=28, IGUAL=29, DIFERENTE=30, AND=31, OR=32, PORCENTAJE=33, 
		INCREMENTO=34, DECREMENTO=35, MENORIGUAL=36, MAYORIGUAL=37, TEXTO=38;
	public static final int
		RULE_main = 0, RULE_content = 1, RULE_condif = 2, RULE_mientras = 3, RULE_siono = 4, 
		RULE_deotro = 5, RULE_cambio = 6, RULE_imprime = 7, RULE_declara = 8, 
		RULE_asigna = 9, RULE_expr = 10, RULE_textobteiner = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "content", "condif", "mientras", "siono", "deotro", "cambio", 
			"imprime", "declara", "asigna", "expr", "textobteiner"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'lets'", "'run'", "'comp'", "'imp'", "'si'", "'sino'", 
			"'mientras'", "'true'", "'false'", "'*'", "'/'", "'-'", "'+'", "'='", 
			"'{'", "'}'", "'.'", null, null, "'('", "')'", "';'", "','", "'\"'", 
			"'>'", "'<'", "'=='", "'!='", "'&&'", "'||'", "'%'", "'++'", "'--'", 
			"'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMENTARIO", "LETS", "RUN", "COMP", "IMP", "IF", "ELSE", 
			"WHILE", "VERDAD", "FALSO", "ASTE", "DIA", "RES", "SUM", "EQU", "LLAVEA", 
			"LLAVEC", "DOT", "ID", "INT", "PARA", "PARC", "SC", "COMA", "COMID", 
			"MAYORQUE", "MENORQUE", "IGUAL", "DIFERENTE", "AND", "OR", "PORCENTAJE", 
			"INCREMENTO", "DECREMENTO", "MENORIGUAL", "MAYORIGUAL", "TEXTO"
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
			setState(24);
			match(LETS);
			setState(25);
			match(RUN);
			setState(26);
			match(LLAVEA);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1049312L) != 0)) {
				{
				setState(27);
				content();
				}
			}

			setState(30);
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
		public List<MientrasContext> mientras() {
			return getRuleContexts(MientrasContext.class);
		}
		public MientrasContext mientras(int i) {
			return getRuleContext(MientrasContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(37);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(32);
						condif();
						}
						break;
					case WHILE:
						{
						setState(33);
						mientras();
						}
						break;
					case IMP:
						{
						setState(34);
						imprime();
						}
						break;
					case COMP:
						{
						setState(35);
						declara();
						}
						break;
					case ID:
						{
						setState(36);
						asigna();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(41);
			match(IF);
			setState(42);
			match(PARA);
			setState(43);
			siono(0);
			setState(44);
			match(PARC);
			setState(45);
			match(LLAVEA);
			setState(46);
			content();
			setState(47);
			match(LLAVEC);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(48);
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
	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DictioParser.WHILE, 0); }
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
		public CambioContext cambio() {
			return getRuleContext(CambioContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(WHILE);
			setState(52);
			match(PARA);
			setState(53);
			siono(0);
			setState(54);
			match(PARC);
			setState(55);
			match(LLAVEA);
			setState(56);
			content();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(57);
				cambio();
				}
			}

			setState(60);
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
	public static class SionoContext extends ParserRuleContext {
		public SionoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siono; }
	 
		public SionoContext() { }
		public void copyFrom(SionoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VerdaderofalsoContext extends SionoContext {
		public TerminalNode VERDAD() { return getToken(DictioParser.VERDAD, 0); }
		public TerminalNode FALSO() { return getToken(DictioParser.FALSO, 0); }
		public VerdaderofalsoContext(SionoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndorContext extends SionoContext {
		public Token op;
		public List<SionoContext> siono() {
			return getRuleContexts(SionoContext.class);
		}
		public SionoContext siono(int i) {
			return getRuleContext(SionoContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(DictioParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(DictioParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(DictioParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(DictioParser.OR, i);
		}
		public AndorContext(SionoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionesContext extends SionoContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYORQUE() { return getToken(DictioParser.MAYORQUE, 0); }
		public TerminalNode MENORQUE() { return getToken(DictioParser.MENORQUE, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(DictioParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(DictioParser.MENORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(DictioParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(DictioParser.DIFERENTE, 0); }
		public ComparacionesContext(SionoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondiparensContext extends SionoContext {
		public TerminalNode PARA() { return getToken(DictioParser.PARA, 0); }
		public SionoContext siono() {
			return getRuleContext(SionoContext.class,0);
		}
		public TerminalNode PARC() { return getToken(DictioParser.PARC, 0); }
		public CondiparensContext(SionoContext ctx) { copyFrom(ctx); }
	}

	public final SionoContext siono() throws RecognitionException {
		return siono(0);
	}

	private SionoContext siono(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SionoContext _localctx = new SionoContext(_ctx, _parentState);
		SionoContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_siono, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new ComparacionesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(63);
				expr(0);
				setState(64);
				((ComparacionesContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 208171696128L) != 0)) ) {
					((ComparacionesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				expr(0);
				}
				break;
			case 2:
				{
				_localctx = new VerdaderofalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				_la = _input.LA(1);
				if ( !(_la==VERDAD || _la==FALSO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new CondiparensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(PARA);
				setState(69);
				siono(0);
				setState(70);
				match(PARC);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndorContext(new SionoContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_siono);
					setState(74);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(75);
						((AndorContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(78); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==AND || _la==OR );
					setState(80);
					siono(5);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class DeotroContext extends ParserRuleContext {
		public DeotroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deotro; }
	 
		public DeotroContext() { }
		public void copyFrom(DeotroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeotroifContext extends DeotroContext {
		public TerminalNode ELSE() { return getToken(DictioParser.ELSE, 0); }
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
		public DeotroifContext(DeotroContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeotrosimpleContext extends DeotroContext {
		public TerminalNode ELSE() { return getToken(DictioParser.ELSE, 0); }
		public TerminalNode LLAVEA() { return getToken(DictioParser.LLAVEA, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(DictioParser.LLAVEC, 0); }
		public DeotrosimpleContext(DeotroContext ctx) { copyFrom(ctx); }
	}

	public final DeotroContext deotro() throws RecognitionException {
		DeotroContext _localctx = new DeotroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_deotro);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new DeotroifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(ELSE);
				setState(87);
				match(IF);
				setState(88);
				match(PARA);
				setState(89);
				siono(0);
				setState(90);
				match(PARC);
				setState(91);
				match(LLAVEA);
				setState(92);
				content();
				setState(93);
				match(LLAVEC);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(94);
					deotro();
					}
				}

				}
				break;
			case 2:
				_localctx = new DeotrosimpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(ELSE);
				setState(98);
				match(LLAVEA);
				setState(99);
				content();
				setState(100);
				match(LLAVEC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CambioContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DictioParser.ID, 0); }
		public TerminalNode SC() { return getToken(DictioParser.SC, 0); }
		public TerminalNode INCREMENTO() { return getToken(DictioParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(DictioParser.DECREMENTO, 0); }
		public CambioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cambio; }
	}

	public final CambioContext cambio() throws RecognitionException {
		CambioContext _localctx = new CambioContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cambio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
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
	public static class ImprimeContext extends ParserRuleContext {
		public TerminalNode IMP() { return getToken(DictioParser.IMP, 0); }
		public TerminalNode PARA() { return getToken(DictioParser.PARA, 0); }
		public TerminalNode PARC() { return getToken(DictioParser.PARC, 0); }
		public TerminalNode SC() { return getToken(DictioParser.SC, 0); }
		public List<TextobteinerContext> textobteiner() {
			return getRuleContexts(TextobteinerContext.class);
		}
		public TextobteinerContext textobteiner(int i) {
			return getRuleContext(TextobteinerContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(DictioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DictioParser.COMA, i);
		}
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_imprime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IMP);
			setState(109);
			match(PARA);
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				{
				setState(110);
				textobteiner();
				}
				break;
			case RES:
			case ID:
			case INT:
			case PARA:
				{
				setState(111);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(114);
				match(COMA);
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXTO:
					{
					setState(115);
					textobteiner();
					}
					break;
				case RES:
				case ID:
				case INT:
				case PARA:
					{
					setState(116);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(PARC);
			setState(125);
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
		enterRule(_localctx, 16, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(COMP);
			setState(128);
			match(ID);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQU) {
				{
				setState(129);
				match(EQU);
				setState(130);
				expr(0);
				}
			}

			setState(133);
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
		enterRule(_localctx, 18, RULE_asigna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ID);
			setState(136);
			match(EQU);
			setState(137);
			expr(0);
			setState(138);
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
	public static class ResiduoContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PORCENTAJE() { return getToken(DictioParser.PORCENTAJE, 0); }
		public ResiduoContext(ExprContext ctx) { copyFrom(ctx); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RES:
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RES) {
					{
					setState(141);
					match(RES);
					}
				}

				setState(144);
				match(INT);
				}
				break;
			case PARA:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(PARA);
				setState(146);
				expr(0);
				setState(147);
				match(PARC);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(153);
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
						setState(154);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AddsubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(156);
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
						setState(157);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ResiduoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						match(PORCENTAJE);
						setState(160);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 22, RULE_textobteiner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
		case 4:
			return siono_sempred((SionoContext)_localctx, predIndex);
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean siono_sempred(SionoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u00a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001&\b\u0001\u000b\u0001\f\u0001\'\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00022\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"I\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004M\b\u0004\u000b\u0004\f\u0004"+
		"N\u0001\u0004\u0005\u0004R\b\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007q\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007v\b\u0007\u0005\u0007x\b\u0007\n\u0007\f\u0007{\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u0084\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0003\n\u008f\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0097\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00a2\b\n\n\n\f\n\u00a5\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0000\u0002\b\u0014\f\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0000\u0006\u0002\u0000\u001b\u001e$%\u0001"+
		"\u0000\n\u000b\u0001\u0000\u001f \u0001\u0000\"#\u0001\u0000\f\r\u0001"+
		"\u0000\u000e\u000f\u00b4\u0000\u0018\u0001\u0000\u0000\u0000\u0002%\u0001"+
		"\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000"+
		"\u0000\bH\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000\u0000\fh\u0001"+
		"\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000"+
		"\u0000\u0000\u0012\u0087\u0001\u0000\u0000\u0000\u0014\u0096\u0001\u0000"+
		"\u0000\u0000\u0016\u00a6\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0003"+
		"\u0000\u0000\u0019\u001a\u0005\u0004\u0000\u0000\u001a\u001c\u0005\u0011"+
		"\u0000\u0000\u001b\u001d\u0003\u0002\u0001\u0000\u001c\u001b\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0005\u0012\u0000\u0000\u001f\u0001\u0001\u0000"+
		"\u0000\u0000 &\u0003\u0004\u0002\u0000!&\u0003\u0006\u0003\u0000\"&\u0003"+
		"\u000e\u0007\u0000#&\u0003\u0010\b\u0000$&\u0003\u0012\t\u0000% \u0001"+
		"\u0000\u0000\u0000%!\u0001\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0003\u0001"+
		"\u0000\u0000\u0000)*\u0005\u0007\u0000\u0000*+\u0005\u0016\u0000\u0000"+
		"+,\u0003\b\u0004\u0000,-\u0005\u0017\u0000\u0000-.\u0005\u0011\u0000\u0000"+
		"./\u0003\u0002\u0001\u0000/1\u0005\u0012\u0000\u000002\u0003\n\u0005\u0000"+
		"10\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0005\u0001\u0000"+
		"\u0000\u000034\u0005\t\u0000\u000045\u0005\u0016\u0000\u000056\u0003\b"+
		"\u0004\u000067\u0005\u0017\u0000\u000078\u0005\u0011\u0000\u00008:\u0003"+
		"\u0002\u0001\u00009;\u0003\f\u0006\u0000:9\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0005\u0012\u0000\u0000"+
		"=\u0007\u0001\u0000\u0000\u0000>?\u0006\u0004\uffff\uffff\u0000?@\u0003"+
		"\u0014\n\u0000@A\u0007\u0000\u0000\u0000AB\u0003\u0014\n\u0000BI\u0001"+
		"\u0000\u0000\u0000CI\u0007\u0001\u0000\u0000DE\u0005\u0016\u0000\u0000"+
		"EF\u0003\b\u0004\u0000FG\u0005\u0017\u0000\u0000GI\u0001\u0000\u0000\u0000"+
		"H>\u0001\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000"+
		"\u0000IS\u0001\u0000\u0000\u0000JL\n\u0004\u0000\u0000KM\u0007\u0002\u0000"+
		"\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0003"+
		"\b\u0004\u0005QJ\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\t\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VW\u0005\b\u0000\u0000WX\u0005\u0007\u0000\u0000"+
		"XY\u0005\u0016\u0000\u0000YZ\u0003\b\u0004\u0000Z[\u0005\u0017\u0000\u0000"+
		"[\\\u0005\u0011\u0000\u0000\\]\u0003\u0002\u0001\u0000]_\u0005\u0012\u0000"+
		"\u0000^`\u0003\n\u0005\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`g\u0001\u0000\u0000\u0000ab\u0005\b\u0000\u0000bc\u0005\u0011\u0000"+
		"\u0000cd\u0003\u0002\u0001\u0000de\u0005\u0012\u0000\u0000eg\u0001\u0000"+
		"\u0000\u0000fV\u0001\u0000\u0000\u0000fa\u0001\u0000\u0000\u0000g\u000b"+
		"\u0001\u0000\u0000\u0000hi\u0005\u0014\u0000\u0000ij\u0007\u0003\u0000"+
		"\u0000jk\u0005\u0018\u0000\u0000k\r\u0001\u0000\u0000\u0000lm\u0005\u0006"+
		"\u0000\u0000mp\u0005\u0016\u0000\u0000nq\u0003\u0016\u000b\u0000oq\u0003"+
		"\u0014\n\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qy\u0001"+
		"\u0000\u0000\u0000ru\u0005\u0019\u0000\u0000sv\u0003\u0016\u000b\u0000"+
		"tv\u0003\u0014\n\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000"+
		"vx\u0001\u0000\u0000\u0000wr\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0017\u0000\u0000}~\u0005"+
		"\u0018\u0000\u0000~\u000f\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0005"+
		"\u0000\u0000\u0080\u0083\u0005\u0014\u0000\u0000\u0081\u0082\u0005\u0010"+
		"\u0000\u0000\u0082\u0084\u0003\u0014\n\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\u0018\u0000\u0000\u0086\u0011\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005\u0014\u0000\u0000\u0088\u0089\u0005\u0010\u0000"+
		"\u0000\u0089\u008a\u0003\u0014\n\u0000\u008a\u008b\u0005\u0018\u0000\u0000"+
		"\u008b\u0013\u0001\u0000\u0000\u0000\u008c\u008e\u0006\n\uffff\uffff\u0000"+
		"\u008d\u008f\u0005\u000e\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0097\u0005\u0015\u0000\u0000\u0091\u0092\u0005\u0016\u0000\u0000"+
		"\u0092\u0093\u0003\u0014\n\u0000\u0093\u0094\u0005\u0017\u0000\u0000\u0094"+
		"\u0097\u0001\u0000\u0000\u0000\u0095\u0097\u0005\u0014\u0000\u0000\u0096"+
		"\u008c\u0001\u0000\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u00a3\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\n\u0006\u0000\u0000\u0099\u009a\u0007\u0004\u0000\u0000\u009a\u00a2"+
		"\u0003\u0014\n\u0007\u009b\u009c\n\u0005\u0000\u0000\u009c\u009d\u0007"+
		"\u0005\u0000\u0000\u009d\u00a2\u0003\u0014\n\u0006\u009e\u009f\n\u0003"+
		"\u0000\u0000\u009f\u00a0\u0005!\u0000\u0000\u00a0\u00a2\u0003\u0014\n"+
		"\u0004\u00a1\u0098\u0001\u0000\u0000\u0000\u00a1\u009b\u0001\u0000\u0000"+
		"\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005&\u0000\u0000\u00a7\u0017\u0001\u0000\u0000\u0000"+
		"\u0012\u001c%\'1:HNS_fpuy\u0083\u008e\u0096\u00a1\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}