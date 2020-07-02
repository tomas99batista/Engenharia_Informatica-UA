grammar CalcGrammar;

main: (statement '\n')* EOF;

statement: assignment    #assignmentStatement
         | operation     #operationStatement     
         ;

assignment: ID '=' set 
          ; 

operation: e1=operation '+' e2=operation    #union
         | e1=operation '&' e2=operation    #interception
         | e1=operation '\\' e2=operation   #difference
         | '(' operation ')'                #parenthesis
         | (set|ID)                         #setOrId
         ;

set: '{' WORD (',' WORD)* '}' (',' set)?
   | '{' NUMBER (',' NUMBER)* '}' (',' set)?
   ;


WORD: LOWER_LETTERS+;
fragment LOWER_LETTERS : 'a'..'z';

NUMBER: ('-'|'+')? DIGIT+;
fragment DIGIT : [0-9];

ID : UPPER_LETTERS+;
fragment UPPER_LETTERS : 'A'..'Z';


LINE_COMMENT: '--' .*? '\n' -> skip;
COMMENT: '/*' .*? '*/' -> skip;
WHITESPACE: [ \r\t\n] -> skip;