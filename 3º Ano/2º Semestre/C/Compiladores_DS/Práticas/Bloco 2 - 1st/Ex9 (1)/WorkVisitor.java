
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class WorkVisitor extends CalcGrammarBaseVisitor<String>{
    protected static Map<String,String> symbolTable = new HashMap<>();
    
    @Override 
    public String visitMain(CalcGrammarParser.MainContext ctx) {
        String result = "";

        Iterator<CalcGrammarParser.StatementContext> iterator = ctx.statement().iterator();

        while(iterator.hasNext()){
            result += visit(iterator.next());
        }
        
        return result; 
    }


    @Override 
    public String visitAssignment(CalcGrammarParser.AssignmentContext ctx) {
        String varID = ctx.ID().getText();
        String varVal = ctx.set().getText();
        symbolTable.put(varID,varVal);

        return varVal;
    }


    @Override 
    public String visitUnion(CalcGrammarParser.UnionContext ctx) { 
        String v1 = visit(ctx.e1);
        String v2 = visit(ctx.e2);

        String result = v1+v2;
        result = result.replace("}{", ",");

        return result;
    }

    @Override /*TO-DO: Implement the diference*/
    public String visitDifference(CalcGrammarParser.DifferenceContext ctx) { 
        return "";
    }

    @Override  /*TO-DO: Implement the interception*/
    public String visitInterception(CalcGrammarParser.InterceptionContext ctx) { 
        return "";
    }



    @Override
     public String visitSetOrId(CalcGrammarParser.SetOrIdContext ctx) { 
        if(ctx.set() != null){
            return ctx.set().getText();
        }else{
            if(symbolTable.containsKey(ctx.ID().getText())){
                return symbolTable.get(ctx.ID().getText());
            }else{
                System.out.println("Error! Undeclared variable used!");
                System.exit(1);
            }
        }

        return null;
    }


}