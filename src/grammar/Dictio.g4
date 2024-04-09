grammar Dictio;

main: LETS RUN LLAVEA content? LLAVEC;

content: (condif|imprime | declara | asigna)+;

condif: IF PARA siono PARC LLAVEA content LLAVEC deotro?;

siono:expr op=(MAYORQUE|MENORQUE|IGUAL|DIFERENTE) expr|VERDAD|FALSO ;

deotro: 
ELSE IF PARA siono PARC LLAVEA content LLAVEC deotro? #deotroif
|ELSE LLAVEA content LLAVEC #deotrosimple ;

imprime: IMP PARA (textobteiner|expr) (COMA expr)? PARC SC;

declara: COMP ID (EQU expr)? SC;

asigna: ID EQU expr SC;

expr:
 expr operation=(ASTE|DIA) expr      #MulDiv
| expr operation=(SUM|RES) expr   #Addsub
| RES? INT #int
| PARA expr PARC #parens
| ID  #id
;
textobteiner: TEXTO;
WS:[ \t\r\n]+ -> skip;
COMENTARIO:'//' ~[\r\n]* -> skip;
//PALABRAS RESERVADAS
LETS:'lets';
RUN:'run';
COMP:'comp';
IMP: 'imp';
IF: 'si';
ELSE:'sino';
VERDAD:'true';
FALSO:'false';
//MATEMATICOS
ASTE:'*';
DIA:'/';
RES:'-';
SUM:'+';
EQU: '=';
//SIMBOLOS DE TEXTO Y CARACTERES
LLAVEA:'{';
LLAVEC:'}';
DOT:'.';
ID:[a-zA-Z]+;
INT:[0-9]+;
PARA:'(';
PARC:')';
SC:';';
COMA:',';
COMID:'"';
//COSAS DEL IF 
MAYORQUE:'>';
MENORQUE:'<';
IGUAL:'==';
DIFERENTE:'!=';

TEXTO: COMID ~["\r\n]* COMID;