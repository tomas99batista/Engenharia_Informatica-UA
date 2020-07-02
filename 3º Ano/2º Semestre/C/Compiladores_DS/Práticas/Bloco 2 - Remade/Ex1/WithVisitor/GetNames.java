import java.util.Iterator;

public class GetNames extends HelloBaseVisitor<String>{
    @Override 
    public String visitGreetingsMain(HelloParser.GreetingsMainContext ctx) { 
        return visit(ctx.greetings());
    }

    @Override 
    public String visitByeMain(HelloParser.ByeMainContext ctx) { 
        return visit(ctx.bye());
    }

    @Override
     public String visitGreeting(HelloParser.GreetingContext ctx) { 
        String names = "";

        //Visit all names
        Iterator<HelloParser.NamesContext> iter = ctx.names().iterator();
        while(iter.hasNext())
            names += " " + visit(iter.next());

        return "Olá" + names;
    }


    @Override 
    public String visitGoodbye(HelloParser.GoodbyeContext ctx) { 
        String names = "";

        //Visit all names
        Iterator<HelloParser.NamesContext> iter = ctx.names().iterator();
        while(iter.hasNext())
            names += " " + visit(iter.next());

        return "Adeus" + names;
    }


    @Override 
    public String visitName(HelloParser.NameContext ctx) { 
        return ctx.ID().getText(); 
    }
}