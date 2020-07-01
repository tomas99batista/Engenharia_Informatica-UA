package a02;

import java.util.Scanner;

public class A02E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numero;
Scanner sc = new Scanner(System.in);
System.out.print("Insira o número: ");
numero = sc.nextInt();
sc.close();

while (numero!=0) {
		System.out.println(numero);
		numero --;
	}

	}
}