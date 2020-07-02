import static java.lang.System.*;
import java.util.*;


public class SymbolTable{

    private Map<String,String> table = new HashMap<>();

    public boolean exists(String name){
        assert (name!=null);
        return table.containsKey(name);
    }

    public void put(String name, String value){
        assert (name!=null);
        assert (value!=null);

        table.put(name, value);
    }

    public void put(String name){
        assert (name!=null);

        table.put(name, null);
    }


    public String get(String name){
        return table.get(name);
    }

    

}