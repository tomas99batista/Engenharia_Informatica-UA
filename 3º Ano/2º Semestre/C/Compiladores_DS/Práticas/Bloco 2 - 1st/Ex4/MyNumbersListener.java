//Class that extends the base NumbersBaseListener
//Has the responsability of creating a map with the number-word set

import java.util.Map;
import java.util.HashMap;

public class MyNumbersListener extends NumbersBaseListener{
    protected Map<String,Integer> numToWordMap = new HashMap<>();

    //Specific functions, used to control our map

    //Checks if given key is in the map
    public boolean exists(String key){
        assert key != null;
        return numToWordMap.containsKey(key);
    } 

    //Checks if given key is in the map
    public int returnValue(String key){
        assert key != null;
        assert exists(key);
        return numToWordMap.get(key);
    } 


    //Override listener functions

    //Function called everytime the tree enters an exitLine rule (i.e, a new line has finished being defined so we can go fetch its content)
    @Override
    public void exitLine(NumbersParser.LineContext ctx){
        String key = ctx.WORD().getText(); //Fetch the key
        int value = Integer.parseInt(ctx.NUM().getText()); //Fetch the value

        if(exists(key)){  //If the key had previously been declared
            System.out.println("Error: Can't insert repeated key!");
            System.exit(1);
        }

        numToWordMap.put(key, value);
    }

}