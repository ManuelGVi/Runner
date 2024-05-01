grammar Dictio;

main: LETS RUN LLAVEA content? LLAVEC;

content: (condif|mientras|imprime | declara | asigna)+;

condif: IF PARA siono PARC LLAVEA content LLAVEC deotro?;

mientras: WHILE PARA siono PARC LLAVEA content cambio? LLAVEC;

siono:
siono op=(AND|OR)+ siono #andor
|expr op=(MAYORQUE|MENORQUE|MAYORIGUAL|MENORIGUAL|IGUAL|DIFERENTE) expr #comparaciones
|(VERDAD|FALSO)#verdaderofalso
|PARA siono PARC #condiparens;

deotro: 
ELSE IF PARA siono PARC LLAVEA content LLAVEC deotro? #deotroif
|ELSE LLAVEA content LLAVEC #deotrosimple ;

cambio:ID (INCREMENTO|DECREMENTO) SC;

imprime: IMP PARA (textobteiner|expr) (COMA (textobteiner|expr))* PARC SC;

declara: COMP ID (EQU expr)? SC;

asigna: ID EQU expr SC;

expr:
 expr operation=(ASTE|DIA) expr      #MulDiv
| expr operation=(SUM|RES) expr   #Addsub
| RES? INT #int
|expr PORCENTAJE expr#residuo
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
WHILE: 'mientras';
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
ID:[^a-zA-Z]+[a-zA-Z0-9]*;
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
AND: '&&';
OR: '||';
PORCENTAJE:'%';
INCREMENTO: '++';
DECREMENTO: '--';
MENORIGUAL: '<=';
MAYORIGUAL: '>=';

TEXTO: COMID ~["\r\n]* COMID;