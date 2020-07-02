import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class NumbersMain {
   public static void main(String[] args) throws Exception {
      // create a CharStream that reads from standard input:
      //CharStream input = CharStreams.fromStream(System.in); We wanna do it a bit different lad ;)

      //In here we're gonna open the file and fetch it's contents using our grammar and listener (so we build our map)
      InputStream inStream = null; 
      try{
         inStream = new FileInputStream(new File("numbers.txt"));
      }catch(FileNotFoundException e){
         System.out.println("Error: FIle not found :(");
         System.exit(1);
      }

      //Now create the input stream based on that file's input stream (instead of the users input)
      CharStream input = CharStreams.fromStream(inStream);
      ///////////////////////////////////////////////////////////////////

      // create a lexer that feeds off of input CharStream:
      NumbersLexer lexer = new NumbersLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      NumbersParser parser = new NumbersParser(tokens);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at file rule:
      ParseTree tree = parser.file();
      
      //Check for no syntatic errors in the tree
      if (parser.getNumberOfSyntaxErrors() == 0) {
        //Now it's time to parse the tree generated using our grammar and the file's input stream
         ParseTreeWalker walker = new ParseTreeWalker();
         MyNumbersListener mappings = new MyNumbersListener();

         walker.walk(mappings,tree); //Walk the tree
         ///////////////////////////////////////////////////////////////////

         //Now the fun stuff: We already have the generated map, so now we just gotta get the user input and translate using it

         Scanner userInput = new Scanner(System.in);
         while(userInput.hasNextLine()){
            String line = userInput.nextLine();

            String[] words = line.replace('-',' ').toLowerCase().split(" "); //Get an array of the users input

            for(int i = 0 ; i < words.length ; i++){ //Iterate over all of user's input
               if(i != 0) //Add a space if it's not the first word
                  System.out.print(" ");
               if(mappings.exists(words[i])) //If the word is registered in the map, convert it
                  System.out.print(mappings.returnValue(words[i])); 
               else //Else just print it as is...
                  System.out.print(words[i]);
            }
            System.out.println("\nContinue? Y/N");
            String response = userInput.nextLine();
            if(response.equals("Y") || response.equals("y"))
               System.out.println("");
            else
               break;
         }
      }
      
      

   }
}
