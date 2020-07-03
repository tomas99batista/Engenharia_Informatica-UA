package a03;

import java.util.Scanner;

public class A03E01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string1, string2;
		System.out.println("Insira a primeira String: ");
		string1 = sc.nextLine();
		System.out.println("Insira a segunda String: ");
		string2 = sc.nextLine();
		String palavras[] = {string1, string2};
		
		int count = 0;
		for(String c: palavras) {
			for(int i = 0; i < c.length() ; i++){
				char n = c.charAt(i);
				if(Character.isLetter(n)) {
					count++;}
				}
			};
		System.out.println("carateres -> " + count);

		 char last = string1.charAt(string1.length() - 1);
		System.out.println("Ultimo char da str1 -> "+ last);

		int result = string1.compareTo( string2 );
		if(result == 0) {
			System.out.println("As duas str são Iguais");
		}
		else {
			System.out.println("As duas str sao Diferentes");
		}
		
		char last2 = string2.charAt(string2.length() - 1);
		if(last2 == '.') {
			System.out.println("A str 2 Acaba com .");
		}
		else {
			System.out.println("A str 2 Não acaba com .");
		}
		
		if(string2.equals(string2.toLowerCase())) {
			System.out.println("A str 2 Só tem minúsculas");
		}
		else {
			System.out.println("Existem maiúsculas na String 2");
		}
		System.out.println("Str 1 em minusculas: " + string1.toLowerCase());
		System.out.println("Str 2 em minusculas: " + string2.toLowerCase());

		System.out.println("str1 -> " + string1.trim().replaceAll(" +", " "));
		System.out.println("str2 -> "+ string2.trim().replaceAll(" +", " "));
			sc.close();
	}
}
