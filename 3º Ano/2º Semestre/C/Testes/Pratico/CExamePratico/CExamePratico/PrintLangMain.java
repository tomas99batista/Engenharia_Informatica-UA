import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


public class PrintLangMain {
   public static void main(String[] args) throws Exception {
      if(args.length < 1){ //User input
         Scanner userReader = new Scanner(System.in); //Get immediate input from user

         while(userReader.hasNext()){
            String line = userReader.nextLine();
            while(line.length() == 0){ //Skip empty lines
               line = userReader.nextLine();
            }
   
            // create a CharStream that reads from standard input:
            CharStream input = CharStreams.fromString(line);
            // create a lexer that feeds off of input CharStream:
            PrintLangLexer lexer = new PrintLangLexer(input);
            // create a buffer of tokens pulled from the lexer:
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer:
            PrintLangParser parser = new PrintLangParser(tokens);
            // replace error listener:
            //parser.removeErrorListeners(); // remove ConsoleErrorListener
            //parser.addErrorListener(new ErrorHandlingListener());
            // begin parsing at main rule:
            ParseTree tree = parser.main();
      
            ///////////////////////////
            ParseTreeWalker walker = new ParseTreeWalker(); //Walker
            PrintLangWorkListener listener = new PrintLangWorkListener(); //Custom Listener
            walker.walk(listener,tree); //Walk the tree with our listener
            ///////////////////////////
      
            if (parser.getNumberOfSyntaxErrors() == 0) {
               // print LISP-style tree:
               // System.out.println(tree.toStringTree(parser));
            }
         }
   
         userReader.close();
      }else{ //File input
         InputStream inputStream = null; //File input
         try{
            inputStream = new FileInputStream(new File(args[0])); //Get File
         }catch(FileNotFoundException e){
            System.out.println("Error! File not found");
            System.exit(1);
         }

         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(inputStream);
         // create a lexer that feeds off of input CharStream:
         PrintLangLexer lexer = new PrintLangLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         PrintLangParser parser = new PrintLangParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at main rule:
         ParseTree tree = parser.main();
      
         ///////////////////////////
         ParseTreeWalker walker = new ParseTreeWalker(); //Walker
         PrintLangWorkListener listener = new PrintLangWorkListener(); //Custom Listener
         walker.walk(listener,tree); //Walk the tree with our listener
         ///////////////////////////
      
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
         }
      }

      
   }
}
