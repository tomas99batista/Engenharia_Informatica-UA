package Pratica1;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true){
            String input = "";


            if (reader.hasNextDouble())
                input+=reader.nextDouble()+" ";
            if (reader.hasNext())
                input+=reader.next()+" ";
            if (reader.hasNextDouble())
                input+=reader.nextDouble()+" ";


            String[] values = input.split("\\s");

            Character op = values[1].charAt(0);

            double result = 0;

            switch(op){
                case '+':
                    result = Double.parseDouble(values[0]) + Double.parseDouble(values[2]);
                    break;
                case '-':
                    result = Double.parseDouble(values[0]) - Double.parseDouble(values[2]);
                    break;
                case '/':
                    result = Double.parseDouble(values[0]) / Double.parseDouble(values[2]);
                    break;
                case '*':
                    result = Double.parseDouble(values[0]) * Double.parseDouble(values[2]);
                    break;
                default:
                    System.err.println("ERROR: Selected Operation not valid");
                    System.exit(1);
            }

            System.out.printf("%s %s %s = %f\n",values[0],values[1],values[2],result);

        }
    }
}
