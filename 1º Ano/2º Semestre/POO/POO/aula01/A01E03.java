package aula01;

import java.util.Scanner;

public class A01E03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double celsius, farenheit; // declaracao de variaveis
		
		// leitura da temperatura no teclado
	    System.out.print("Insira uma temperatura em graus Celsius: ");
	    celsius = sc.nextDouble(); // atribuicao do valor lido
	    
	    farenheit = 1.8 * celsius + 32; // formula de conversao
	    
	    // impressao final
	    System.out.println(celsius + " graus Celsius são " + farenheit + " graus Farenheit.");
	    
	    sc.close();

	}

}
