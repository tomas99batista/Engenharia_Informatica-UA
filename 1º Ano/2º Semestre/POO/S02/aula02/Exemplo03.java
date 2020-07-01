package aula02;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		// reading numbers until zero appears 
		// count positive and negatives
		// while usage
		
		Scanner kb = new Scanner(System.in);
		int n, pos = 0, neg = 0;
		
		do{
			System.out.print("Numero:");
			n = kb.nextInt();
			if(n > 0){
				System.out.println("positivo");
				pos++; // increment
			}
			else if(n == 0)
				System.out.println("Zero");
			else{
				System.out.println("Negativo");
				neg++;
				}
		}while(n != 0);
		
		System.out.println("pos " + pos + " neg " + neg);
	}

}
