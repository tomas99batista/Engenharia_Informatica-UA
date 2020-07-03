package aula03;

import java.util.*;
import java.lang.String;

public class A03E01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// leitura das duas strings
		System.out.print("Insira a primeira string: ");
		String str1 = sc.nextLine();
		System.out.print("\nInsira a segunda string: ");
		String str2 = sc.nextLine();
		
		// contagem do numero de carateres de cada string e consequente impressao
		int c1 = countCharacters(str1);
		int c2 = countCharacters(str2);
		
		System.out.println("\nA primeira string tem " + c1 + " caracteres.");
		System.out.println("A segunda string tem " + c2 + " caracteres.");
		
		// imprimir o ultimo caracter da primeira string
		char lc = lastCharacter(str1);
		System.out.println("\nO ultimo caracter da primeira string e '" + lc + "'." );
		
		// indicar se as duas strings sao iguais ou nao
		boolean iguais = compareStrings(str1, str2);
		
		if (iguais) {
			System.out.println("\nAs strings sao iguais.");
		} else {
			System.out.println("\nAs strings sao diferentes.");
		}
		
		// indicar se a segunda string acaba com um '.'
		boolean dot = endsWithDot(str2);
		if (dot) {
			System.out.println("\nA segunda string acaba com um '.'.");
		} else {
			System.out.println("\nA segunda string nao acaba com um '.'.");
		}
		
		// indicar se a segunda string so tem minusculas
		boolean olc = onlyLowerCase(str2);
		if (olc) {
			System.out.println("\nA segunda string so tem letras minusculas.");
		} else {
			System.out.println("\nA segunda string nao tem so letras minusculas.");
		}
		
		// converter todos os caracteres das strings para minusculas e imprimir
		str1 = stringToLowerCase(str1);
		str2 = stringToLowerCase(str2);
		
		System.out.println("\nPrimeira string em minusculas: " + str1);
		System.out.println("\nSegunda string em minusculas: " + str2);
		
		// substituir todas as ocorrencias de varios espaços seguidos por um unico espaço
		// NOTA: ainda que no enunciado nao seja pedido a impressao desta acao, decidi imprimir para confirmar
		str1 = replaceSpaces(str1);
		str2 = replaceSpaces(str2);
		
		System.out.println("\nPrimeira string sem varios espacos: " + str1); 
		System.out.println("\nSegunda string sem varios espacos: " + str2);
		
		// capitalizar a primeira letra de cada palavra de ambas as frases
		str1 = capitalizeFirstLetter(str1);
		str2 = capitalizeFirstLetter(str2);
		
		System.out.println("\nPrimeiras letras da primeira string capitalizadas: ");
		System.out.println(str1);
		
		System.out.println("\nPrimeiras letras da seguda string capitalizadas: ");
		System.out.println(str2);
		
		// verificar se cada string e um palindromo ou nao
		boolean str1_is_palindrome = checkPalindrome(str1.toLowerCase());
		boolean str2_is_palindrome = checkPalindrome(str2.toLowerCase());
		
		if(str1_is_palindrome) {
			System.out.println("A primeira string e um palindromo.");
		} else {
			System.out.println("A primeira string nao e um palindromo.");
		}
		
		if(str2_is_palindrome) {
			System.out.println("A segunda string e um palindromo.");
		} else {
			System.out.println("A segunda string nao e um palindromo.");
		}
		
		sc.close();
		
	}
	
	// funcao para contar o numero de carateres de uma string
	public static int countCharacters(String s) {
		
		return s.length();
		
	}
	
	// funcao para averiguar qual o ultimo caracter de uma string
	public static char lastCharacter(String s) {
		
		return s.charAt(s.length() - 1);
		
	}
	
	// funcao para comparar se duas strings sao iguais
	public static boolean compareStrings(String s1, String s2) {
		
		return s1.equals(s2);
		
	}
	
	// funcao para averiguar se uma string acaba com um '.'
	public static boolean endsWithDot(String s) {
		
		return s.endsWith(".");
		
	}
	
	// funcao para averiguar se uma string so tem letras minusculas
	public static boolean onlyLowerCase(String s) {
		
		String sl = s.toLowerCase();
		return s.equals(sl);
		
	}
	
	// funcao para converter uma string em letras minusculas
	public static String stringToLowerCase(String s) {
		
		return s.toLowerCase();
		
	}
	
	// funcao para substituir todas as ocorrencias de varios espacos seguidos por um unico espaco
	public static String replaceSpaces(String s) {
		
		return s.replaceAll("\\s+", " ");
		
	}
	
	// funcao para capitalizar a primeira letra de cada palavra numa string
	public static String capitalizeFirstLetter(String s) {
		
		String[] splitResult = s.split("\\W"); // array com as palavras da frase da string
		String newString = ""; 
		
		for( int i = 0 ; i < splitResult.length ; i++) {
			
			newString += (splitResult[i].substring(0, 1).toUpperCase() + splitResult[i].substring(1) + " ");
			
		}
		
		return newString; // nova string com a primeira letra de cada palavra capitalizada
		
	}
	
	// funcao para averiguar se uma string e um palindromo
	public static boolean checkPalindrome(String s) {
		
		String reversed_s = new StringBuilder(s).reverse().toString().trim();
		return s.trim().equals(reversed_s);
		
		
	}
	
}
