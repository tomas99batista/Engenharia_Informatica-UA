package A03;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		String a[] = {"poo, e fixe 123", "TP de poo. Tem 456", "poo; 23", "ola  aveiro 45"};
		
		for(String s : a){
			System.out.println("a) " + s);
		}
		
		for(int i = 0 ; i < a.length ; i++){
			System.out.println("b) " + a[i]);
		}
				
		for(String s : a){
			System.out.println("c) " + s.replace("poo", "fp"));
			System.out.println("e) " + s); 
		}
		
		// percorrer todas as letras de todas as frases
		// mostrar os carateres
		// contar as letras
		int l = 0, n = 0;
		for(String s : a){
			for(int i = 0 ; i < s.length() ; i++){ 
				char c = s.charAt(i);
				System.out.println(c);
				if(Character.isLetter(c)){
					l++;
				}
				if(Character.isDigit(c)){ // if(c >= '0' &&  c <= '9')
					n++;
				}
			}	
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

}
