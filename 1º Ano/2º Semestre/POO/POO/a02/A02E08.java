package a02;

import java.util.Scanner;

public class A02E08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor? "); 
		byte b = sc.nextByte();
		String bits = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
		for (int i = 0 ; i < 8 ; i++) {
			if ( bits.charAt(i) == '1' ) {
				contador++;
			}
		}
		System.out.println("O nº " + b + " é " + bits + " e tem " + contador + " bits igual a 1.");
		
		sc.close();	
	
	
	}

}
