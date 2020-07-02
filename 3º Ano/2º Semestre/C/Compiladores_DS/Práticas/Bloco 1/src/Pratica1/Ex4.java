package Pratica1;

import java.util.HashMap;
import java.io.File;
import java.util.Scanner;


public class Ex4 {

    public static int getFullNumber(String allNumbers){
        int fullNumber=0;

        String[] numbers = allNumbers.split("\\s+");

        for(int i = 0 ; i<numbers.length ; i++){
            if(i==numbers.length){
                fullNumber+=Integer.parseInt(numbers[i]);
                continue;
            }

            int tempNumb = Integer.parseInt(numbers[i]);
            for(int j = i ; j<numbers.length-1 ; j++){
                if(Integer.parseInt(numbers[j])>Integer.parseInt(numbers[j+1])){
                    //System.out.println(Integer.parseInt(numbers[j])+">"+Integer.parseInt(numbers[j+1]));
                    break;
                }else{
                    //System.out.println(Integer.parseInt(numbers[j])+"<"+Integer.parseInt(numbers[j+1]));
                    i++; //So we dont take the next number into consideration on the next i loop
                    tempNumb = tempNumb*Integer.parseInt(numbers[j+1]);
                }
            }

            fullNumber+=tempNumb;
        }

        return fullNumber;
    }

    public static void main(String[] args){
        HashMap<String, Integer> associativeArray = Ex3.getAssociativeArray(new File("../../../src/Pratica1/numbers.txt")); //Run using terminal

        Scanner inputGetter = new Scanner(System.in);
        String phrase = inputGetter.nextLine();
        String allNumbers = Ex3.transformNumbers(phrase,associativeArray).replaceAll("[\\D]", " ");
        //System.out.println(allNumbers);
        System.out.println(phrase+" -> "+getFullNumber(allNumbers));
    }
}
