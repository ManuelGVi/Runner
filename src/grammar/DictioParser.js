// Generated from ./src/grammar/Dictio.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from 'antlr4';
import DictioVisitor from './DictioVisitor.js';

const serializedATN = [4,1,27,104,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,1,0,1,0,1,0,1,0,3,0,25,8,0,1,0,
1,0,1,1,1,1,1,1,1,1,4,1,33,8,1,11,1,12,1,34,1,2,1,2,1,2,1,2,1,2,1,2,1,2,
1,2,3,2,45,8,2,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,3,
5,61,8,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,3,6,70,8,6,1,6,1,6,1,7,1,7,1,7,1,7,
1,7,1,8,1,8,3,8,81,8,8,1,8,1,8,1,8,1,8,1,8,1,8,3,8,89,8,8,1,8,1,8,1,8,1,
8,1,8,1,8,5,8,97,8,8,10,8,12,8,100,9,8,1,9,1,9,1,9,0,1,16,10,0,2,4,6,8,10,
12,14,16,18,0,3,1,0,23,26,1,0,8,9,1,0,10,11,106,0,20,1,0,0,0,2,32,1,0,0,
0,4,36,1,0,0,0,6,46,1,0,0,0,8,50,1,0,0,0,10,55,1,0,0,0,12,65,1,0,0,0,14,
73,1,0,0,0,16,88,1,0,0,0,18,101,1,0,0,0,20,21,5,2,0,0,21,22,5,3,0,0,22,24,
5,13,0,0,23,25,3,2,1,0,24,23,1,0,0,0,24,25,1,0,0,0,25,26,1,0,0,0,26,27,5,
14,0,0,27,1,1,0,0,0,28,33,3,4,2,0,29,33,3,10,5,0,30,33,3,12,6,0,31,33,3,
14,7,0,32,28,1,0,0,0,32,29,1,0,0,0,32,30,1,0,0,0,32,31,1,0,0,0,33,34,1,0,
0,0,34,32,1,0,0,0,34,35,1,0,0,0,35,3,1,0,0,0,36,37,5,6,0,0,37,38,5,18,0,
0,38,39,3,6,3,0,39,40,5,19,0,0,40,41,5,13,0,0,41,42,3,2,1,0,42,44,5,14,0,
0,43,45,3,8,4,0,44,43,1,0,0,0,44,45,1,0,0,0,45,5,1,0,0,0,46,47,3,16,8,0,
47,48,7,0,0,0,48,49,3,16,8,0,49,7,1,0,0,0,50,51,5,7,0,0,51,52,5,13,0,0,52,
53,3,2,1,0,53,54,5,14,0,0,54,9,1,0,0,0,55,56,5,5,0,0,56,57,5,18,0,0,57,60,
3,18,9,0,58,59,5,21,0,0,59,61,3,16,8,0,60,58,1,0,0,0,60,61,1,0,0,0,61,62,
1,0,0,0,62,63,5,19,0,0,63,64,5,20,0,0,64,11,1,0,0,0,65,66,5,4,0,0,66,69,
5,16,0,0,67,68,5,12,0,0,68,70,3,16,8,0,69,67,1,0,0,0,69,70,1,0,0,0,70,71,
1,0,0,0,71,72,5,20,0,0,72,13,1,0,0,0,73,74,5,16,0,0,74,75,5,12,0,0,75,76,
3,16,8,0,76,77,5,20,0,0,77,15,1,0,0,0,78,80,6,8,-1,0,79,81,5,10,0,0,80,79,
1,0,0,0,80,81,1,0,0,0,81,82,1,0,0,0,82,89,5,17,0,0,83,84,5,18,0,0,84,85,
3,16,8,0,85,86,5,19,0,0,86,89,1,0,0,0,87,89,5,16,0,0,88,78,1,0,0,0,88,83,
1,0,0,0,88,87,1,0,0,0,89,98,1,0,0,0,90,91,10,5,0,0,91,92,7,1,0,0,92,97,3,
16,8,6,93,94,10,4,0,0,94,95,7,2,0,0,95,97,3,16,8,5,96,90,1,0,0,0,96,93,1,
0,0,0,97,100,1,0,0,0,98,96,1,0,0,0,98,99,1,0,0,0,99,17,1,0,0,0,100,98,1,
0,0,0,101,102,5,27,0,0,102,19,1,0,0,0,10,24,32,34,44,60,69,80,88,96,98];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class DictioParser extends antlr4.Parser {

    static grammarFileName = "Dictio.g4";
    static literalNames = [ null, null, "'lets'", "'run'", "'comp'", "'imp'", 
                            "'si'", "'sino'", "'*'", "'/'", "'-'", "'+'", 
                            "'='", "'{'", "'}'", "'.'", null, null, "'('", 
                            "')'", "';'", "','", "'\"'", "'>'", "'<'", "'=='", 
                            "'!='" ];
    static symbolicNames = [ null, "WS", "LETS", "RUN", "COMP", "IMP", "IF", 
                             "ELSE", "ASTE", "DIA", "RES", "SUM", "EQU", 
                             "LLAVEA", "LLAVEC", "DOT", "ID", "INT", "PARA", 
                             "PARC", "SC", "COMA", "COMID", "MAYORQUE", 
                             "MENORQUE", "IGUAL", "DIFERENTE", "TEXTO" ];
    static ruleNames = [ "main", "content", "condif", "siono", "deotro", 
                         "imprime", "declara", "asigna", "expr", "textobteiner" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = DictioParser.ruleNames;
        this.literalNames = DictioParser.literalNames;
        this.symbolicNames = DictioParser.symbolicNames;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 8:
    	    		return this.expr_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    expr_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 5);
    		case 1:
    			return this.precpred(this._ctx, 4);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };




	main() {
	    let localctx = new MainContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, DictioParser.RULE_main);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 20;
	        this.match(DictioParser.LETS);
	        this.state = 21;
	        this.match(DictioParser.RUN);
	        this.state = 22;
	        this.match(DictioParser.LLAVEA);
	        this.state = 24;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 65648) !== 0)) {
	            this.state = 23;
	            this.content();
	        }

	        this.state = 26;
	        this.match(DictioParser.LLAVEC);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	content() {
	    let localctx = new ContentContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, DictioParser.RULE_content);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 32; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 32;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 6:
	                this.state = 28;
	                this.condif();
	                break;
	            case 5:
	                this.state = 29;
	                this.imprime();
	                break;
	            case 4:
	                this.state = 30;
	                this.declara();
	                break;
	            case 16:
	                this.state = 31;
	                this.asigna();
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 34; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) === 0 && ((1 << _la) & 65648) !== 0));
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condif() {
	    let localctx = new CondifContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, DictioParser.RULE_condif);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 36;
	        this.match(DictioParser.IF);
	        this.state = 37;
	        this.match(DictioParser.PARA);
	        this.state = 38;
	        this.siono();
	        this.state = 39;
	        this.match(DictioParser.PARC);
	        this.state = 40;
	        this.match(DictioParser.LLAVEA);
	        this.state = 41;
	        this.content();
	        this.state = 42;
	        this.match(DictioParser.LLAVEC);
	        this.state = 44;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===7) {
	            this.state = 43;
	            this.deotro();
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	siono() {
	    let localctx = new SionoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, DictioParser.RULE_siono);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 46;
	        this.expr(0);
	        this.state = 47;
	        localctx.op = this._input.LT(1);
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 125829120) !== 0))) {
	            localctx.op = this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 48;
	        this.expr(0);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	deotro() {
	    let localctx = new DeotroContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, DictioParser.RULE_deotro);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 50;
	        this.match(DictioParser.ELSE);
	        this.state = 51;
	        this.match(DictioParser.LLAVEA);
	        this.state = 52;
	        this.content();
	        this.state = 53;
	        this.match(DictioParser.LLAVEC);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	imprime() {
	    let localctx = new ImprimeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, DictioParser.RULE_imprime);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 55;
	        this.match(DictioParser.IMP);
	        this.state = 56;
	        this.match(DictioParser.PARA);
	        this.state = 57;
	        this.textobteiner();
	        this.state = 60;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===21) {
	            this.state = 58;
	            this.match(DictioParser.COMA);
	            this.state = 59;
	            this.expr(0);
	        }

	        this.state = 62;
	        this.match(DictioParser.PARC);
	        this.state = 63;
	        this.match(DictioParser.SC);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	declara() {
	    let localctx = new DeclaraContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, DictioParser.RULE_declara);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 65;
	        this.match(DictioParser.COMP);
	        this.state = 66;
	        this.match(DictioParser.ID);
	        this.state = 69;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===12) {
	            this.state = 67;
	            this.match(DictioParser.EQU);
	            this.state = 68;
	            this.expr(0);
	        }

	        this.state = 71;
	        this.match(DictioParser.SC);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	asigna() {
	    let localctx = new AsignaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, DictioParser.RULE_asigna);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 73;
	        this.match(DictioParser.ID);
	        this.state = 74;
	        this.match(DictioParser.EQU);
	        this.state = 75;
	        this.expr(0);
	        this.state = 76;
	        this.match(DictioParser.SC);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


	expr(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new ExprContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 16;
	    this.enterRecursionRule(localctx, 16, DictioParser.RULE_expr, _p);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 88;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 10:
	        case 17:
	            localctx = new IntContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;

	            this.state = 80;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===10) {
	                this.state = 79;
	                this.match(DictioParser.RES);
	            }

	            this.state = 82;
	            this.match(DictioParser.INT);
	            break;
	        case 18:
	            localctx = new ParensContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 83;
	            this.match(DictioParser.PARA);
	            this.state = 84;
	            this.expr(0);
	            this.state = 85;
	            this.match(DictioParser.PARC);
	            break;
	        case 16:
	            localctx = new IdContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 87;
	            this.match(DictioParser.ID);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 98;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,9,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 96;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,8,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new MulDivContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, DictioParser.RULE_expr);
	                    this.state = 90;
	                    if (!( this.precpred(this._ctx, 5))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 5)");
	                    }
	                    this.state = 91;
	                    localctx.operation = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===8 || _la===9)) {
	                        localctx.operation = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 92;
	                    this.expr(6);
	                    break;

	                case 2:
	                    localctx = new AddsubContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, DictioParser.RULE_expr);
	                    this.state = 93;
	                    if (!( this.precpred(this._ctx, 4))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
	                    }
	                    this.state = 94;
	                    localctx.operation = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===10 || _la===11)) {
	                        localctx.operation = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 95;
	                    this.expr(5);
	                    break;

	                } 
	            }
	            this.state = 100;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,9,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	textobteiner() {
	    let localctx = new TextobteinerContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, DictioParser.RULE_textobteiner);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 101;
	        this.match(DictioParser.TEXTO);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

DictioParser.EOF = antlr4.Token.EOF;
DictioParser.WS = 1;
DictioParser.LETS = 2;
DictioParser.RUN = 3;
DictioParser.COMP = 4;
DictioParser.IMP = 5;
DictioParser.IF = 6;
DictioParser.ELSE = 7;
DictioParser.ASTE = 8;
DictioParser.DIA = 9;
DictioParser.RES = 10;
DictioParser.SUM = 11;
DictioParser.EQU = 12;
DictioParser.LLAVEA = 13;
DictioParser.LLAVEC = 14;
DictioParser.DOT = 15;
DictioParser.ID = 16;
DictioParser.INT = 17;
DictioParser.PARA = 18;
DictioParser.PARC = 19;
DictioParser.SC = 20;
DictioParser.COMA = 21;
DictioParser.COMID = 22;
DictioParser.MAYORQUE = 23;
DictioParser.MENORQUE = 24;
DictioParser.IGUAL = 25;
DictioParser.DIFERENTE = 26;
DictioParser.TEXTO = 27;

DictioParser.RULE_main = 0;
DictioParser.RULE_content = 1;
DictioParser.RULE_condif = 2;
DictioParser.RULE_siono = 3;
DictioParser.RULE_deotro = 4;
DictioParser.RULE_imprime = 5;
DictioParser.RULE_declara = 6;
DictioParser.RULE_asigna = 7;
DictioParser.RULE_expr = 8;
DictioParser.RULE_textobteiner = 9;

class MainContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_main;
    }

	LETS() {
	    return this.getToken(DictioParser.LETS, 0);
	};

	RUN() {
	    return this.getToken(DictioParser.RUN, 0);
	};

	LLAVEA() {
	    return this.getToken(DictioParser.LLAVEA, 0);
	};

	LLAVEC() {
	    return this.getToken(DictioParser.LLAVEC, 0);
	};

	content() {
	    return this.getTypedRuleContext(ContentContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitMain(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ContentContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_content;
    }

	condif = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CondifContext);
	    } else {
	        return this.getTypedRuleContext(CondifContext,i);
	    }
	};

	imprime = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ImprimeContext);
	    } else {
	        return this.getTypedRuleContext(ImprimeContext,i);
	    }
	};

	declara = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DeclaraContext);
	    } else {
	        return this.getTypedRuleContext(DeclaraContext,i);
	    }
	};

	asigna = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(AsignaContext);
	    } else {
	        return this.getTypedRuleContext(AsignaContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitContent(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CondifContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_condif;
    }

	IF() {
	    return this.getToken(DictioParser.IF, 0);
	};

	PARA() {
	    return this.getToken(DictioParser.PARA, 0);
	};

	siono() {
	    return this.getTypedRuleContext(SionoContext,0);
	};

	PARC() {
	    return this.getToken(DictioParser.PARC, 0);
	};

	LLAVEA() {
	    return this.getToken(DictioParser.LLAVEA, 0);
	};

	content() {
	    return this.getTypedRuleContext(ContentContext,0);
	};

	LLAVEC() {
	    return this.getToken(DictioParser.LLAVEC, 0);
	};

	deotro() {
	    return this.getTypedRuleContext(DeotroContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitCondif(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SionoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_siono;
        this.op = null;
    }

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	MAYORQUE() {
	    return this.getToken(DictioParser.MAYORQUE, 0);
	};

	MENORQUE() {
	    return this.getToken(DictioParser.MENORQUE, 0);
	};

	IGUAL() {
	    return this.getToken(DictioParser.IGUAL, 0);
	};

	DIFERENTE() {
	    return this.getToken(DictioParser.DIFERENTE, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitSiono(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DeotroContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_deotro;
    }

	ELSE() {
	    return this.getToken(DictioParser.ELSE, 0);
	};

	LLAVEA() {
	    return this.getToken(DictioParser.LLAVEA, 0);
	};

	content() {
	    return this.getTypedRuleContext(ContentContext,0);
	};

	LLAVEC() {
	    return this.getToken(DictioParser.LLAVEC, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitDeotro(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ImprimeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_imprime;
    }

	IMP() {
	    return this.getToken(DictioParser.IMP, 0);
	};

	PARA() {
	    return this.getToken(DictioParser.PARA, 0);
	};

	textobteiner() {
	    return this.getTypedRuleContext(TextobteinerContext,0);
	};

	PARC() {
	    return this.getToken(DictioParser.PARC, 0);
	};

	SC() {
	    return this.getToken(DictioParser.SC, 0);
	};

	COMA() {
	    return this.getToken(DictioParser.COMA, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitImprime(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DeclaraContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_declara;
    }

	COMP() {
	    return this.getToken(DictioParser.COMP, 0);
	};

	ID() {
	    return this.getToken(DictioParser.ID, 0);
	};

	SC() {
	    return this.getToken(DictioParser.SC, 0);
	};

	EQU() {
	    return this.getToken(DictioParser.EQU, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitDeclara(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AsignaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_asigna;
    }

	ID() {
	    return this.getToken(DictioParser.ID, 0);
	};

	EQU() {
	    return this.getToken(DictioParser.EQU, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	SC() {
	    return this.getToken(DictioParser.SC, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitAsigna(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ExprContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_expr;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class ParensContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	PARA() {
	    return this.getToken(DictioParser.PARA, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	PARC() {
	    return this.getToken(DictioParser.PARC, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitParens(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.ParensContext = ParensContext;

class AddsubContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        this.operation = null;;
        super.copyFrom(ctx);
    }

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	SUM() {
	    return this.getToken(DictioParser.SUM, 0);
	};

	RES() {
	    return this.getToken(DictioParser.RES, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitAddsub(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.AddsubContext = AddsubContext;

class MulDivContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        this.operation = null;;
        super.copyFrom(ctx);
    }

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	ASTE() {
	    return this.getToken(DictioParser.ASTE, 0);
	};

	DIA() {
	    return this.getToken(DictioParser.DIA, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitMulDiv(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.MulDivContext = MulDivContext;

class IdContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ID() {
	    return this.getToken(DictioParser.ID, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitId(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.IdContext = IdContext;

class IntContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	INT() {
	    return this.getToken(DictioParser.INT, 0);
	};

	RES() {
	    return this.getToken(DictioParser.RES, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitInt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.IntContext = IntContext;

class TextobteinerContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_textobteiner;
    }

	TEXTO() {
	    return this.getToken(DictioParser.TEXTO, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitTextobteiner(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




DictioParser.MainContext = MainContext; 
DictioParser.ContentContext = ContentContext; 
DictioParser.CondifContext = CondifContext; 
DictioParser.SionoContext = SionoContext; 
DictioParser.DeotroContext = DeotroContext; 
DictioParser.ImprimeContext = ImprimeContext; 
DictioParser.DeclaraContext = DeclaraContext; 
DictioParser.AsignaContext = AsignaContext; 
DictioParser.ExprContext = ExprContext; 
DictioParser.TextobteinerContext = TextobteinerContext; 
