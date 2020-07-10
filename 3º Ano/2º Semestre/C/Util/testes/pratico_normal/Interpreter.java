import java.util.*;

public class Interpreter extends VectorBaseVisitor<String> {

   @Override public String visitDec(VectorParser.DecContext ctx) {
      String res = visit(ctx.expr());

      if (res != null) {
         String id = ctx.Identifier().getText();
         simbolTable.put(id, res);
      }

      return res;
   }

   @Override public String visitShow(VectorParser.ShowContext ctx) {
      String res = visit(ctx.expr());
      if (res != null) {
         System.out.println(res);
      }
      return res;
   }

   @Override public String visitIntProd(VectorParser.IntProdContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitIdentifier(VectorParser.IdentifierContext ctx) {
      String res = null;
      String id = ctx.Identifier().getText();

      if (!simbolTable.containsKey(id)) 
         System.err.println("Erro: variável \"" + id + "\" não declarada.");
      else 
         res = simbolTable.get(id);
      
      return res;
   }

   @Override public String visitNumber(VectorParser.NumberContext ctx) {
      Float f = Float.parseFloat(ctx.Number().getText());
      return String.valueOf(f);
   }

   @Override public String visitMult(VectorParser.MultContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitAddSub(VectorParser.AddSubContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitVector(VectorParser.VectorContext ctx) {
      String res = "["; 
      Iterator<VectorParser.ExprContext> iter = ctx.expr().iterator();
      while (iter.hasNext()) 
         res += visit(iter.next()) + ",";
      
      return res.substring(0, res.length()-1) + "]";
   }

   @Override public String visitUnary(VectorParser.UnaryContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitParen(VectorParser.ParenContext ctx) {
      return visit(ctx.expr());
   }

   private HashMap <String, String> simbolTable = new HashMap<>();
}
