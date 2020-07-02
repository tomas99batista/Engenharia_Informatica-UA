import java.util.Iterator;

public class ConvertToSuffix extends CalculatorRemadeAgainBaseVisitor<String>{
   
    @Override
    public String visitProgram(CalculatorRemadeAgainParser.ProgramContext ctx){
        String res = "";
        Iterator<CalculatorRemadeAgainParser.StatContext> iter = ctx.stat().iterator(); //Iterate over all stats (since we may have many lines as inputs)

        //Basically goes through all lines and visits them
        while(iter.hasNext()){
            res += visit(iter.next()) + "\n";
        }
        return res;
    }

    @Override 
    public String visitExprStat(CalculatorRemadeAgainParser.ExprStatContext ctx) { 
        return visit(ctx.expr()); 
    }

    @Override 
    public String visitAssignmentStat(CalculatorRemadeAgainParser.AssignmentStatContext ctx) {
         return visit(ctx.assignment());
    }


    //Convert assignment to posfix -> a=5 == a 5 =
    @Override 
    public String visitAssignment(CalculatorRemadeAgainParser.AssignmentContext ctx) { 
        return ctx.ID().getText() + " " + visit(ctx.expr()) + " ="; 
    }

    //Convert mult or divition
    @Override 
    public String visitMultDiv(CalculatorRemadeAgainParser.MultDivContext ctx) { 
        return visit(ctx.e1) + " " + visit(ctx.e2) + " " + ctx.op.getText(); 
    }

    //Convert sum or sub
    @Override 
    public String visitSumSub(CalculatorRemadeAgainParser.SumSubContext ctx) { 
        return visit(ctx.e1) + " " + visit(ctx.e2) + " " + ctx.op.getText(); 
    }

    //Get Number
    @Override 
    public String visitNumber(CalculatorRemadeAgainParser.NumberContext ctx) { 
        return ctx.INT().getText();
    }

    //Get Variable Name
    @Override 
    public String visitVariable(CalculatorRemadeAgainParser.VariableContext ctx) { 
        return ctx.ID().getText();
    }

    //Visit Parenthisis
    //Get Variable Name
    @Override 
    public String visitParenthesis(CalculatorRemadeAgainParser.ParenthesisContext ctx) { 
        return visit(ctx.expr());
    }


}