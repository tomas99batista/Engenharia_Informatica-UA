import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static java.lang.System.*;
import java.io.*;


public class StrLangMain {
   public static void main(String[] args) throws Exception {

      if(args.length != 1){
         err.println("Usage: StrLangMain <program-file>");
         exit(1);
      }

      Scanner sc = new Scanner(new File(args[0]));


      String lineText = null;
      int numLine = 1;
      if (sc.hasNextLine())
         lineText = sc.nextLine();
      StrLangParser parser = new StrLangParser(null);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      StrLangSemCheck visitor0 = new StrLangSemCheck();
      StrLangExecute visitor1 = new StrLangExecute();
      while(lineText != null) {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromString(lineText + "\n");
         // create a lexer that feeds off of input CharStream:
         StrLangLexer lexer = new StrLangLexer(input);
         lexer.setLine(numLine);
         lexer.setCharPositionInLine(0);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         parser.setInputStream(tokens);
         // begin parsing at main rule:
         ParseTree tree = parser.main();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            semCheck.visit(tree);
            if(!semCheck.error())
               execute.visit(tree);
            else
               resetError();
            visitor1.visit(tree);
         }
         if (sc.hasNextLine())
            lineText = sc.nextLine();
         else
            lineText = null;
         numLine++;
      }
   }
}
