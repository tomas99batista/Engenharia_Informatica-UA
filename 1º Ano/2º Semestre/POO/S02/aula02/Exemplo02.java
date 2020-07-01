package aula02;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		// multiple decision using switch
		
		Scanner kb = new Scanner(System.in);
		int mes = kb.nextInt();
		int dias = 0;
		
		switch(mes){ // int strings char enumerados
		case 1:
		case 3:
		case 5:
			dias = 31;
			break;
		case 4:
		case 6:
			dias = 30;
			break;
		default:
			System.out.println("mes invalido");
		}
		
		System.out.println("Dias = " + dias);
	}

}
