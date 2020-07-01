package a02;

import java.util.Scanner;

public class A02E04PEDRO {
	public static void main(String[] args) {
		double ask, count, total, max, min, c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduza o primeiro valor: ");
		c = sc.nextDouble();
		count = 1;
		total = c;
		max = c;
		min = c;
		do {
			System.out.println("Introduz numero: ");
			ask = sc.nextDouble();
			count++;
			total += ask;
			if (max < ask) max = ask;
			if (min > ask) min = ask;
			
		} while(ask!=c);
		
		System.out.println(" média: " + total/count + "\n Maximo: " + max + "\n Minimo: " + min + "\n Numero: " + (int)(count));
		sc.close();
	}
}
