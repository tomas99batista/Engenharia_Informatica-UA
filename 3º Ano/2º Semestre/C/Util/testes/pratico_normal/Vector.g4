grammar Vector;

main: (stat ';')* EOF;

stat:
    dec         
    | show      
    ;

dec: expr '->' Identifier;

show: 'show' expr;

expr: 
     signal=('+' | '-') expr        #Unary
    | expr '*' expr                 #Mult
    | expr '.' expr                 #IntProd
    | expr op=('+' | '-') expr      #AddSub
    | '(' expr ')'                  #Paren
    | '[' expr (',' expr)* ']'      #Vector
    | Number                        #Number
    | Identifier                    #Identifier
    ;

Number: [0-9]+('.'[0-9]+)?;
Identifier: [a-zA-Z][a-zA-Z0-9]*;
Whitespace: [ \t\n\r] -> skip;
Comment: '#' .*? '\n' -> skip;
Error: .;
