package aula03;

import java.util.*;

public class A03E02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// leitura do paragrafo do teclado
		System.out.println("Escreva um paragrafo: ");
		String paragrafo = sc.nextLine();
		
		// variavel que contem o numero de palavras do paragrafo
		int numWords = countWords(paragrafo);
		
		// variavel que contem o numero de frases do paragrafo
		int numSentences = countSentences(paragrafo);
		
		// impressao de resultados
		System.out.println("\nO paragrafo tem " + numWords + " palavras");
		
		System.out.println("\nO paragrafo tem " + numSentences + " frases");
		
		printSentences(paragrafo);
		
		sc.close();
		
		
	}
	
	// funcao que conta o numero de palavras de um paragrafo
	public static int countWords(String s) {
		
		// o metodo .split("\\W+") remove um ou mais caracteres nao alfanumericos presentes no paragrafo
		return s.split("\\W+").length;
		
	}
	
	public static int countSentences(String s) {
		
		// o metodo .replace("...", ".") remove todos os "..." e adiciona um único "." no seu lugar
		// o metodo .split("[.?!]") remove todos os caracteres da string iguais aos da classe [.?!]
		return s.replace("...", ".").split("[.?!]").length; 
		
	}
	
	//funcao para imprimir as frases, linha a linha, do paragrafo
	public static void printSentences(String s) {
		
		System.out.println("\nImpressao das frases, linha a linha, do paragrafo: ");
		
		String[] splitResult = s.replace("...", ".").split("[.?!]"); // array com as palavras da frase da string
		for ( String s2 : splitResult ) {
			
			System.out.println("\n" + s2);
			
		}
		
	}

}


