grammar Hello;

main: (greetings | bye)*;

//Parser Rules//
greetings : 'hello' names {
            System.out.println("Olá " + $names.list); 
            }
        ;

bye : 'bye' names {
            System.out.println("Adeus " + $names.list); 
            }
        ;

//The names rule is used to capture as many id's as we want and concat them to a variable called list
//Then, to print said list, we just have to use the list created :)
names returns[String list=""] : (ID {
            $list = $list + " " + $ID.text; //Append new ID text to list 
            })+ //NOTICE THE + HERE THAT LETS US HAVE MULTIPLE OF THESE CALLS
        ;


//Lexer Rules//
ID : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip;