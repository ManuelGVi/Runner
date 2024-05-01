// Generated from ./src/grammar/Dictio.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from 'antlr4';
import DictioVisitor from './DictioVisitor.js';

const serializedATN = [4,1,38,169,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,1,0,1,
0,1,0,3,0,29,8,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,4,1,38,8,1,11,1,12,1,39,1,2,
1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,50,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,3,3,59,
8,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,3,4,73,8,4,1,4,1,4,4,
4,77,8,4,11,4,12,4,78,1,4,5,4,82,8,4,10,4,12,4,85,9,4,1,5,1,5,1,5,1,5,1,
5,1,5,1,5,1,5,1,5,3,5,96,8,5,1,5,1,5,1,5,1,5,1,5,3,5,103,8,5,1,6,1,6,1,6,
1,6,1,7,1,7,1,7,1,7,3,7,113,8,7,1,7,1,7,1,7,3,7,118,8,7,5,7,120,8,7,10,7,
12,7,123,9,7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,3,8,132,8,8,1,8,1,8,1,9,1,9,1,9,
1,9,1,9,1,10,1,10,3,10,143,8,10,1,10,1,10,1,10,1,10,1,10,1,10,3,10,151,8,
10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,5,10,162,8,10,10,10,12,10,
165,9,10,1,11,1,11,1,11,0,2,8,20,12,0,2,4,6,8,10,12,14,16,18,20,22,0,6,2,
0,27,30,36,37,1,0,10,11,1,0,31,32,1,0,34,35,1,0,12,13,1,0,14,15,180,0,24,
1,0,0,0,2,37,1,0,0,0,4,41,1,0,0,0,6,51,1,0,0,0,8,72,1,0,0,0,10,102,1,0,0,
0,12,104,1,0,0,0,14,108,1,0,0,0,16,127,1,0,0,0,18,135,1,0,0,0,20,150,1,0,
0,0,22,166,1,0,0,0,24,25,5,3,0,0,25,26,5,4,0,0,26,28,5,17,0,0,27,29,3,2,
1,0,28,27,1,0,0,0,28,29,1,0,0,0,29,30,1,0,0,0,30,31,5,18,0,0,31,1,1,0,0,
0,32,38,3,4,2,0,33,38,3,6,3,0,34,38,3,14,7,0,35,38,3,16,8,0,36,38,3,18,9,
0,37,32,1,0,0,0,37,33,1,0,0,0,37,34,1,0,0,0,37,35,1,0,0,0,37,36,1,0,0,0,
38,39,1,0,0,0,39,37,1,0,0,0,39,40,1,0,0,0,40,3,1,0,0,0,41,42,5,7,0,0,42,
43,5,22,0,0,43,44,3,8,4,0,44,45,5,23,0,0,45,46,5,17,0,0,46,47,3,2,1,0,47,
49,5,18,0,0,48,50,3,10,5,0,49,48,1,0,0,0,49,50,1,0,0,0,50,5,1,0,0,0,51,52,
5,9,0,0,52,53,5,22,0,0,53,54,3,8,4,0,54,55,5,23,0,0,55,56,5,17,0,0,56,58,
3,2,1,0,57,59,3,12,6,0,58,57,1,0,0,0,58,59,1,0,0,0,59,60,1,0,0,0,60,61,5,
18,0,0,61,7,1,0,0,0,62,63,6,4,-1,0,63,64,3,20,10,0,64,65,7,0,0,0,65,66,3,
20,10,0,66,73,1,0,0,0,67,73,7,1,0,0,68,69,5,22,0,0,69,70,3,8,4,0,70,71,5,
23,0,0,71,73,1,0,0,0,72,62,1,0,0,0,72,67,1,0,0,0,72,68,1,0,0,0,73,83,1,0,
0,0,74,76,10,4,0,0,75,77,7,2,0,0,76,75,1,0,0,0,77,78,1,0,0,0,78,76,1,0,0,
0,78,79,1,0,0,0,79,80,1,0,0,0,80,82,3,8,4,5,81,74,1,0,0,0,82,85,1,0,0,0,
83,81,1,0,0,0,83,84,1,0,0,0,84,9,1,0,0,0,85,83,1,0,0,0,86,87,5,8,0,0,87,
88,5,7,0,0,88,89,5,22,0,0,89,90,3,8,4,0,90,91,5,23,0,0,91,92,5,17,0,0,92,
93,3,2,1,0,93,95,5,18,0,0,94,96,3,10,5,0,95,94,1,0,0,0,95,96,1,0,0,0,96,
103,1,0,0,0,97,98,5,8,0,0,98,99,5,17,0,0,99,100,3,2,1,0,100,101,5,18,0,0,
101,103,1,0,0,0,102,86,1,0,0,0,102,97,1,0,0,0,103,11,1,0,0,0,104,105,5,20,
0,0,105,106,7,3,0,0,106,107,5,24,0,0,107,13,1,0,0,0,108,109,5,6,0,0,109,
112,5,22,0,0,110,113,3,22,11,0,111,113,3,20,10,0,112,110,1,0,0,0,112,111,
1,0,0,0,113,121,1,0,0,0,114,117,5,25,0,0,115,118,3,22,11,0,116,118,3,20,
10,0,117,115,1,0,0,0,117,116,1,0,0,0,118,120,1,0,0,0,119,114,1,0,0,0,120,
123,1,0,0,0,121,119,1,0,0,0,121,122,1,0,0,0,122,124,1,0,0,0,123,121,1,0,
0,0,124,125,5,23,0,0,125,126,5,24,0,0,126,15,1,0,0,0,127,128,5,5,0,0,128,
131,5,20,0,0,129,130,5,16,0,0,130,132,3,20,10,0,131,129,1,0,0,0,131,132,
1,0,0,0,132,133,1,0,0,0,133,134,5,24,0,0,134,17,1,0,0,0,135,136,5,20,0,0,
136,137,5,16,0,0,137,138,3,20,10,0,138,139,5,24,0,0,139,19,1,0,0,0,140,142,
6,10,-1,0,141,143,5,14,0,0,142,141,1,0,0,0,142,143,1,0,0,0,143,144,1,0,0,
0,144,151,5,21,0,0,145,146,5,22,0,0,146,147,3,20,10,0,147,148,5,23,0,0,148,
151,1,0,0,0,149,151,5,20,0,0,150,140,1,0,0,0,150,145,1,0,0,0,150,149,1,0,
0,0,151,163,1,0,0,0,152,153,10,6,0,0,153,154,7,4,0,0,154,162,3,20,10,7,155,
156,10,5,0,0,156,157,7,5,0,0,157,162,3,20,10,6,158,159,10,3,0,0,159,160,
5,33,0,0,160,162,3,20,10,4,161,152,1,0,0,0,161,155,1,0,0,0,161,158,1,0,0,
0,162,165,1,0,0,0,163,161,1,0,0,0,163,164,1,0,0,0,164,21,1,0,0,0,165,163,
1,0,0,0,166,167,5,38,0,0,167,23,1,0,0,0,18,28,37,39,49,58,72,78,83,95,102,
112,117,121,131,142,150,161,163];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class DictioParser extends antlr4.Parser {

    static grammarFileName = "Dictio.g4";
    static literalNames = [ null, null, null, "'lets'", "'run'", "'comp'", 
                            "'imp'", "'si'", "'sino'", "'mientras'", "'true'", 
                            "'false'", "'*'", "'/'", "'-'", "'+'", "'='", 
                            "'{'", "'}'", "'.'", null, null, "'('", "')'", 
                            "';'", "','", "'\"'", "'>'", "'<'", "'=='", 
                            "'!='", "'&&'", "'||'", "'%'", "'++'", "'--'", 
                            "'<='", "'>='" ];
    static symbolicNames = [ null, "WS", "COMENTARIO", "LETS", "RUN", "COMP", 
                             "IMP", "IF", "ELSE", "WHILE", "VERDAD", "FALSO", 
                             "ASTE", "DIA", "RES", "SUM", "EQU", "LLAVEA", 
                             "LLAVEC", "DOT", "ID", "INT", "PARA", "PARC", 
                             "SC", "COMA", "COMID", "MAYORQUE", "MENORQUE", 
                             "IGUAL", "DIFERENTE", "AND", "OR", "PORCENTAJE", 
                             "INCREMENTO", "DECREMENTO", "MENORIGUAL", "MAYORIGUAL", 
                             "TEXTO" ];
    static ruleNames = [ "main", "content", "condif", "mientras", "siono", 
                         "deotro", "cambio", "imprime", "declara", "asigna", 
                         "expr", "textobteiner" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = DictioParser.ruleNames;
        this.literalNames = DictioParser.literalNames;
        this.symbolicNames = DictioParser.symbolicNames;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 4:
    	    		return this.siono_sempred(localctx, predIndex);
    	case 10:
    	    		return this.expr_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    siono_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 4);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };

    expr_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 1:
    			return this.precpred(this._ctx, 6);
    		case 2:
    			return this.precpred(this._ctx, 5);
    		case 3:
    			return this.precpred(this._ctx, 3);
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
	        this.state = 24;
	        this.match(DictioParser.LETS);
	        this.state = 25;
	        this.match(DictioParser.RUN);
	        this.state = 26;
	        this.match(DictioParser.LLAVEA);
	        this.state = 28;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 1049312) !== 0)) {
	            this.state = 27;
	            this.content();
	        }

	        this.state = 30;
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
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 37; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 37;
	        		this._errHandler.sync(this);
	        		switch(this._input.LA(1)) {
	        		case 7:
	        		    this.state = 32;
	        		    this.condif();
	        		    break;
	        		case 9:
	        		    this.state = 33;
	        		    this.mientras();
	        		    break;
	        		case 6:
	        		    this.state = 34;
	        		    this.imprime();
	        		    break;
	        		case 5:
	        		    this.state = 35;
	        		    this.declara();
	        		    break;
	        		case 20:
	        		    this.state = 36;
	        		    this.asigna();
	        		    break;
	        		default:
	        		    throw new antlr4.error.NoViableAltException(this);
	        		}
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 39; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,2, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
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
	        this.state = 41;
	        this.match(DictioParser.IF);
	        this.state = 42;
	        this.match(DictioParser.PARA);
	        this.state = 43;
	        this.siono(0);
	        this.state = 44;
	        this.match(DictioParser.PARC);
	        this.state = 45;
	        this.match(DictioParser.LLAVEA);
	        this.state = 46;
	        this.content();
	        this.state = 47;
	        this.match(DictioParser.LLAVEC);
	        this.state = 49;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===8) {
	            this.state = 48;
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



	mientras() {
	    let localctx = new MientrasContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, DictioParser.RULE_mientras);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 51;
	        this.match(DictioParser.WHILE);
	        this.state = 52;
	        this.match(DictioParser.PARA);
	        this.state = 53;
	        this.siono(0);
	        this.state = 54;
	        this.match(DictioParser.PARC);
	        this.state = 55;
	        this.match(DictioParser.LLAVEA);
	        this.state = 56;
	        this.content();
	        this.state = 58;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===20) {
	            this.state = 57;
	            this.cambio();
	        }

	        this.state = 60;
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


	siono(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new SionoContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 8;
	    this.enterRecursionRule(localctx, 8, DictioParser.RULE_siono, _p);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 72;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,5,this._ctx);
	        switch(la_) {
	        case 1:
	            localctx = new ComparacionesContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;

	            this.state = 63;
	            this.expr(0);
	            this.state = 64;
	            localctx.op = this._input.LT(1);
	            _la = this._input.LA(1);
	            if(!(((((_la - 27)) & ~0x1f) === 0 && ((1 << (_la - 27)) & 1551) !== 0))) {
	                localctx.op = this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 65;
	            this.expr(0);
	            break;

	        case 2:
	            localctx = new VerdaderofalsoContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 67;
	            _la = this._input.LA(1);
	            if(!(_la===10 || _la===11)) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            break;

	        case 3:
	            localctx = new CondiparensContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 68;
	            this.match(DictioParser.PARA);
	            this.state = 69;
	            this.siono(0);
	            this.state = 70;
	            this.match(DictioParser.PARC);
	            break;

	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 83;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,7,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                localctx = new AndorContext(this, new SionoContext(this, _parentctx, _parentState));
	                this.pushNewRecursionContext(localctx, _startState, DictioParser.RULE_siono);
	                this.state = 74;
	                if (!( this.precpred(this._ctx, 4))) {
	                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
	                }
	                this.state = 76; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	                do {
	                    this.state = 75;
	                    localctx.op = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===31 || _la===32)) {
	                        localctx.op = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 78; 
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                } while(_la===31 || _la===32);
	                this.state = 80;
	                this.siono(5); 
	            }
	            this.state = 85;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,7,this._ctx);
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



	deotro() {
	    let localctx = new DeotroContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, DictioParser.RULE_deotro);
	    var _la = 0;
	    try {
	        this.state = 102;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
	        switch(la_) {
	        case 1:
	            localctx = new DeotroifContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 86;
	            this.match(DictioParser.ELSE);
	            this.state = 87;
	            this.match(DictioParser.IF);
	            this.state = 88;
	            this.match(DictioParser.PARA);
	            this.state = 89;
	            this.siono(0);
	            this.state = 90;
	            this.match(DictioParser.PARC);
	            this.state = 91;
	            this.match(DictioParser.LLAVEA);
	            this.state = 92;
	            this.content();
	            this.state = 93;
	            this.match(DictioParser.LLAVEC);
	            this.state = 95;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===8) {
	                this.state = 94;
	                this.deotro();
	            }

	            break;

	        case 2:
	            localctx = new DeotrosimpleContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 97;
	            this.match(DictioParser.ELSE);
	            this.state = 98;
	            this.match(DictioParser.LLAVEA);
	            this.state = 99;
	            this.content();
	            this.state = 100;
	            this.match(DictioParser.LLAVEC);
	            break;

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



	cambio() {
	    let localctx = new CambioContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, DictioParser.RULE_cambio);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 104;
	        this.match(DictioParser.ID);
	        this.state = 105;
	        _la = this._input.LA(1);
	        if(!(_la===34 || _la===35)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 106;
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



	imprime() {
	    let localctx = new ImprimeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, DictioParser.RULE_imprime);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 108;
	        this.match(DictioParser.IMP);
	        this.state = 109;
	        this.match(DictioParser.PARA);
	        this.state = 112;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 38:
	            this.state = 110;
	            this.textobteiner();
	            break;
	        case 14:
	        case 20:
	        case 21:
	        case 22:
	            this.state = 111;
	            this.expr(0);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this.state = 121;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===25) {
	            this.state = 114;
	            this.match(DictioParser.COMA);
	            this.state = 117;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 38:
	                this.state = 115;
	                this.textobteiner();
	                break;
	            case 14:
	            case 20:
	            case 21:
	            case 22:
	                this.state = 116;
	                this.expr(0);
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 123;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 124;
	        this.match(DictioParser.PARC);
	        this.state = 125;
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
	    this.enterRule(localctx, 16, DictioParser.RULE_declara);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 127;
	        this.match(DictioParser.COMP);
	        this.state = 128;
	        this.match(DictioParser.ID);
	        this.state = 131;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===16) {
	            this.state = 129;
	            this.match(DictioParser.EQU);
	            this.state = 130;
	            this.expr(0);
	        }

	        this.state = 133;
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
	    this.enterRule(localctx, 18, DictioParser.RULE_asigna);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 135;
	        this.match(DictioParser.ID);
	        this.state = 136;
	        this.match(DictioParser.EQU);
	        this.state = 137;
	        this.expr(0);
	        this.state = 138;
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
	    const _startState = 20;
	    this.enterRecursionRule(localctx, 20, DictioParser.RULE_expr, _p);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 150;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 14:
	        case 21:
	            localctx = new IntContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;

	            this.state = 142;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===14) {
	                this.state = 141;
	                this.match(DictioParser.RES);
	            }

	            this.state = 144;
	            this.match(DictioParser.INT);
	            break;
	        case 22:
	            localctx = new ParensContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 145;
	            this.match(DictioParser.PARA);
	            this.state = 146;
	            this.expr(0);
	            this.state = 147;
	            this.match(DictioParser.PARC);
	            break;
	        case 20:
	            localctx = new IdContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 149;
	            this.match(DictioParser.ID);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 163;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,17,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 161;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,16,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new MulDivContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, DictioParser.RULE_expr);
	                    this.state = 152;
	                    if (!( this.precpred(this._ctx, 6))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 6)");
	                    }
	                    this.state = 153;
	                    localctx.operation = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===12 || _la===13)) {
	                        localctx.operation = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 154;
	                    this.expr(7);
	                    break;

	                case 2:
	                    localctx = new AddsubContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, DictioParser.RULE_expr);
	                    this.state = 155;
	                    if (!( this.precpred(this._ctx, 5))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 5)");
	                    }
	                    this.state = 156;
	                    localctx.operation = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===14 || _la===15)) {
	                        localctx.operation = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 157;
	                    this.expr(6);
	                    break;

	                case 3:
	                    localctx = new ResiduoContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, DictioParser.RULE_expr);
	                    this.state = 158;
	                    if (!( this.precpred(this._ctx, 3))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
	                    }
	                    this.state = 159;
	                    this.match(DictioParser.PORCENTAJE);
	                    this.state = 160;
	                    this.expr(4);
	                    break;

	                } 
	            }
	            this.state = 165;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,17,this._ctx);
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
	    this.enterRule(localctx, 22, DictioParser.RULE_textobteiner);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 166;
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
DictioParser.COMENTARIO = 2;
DictioParser.LETS = 3;
DictioParser.RUN = 4;
DictioParser.COMP = 5;
DictioParser.IMP = 6;
DictioParser.IF = 7;
DictioParser.ELSE = 8;
DictioParser.WHILE = 9;
DictioParser.VERDAD = 10;
DictioParser.FALSO = 11;
DictioParser.ASTE = 12;
DictioParser.DIA = 13;
DictioParser.RES = 14;
DictioParser.SUM = 15;
DictioParser.EQU = 16;
DictioParser.LLAVEA = 17;
DictioParser.LLAVEC = 18;
DictioParser.DOT = 19;
DictioParser.ID = 20;
DictioParser.INT = 21;
DictioParser.PARA = 22;
DictioParser.PARC = 23;
DictioParser.SC = 24;
DictioParser.COMA = 25;
DictioParser.COMID = 26;
DictioParser.MAYORQUE = 27;
DictioParser.MENORQUE = 28;
DictioParser.IGUAL = 29;
DictioParser.DIFERENTE = 30;
DictioParser.AND = 31;
DictioParser.OR = 32;
DictioParser.PORCENTAJE = 33;
DictioParser.INCREMENTO = 34;
DictioParser.DECREMENTO = 35;
DictioParser.MENORIGUAL = 36;
DictioParser.MAYORIGUAL = 37;
DictioParser.TEXTO = 38;

DictioParser.RULE_main = 0;
DictioParser.RULE_content = 1;
DictioParser.RULE_condif = 2;
DictioParser.RULE_mientras = 3;
DictioParser.RULE_siono = 4;
DictioParser.RULE_deotro = 5;
DictioParser.RULE_cambio = 6;
DictioParser.RULE_imprime = 7;
DictioParser.RULE_declara = 8;
DictioParser.RULE_asigna = 9;
DictioParser.RULE_expr = 10;
DictioParser.RULE_textobteiner = 11;

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

	mientras = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(MientrasContext);
	    } else {
	        return this.getTypedRuleContext(MientrasContext,i);
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



class MientrasContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_mientras;
    }

	WHILE() {
	    return this.getToken(DictioParser.WHILE, 0);
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

	cambio() {
	    return this.getTypedRuleContext(CambioContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitMientras(this);
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
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class VerdaderofalsoContext extends SionoContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	VERDAD() {
	    return this.getToken(DictioParser.VERDAD, 0);
	};

	FALSO() {
	    return this.getToken(DictioParser.FALSO, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitVerdaderofalso(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.VerdaderofalsoContext = VerdaderofalsoContext;

class AndorContext extends SionoContext {

    constructor(parser, ctx) {
        super(parser);
        this.op = null;;
        super.copyFrom(ctx);
    }

	siono = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SionoContext);
	    } else {
	        return this.getTypedRuleContext(SionoContext,i);
	    }
	};

	AND = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(DictioParser.AND);
	    } else {
	        return this.getToken(DictioParser.AND, i);
	    }
	};


	OR = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(DictioParser.OR);
	    } else {
	        return this.getToken(DictioParser.OR, i);
	    }
	};


	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitAndor(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.AndorContext = AndorContext;

class ComparacionesContext extends SionoContext {

    constructor(parser, ctx) {
        super(parser);
        this.op = null;;
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

	MAYORQUE() {
	    return this.getToken(DictioParser.MAYORQUE, 0);
	};

	MENORQUE() {
	    return this.getToken(DictioParser.MENORQUE, 0);
	};

	MAYORIGUAL() {
	    return this.getToken(DictioParser.MAYORIGUAL, 0);
	};

	MENORIGUAL() {
	    return this.getToken(DictioParser.MENORIGUAL, 0);
	};

	IGUAL() {
	    return this.getToken(DictioParser.IGUAL, 0);
	};

	DIFERENTE() {
	    return this.getToken(DictioParser.DIFERENTE, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitComparaciones(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.ComparacionesContext = ComparacionesContext;

class CondiparensContext extends SionoContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	PARA() {
	    return this.getToken(DictioParser.PARA, 0);
	};

	siono() {
	    return this.getTypedRuleContext(SionoContext,0);
	};

	PARC() {
	    return this.getToken(DictioParser.PARC, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitCondiparens(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.CondiparensContext = CondiparensContext;

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


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class DeotroifContext extends DeotroContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ELSE() {
	    return this.getToken(DictioParser.ELSE, 0);
	};

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
	        return visitor.visitDeotroif(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.DeotroifContext = DeotroifContext;

class DeotrosimpleContext extends DeotroContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
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
	        return visitor.visitDeotrosimple(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.DeotrosimpleContext = DeotrosimpleContext;

class CambioContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = DictioParser.RULE_cambio;
    }

	ID() {
	    return this.getToken(DictioParser.ID, 0);
	};

	SC() {
	    return this.getToken(DictioParser.SC, 0);
	};

	INCREMENTO() {
	    return this.getToken(DictioParser.INCREMENTO, 0);
	};

	DECREMENTO() {
	    return this.getToken(DictioParser.DECREMENTO, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitCambio(this);
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

	PARC() {
	    return this.getToken(DictioParser.PARC, 0);
	};

	SC() {
	    return this.getToken(DictioParser.SC, 0);
	};

	textobteiner = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(TextobteinerContext);
	    } else {
	        return this.getTypedRuleContext(TextobteinerContext,i);
	    }
	};

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

	COMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(DictioParser.COMA);
	    } else {
	        return this.getToken(DictioParser.COMA, i);
	    }
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


class ResiduoContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
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

	PORCENTAJE() {
	    return this.getToken(DictioParser.PORCENTAJE, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof DictioVisitor ) {
	        return visitor.visitResiduo(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

DictioParser.ResiduoContext = ResiduoContext;

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
DictioParser.MientrasContext = MientrasContext; 
DictioParser.SionoContext = SionoContext; 
DictioParser.DeotroContext = DeotroContext; 
DictioParser.CambioContext = CambioContext; 
DictioParser.ImprimeContext = ImprimeContext; 
DictioParser.DeclaraContext = DeclaraContext; 
DictioParser.AsignaContext = AsignaContext; 
DictioParser.ExprContext = ExprContext; 
DictioParser.TextobteinerContext = TextobteinerContext; 
