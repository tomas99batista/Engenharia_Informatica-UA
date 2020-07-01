package a01;

import java.util.Scanner;

public class A01E03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double celsius, fh;
		System.out.print("Insira a temperatura em celsius: ");
		celsius = sc.nextDouble();
		fh = 1.8 * celsius + 32;
		System.out.println("A temperatura em farenheit é: " + fh);
		sc.close();
		}
}
