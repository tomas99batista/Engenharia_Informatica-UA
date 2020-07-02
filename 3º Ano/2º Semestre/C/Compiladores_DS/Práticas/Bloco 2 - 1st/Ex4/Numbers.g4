grammar Numbers;

//This grammar will only be used to read the file containing <NUMBER> - <WORD>
//Parser Rules//
file : (line|empty_line)* EOF;

line : NUM '-' WORD NEWLINE;
empty_line : NEWLINE;

//Lexer Rules//
NUM : [0-9]+;
WORD : [A-Za-z]+ ;
NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip;