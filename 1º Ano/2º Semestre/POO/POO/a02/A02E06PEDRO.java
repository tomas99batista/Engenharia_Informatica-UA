package a02;

import java.util.Scanner;

public class A02E06PEDRO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op;
		int g,r,c;
		c=0;
		r = (int)(Math.random()*100);
		System.out.println(r);
		do {
			do {
				System.out.println("Guess? ");
				g = sc.nextInt();
				if (g>r) System.out.println("Mais Baixo!");
				else if (g<r) System.out.println("Mais Alto!");
				c++;
			} while (g != r);
			System.out.println("Acertou com " + c + " tentativas");
			System.out.println("Deseja jogar de novo? ");
			op = sc.next();
			c=0;
		} while (op!="nao");
		sc.close();
	}
}
