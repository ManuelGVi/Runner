// Generated from c:/Users/neoge/Documents/automatas/Runner/src/graccar/CDictio.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CDictioParser extends Parser {
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
	public static final int
		RULE_main = 0, RULE_contenido = 1, RULE_conditionalif = 2, RULE_ciclowhile = 3, 
		RULE_elseif = 4, RULE_elsesimple = 5, RULE_condition = 6, RULE_print = 7, 
		RULE_declaration = 8, RULE_asignation = 9, RULE_change = 10, RULE_expr = 11, 
		RULE_textobteiner = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "contenido", "conditionalif", "ciclowhile", "elseif", "elsesimple", 
			"condition", "print", "declaration", "asignation", "change", "expr", 
			"textobteiner"
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

	@Override
	public String getGrammarFileName() { return "CDictio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CDictioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CDictioParser.MAIN, 0); }
		public TerminalNode PARENO() { return getToken(CDictioParser.PARENO, 0); }
		public TerminalNode PARENC() { return getToken(CDictioParser.PARENC, 0); }
		public TerminalNode LLAVEO() { return getToken(CDictioParser.LLAVEO, 0); }
		public TerminalNode LLAVECL() { return getToken(CDictioParser.LLAVECL, 0); }
		public TerminalNode VOID() { return getToken(CDictioParser.VOID, 0); }
		public TerminalNode INT() { return getToken(CDictioParser.INT, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
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
			setState(26);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(27);
			match(MAIN);
			setState(28);
			match(PARENO);
			setState(29);
			match(PARENC);
			setState(30);
			match(LLAVEO);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2101696L) != 0)) {
				{
				setState(31);
				contenido();
				}
			}

			setState(34);
			match(LLAVECL);
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
	public static class ContenidoContext extends ParserRuleContext {
		public List<ConditionalifContext> conditionalif() {
			return getRuleContexts(ConditionalifContext.class);
		}
		public ConditionalifContext conditionalif(int i) {
			return getRuleContext(ConditionalifContext.class,i);
		}
		public List<CiclowhileContext> ciclowhile() {
			return getRuleContexts(CiclowhileContext.class);
		}
		public CiclowhileContext ciclowhile(int i) {
			return getRuleContext(CiclowhileContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<AsignationContext> asignation() {
			return getRuleContexts(AsignationContext.class);
		}
		public AsignationContext asignation(int i) {
			return getRuleContext(AsignationContext.class,i);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_contenido);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(41);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SI:
						{
						setState(36);
						conditionalif();
						}
						break;
					case WHILE:
						{
						setState(37);
						ciclowhile();
						}
						break;
					case PRINTF:
						{
						setState(38);
						print();
						}
						break;
					case INT:
						{
						setState(39);
						declaration();
						}
						break;
					case IDS:
						{
						setState(40);
						asignation();
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
				setState(43); 
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
	public static class ConditionalifContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(CDictioParser.SI, 0); }
		public TerminalNode PARENO() { return getToken(CDictioParser.PARENO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(CDictioParser.PARENC, 0); }
		public TerminalNode LLAVEO() { return getToken(CDictioParser.LLAVEO, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode LLAVECL() { return getToken(CDictioParser.LLAVECL, 0); }
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public ElsesimpleContext elsesimple() {
			return getRuleContext(ElsesimpleContext.class,0);
		}
		public ConditionalifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalif; }
	}

	public final ConditionalifContext conditionalif() throws RecognitionException {
		ConditionalifContext _localctx = new ConditionalifContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conditionalif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(SI);
			setState(46);
			match(PARENO);
			setState(47);
			condition(0);
			setState(48);
			match(PARENC);
			setState(49);
			match(LLAVEO);
			setState(50);
			contenido();
			setState(51);
			match(LLAVECL);
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(52);
				elseif();
				}
				break;
			case 2:
				{
				setState(53);
				elsesimple();
				}
				break;
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
	public static class CiclowhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CDictioParser.WHILE, 0); }
		public TerminalNode PARENO() { return getToken(CDictioParser.PARENO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(CDictioParser.PARENC, 0); }
		public TerminalNode LLAVEO() { return getToken(CDictioParser.LLAVEO, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public ChangeContext change() {
			return getRuleContext(ChangeContext.class,0);
		}
		public TerminalNode LLAVECL() { return getToken(CDictioParser.LLAVECL, 0); }
		public CiclowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclowhile; }
	}

	public final CiclowhileContext ciclowhile() throws RecognitionException {
		CiclowhileContext _localctx = new CiclowhileContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ciclowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(WHILE);
			setState(57);
			match(PARENO);
			setState(58);
			condition(0);
			setState(59);
			match(PARENC);
			setState(60);
			match(LLAVEO);
			setState(61);
			contenido();
			setState(62);
			change();
			setState(63);
			match(LLAVECL);
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
	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(CDictioParser.SINO, 0); }
		public TerminalNode SI() { return getToken(CDictioParser.SI, 0); }
		public TerminalNode PARENO() { return getToken(CDictioParser.PARENO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(CDictioParser.PARENC, 0); }
		public TerminalNode LLAVEO() { return getToken(CDictioParser.LLAVEO, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode LLAVECL() { return getToken(CDictioParser.LLAVECL, 0); }
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public ElsesimpleContext elsesimple() {
			return getRuleContext(ElsesimpleContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(SINO);
			setState(66);
			match(SI);
			setState(67);
			match(PARENO);
			setState(68);
			condition(0);
			setState(69);
			match(PARENC);
			setState(70);
			match(LLAVEO);
			setState(71);
			contenido();
			setState(72);
			match(LLAVECL);
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(73);
				elseif();
				}
				break;
			case 2:
				{
				setState(74);
				elsesimple();
				}
				break;
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
	public static class ElsesimpleContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(CDictioParser.SINO, 0); }
		public TerminalNode LLAVEO() { return getToken(CDictioParser.LLAVEO, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode LLAVECL() { return getToken(CDictioParser.LLAVECL, 0); }
		public ElsesimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsesimple; }
	}

	public final ElsesimpleContext elsesimple() throws RecognitionException {
		ElsesimpleContext _localctx = new ElsesimpleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elsesimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(SINO);
			setState(78);
			match(LLAVEO);
			setState(79);
			contenido();
			setState(80);
			match(LLAVECL);
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
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TruefalseContext extends ConditionContext {
		public TerminalNode TRUE() { return getToken(CDictioParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CDictioParser.FALSE, 0); }
		public TruefalseContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionparensContext extends ConditionContext {
		public TerminalNode PARENO() { return getToken(CDictioParser.PARENO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(CDictioParser.PARENC, 0); }
		public ConditionparensContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YoContext extends ConditionContext {
		public Token op;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> Y() { return getTokens(CDictioParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(CDictioParser.Y, i);
		}
		public List<TerminalNode> O() { return getTokens(CDictioParser.O); }
		public TerminalNode O(int i) {
			return getToken(CDictioParser.O, i);
		}
		public YoContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparissonContext extends ConditionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATERTHAN() { return getToken(CDictioParser.GREATERTHAN, 0); }
		public TerminalNode LOWER() { return getToken(CDictioParser.LOWER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(CDictioParser.GREATEREQUAL, 0); }
		public TerminalNode LOWEREQUAL() { return getToken(CDictioParser.LOWEREQUAL, 0); }
		public TerminalNode COMPARISON() { return getToken(CDictioParser.COMPARISON, 0); }
		public TerminalNode NOTEQUAL() { return getToken(CDictioParser.NOTEQUAL, 0); }
		public ComparissonContext(ConditionContext ctx) { copyFrom(ctx); }
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new ComparissonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				expr(0);
				setState(84);
				((ComparissonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
					((ComparissonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(85);
				expr(0);
				}
				break;
			case 2:
				{
				_localctx = new TruefalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
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
				_localctx = new ConditionparensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(PARENO);
				setState(89);
				condition(0);
				setState(90);
				match(PARENC);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new YoContext(new ConditionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(94);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(95);
						((YoContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Y || _la==O) ) {
							((YoContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(98); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Y || _la==O );
					setState(100);
					condition(5);
					}
					} 
				}
				setState(105);
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(CDictioParser.PRINTF, 0); }
		public TerminalNode PARENO() { return getToken(CDictioParser.PARENO, 0); }
		public TerminalNode PARENC() { return getToken(CDictioParser.PARENC, 0); }
		public TerminalNode SEMICOLON() { return getToken(CDictioParser.SEMICOLON, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(CDictioParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CDictioParser.COMMA, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(PRINTF);
				setState(107);
				match(PARENO);
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(108);
					textobteiner();
					}
					break;
				case SUB:
				case IDS:
				case NUM:
				case PARENO:
					{
					setState(109);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112);
				match(PARENC);
				setState(113);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(PRINTF);
				setState(116);
				match(PARENO);
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(117);
					textobteiner();
					}
					break;
				case SUB:
				case IDS:
				case NUM:
				case PARENO:
					{
					setState(118);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(121);
					match(COMMA);
					setState(124);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SUB:
					case IDS:
					case NUM:
					case PARENO:
						{
						setState(122);
						expr(0);
						}
						break;
					case TEXT:
						{
						setState(123);
						textobteiner();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(PARENC);
				setState(132);
				match(SEMICOLON);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CDictioParser.INT, 0); }
		public TerminalNode IDS() { return getToken(CDictioParser.IDS, 0); }
		public TerminalNode SEMICOLON() { return getToken(CDictioParser.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(CDictioParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(INT);
			setState(137);
			match(IDS);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(138);
				match(EQUAL);
				setState(139);
				expr(0);
				}
			}

			setState(142);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignationContext extends ParserRuleContext {
		public TerminalNode IDS() { return getToken(CDictioParser.IDS, 0); }
		public TerminalNode EQUAL() { return getToken(CDictioParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CDictioParser.SEMICOLON, 0); }
		public AsignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignation; }
	}

	public final AsignationContext asignation() throws RecognitionException {
		AsignationContext _localctx = new AsignationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IDS);
			setState(145);
			match(EQUAL);
			setState(146);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChangeContext extends ParserRuleContext {
		public TerminalNode IDS() { return getToken(CDictioParser.IDS, 0); }
		public TerminalNode SEMICOLON() { return getToken(CDictioParser.SEMICOLON, 0); }
		public TerminalNode INCREMENT() { return getToken(CDictioParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(CDictioParser.DECREMENT, 0); }
		public ChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change; }
	}

	public final ChangeContext change() throws RecognitionException {
		ChangeContext _localctx = new ChangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_change);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IDS);
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151);
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
	public static class TimesdivContext extends ExprContext {
		public Token operation;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CDictioParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CDictioParser.DIV, 0); }
		public TimesdivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdsContext extends ExprContext {
		public TerminalNode IDS() { return getToken(CDictioParser.IDS, 0); }
		public IdsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResidualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PER() { return getToken(CDictioParser.PER, 0); }
		public ResidualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprparensContext extends ExprContext {
		public TerminalNode PARENO() { return getToken(CDictioParser.PARENO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(CDictioParser.PARENC, 0); }
		public ExprparensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumarestaContext extends ExprContext {
		public Token operation;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CDictioParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CDictioParser.SUB, 0); }
		public SumarestaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public TerminalNode NUM() { return getToken(CDictioParser.NUM, 0); }
		public TerminalNode SUB() { return getToken(CDictioParser.SUB, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case NUM:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(154);
					match(SUB);
					}
				}

				setState(157);
				match(NUM);
				}
				break;
			case PARENO:
				{
				_localctx = new ExprparensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(PARENO);
				setState(159);
				expr(0);
				setState(160);
				match(PARENC);
				}
				break;
			case IDS:
				{
				_localctx = new IdsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(IDS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new TimesdivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(166);
						((TimesdivContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((TimesdivContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new SumarestaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(169);
						((SumarestaContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUB || _la==ADD) ) {
							((SumarestaContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ResidualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(172);
						match(PER);
						setState(173);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(178);
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
		public TerminalNode TEXT() { return getToken(CDictioParser.TEXT, 0); }
		public TextobteinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textobteiner; }
	}

	public final TextobteinerContext textobteiner() throws RecognitionException {
		TextobteinerContext _localctx = new TextobteinerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_textobteiner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(TEXT);
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
		case 6:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
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
		"\u0004\u0001(\u00b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000!\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001*\b\u0001"+
		"\u000b\u0001\f\u0001+\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"7\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004L\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006]\b\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"a\b\u0006\u000b\u0006\f\u0006b\u0001\u0006\u0005\u0006f\b\u0006\n\u0006"+
		"\f\u0006i\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007o\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007x\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007}\b\u0007\u0005\u0007\u007f\b\u0007\n\u0007"+
		"\f\u0007\u0082\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0087\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008d\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u009c\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00a4\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00af\b\u000b"+
		"\n\u000b\f\u000b\u00b2\t\u000b\u0001\f\u0001\f\u0001\f\u0000\u0002\f\u0016"+
		"\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\u0007\u0002\u0000\u0004\u0004\u0006\u0006\u0001\u0000\u001c!\u0001\u0000"+
		"\n\u000b\u0001\u0000\"#\u0001\u0000$%\u0001\u0000\r\u000e\u0001\u0000"+
		"\u000f\u0010\u00c2\u0000\u001a\u0001\u0000\u0000\u0000\u0002)\u0001\u0000"+
		"\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000"+
		"\bA\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\f\\\u0001\u0000"+
		"\u0000\u0000\u000e\u0086\u0001\u0000\u0000\u0000\u0010\u0088\u0001\u0000"+
		"\u0000\u0000\u0012\u0090\u0001\u0000\u0000\u0000\u0014\u0095\u0001\u0000"+
		"\u0000\u0000\u0016\u00a3\u0001\u0000\u0000\u0000\u0018\u00b3\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0007\u0000\u0000\u0000\u001b\u001c\u0005\u0005"+
		"\u0000\u0000\u001c\u001d\u0005\u0017\u0000\u0000\u001d\u001e\u0005\u0018"+
		"\u0000\u0000\u001e \u0005\u0012\u0000\u0000\u001f!\u0003\u0002\u0001\u0000"+
		" \u001f\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"#\u0005\u0013\u0000\u0000#\u0001\u0001\u0000\u0000\u0000"+
		"$*\u0003\u0004\u0002\u0000%*\u0003\u0006\u0003\u0000&*\u0003\u000e\u0007"+
		"\u0000\'*\u0003\u0010\b\u0000(*\u0003\u0012\t\u0000)$\u0001\u0000\u0000"+
		"\u0000)%\u0001\u0000\u0000\u0000)&\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0003\u0001\u0000\u0000"+
		"\u0000-.\u0005\b\u0000\u0000./\u0005\u0017\u0000\u0000/0\u0003\f\u0006"+
		"\u000001\u0005\u0018\u0000\u000012\u0005\u0012\u0000\u000023\u0003\u0002"+
		"\u0001\u000036\u0005\u0013\u0000\u000047\u0003\b\u0004\u000057\u0003\n"+
		"\u0005\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u00007\u0005\u0001\u0000\u0000\u000089\u0005\f\u0000\u0000"+
		"9:\u0005\u0017\u0000\u0000:;\u0003\f\u0006\u0000;<\u0005\u0018\u0000\u0000"+
		"<=\u0005\u0012\u0000\u0000=>\u0003\u0002\u0001\u0000>?\u0003\u0014\n\u0000"+
		"?@\u0005\u0013\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AB\u0005\t\u0000"+
		"\u0000BC\u0005\b\u0000\u0000CD\u0005\u0017\u0000\u0000DE\u0003\f\u0006"+
		"\u0000EF\u0005\u0018\u0000\u0000FG\u0005\u0012\u0000\u0000GH\u0003\u0002"+
		"\u0001\u0000HK\u0005\u0013\u0000\u0000IL\u0003\b\u0004\u0000JL\u0003\n"+
		"\u0005\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000L\t\u0001\u0000\u0000\u0000MN\u0005\t\u0000\u0000NO"+
		"\u0005\u0012\u0000\u0000OP\u0003\u0002\u0001\u0000PQ\u0005\u0013\u0000"+
		"\u0000Q\u000b\u0001\u0000\u0000\u0000RS\u0006\u0006\uffff\uffff\u0000"+
		"ST\u0003\u0016\u000b\u0000TU\u0007\u0001\u0000\u0000UV\u0003\u0016\u000b"+
		"\u0000V]\u0001\u0000\u0000\u0000W]\u0007\u0002\u0000\u0000XY\u0005\u0017"+
		"\u0000\u0000YZ\u0003\f\u0006\u0000Z[\u0005\u0018\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\R\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\X"+
		"\u0001\u0000\u0000\u0000]g\u0001\u0000\u0000\u0000^`\n\u0004\u0000\u0000"+
		"_a\u0007\u0003\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000df\u0003\f\u0006\u0005e^\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\r\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0007\u0000\u0000"+
		"kn\u0005\u0017\u0000\u0000lo\u0003\u0018\f\u0000mo\u0003\u0016\u000b\u0000"+
		"nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0005\u0018\u0000\u0000qr\u0005\u0019\u0000\u0000r\u0087\u0001"+
		"\u0000\u0000\u0000st\u0005\u0007\u0000\u0000tw\u0005\u0017\u0000\u0000"+
		"ux\u0003\u0018\f\u0000vx\u0003\u0016\u000b\u0000wu\u0001\u0000\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000x\u0080\u0001\u0000\u0000\u0000y|\u0005\u001a"+
		"\u0000\u0000z}\u0003\u0016\u000b\u0000{}\u0003\u0018\f\u0000|z\u0001\u0000"+
		"\u0000\u0000|{\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~y\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\u0018\u0000\u0000\u0084\u0085\u0005\u0019\u0000\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086j\u0001\u0000\u0000\u0000\u0086s\u0001\u0000"+
		"\u0000\u0000\u0087\u000f\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0006"+
		"\u0000\u0000\u0089\u008c\u0005\u0015\u0000\u0000\u008a\u008b\u0005\u0011"+
		"\u0000\u0000\u008b\u008d\u0003\u0016\u000b\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u0019\u0000\u0000\u008f\u0011\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u0015\u0000\u0000\u0091\u0092\u0005\u0011"+
		"\u0000\u0000\u0092\u0093\u0003\u0016\u000b\u0000\u0093\u0094\u0005\u0019"+
		"\u0000\u0000\u0094\u0013\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0015"+
		"\u0000\u0000\u0096\u0097\u0007\u0004\u0000\u0000\u0097\u0098\u0005\u0019"+
		"\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000\u0099\u009b\u0006\u000b"+
		"\uffff\uffff\u0000\u009a\u009c\u0005\u000f\u0000\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u00a4\u0005\u0016\u0000\u0000\u009e\u009f\u0005"+
		"\u0017\u0000\u0000\u009f\u00a0\u0003\u0016\u000b\u0000\u00a0\u00a1\u0005"+
		"\u0018\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005"+
		"\u0015\u0000\u0000\u00a3\u0099\u0001\u0000\u0000\u0000\u00a3\u009e\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00b0\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\n\u0006\u0000\u0000\u00a6\u00a7\u0007\u0005"+
		"\u0000\u0000\u00a7\u00af\u0003\u0016\u000b\u0007\u00a8\u00a9\n\u0005\u0000"+
		"\u0000\u00a9\u00aa\u0007\u0006\u0000\u0000\u00aa\u00af\u0003\u0016\u000b"+
		"\u0006\u00ab\u00ac\n\u0003\u0000\u0000\u00ac\u00ad\u0005&\u0000\u0000"+
		"\u00ad\u00af\u0003\u0016\u000b\u0004\u00ae\u00a5\u0001\u0000\u0000\u0000"+
		"\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000"+
		"\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u0017\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005(\u0000\u0000\u00b4"+
		"\u0019\u0001\u0000\u0000\u0000\u0012 )+6K\\bgnw|\u0080\u0086\u008c\u009b"+
		"\u00a3\u00ae\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}