// Generated from ./src/grammar/Dictio.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from 'antlr4';


const serializedATN = [4,0,38,222,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,
4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,
12,2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,
2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,
27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,7,33,2,34,
7,34,2,35,7,35,2,36,7,36,2,37,7,37,1,0,4,0,79,8,0,11,0,12,0,80,1,0,1,0,1,
1,1,1,1,1,1,1,5,1,89,8,1,10,1,12,1,92,9,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,
3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,7,1,7,1,
7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,10,1,
10,1,10,1,10,1,10,1,10,1,11,1,11,1,12,1,12,1,13,1,13,1,14,1,14,1,15,1,15,
1,16,1,16,1,17,1,17,1,18,1,18,1,19,4,19,159,8,19,11,19,12,19,160,1,19,5,
19,164,8,19,10,19,12,19,167,9,19,1,20,4,20,170,8,20,11,20,12,20,171,1,21,
1,21,1,22,1,22,1,23,1,23,1,24,1,24,1,25,1,25,1,26,1,26,1,27,1,27,1,28,1,
28,1,28,1,29,1,29,1,29,1,30,1,30,1,30,1,31,1,31,1,31,1,32,1,32,1,33,1,33,
1,33,1,34,1,34,1,34,1,35,1,35,1,35,1,36,1,36,1,36,1,37,1,37,5,37,216,8,37,
10,37,12,37,219,9,37,1,37,1,37,0,0,38,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,
17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,33,17,35,18,37,19,39,20,41,
21,43,22,45,23,47,24,49,25,51,26,53,27,55,28,57,29,59,30,61,31,63,32,65,
33,67,34,69,35,71,36,73,37,75,38,1,0,6,3,0,9,10,13,13,32,32,2,0,10,10,13,
13,3,0,65,90,94,94,97,122,3,0,48,57,65,90,97,122,1,0,48,57,3,0,10,10,13,
13,34,34,227,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,
0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,
0,0,0,0,23,1,0,0,0,0,25,1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,
33,1,0,0,0,0,35,1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,
0,0,0,45,1,0,0,0,0,47,1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,0,0,53,1,0,0,0,0,55,
1,0,0,0,0,57,1,0,0,0,0,59,1,0,0,0,0,61,1,0,0,0,0,63,1,0,0,0,0,65,1,0,0,0,
0,67,1,0,0,0,0,69,1,0,0,0,0,71,1,0,0,0,0,73,1,0,0,0,0,75,1,0,0,0,1,78,1,
0,0,0,3,84,1,0,0,0,5,95,1,0,0,0,7,100,1,0,0,0,9,104,1,0,0,0,11,109,1,0,0,
0,13,113,1,0,0,0,15,116,1,0,0,0,17,121,1,0,0,0,19,130,1,0,0,0,21,135,1,0,
0,0,23,141,1,0,0,0,25,143,1,0,0,0,27,145,1,0,0,0,29,147,1,0,0,0,31,149,1,
0,0,0,33,151,1,0,0,0,35,153,1,0,0,0,37,155,1,0,0,0,39,158,1,0,0,0,41,169,
1,0,0,0,43,173,1,0,0,0,45,175,1,0,0,0,47,177,1,0,0,0,49,179,1,0,0,0,51,181,
1,0,0,0,53,183,1,0,0,0,55,185,1,0,0,0,57,187,1,0,0,0,59,190,1,0,0,0,61,193,
1,0,0,0,63,196,1,0,0,0,65,199,1,0,0,0,67,201,1,0,0,0,69,204,1,0,0,0,71,207,
1,0,0,0,73,210,1,0,0,0,75,213,1,0,0,0,77,79,7,0,0,0,78,77,1,0,0,0,79,80,
1,0,0,0,80,78,1,0,0,0,80,81,1,0,0,0,81,82,1,0,0,0,82,83,6,0,0,0,83,2,1,0,
0,0,84,85,5,47,0,0,85,86,5,47,0,0,86,90,1,0,0,0,87,89,8,1,0,0,88,87,1,0,
0,0,89,92,1,0,0,0,90,88,1,0,0,0,90,91,1,0,0,0,91,93,1,0,0,0,92,90,1,0,0,
0,93,94,6,1,0,0,94,4,1,0,0,0,95,96,5,108,0,0,96,97,5,101,0,0,97,98,5,116,
0,0,98,99,5,115,0,0,99,6,1,0,0,0,100,101,5,114,0,0,101,102,5,117,0,0,102,
103,5,110,0,0,103,8,1,0,0,0,104,105,5,99,0,0,105,106,5,111,0,0,106,107,5,
109,0,0,107,108,5,112,0,0,108,10,1,0,0,0,109,110,5,105,0,0,110,111,5,109,
0,0,111,112,5,112,0,0,112,12,1,0,0,0,113,114,5,115,0,0,114,115,5,105,0,0,
115,14,1,0,0,0,116,117,5,115,0,0,117,118,5,105,0,0,118,119,5,110,0,0,119,
120,5,111,0,0,120,16,1,0,0,0,121,122,5,109,0,0,122,123,5,105,0,0,123,124,
5,101,0,0,124,125,5,110,0,0,125,126,5,116,0,0,126,127,5,114,0,0,127,128,
5,97,0,0,128,129,5,115,0,0,129,18,1,0,0,0,130,131,5,116,0,0,131,132,5,114,
0,0,132,133,5,117,0,0,133,134,5,101,0,0,134,20,1,0,0,0,135,136,5,102,0,0,
136,137,5,97,0,0,137,138,5,108,0,0,138,139,5,115,0,0,139,140,5,101,0,0,140,
22,1,0,0,0,141,142,5,42,0,0,142,24,1,0,0,0,143,144,5,47,0,0,144,26,1,0,0,
0,145,146,5,45,0,0,146,28,1,0,0,0,147,148,5,43,0,0,148,30,1,0,0,0,149,150,
5,61,0,0,150,32,1,0,0,0,151,152,5,123,0,0,152,34,1,0,0,0,153,154,5,125,0,
0,154,36,1,0,0,0,155,156,5,46,0,0,156,38,1,0,0,0,157,159,7,2,0,0,158,157,
1,0,0,0,159,160,1,0,0,0,160,158,1,0,0,0,160,161,1,0,0,0,161,165,1,0,0,0,
162,164,7,3,0,0,163,162,1,0,0,0,164,167,1,0,0,0,165,163,1,0,0,0,165,166,
1,0,0,0,166,40,1,0,0,0,167,165,1,0,0,0,168,170,7,4,0,0,169,168,1,0,0,0,170,
171,1,0,0,0,171,169,1,0,0,0,171,172,1,0,0,0,172,42,1,0,0,0,173,174,5,40,
0,0,174,44,1,0,0,0,175,176,5,41,0,0,176,46,1,0,0,0,177,178,5,59,0,0,178,
48,1,0,0,0,179,180,5,44,0,0,180,50,1,0,0,0,181,182,5,34,0,0,182,52,1,0,0,
0,183,184,5,62,0,0,184,54,1,0,0,0,185,186,5,60,0,0,186,56,1,0,0,0,187,188,
5,61,0,0,188,189,5,61,0,0,189,58,1,0,0,0,190,191,5,33,0,0,191,192,5,61,0,
0,192,60,1,0,0,0,193,194,5,38,0,0,194,195,5,38,0,0,195,62,1,0,0,0,196,197,
5,124,0,0,197,198,5,124,0,0,198,64,1,0,0,0,199,200,5,37,0,0,200,66,1,0,0,
0,201,202,5,43,0,0,202,203,5,43,0,0,203,68,1,0,0,0,204,205,5,45,0,0,205,
206,5,45,0,0,206,70,1,0,0,0,207,208,5,60,0,0,208,209,5,61,0,0,209,72,1,0,
0,0,210,211,5,62,0,0,211,212,5,61,0,0,212,74,1,0,0,0,213,217,3,51,25,0,214,
216,8,5,0,0,215,214,1,0,0,0,216,219,1,0,0,0,217,215,1,0,0,0,217,218,1,0,
0,0,218,220,1,0,0,0,219,217,1,0,0,0,220,221,3,51,25,0,221,76,1,0,0,0,7,0,
80,90,160,165,171,217,1,6,0,0];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

export default class DictioLexer extends antlr4.Lexer {

    static grammarFileName = "Dictio.g4";
    static channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	static modeNames = [ "DEFAULT_MODE" ];
	static literalNames = [ null, null, null, "'lets'", "'run'", "'comp'", 
                         "'imp'", "'si'", "'sino'", "'mientras'", "'true'", 
                         "'false'", "'*'", "'/'", "'-'", "'+'", "'='", "'{'", 
                         "'}'", "'.'", null, null, "'('", "')'", "';'", 
                         "','", "'\"'", "'>'", "'<'", "'=='", "'!='", "'&&'", 
                         "'||'", "'%'", "'++'", "'--'", "'<='", "'>='" ];
	static symbolicNames = [ null, "WS", "COMENTARIO", "LETS", "RUN", "COMP", 
                          "IMP", "IF", "ELSE", "WHILE", "VERDAD", "FALSO", 
                          "ASTE", "DIA", "RES", "SUM", "EQU", "LLAVEA", 
                          "LLAVEC", "DOT", "ID", "INT", "PARA", "PARC", 
                          "SC", "COMA", "COMID", "MAYORQUE", "MENORQUE", 
                          "IGUAL", "DIFERENTE", "AND", "OR", "PORCENTAJE", 
                          "INCREMENTO", "DECREMENTO", "MENORIGUAL", "MAYORIGUAL", 
                          "TEXTO" ];
	static ruleNames = [ "WS", "COMENTARIO", "LETS", "RUN", "COMP", "IMP", 
                      "IF", "ELSE", "WHILE", "VERDAD", "FALSO", "ASTE", 
                      "DIA", "RES", "SUM", "EQU", "LLAVEA", "LLAVEC", "DOT", 
                      "ID", "INT", "PARA", "PARC", "SC", "COMA", "COMID", 
                      "MAYORQUE", "MENORQUE", "IGUAL", "DIFERENTE", "AND", 
                      "OR", "PORCENTAJE", "INCREMENTO", "DECREMENTO", "MENORIGUAL", 
                      "MAYORIGUAL", "TEXTO" ];

    constructor(input) {
        super(input)
        this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.atn.PredictionContextCache());
    }
}

DictioLexer.EOF = antlr4.Token.EOF;
DictioLexer.WS = 1;
DictioLexer.COMENTARIO = 2;
DictioLexer.LETS = 3;
DictioLexer.RUN = 4;
DictioLexer.COMP = 5;
DictioLexer.IMP = 6;
DictioLexer.IF = 7;
DictioLexer.ELSE = 8;
DictioLexer.WHILE = 9;
DictioLexer.VERDAD = 10;
DictioLexer.FALSO = 11;
DictioLexer.ASTE = 12;
DictioLexer.DIA = 13;
DictioLexer.RES = 14;
DictioLexer.SUM = 15;
DictioLexer.EQU = 16;
DictioLexer.LLAVEA = 17;
DictioLexer.LLAVEC = 18;
DictioLexer.DOT = 19;
DictioLexer.ID = 20;
DictioLexer.INT = 21;
DictioLexer.PARA = 22;
DictioLexer.PARC = 23;
DictioLexer.SC = 24;
DictioLexer.COMA = 25;
DictioLexer.COMID = 26;
DictioLexer.MAYORQUE = 27;
DictioLexer.MENORQUE = 28;
DictioLexer.IGUAL = 29;
DictioLexer.DIFERENTE = 30;
DictioLexer.AND = 31;
DictioLexer.OR = 32;
DictioLexer.PORCENTAJE = 33;
DictioLexer.INCREMENTO = 34;
DictioLexer.DECREMENTO = 35;
DictioLexer.MENORIGUAL = 36;
DictioLexer.MAYORIGUAL = 37;
DictioLexer.TEXTO = 38;



