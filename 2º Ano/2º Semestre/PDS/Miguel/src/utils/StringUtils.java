package utils;

public class StringUtils
{   
    /**
     *  Multiply 
     *  <p>
     *  Name self explanatory, multiplies non numbers.
     *  Currently only defined for Strings
     *  @param  s       String to multiply
     *  @param  times   Number of times to multiply
     *  @return         the String s multiplied by {@code times}
     */
    public static String multiply(String s, int times){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < times; i++){
            sb.append(s);
        }
        return sb.toString();
    }
    
    
    
}
