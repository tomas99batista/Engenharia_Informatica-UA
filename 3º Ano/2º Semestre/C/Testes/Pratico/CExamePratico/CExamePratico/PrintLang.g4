grammar PrintLang;


main: (expr|'\n')* EOF;

expr: print
    | assignment
    ;

print: 'print' phrase
    ;

phrase: opVal=operation
    |   stringVal=STRING
    |   idVal=ID
    ;

assignment: idVal=ID ':' (stringVal=STRING | 'input(' inputVal=STRING ')')
    ;

operation returns [int type]: 
            concat {$type = 0;}
    |       replace {$type = 1;}
    ;

concat: (STRING|ID) '+' (STRING|ID) ('+' (STRING|ID))*
    ;

replace: '('phrase '/' phrase '/' phrase ')'
    ;  


ID : LETTER | (LETTER | DIGIT)*;
fragment LETTER : [a-zA-Z_]+;
fragment DIGIT : [0-9]+;

STRING : '"' (ESC | . )*? '"';
fragment ESC: '\\"' | '\\\\';


//Whitespaces & Comments
LINE_COMMENT : '//' .*? '\n' -> skip;
COMMENT : '/*' .*? '*/' -> skip;
WS : [ \t\r\n]+ -> skip ;
