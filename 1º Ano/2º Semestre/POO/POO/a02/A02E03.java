package a02;

import java.util.Scanner;

public class A02E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o número: ");
		numero = sc.nextInt();
		
		while(numero <= 0) {
			System.out.print("Número não positivo, insira novamente: ");
			numero = sc.nextInt();
		}
		sc.close();
		int i = numero;
		while(i > 0) {
			
		}
	}

}
