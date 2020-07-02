grammar CalculatorRemadeAgain;
@header{
    import java.util.Map ; 
    import java.util.HashMap;
}
@members{ 
    protected Map<String,Double> symbolTable = new HashMap<>();
}


program:
        (stat NEWLINE)* EOF
    ;

stat:
        expr        #ExprStat //{System.out.println($expr.val);} //For this exercise we don't need/want to print the result
    |   assignment  #AssignmentStat
    ;

assignment: //Assignment of variables
        ID '=' expr NEWLINE{ 
                symbolTable.put($ID.text,$expr.val); //Just add it to the map (overrides if same ID is assigned twice)
            } 
        ;

expr returns [double val]:
        e1=expr op=('*'|'/') e2=expr    #MultDiv
    |   e1=expr op=('+'|'-') e2=expr    #SumSub
    |   INT                             #Number
    |   ID                              #Variable
    |   '(' expr ')'                    #Parenthesis
    ;


INT: [0-9]+;
ID: [a-zA-Z_]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;