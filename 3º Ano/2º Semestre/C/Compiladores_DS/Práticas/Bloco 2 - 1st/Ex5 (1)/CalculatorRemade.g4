grammar CalculatorRemade;
@header{
    import java.util.Map ; 
    import java.util.HashMap;
}
@members{ 
    protected Map<String,Double> symbolTable = new HashMap<>();
}


program:
        stat* EOF
    ;

stat:
        expr NEWLINE {System.out.println($expr.val);} //Prints value returned by expression
    |   assignment
    |   NEWLINE
    ;

assignment: //Assignment of variables
        ID '=' expr NEWLINE{ 
                symbolTable.put($ID.text,$expr.val); //Just add it to the map (overrides if same ID is assigned twice)
            } 
        ;

expr returns [double val]:
        e1=expr op=('*'|'/') e2=expr{
                if($op.text.equals("*")){  //Check what operator we're using and then compute return value
                    $val = $e1.val * $e2.val;
                }else{
                    $val = $e1.val / $e2.val;
                }
            }
    |   e1=expr op=('+'|'-') e2=expr{
                if($op.text.equals("+")){   //Check what operator we're using and then compute return value
                    $val = $e1.val + $e2.val;
                }else{
                    $val = $e1.val - $e2.val;
                };
            }
    |   INT {
                $val = Double.parseDouble($INT.text); //Just like the previous exercise this is probably the most important line..makes the whole return of value recursively idea work
            }
    |   ID {
                if(symbolTable.containsKey($ID.text)) //Check if that ID has been declared as a variable or not
                    $val = symbolTable.get($ID.text); //If so, return its associated value :D
                else{
                    System.out.println("Error! " + $ID.text + " not declared or initialized!");
                    System.exit(1);
                }
            }
    |   '(' expr ')' {
                $val = $expr.val; //All we gotta do here is return the value...the fact we have an expr inside of it means we'll first calc the val of that expr before returning it so... IT JUST WORKS -Todd Howard
            }
    ;


INT: [0-9]+;
ID: [a-zA-Z_]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;