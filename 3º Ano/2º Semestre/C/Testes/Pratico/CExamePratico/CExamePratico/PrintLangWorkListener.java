import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class PrintLangWorkListener extends PrintLangBaseListener{
    protected static Map<String,String> symbolTable = new HashMap<>(); //Variable mapping
    protected static Scanner readInput = new Scanner(System.in); //Read input

    //Print Function
    @Override
     public void exitPrint(PrintLangParser.PrintContext ctx) { 
        String output = "";
        if(ctx.phrase().stringVal!=null){ //If its a literal
            output = ctx.phrase().stringVal.getText();
        }else if(ctx.phrase().idVal != null){ //If its a variable
            if(symbolTable.containsKey(ctx.phrase().idVal.getText()))
                output = symbolTable.get(ctx.phrase().idVal.getText());
            else{
                System.out.println("Error! Invoked undefined variable!");
                System.exit(1);
            }
                
        }else{
            if(ctx.phrase().opVal.type == 0)
                output = getConcatVal(ctx.phrase().opVal.getText());
            else
                output = getReplaceVal(ctx.phrase().opVal.getText());
        }

        output = output.substring(1,output.length()-1); //Remove the initial and final "
        System.out.println(">> "+output);

     }

     //Assignment Function
     @Override 
     public void exitAssignment(PrintLangParser.AssignmentContext ctx) { 
        if(ctx.stringVal!=null){ //If its a direct declaration
            symbolTable.put(ctx.idVal.getText(),ctx.stringVal.getText()); //Register new variable
        
        }else{ //Else ask for input
            String inputQuestion = ctx.inputVal.getText();
            inputQuestion = inputQuestion.substring(1,inputQuestion.length()-1); //Remove the initial and final "
            
            System.out.print(">> "+ inputQuestion); //Print input question
            
            String response = readInput.nextLine();

            //Encapsulate in " "
            if(response.charAt(0) != '"'){
                response = '"' + response;
            }
            if(response.charAt(response.length()-1) != '"'){
                response = response + '"';
            }

            symbolTable.put(ctx.idVal.getText(),response); //Register new variable

        }
    }

    //Function used to fetch an input, be it a string literal or variable
    private String getVal(String inputVal){
        String outputVal = "";

        if(inputVal.charAt(0) == '"'){ //If its a String literal (i.e starts with ")
            outputVal =inputVal.substring(1,inputVal.length()-1);
        }else if(inputVal.charAt(0) == '('){ //Else we need to fetch it from the map
            outputVal = getConcatVal(outputVal =inputVal.substring(1,inputVal.length()-1));
        }else{
            if(!symbolTable.containsKey(inputVal)){
                System.out.println("Error! Undeclared variable can't be used in concat operation");
                System.exit(1);
            }else{
                outputVal = symbolTable.get(inputVal);
                outputVal = outputVal.substring(1,outputVal.length()-1);
            }
        }
        return outputVal;
    }

    //Function used to concat string
    public String getConcatVal(String concatOp){
        String[] allOps = concatOp.split("\\+");
        String finalString = "";

        for (int i = 0 ; i < allOps.length ; i++){
            String tempString = getVal(allOps[i]);
            finalString+=tempString;
        }

        finalString = '"' + finalString + '"';

        return finalString;
    }

    //Function used to replace a value in a string for another
    public String getReplaceVal(String concatOp){
        concatOp = concatOp.substring(1,concatOp.length()-1); //Ignore initial ( and final )
        String[] allOps = concatOp.split("\\/");
        String finalString = "";

        String baseString = getVal(allOps[0]);
        String findString = getVal(allOps[1]);
        String replaceString = getVal(allOps[2]);

        finalString = baseString.replace(findString,replaceString);
        
        finalString = '"' + finalString + '"';

        return finalString;
    }

}