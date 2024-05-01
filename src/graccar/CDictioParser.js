// Generated from ./src/graccar/CDictio.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from 'antlr4';
import CDictioVisitor from './CDictioVisitor.js';

const serializedATN = [4,1,40,182,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
1,0,1,0,1,0,1,0,1,0,1,0,3,0,33,8,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,4,1,42,8,
1,11,1,12,1,43,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,55,8,2,1,3,1,3,1,
3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,3,4,76,
8,4,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,3,6,93,8,
6,1,6,1,6,4,6,97,8,6,11,6,12,6,98,1,6,5,6,102,8,6,10,6,12,6,105,9,6,1,7,
1,7,1,7,1,7,3,7,111,8,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,3,7,120,8,7,1,7,1,7,
1,7,3,7,125,8,7,5,7,127,8,7,10,7,12,7,130,9,7,1,7,1,7,1,7,3,7,135,8,7,1,
8,1,8,1,8,1,8,3,8,141,8,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,10,
1,11,1,11,3,11,156,8,11,1,11,1,11,1,11,1,11,1,11,1,11,3,11,164,8,11,1,11,
1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,5,11,175,8,11,10,11,12,11,178,9,
11,1,12,1,12,1,12,0,2,12,22,13,0,2,4,6,8,10,12,14,16,18,20,22,24,0,7,2,0,
4,4,6,6,1,0,28,33,1,0,10,11,1,0,34,35,1,0,36,37,1,0,13,14,1,0,15,16,194,
0,26,1,0,0,0,2,41,1,0,0,0,4,45,1,0,0,0,6,56,1,0,0,0,8,65,1,0,0,0,10,77,1,
0,0,0,12,92,1,0,0,0,14,134,1,0,0,0,16,136,1,0,0,0,18,144,1,0,0,0,20,149,
1,0,0,0,22,163,1,0,0,0,24,179,1,0,0,0,26,27,7,0,0,0,27,28,5,5,0,0,28,29,
5,23,0,0,29,30,5,24,0,0,30,32,5,18,0,0,31,33,3,2,1,0,32,31,1,0,0,0,32,33,
1,0,0,0,33,34,1,0,0,0,34,35,5,19,0,0,35,1,1,0,0,0,36,42,3,4,2,0,37,42,3,
6,3,0,38,42,3,14,7,0,39,42,3,16,8,0,40,42,3,18,9,0,41,36,1,0,0,0,41,37,1,
0,0,0,41,38,1,0,0,0,41,39,1,0,0,0,41,40,1,0,0,0,42,43,1,0,0,0,43,41,1,0,
0,0,43,44,1,0,0,0,44,3,1,0,0,0,45,46,5,8,0,0,46,47,5,23,0,0,47,48,3,12,6,
0,48,49,5,24,0,0,49,50,5,18,0,0,50,51,3,2,1,0,51,54,5,19,0,0,52,55,3,8,4,
0,53,55,3,10,5,0,54,52,1,0,0,0,54,53,1,0,0,0,54,55,1,0,0,0,55,5,1,0,0,0,
56,57,5,12,0,0,57,58,5,23,0,0,58,59,3,12,6,0,59,60,5,24,0,0,60,61,5,18,0,
0,61,62,3,2,1,0,62,63,3,20,10,0,63,64,5,19,0,0,64,7,1,0,0,0,65,66,5,9,0,
0,66,67,5,8,0,0,67,68,5,23,0,0,68,69,3,12,6,0,69,70,5,24,0,0,70,71,5,18,
0,0,71,72,3,2,1,0,72,75,5,19,0,0,73,76,3,8,4,0,74,76,3,10,5,0,75,73,1,0,
0,0,75,74,1,0,0,0,75,76,1,0,0,0,76,9,1,0,0,0,77,78,5,9,0,0,78,79,5,18,0,
0,79,80,3,2,1,0,80,81,5,19,0,0,81,11,1,0,0,0,82,83,6,6,-1,0,83,84,3,22,11,
0,84,85,7,1,0,0,85,86,3,22,11,0,86,93,1,0,0,0,87,93,7,2,0,0,88,89,5,23,0,
0,89,90,3,12,6,0,90,91,5,24,0,0,91,93,1,0,0,0,92,82,1,0,0,0,92,87,1,0,0,
0,92,88,1,0,0,0,93,103,1,0,0,0,94,96,10,4,0,0,95,97,7,3,0,0,96,95,1,0,0,
0,97,98,1,0,0,0,98,96,1,0,0,0,98,99,1,0,0,0,99,100,1,0,0,0,100,102,3,12,
6,5,101,94,1,0,0,0,102,105,1,0,0,0,103,101,1,0,0,0,103,104,1,0,0,0,104,13,
1,0,0,0,105,103,1,0,0,0,106,107,5,7,0,0,107,110,5,23,0,0,108,111,3,24,12,
0,109,111,3,22,11,0,110,108,1,0,0,0,110,109,1,0,0,0,111,112,1,0,0,0,112,
113,5,24,0,0,113,114,5,25,0,0,114,135,1,0,0,0,115,116,5,7,0,0,116,119,5,
23,0,0,117,120,3,24,12,0,118,120,3,22,11,0,119,117,1,0,0,0,119,118,1,0,0,
0,120,128,1,0,0,0,121,124,5,26,0,0,122,125,3,22,11,0,123,125,3,24,12,0,124,
122,1,0,0,0,124,123,1,0,0,0,125,127,1,0,0,0,126,121,1,0,0,0,127,130,1,0,
0,0,128,126,1,0,0,0,128,129,1,0,0,0,129,131,1,0,0,0,130,128,1,0,0,0,131,
132,5,24,0,0,132,133,5,25,0,0,133,135,1,0,0,0,134,106,1,0,0,0,134,115,1,
0,0,0,135,15,1,0,0,0,136,137,5,6,0,0,137,140,5,21,0,0,138,139,5,17,0,0,139,
141,3,22,11,0,140,138,1,0,0,0,140,141,1,0,0,0,141,142,1,0,0,0,142,143,5,
25,0,0,143,17,1,0,0,0,144,145,5,21,0,0,145,146,5,17,0,0,146,147,3,22,11,
0,147,148,5,25,0,0,148,19,1,0,0,0,149,150,5,21,0,0,150,151,7,4,0,0,151,152,
5,25,0,0,152,21,1,0,0,0,153,155,6,11,-1,0,154,156,5,15,0,0,155,154,1,0,0,
0,155,156,1,0,0,0,156,157,1,0,0,0,157,164,5,22,0,0,158,159,5,23,0,0,159,
160,3,22,11,0,160,161,5,24,0,0,161,164,1,0,0,0,162,164,5,21,0,0,163,153,
1,0,0,0,163,158,1,0,0,0,163,162,1,0,0,0,164,176,1,0,0,0,165,166,10,6,0,0,
166,167,7,5,0,0,167,175,3,22,11,7,168,169,10,5,0,0,169,170,7,6,0,0,170,175,
3,22,11,6,171,172,10,3,0,0,172,173,5,38,0,0,173,175,3,22,11,4,174,165,1,
0,0,0,174,168,1,0,0,0,174,171,1,0,0,0,175,178,1,0,0,0,176,174,1,0,0,0,176,
177,1,0,0,0,177,23,1,0,0,0,178,176,1,0,0,0,179,180,5,40,0,0,180,25,1,0,0,
0,18,32,41,43,54,75,92,98,103,110,119,124,128,134,140,155,163,174,176];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class CDictioParser extends antlr4.Parser {

    static grammarFileName = "CDictio.g4";
    static literalNames = [ null, null, null, null, "'void'", "'main'", 
                            "'int'", "'printf'", "'if'", "'else'", "'true'", 
                            "'false'", "'while'", "'*'", "'/'", "'-'", "'+'", 
                            "'='", "'{'", "'}'", "'.'", null, null, "'('", 
                            "')'", "';'", "','", "'\"'", "'>'", "'>='", 
                            "'<='", "'<'", "'=='", "'!='", "'&&'", "'||'", 
                            "'++'", "'--'", "'%'", "'return'" ];
    static symbolicNames = [ null, "WS", "COMENTARIO", "SKIPRETUNR", "VOID", 
                             "MAIN", "INT", "PRINTF", "SI", "SINO", "TRUE", 
                             "FALSE", "WHILE", "MUL", "DIV", "SUB", "ADD", 
                             "EQUAL", "LLAVEO", "LLAVECL", "PUNTO", "IDS", 
                             "NUM", "PARENO", "PARENC", "SEMICOLON", "COMMA", 
                             "COMILLAS", "GREATERTHAN", "GREATEREQUAL", 
                             "LOWEREQUAL", "LOWER", "COMPARISON", "NOTEQUAL", 
                             "Y", "O", "INCREMENT", "DECREMENT", "PER", 
                             "RETURN", "TEXT" ];
    static ruleNames = [ "main", "contenido", "conditionalif", "ciclowhile", 
                         "elseif", "elsesimple", "condition", "print", "declaration", 
                         "asignation", "change", "expr", "textobteiner" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = CDictioParser.ruleNames;
        this.literalNames = CDictioParser.literalNames;
        this.symbolicNames = CDictioParser.symbolicNames;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 6:
    	    		return this.condition_sempred(localctx, predIndex);
    	case 11:
    	    		return this.expr_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    condition_sempred(localctx, predIndex) {
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
	    this.enterRule(localctx, 0, CDictioParser.RULE_main);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 26;
	        _la = this._input.LA(1);
	        if(!(_la===4 || _la===6)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 27;
	        this.match(CDictioParser.MAIN);
	        this.state = 28;
	        this.match(CDictioParser.PARENO);
	        this.state = 29;
	        this.match(CDictioParser.PARENC);
	        this.state = 30;
	        this.match(CDictioParser.LLAVEO);
	        this.state = 32;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 2101696) !== 0)) {
	            this.state = 31;
	            this.contenido();
	        }

	        this.state = 34;
	        this.match(CDictioParser.LLAVECL);
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



	contenido() {
	    let localctx = new ContenidoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, CDictioParser.RULE_contenido);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 41; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 41;
	        		this._errHandler.sync(this);
	        		switch(this._input.LA(1)) {
	        		case 8:
	        		    this.state = 36;
	        		    this.conditionalif();
	        		    break;
	        		case 12:
	        		    this.state = 37;
	        		    this.ciclowhile();
	        		    break;
	        		case 7:
	        		    this.state = 38;
	        		    this.print();
	        		    break;
	        		case 6:
	        		    this.state = 39;
	        		    this.declaration();
	        		    break;
	        		case 21:
	        		    this.state = 40;
	        		    this.asignation();
	        		    break;
	        		default:
	        		    throw new antlr4.error.NoViableAltException(this);
	        		}
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 43; 
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



	conditionalif() {
	    let localctx = new ConditionalifContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, CDictioParser.RULE_conditionalif);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 45;
	        this.match(CDictioParser.SI);
	        this.state = 46;
	        this.match(CDictioParser.PARENO);
	        this.state = 47;
	        this.condition(0);
	        this.state = 48;
	        this.match(CDictioParser.PARENC);
	        this.state = 49;
	        this.match(CDictioParser.LLAVEO);
	        this.state = 50;
	        this.contenido();
	        this.state = 51;
	        this.match(CDictioParser.LLAVECL);
	        this.state = 54;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,3,this._ctx);
	        if(la_===1) {
	            this.state = 52;
	            this.elseif();

	        } else if(la_===2) {
	            this.state = 53;
	            this.elsesimple();

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



	ciclowhile() {
	    let localctx = new CiclowhileContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, CDictioParser.RULE_ciclowhile);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 56;
	        this.match(CDictioParser.WHILE);
	        this.state = 57;
	        this.match(CDictioParser.PARENO);
	        this.state = 58;
	        this.condition(0);
	        this.state = 59;
	        this.match(CDictioParser.PARENC);
	        this.state = 60;
	        this.match(CDictioParser.LLAVEO);
	        this.state = 61;
	        this.contenido();
	        this.state = 62;
	        this.change();
	        this.state = 63;
	        this.match(CDictioParser.LLAVECL);
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



	elseif() {
	    let localctx = new ElseifContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, CDictioParser.RULE_elseif);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 65;
	        this.match(CDictioParser.SINO);
	        this.state = 66;
	        this.match(CDictioParser.SI);
	        this.state = 67;
	        this.match(CDictioParser.PARENO);
	        this.state = 68;
	        this.condition(0);
	        this.state = 69;
	        this.match(CDictioParser.PARENC);
	        this.state = 70;
	        this.match(CDictioParser.LLAVEO);
	        this.state = 71;
	        this.contenido();
	        this.state = 72;
	        this.match(CDictioParser.LLAVECL);
	        this.state = 75;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,4,this._ctx);
	        if(la_===1) {
	            this.state = 73;
	            this.elseif();

	        } else if(la_===2) {
	            this.state = 74;
	            this.elsesimple();

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



	elsesimple() {
	    let localctx = new ElsesimpleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, CDictioParser.RULE_elsesimple);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 77;
	        this.match(CDictioParser.SINO);
	        this.state = 78;
	        this.match(CDictioParser.LLAVEO);
	        this.state = 79;
	        this.contenido();
	        this.state = 80;
	        this.match(CDictioParser.LLAVECL);
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


	condition(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new ConditionContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 12;
	    this.enterRecursionRule(localctx, 12, CDictioParser.RULE_condition, _p);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 92;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,5,this._ctx);
	        switch(la_) {
	        case 1:
	            localctx = new ComparissonContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;

	            this.state = 83;
	            this.expr(0);
	            this.state = 84;
	            localctx.op = this._input.LT(1);
	            _la = this._input.LA(1);
	            if(!(((((_la - 28)) & ~0x1f) === 0 && ((1 << (_la - 28)) & 63) !== 0))) {
	                localctx.op = this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 85;
	            this.expr(0);
	            break;

	        case 2:
	            localctx = new TruefalseContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 87;
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
	            localctx = new ConditionparensContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 88;
	            this.match(CDictioParser.PARENO);
	            this.state = 89;
	            this.condition(0);
	            this.state = 90;
	            this.match(CDictioParser.PARENC);
	            break;

	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 103;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,7,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                localctx = new YoContext(this, new ConditionContext(this, _parentctx, _parentState));
	                this.pushNewRecursionContext(localctx, _startState, CDictioParser.RULE_condition);
	                this.state = 94;
	                if (!( this.precpred(this._ctx, 4))) {
	                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
	                }
	                this.state = 96; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	                do {
	                    this.state = 95;
	                    localctx.op = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===34 || _la===35)) {
	                        localctx.op = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 98; 
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                } while(_la===34 || _la===35);
	                this.state = 100;
	                this.condition(5); 
	            }
	            this.state = 105;
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



	print() {
	    let localctx = new PrintContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, CDictioParser.RULE_print);
	    var _la = 0;
	    try {
	        this.state = 134;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,12,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 106;
	            this.match(CDictioParser.PRINTF);
	            this.state = 107;
	            this.match(CDictioParser.PARENO);
	            this.state = 110;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 40:
	                this.state = 108;
	                this.textobteiner();
	                break;
	            case 15:
	            case 21:
	            case 22:
	            case 23:
	                this.state = 109;
	                this.expr(0);
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 112;
	            this.match(CDictioParser.PARENC);
	            this.state = 113;
	            this.match(CDictioParser.SEMICOLON);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 115;
	            this.match(CDictioParser.PRINTF);
	            this.state = 116;
	            this.match(CDictioParser.PARENO);
	            this.state = 119;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 40:
	                this.state = 117;
	                this.textobteiner();
	                break;
	            case 15:
	            case 21:
	            case 22:
	            case 23:
	                this.state = 118;
	                this.expr(0);
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 128;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===26) {
	                this.state = 121;
	                this.match(CDictioParser.COMMA);
	                this.state = 124;
	                this._errHandler.sync(this);
	                switch(this._input.LA(1)) {
	                case 15:
	                case 21:
	                case 22:
	                case 23:
	                    this.state = 122;
	                    this.expr(0);
	                    break;
	                case 40:
	                    this.state = 123;
	                    this.textobteiner();
	                    break;
	                default:
	                    throw new antlr4.error.NoViableAltException(this);
	                }
	                this.state = 130;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            this.state = 131;
	            this.match(CDictioParser.PARENC);
	            this.state = 132;
	            this.match(CDictioParser.SEMICOLON);
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



	declaration() {
	    let localctx = new DeclarationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, CDictioParser.RULE_declaration);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 136;
	        this.match(CDictioParser.INT);
	        this.state = 137;
	        this.match(CDictioParser.IDS);
	        this.state = 140;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===17) {
	            this.state = 138;
	            this.match(CDictioParser.EQUAL);
	            this.state = 139;
	            this.expr(0);
	        }

	        this.state = 142;
	        this.match(CDictioParser.SEMICOLON);
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



	asignation() {
	    let localctx = new AsignationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, CDictioParser.RULE_asignation);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 144;
	        this.match(CDictioParser.IDS);
	        this.state = 145;
	        this.match(CDictioParser.EQUAL);
	        this.state = 146;
	        this.expr(0);
	        this.state = 147;
	        this.match(CDictioParser.SEMICOLON);
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



	change() {
	    let localctx = new ChangeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, CDictioParser.RULE_change);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 149;
	        this.match(CDictioParser.IDS);
	        this.state = 150;
	        _la = this._input.LA(1);
	        if(!(_la===36 || _la===37)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 151;
	        this.match(CDictioParser.SEMICOLON);
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
	    const _startState = 22;
	    this.enterRecursionRule(localctx, 22, CDictioParser.RULE_expr, _p);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 163;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 15:
	        case 22:
	            localctx = new IntContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;

	            this.state = 155;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===15) {
	                this.state = 154;
	                this.match(CDictioParser.SUB);
	            }

	            this.state = 157;
	            this.match(CDictioParser.NUM);
	            break;
	        case 23:
	            localctx = new ExprparensContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 158;
	            this.match(CDictioParser.PARENO);
	            this.state = 159;
	            this.expr(0);
	            this.state = 160;
	            this.match(CDictioParser.PARENC);
	            break;
	        case 21:
	            localctx = new IdsContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 162;
	            this.match(CDictioParser.IDS);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 176;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,17,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 174;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,16,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new TimesdivContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, CDictioParser.RULE_expr);
	                    this.state = 165;
	                    if (!( this.precpred(this._ctx, 6))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 6)");
	                    }
	                    this.state = 166;
	                    localctx.operation = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===13 || _la===14)) {
	                        localctx.operation = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 167;
	                    this.expr(7);
	                    break;

	                case 2:
	                    localctx = new SumarestaContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, CDictioParser.RULE_expr);
	                    this.state = 168;
	                    if (!( this.precpred(this._ctx, 5))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 5)");
	                    }
	                    this.state = 169;
	                    localctx.operation = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===15 || _la===16)) {
	                        localctx.operation = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 170;
	                    this.expr(6);
	                    break;

	                case 3:
	                    localctx = new ResidualContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, CDictioParser.RULE_expr);
	                    this.state = 171;
	                    if (!( this.precpred(this._ctx, 3))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
	                    }
	                    this.state = 172;
	                    this.match(CDictioParser.PER);
	                    this.state = 173;
	                    this.expr(4);
	                    break;

	                } 
	            }
	            this.state = 178;
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
	    this.enterRule(localctx, 24, CDictioParser.RULE_textobteiner);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 179;
	        this.match(CDictioParser.TEXT);
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

CDictioParser.EOF = antlr4.Token.EOF;
CDictioParser.WS = 1;
CDictioParser.COMENTARIO = 2;
CDictioParser.SKIPRETUNR = 3;
CDictioParser.VOID = 4;
CDictioParser.MAIN = 5;
CDictioParser.INT = 6;
CDictioParser.PRINTF = 7;
CDictioParser.SI = 8;
CDictioParser.SINO = 9;
CDictioParser.TRUE = 10;
CDictioParser.FALSE = 11;
CDictioParser.WHILE = 12;
CDictioParser.MUL = 13;
CDictioParser.DIV = 14;
CDictioParser.SUB = 15;
CDictioParser.ADD = 16;
CDictioParser.EQUAL = 17;
CDictioParser.LLAVEO = 18;
CDictioParser.LLAVECL = 19;
CDictioParser.PUNTO = 20;
CDictioParser.IDS = 21;
CDictioParser.NUM = 22;
CDictioParser.PARENO = 23;
CDictioParser.PARENC = 24;
CDictioParser.SEMICOLON = 25;
CDictioParser.COMMA = 26;
CDictioParser.COMILLAS = 27;
CDictioParser.GREATERTHAN = 28;
CDictioParser.GREATEREQUAL = 29;
CDictioParser.LOWEREQUAL = 30;
CDictioParser.LOWER = 31;
CDictioParser.COMPARISON = 32;
CDictioParser.NOTEQUAL = 33;
CDictioParser.Y = 34;
CDictioParser.O = 35;
CDictioParser.INCREMENT = 36;
CDictioParser.DECREMENT = 37;
CDictioParser.PER = 38;
CDictioParser.RETURN = 39;
CDictioParser.TEXT = 40;

CDictioParser.RULE_main = 0;
CDictioParser.RULE_contenido = 1;
CDictioParser.RULE_conditionalif = 2;
CDictioParser.RULE_ciclowhile = 3;
CDictioParser.RULE_elseif = 4;
CDictioParser.RULE_elsesimple = 5;
CDictioParser.RULE_condition = 6;
CDictioParser.RULE_print = 7;
CDictioParser.RULE_declaration = 8;
CDictioParser.RULE_asignation = 9;
CDictioParser.RULE_change = 10;
CDictioParser.RULE_expr = 11;
CDictioParser.RULE_textobteiner = 12;

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
        this.ruleIndex = CDictioParser.RULE_main;
    }

	MAIN() {
	    return this.getToken(CDictioParser.MAIN, 0);
	};

	PARENO() {
	    return this.getToken(CDictioParser.PARENO, 0);
	};

	PARENC() {
	    return this.getToken(CDictioParser.PARENC, 0);
	};

	LLAVEO() {
	    return this.getToken(CDictioParser.LLAVEO, 0);
	};

	LLAVECL() {
	    return this.getToken(CDictioParser.LLAVECL, 0);
	};

	VOID() {
	    return this.getToken(CDictioParser.VOID, 0);
	};

	INT() {
	    return this.getToken(CDictioParser.INT, 0);
	};

	contenido() {
	    return this.getTypedRuleContext(ContenidoContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitMain(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ContenidoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CDictioParser.RULE_contenido;
    }

	conditionalif = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ConditionalifContext);
	    } else {
	        return this.getTypedRuleContext(ConditionalifContext,i);
	    }
	};

	ciclowhile = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CiclowhileContext);
	    } else {
	        return this.getTypedRuleContext(CiclowhileContext,i);
	    }
	};

	print = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(PrintContext);
	    } else {
	        return this.getTypedRuleContext(PrintContext,i);
	    }
	};

	declaration = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DeclarationContext);
	    } else {
	        return this.getTypedRuleContext(DeclarationContext,i);
	    }
	};

	asignation = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(AsignationContext);
	    } else {
	        return this.getTypedRuleContext(AsignationContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitContenido(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConditionalifContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CDictioParser.RULE_conditionalif;
    }

	SI() {
	    return this.getToken(CDictioParser.SI, 0);
	};

	PARENO() {
	    return this.getToken(CDictioParser.PARENO, 0);
	};

	condition() {
	    return this.getTypedRuleContext(ConditionContext,0);
	};

	PARENC() {
	    return this.getToken(CDictioParser.PARENC, 0);
	};

	LLAVEO() {
	    return this.getToken(CDictioParser.LLAVEO, 0);
	};

	contenido() {
	    return this.getTypedRuleContext(ContenidoContext,0);
	};

	LLAVECL() {
	    return this.getToken(CDictioParser.LLAVECL, 0);
	};

	elseif() {
	    return this.getTypedRuleContext(ElseifContext,0);
	};

	elsesimple() {
	    return this.getTypedRuleContext(ElsesimpleContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitConditionalif(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CiclowhileContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CDictioParser.RULE_ciclowhile;
    }

	WHILE() {
	    return this.getToken(CDictioParser.WHILE, 0);
	};

	PARENO() {
	    return this.getToken(CDictioParser.PARENO, 0);
	};

	condition() {
	    return this.getTypedRuleContext(ConditionContext,0);
	};

	PARENC() {
	    return this.getToken(CDictioParser.PARENC, 0);
	};

	LLAVEO() {
	    return this.getToken(CDictioParser.LLAVEO, 0);
	};

	contenido() {
	    return this.getTypedRuleContext(ContenidoContext,0);
	};

	change() {
	    return this.getTypedRuleContext(ChangeContext,0);
	};

	LLAVECL() {
	    return this.getToken(CDictioParser.LLAVECL, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitCiclowhile(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ElseifContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CDictioParser.RULE_elseif;
    }

	SINO() {
	    return this.getToken(CDictioParser.SINO, 0);
	};

	SI() {
	    return this.getToken(CDictioParser.SI, 0);
	};

	PARENO() {
	    return this.getToken(CDictioParser.PARENO, 0);
	};

	condition() {
	    return this.getTypedRuleContext(ConditionContext,0);
	};

	PARENC() {
	    return this.getToken(CDictioParser.PARENC, 0);
	};

	LLAVEO() {
	    return this.getToken(CDictioParser.LLAVEO, 0);
	};

	contenido() {
	    return this.getTypedRuleContext(ContenidoContext,0);
	};

	LLAVECL() {
	    return this.getToken(CDictioParser.LLAVECL, 0);
	};

	elseif() {
	    return this.getTypedRuleContext(ElseifContext,0);
	};

	elsesimple() {
	    return this.getTypedRuleContext(ElsesimpleContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitElseif(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ElsesimpleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CDictioParser.RULE_elsesimple;
    }

	SINO() {
	    return this.getToken(CDictioParser.SINO, 0);
	};

	LLAVEO() {
	    return this.getToken(CDictioParser.LLAVEO, 0);
	};

	contenido() {
	    return this.getTypedRuleContext(ContenidoContext,0);
	};

	LLAVECL() {
	    return this.getToken(CDictioParser.LLAVECL, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitElsesimple(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConditionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CDictioParser.RULE_condition;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class TruefalseContext extends ConditionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	TRUE() {
	    return this.getToken(CDictioParser.TRUE, 0);
	};

	FALSE() {
	    return this.getToken(CDictioParser.FALSE, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitTruefalse(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CDictioParser.TruefalseContext = TruefalseContext;

class ConditionparensContext extends ConditionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	PARENO() {
	    return this.getToken(CDictioParser.PARENO, 0);
	};

	condition() {
	    return this.getTypedRuleContext(ConditionContext,0);
	};

	PARENC() {
	    return this.getToken(CDictioParser.PARENC, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitConditionparens(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CDictioParser.ConditionparensContext = ConditionparensContext;

class YoContext extends ConditionContext {

    constructor(parser, ctx) {
        super(parser);
        this.op = null;;
        super.copyFrom(ctx);
    }

	condition = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ConditionContext);
	    } else {
	        return this.getTypedRuleContext(ConditionContext,i);
	    }
	};

	Y = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(CDictioParser.Y);
	    } else {
	        return this.getToken(CDictioParser.Y, i);
	    }
	};


	O = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(CDictioParser.O);
	    } else {
	        return this.getToken(CDictioParser.O, i);
	    }
	};


	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitYo(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CDictioParser.YoContext = YoContext;

class ComparissonContext extends ConditionContext {

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

	GREATERTHAN() {
	    return this.getToken(CDictioParser.GREATERTHAN, 0);
	};

	LOWER() {
	    return this.getToken(CDictioParser.LOWER, 0);
	};

	GREATEREQUAL() {
	    return this.getToken(CDictioParser.GREATEREQUAL, 0);
	};

	LOWEREQUAL() {
	    return this.getToken(CDictioParser.LOWEREQUAL, 0);
	};

	COMPARISON() {
	    return this.getToken(CDictioParser.COMPARISON, 0);
	};

	NOTEQUAL() {
	    return this.getToken(CDictioParser.NOTEQUAL, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitComparisson(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CDictioParser.ComparissonContext = ComparissonContext;

class PrintContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CDictioParser.RULE_print;
    }

	PRINTF() {
	    return this.getToken(CDictioParser.PRINTF, 0);
	};

	PARENO() {
	    return this.getToken(CDictioParser.PARENO, 0);
	};

	PARENC() {
	    return this.getToken(CDictioParser.PARENC, 0);
	};

	SEMICOLON() {
	    return this.getToken(CDictioParser.SEMICOLON, 0);
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

	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(CDictioParser.COMMA);
	    } else {
	        return this.getToken(CDictioParser.COMMA, i);
	    }
	};


	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitPrint(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DeclarationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CDictioParser.RULE_declaration;
    }

	INT() {
	    return this.getToken(CDictioParser.INT, 0);
	};

	IDS() {
	    return this.getToken(CDictioParser.IDS, 0);
	};

	SEMICOLON() {
	    return this.getToken(CDictioParser.SEMICOLON, 0);
	};

	EQUAL() {
	    return this.getToken(CDictioParser.EQUAL, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitDeclaration(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AsignationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CDictioParser.RULE_asignation;
    }

	IDS() {
	    return this.getToken(CDictioParser.IDS, 0);
	};

	EQUAL() {
	    return this.getToken(CDictioParser.EQUAL, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	SEMICOLON() {
	    return this.getToken(CDictioParser.SEMICOLON, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitAsignation(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ChangeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CDictioParser.RULE_change;
    }

	IDS() {
	    return this.getToken(CDictioParser.IDS, 0);
	};

	SEMICOLON() {
	    return this.getToken(CDictioParser.SEMICOLON, 0);
	};

	INCREMENT() {
	    return this.getToken(CDictioParser.INCREMENT, 0);
	};

	DECREMENT() {
	    return this.getToken(CDictioParser.DECREMENT, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitChange(this);
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
        this.ruleIndex = CDictioParser.RULE_expr;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class TimesdivContext extends ExprContext {

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

	MUL() {
	    return this.getToken(CDictioParser.MUL, 0);
	};

	DIV() {
	    return this.getToken(CDictioParser.DIV, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitTimesdiv(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CDictioParser.TimesdivContext = TimesdivContext;

class IdsContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	IDS() {
	    return this.getToken(CDictioParser.IDS, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitIds(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CDictioParser.IdsContext = IdsContext;

class ResidualContext extends ExprContext {

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

	PER() {
	    return this.getToken(CDictioParser.PER, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitResidual(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CDictioParser.ResidualContext = ResidualContext;

class ExprparensContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	PARENO() {
	    return this.getToken(CDictioParser.PARENO, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	PARENC() {
	    return this.getToken(CDictioParser.PARENC, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitExprparens(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CDictioParser.ExprparensContext = ExprparensContext;

class SumarestaContext extends ExprContext {

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

	ADD() {
	    return this.getToken(CDictioParser.ADD, 0);
	};

	SUB() {
	    return this.getToken(CDictioParser.SUB, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitSumaresta(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CDictioParser.SumarestaContext = SumarestaContext;

class IntContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	NUM() {
	    return this.getToken(CDictioParser.NUM, 0);
	};

	SUB() {
	    return this.getToken(CDictioParser.SUB, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitInt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CDictioParser.IntContext = IntContext;

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
        this.ruleIndex = CDictioParser.RULE_textobteiner;
    }

	TEXT() {
	    return this.getToken(CDictioParser.TEXT, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof CDictioVisitor ) {
	        return visitor.visitTextobteiner(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




CDictioParser.MainContext = MainContext; 
CDictioParser.ContenidoContext = ContenidoContext; 
CDictioParser.ConditionalifContext = ConditionalifContext; 
CDictioParser.CiclowhileContext = CiclowhileContext; 
CDictioParser.ElseifContext = ElseifContext; 
CDictioParser.ElsesimpleContext = ElsesimpleContext; 
CDictioParser.ConditionContext = ConditionContext; 
CDictioParser.PrintContext = PrintContext; 
CDictioParser.DeclarationContext = DeclarationContext; 
CDictioParser.AsignationContext = AsignationContext; 
CDictioParser.ChangeContext = ChangeContext; 
CDictioParser.ExprContext = ExprContext; 
CDictioParser.TextobteinerContext = TextobteinerContext; 
