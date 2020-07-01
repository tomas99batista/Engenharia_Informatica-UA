package a01;

import java.util.Scanner;

public class A01E04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double v1, v2, vfinal;
		System.out.print("Insira a velocidade 1: ");
		v1 = sc.nextDouble();
		System.out.print("Insira a velocidade 2: ");
		v2 = sc.nextDouble();
		vfinal = (2*v1*v2) / (v1+v2);
		System.out.println("A velocidade média final é: " + vfinal);
		sc.close();
		}
}
