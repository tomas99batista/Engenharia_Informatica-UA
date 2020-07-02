grammar Calculator;

program:
        stat* EOF
    ;

stat:
        expr NEWLINE {System.out.println($expr.val);} //Prints value returned by expression
    |   NEWLINE
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

    |   '(' expr ')' {
                $val = $expr.val; //All we gotta do here is return the value...the fact we have an expr inside of it means we'll first calc the val of that expr before returning it so... IT JUST WORKS -Todd Howard
            }
    ;


INT: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;