grammar Hello;
//This time i did the exercise using a visitor

main: greetings
    | bye       
    ;

greetings : 'hello' names+ 
          ;

bye : 'bye' names+
    ;

names : ID
      ; 


ID : [a-zA-Z]+;
WS : [ \t\r\n]+ -> skip;