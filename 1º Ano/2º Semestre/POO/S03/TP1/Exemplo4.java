package A03;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		String frases[] = {"poo, e fixe 123", "TP de poo. Tem 456", "poo; 23", "ola  aveiro 45"};
		String frases2[] = {"ola", "coisas"};
		imprime(frases);
		imprime(frases2);
		
		int x = contaLetras(frases);
		System.out.println("letras = " + x);
	}

	public static void imprime(String a[]){
		for(String s : a){
			System.out.println("a) " + s);
		}
	}

	public static int contaLetras(String a[]){
		int l = 0;
		for(String s : a){
			for(int i = 0 ; i < s.length() ; i++){ 
				char c = s.charAt(i);
				System.out.println(c);
				if(Character.isLetter(c)){
					l++;
				}
			}	
		}
		return l;
	}
	/*		
		for(String s : a){
			System.out.println("c) " + s.replace("poo", "fp"));
			System.out.println("e) " + s); 
		}


		System.out.println("letras: " + l + " digitos: " + n);

		// partir frases em palavras
		for(String s : a){
			String p[] = s.split("[ ,;.]");
			for(String ss : p){
				System.out.println(ss);
			}
		}
	}
	 */

}
