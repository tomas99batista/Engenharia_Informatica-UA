package aula02;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo06 {

	public static void main(String[] args) {
		// Example of using arrays to store information
		
		Scanner kb = new Scanner(System.in);
		
		int lista[] = new int[5];
		
		for( int i = 0 ; i < lista.length ; i++){
			System.out.print("n ");
			lista[i] = kb.nextInt();
		}
		
		// printing the content of the array by reverse order
		for( int i = lista.length - 1 ; i >= 0 ; i--){
			System.out.printf("[%d] = %d \n", i, lista[i]);
		}
		
		// explore the Arrays class
		System.out.println(Arrays.toString(lista));
		
		// foreach 
		for(int val : lista){
			System.out.println(val);
		}
			
		
	}

}
