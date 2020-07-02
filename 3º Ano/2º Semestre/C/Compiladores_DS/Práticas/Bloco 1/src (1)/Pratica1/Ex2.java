package Pratica1;
import java.util.*;


public class Ex2 {

    public static void main(String[] args) {

        Stack<Double> numberStack = new Stack<>();

        double num1;
        double num2;
        double result = 0;

        Scanner reader = new Scanner(System.in);
        String arguments = reader.nextLine();
        reader.close();

        Scanner interpreter = new Scanner(arguments);

        while(interpreter.hasNextDouble()){
            numberStack.add(interpreter.nextDouble());
            System.out.println("Stack: " + numberStack.toString());
        }

        while(interpreter.hasNext() && numberStack.size()>=2){
            num2 = numberStack.pop();
            num1 = numberStack.pop();

            String op = interpreter.next().trim();

            switch(op){
                case "+":
                    result = num1+num2;
                    break;
                case "-":
                    result = num1-num2;
                    break;
                case "/":
                    result = num1/num2;
                    break;
                case "*":
                    result = num1*num2;
                    break;
                default:
                    System.err.println("ERROR: Selected Operation not valid");
                    System.exit(1);
            }

            numberStack.add(result);
            System.out.println("Stack: " + numberStack.toString());

        }

        interpreter.close();

    }
}