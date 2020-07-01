package aula02;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		// reading numbers until zero appears 
		// count positive and negatives
		// while usage
		
		Scanner kb = new Scanner(System.in);
		int n, pos = 0, neg = 0;

		System.out.print("primeiro numero:");
		n = kb.nextInt();
		while(n != 0){

			if(n > 0){
				System.out.println("positivo");
				pos++; // incremento
			}
			else if(n == 0)
				System.out.println("Zero");
			else{
				System.out.println("Negativo");
				neg++;
			}
			System.out.print("Numero:");
			n = kb.nextInt();
		}

		System.out.println("pos " + pos + " neg " + neg);
	}

}
