package a01;

import java.util.Scanner;

public class A01E06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xponto1, yponto1, xponto2, yponto2, distancia;
		System.out.print("Insira x do ponto 1: ");
		xponto1 = sc.nextDouble();
		
		System.out.print("Insira y do ponto 1: ");
		yponto1 = sc.nextDouble();
		
		System.out.print("Insira x do ponto 2: ");
		xponto2 = sc.nextDouble();
		
		System.out.print("Insira y do ponto 2: ");
		yponto2 = sc.nextDouble();
		
		distancia = Math.sqrt( (Math.pow((xponto2 - xponto1), 2) + Math.pow((yponto2 - yponto1),2)));
		System.out.println("A distância entre os pontos é " + distancia);
		sc.close();
		}
}
