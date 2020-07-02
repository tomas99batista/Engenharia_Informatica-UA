grammar StrLang;

@parser::members { // so para o analisar sintatic
    public static final SymbolTable symbolTable = new SymbolTable();
}


main: instruction* EOF;




instruction:    print
            |   declaration
            ;

print:  'print' expression;


declaration: ID ':' expression;


expression:     STRING                                      #ExprStr
            |   ID                                          #ExprVar
            |   'input' '(' expression ')'                  #ExprInput // ou sem os parenteses porque ja ha uma com eles
            |   e1=expression '+' e2=expression             #ExprConcat
            |   '(' expression ')'                          #ExprParent
            |   expression '/' expression '/' expression    #ExprReplace
            ;


STRING: '"' .*? '"';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\n\r] -> skip;
COMMENT: '//' .*? '\n' -> skip;
ERROR: .;