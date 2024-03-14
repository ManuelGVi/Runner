// Generated from ./src/grammar/Dictio.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from 'antlr4';
import DictioVisitor from './DictioVisitor.js';

const serializedATN = [4,1,21,78,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,1,0,1,0,1,0,1,0,3,0,19,8,0,1,0,1,0,1,1,1,1,1,1,4,1,26,8,
1,11,1,12,1,27,1,2,1,2,1,2,1,2,1,2,3,2,35,8,2,1,2,1,2,1,2,1,3,1,3,1,3,1,
3,3,3,44,8,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,5,1,5,3,5,55,8,5,1,5,1,5,1,5,
1,5,1,5,1,5,3,5,63,8,5,1,5,1,5,1,5,1,5,1,5,1,5,5,5,71,8,5,10,5,12,5,74,9,
5,1,6,1,6,1,6,0,1,10,7,0,2,4,6,8,10,12,0,2,1,0,6,7,1,0,8,9,81,0,14,1,0,0,
0,2,25,1,0,0,0,4,29,1,0,0,0,6,39,1,0,0,0,8,47,1,0,0,0,10,62,1,0,0,0,12,75,
1,0,0,0,14,15,5,2,0,0,15,16,5,3,0,0,16,18,5,11,0,0,17,19,3,2,1,0,18,17,1,
0,0,0,18,19,1,0,0,0,19,20,1,0,0,0,20,21,5,12,0,0,21,1,1,0,0,0,22,26,3,4,
2,0,23,26,3,6,3,0,24,26,3,8,4,0,25,22,1,0,0,0,25,23,1,0,0,0,25,24,1,0,0,
0,26,27,1,0,0,0,27,25,1,0,0,0,27,28,1,0,0,0,28,3,1,0,0,0,29,30,5,5,0,0,30,
31,5,16,0,0,31,34,3,12,6,0,32,33,5,19,0,0,33,35,3,10,5,0,34,32,1,0,0,0,34,
35,1,0,0,0,35,36,1,0,0,0,36,37,5,17,0,0,37,38,5,18,0,0,38,5,1,0,0,0,39,40,
5,4,0,0,40,43,5,14,0,0,41,42,5,10,0,0,42,44,3,10,5,0,43,41,1,0,0,0,43,44,
1,0,0,0,44,45,1,0,0,0,45,46,5,18,0,0,46,7,1,0,0,0,47,48,5,14,0,0,48,49,5,
10,0,0,49,50,3,10,5,0,50,51,5,18,0,0,51,9,1,0,0,0,52,54,6,5,-1,0,53,55,5,
8,0,0,54,53,1,0,0,0,54,55,1,0,0,0,55,56,1,0,0,0,56,63,5,15,0,0,57,58,5,16,
0,0,58,59,3,10,5,0,59,60,5,17,0,0,60,63,1,0,0,0,61,63,5,14,0,0,62,52,1,0,
0,0,62,57,1,0,0,0,62,61,1,0,0,0,63,72,1,0,0,0,64,65,10,5,0,0,65,66,7,0,0,
0,66,71,3,10,5,6,67,68,10,4,0,0,68,69,7,1,0,0,69,71,3,10,5,5,70,64,1,0,0,
0,70,67,1,0,0,0,71,74,1,0,0,0,72,70,1,0,0,0,72,73,1,0,0,0,73,11,1,0,0,0,
74,72,1,0,0,0,75,76,5,21,0,0,76,13,1,0,0,0,9,18,25,27,34,43,54,62,70,72];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class DictioParser extends antlr4.Parser {

    static grammarFileName = "Dictio.g4";
    static literalNames = [ null, null, "'lets'", "'run'", "'comp'", "'imp'", 
                            "'*'", "'/'", "'-'", "'+'", "'='", "'{'", "'}'", 
                            "'.'", null, null, "'('", "')'", "';'", "','", 
                            "'\"'" ];
    static symbolicNames = [ null, "WS", "LETS", "RUN", "COMP", "IMP", "ASTE", 
                             "DIA", "RES", "SUM", "EQU", "LLAVEA", "LLAVEC", 
                             "DOT", "ID", "INT", "PARA", "PARC", "SC", "COMA", 
                             "COMID", "TEXTO" ];
    static ruleNames = [ "main", "content", "imprime", "declara", "asigna", 
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
    	case 5:
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
	        this.state = 14;
	        this.match(DictioParser.LETS);
	        this.state = 15;
	        this.match(DictioParser.RUN);
	        this.state = 16;
	        this.match(DictioParser.LLAVEA);
	        this.state = 18;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 16432) !== 0)) {
	            this.state = 17;
	            this.content();
	        }

	        this.state = 20;
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
	        this.state = 25; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 25;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 5:
	                this.state = 22;
	                this.imprime();
	                break;
	            case 4:
	                this.state = 23;
	                this.declara();
	                break;
	            case 14:
	                this.state = 24;
	                this.asigna();
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 27; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) === 0 && ((1 << _la) & 16432) !== 0));
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
	    this.enterRule(localctx, 4, DictioParser.RULE_imprime);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 29;
	        this.match(DictioParser.IMP);
	        this.state = 30;
	        this.match(DictioParser.PARA);
	        this.state = 31;
	        this.textobteiner();
	        this.state = 34;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===19) {
	            this.state = 32;
	            this.match(DictioParser.COMA);
	            this.state = 33;
	            this.expr(0);
	        }

	        this.state = 36;
	        this.match(DictioParser.PARC);
	        this.state = 37;
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
	    this.enterRule(localctx, 6, DictioParser.RULE_declara);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 39;
	        this.match(DictioParser.COMP);
	        this.state = 40;
	        this.match(DictioParser.ID);
	        this.state = 43;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===10) {
	            this.state = 41;
	            this.match(DictioParser.EQU);
	            this.state = 42;
	            this.expr(0);
	        }

	        this.state = 45;
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
	    this.enterRule(localctx, 8, DictioParser.RULE_asigna);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 47;
	        this.match(DictioParser.ID);
	        this.state = 48;
	        this.match(DictioParser.EQU);
	        this.state = 49;
	        this.expr(0);
	        this.state = 50;
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
	    const _startState = 10;
	    this.enterRecursionRule(localctx, 10, DictioParser.RULE_expr, _p);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 62;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 8:
	        case 15:
	            localctx = new IntContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;

	            this.state = 54;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===8) {
	                this.state = 53;
	                this.match(DictioParser.RES);
	            }

	            this.state = 56;
	            this.match(DictioParser.INT);
	            break;
	        case 16:
	            localctx = new ParensContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 57;
	            this.match(DictioParser.PARA);
	            this.state = 58;
	            this.expr(0);
	            this.state = 59;
	            this.match(DictioParser.PARC);
	            break;
	        case 14:
	            localctx = new IdContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 61;
	            this.match(DictioParser.ID);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 72;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,8,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 70;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,7,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new MulDivContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, DictioParser.RULE_expr);
	                    this.state = 64;
	                    if (!( this.precpred(this._ctx, 5))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 5)");
	                    }
	                    this.state = 65;
	                    localctx.operation = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===6 || _la===7)) {
	                        localctx.operation = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 66;
	                    this.expr(6);
	                    break;

	                case 2:
	                    localctx = new AddsubContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, DictioParser.RULE_expr);
	                    this.state = 67;
	                    if (!( this.precpred(this._ctx, 4))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
	                    }
	                    this.state = 68;
	                    localctx.operation = this._input.LT(1);
	                    _la = this._input.LA(1);
	                    if(!(_la===8 || _la===9)) {
	                        localctx.operation = this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 69;
	                    this.expr(5);
	                    break;

	                } 
	            }
	            this.state = 74;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,8,this._ctx);
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
	    this.enterRule(localctx, 12, DictioParser.RULE_textobteiner);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 75;
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
DictioParser.ASTE = 6;
DictioParser.DIA = 7;
DictioParser.RES = 8;
DictioParser.SUM = 9;
DictioParser.EQU = 10;
DictioParser.LLAVEA = 11;
DictioParser.LLAVEC = 12;
DictioParser.DOT = 13;
DictioParser.ID = 14;
DictioParser.INT = 15;
DictioParser.PARA = 16;
DictioParser.PARC = 17;
DictioParser.SC = 18;
DictioParser.COMA = 19;
DictioParser.COMID = 20;
DictioParser.TEXTO = 21;

DictioParser.RULE_main = 0;
DictioParser.RULE_content = 1;
DictioParser.RULE_imprime = 2;
DictioParser.RULE_declara = 3;
DictioParser.RULE_asigna = 4;
DictioParser.RULE_expr = 5;
DictioParser.RULE_textobteiner = 6;

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
DictioParser.ImprimeContext = ImprimeContext; 
DictioParser.DeclaraContext = DeclaraContext; 
DictioParser.AsignaContext = AsignaContext; 
DictioParser.ExprContext = ExprContext; 
DictioParser.TextobteinerContext = TextobteinerContext; 
