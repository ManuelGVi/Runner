grammar CDictio;

main: (VOID|INT) MAIN PARENO PARENC LLAVEO contenido? LLAVECL;

contenido: (conditionalif|ciclowhile|print | declaration | asignation)+;

conditionalif: SI PARENO condition PARENC LLAVEO contenido LLAVECL (elseif|elsesimple)?;

ciclowhile:WHILE PARENO condition PARENC LLAVEO contenido change LLAVECL;

elseif: 
SINO SI PARENO condition PARENC LLAVEO contenido LLAVECL (elseif|elsesimple)?;
elsesimple:SINO LLAVEO contenido LLAVECL;


condition:
condition op=(Y|O)+ condition #yo
|expr op=(GREATERTHAN|LOWER|GREATEREQUAL|LOWEREQUAL|COMPARISON|NOTEQUAL) expr #comparisson
|(TRUE|FALSE)#truefalse
|PARENO condition PARENC #conditionparens;

print: PRINTF PARENO (textobteiner|expr) (COMMA (expr|textobteiner))* PARENC SEMICOLON;

declaration: INT IDS (EQUAL expr)? SEMICOLON;

asignation: IDS EQUAL expr SEMICOLON;
change: IDS (INCREMENT|DECREMENT) SEMICOLON;
expr:
 expr operation=(MUL|DIV) expr      #timesdiv
| expr operation=(ADD|SUB) expr   #sumaresta
| SUB? NUM #int
| PARENO expr PARENC #exprparens
| IDS  #ids 
;
textobteiner: TEXT;
WS:[ \t\r\n]+ -> skip;
COMENTARIO:'//' ~[\r\n]* -> skip;
SKIPRETUNR: RETURN -> skip;
//PALABRAS RESERVADAS
VOID:'void';
MAIN:'main';
INT:'int';
PRINTF: 'printf';
SI: 'if';
SINO:'else';
TRUE:'true';
FALSE:'false';
WHILE: 'while';
//MATEMATICOS
MUL:'*';
DIV:'/';
SUB:'-';
ADD:'+';
EQUAL: '=';
//SIMBOLOS DE TEXTO Y CARACTERES
LLAVEO:'{';
LLAVECL:'}';
PUNTO:'.';
IDS:[^a-zA-Z]+[a-zA-Z0-9]*;
NUM:[0-9]+;
PARENO:'(';
PARENC:')';
SEMICOLON:';';
COMMA:',';
COMILLAS:'"';
//COSAS DEL IF 
GREATERTHAN:'>';
GREATEREQUAL:'>=';
LOWEREQUAL:'<=';
LOWER:'<';
COMPARISON:'==';
NOTEQUAL:'!=';
Y: '&&';
O: '||';
INCREMENT: '++';
DECREMENT:'--';
RETURN:'return';
TEXT:COMILLAS ~["\r\n]* COMILLAS;