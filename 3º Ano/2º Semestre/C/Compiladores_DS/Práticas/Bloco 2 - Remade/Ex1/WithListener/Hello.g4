grammar Hello;
//This time i did the exercise using a visitor

main: greetings #greetingsMain
    | bye       #byeMain
    ;

greetings : 'hello' names+ #greeting
          ;

bye : 'bye' names+ #goodbye
    ;

names : ID #name
      ; 


ID : [a-zA-Z]+;
WS : [ \t\r\n]+ -> skip;