package aula10;

import java.util.*;
import java.io.*;

public class A10E01 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new FileReader("words.txt"));
		
		List<String> palavras = new ArrayList<>();
		
		// a)
		while (input.hasNext()) {
			String word = input.next();
			System.out.println(word);
			
			// b)
			if(word.length() > 2) {
				palavras.add(word);
			}
			
		}
		
		// b)
		System.out.println("\nPalavras com mais de 2 letras: ");
		for(String s : palavras) {
			System.out.println(s);
		}
		
		// c)
		System.out.println("\nPalavras terminadas com 's':");
		for(String s : palavras) {
			if(s.endsWith("s")) {
				System.out.println(s);
			}
		}
		
		// d)
		for(int i = 0; i < palavras.size(); i++) {
			if(!palavras.get(i).matches("[a-zA-Z]+")) {
				palavras.remove(i);
			}
		}
		
		FileWriter outputstream = new FileWriter("words2.txt");
		PrintWriter escreve = new PrintWriter(outputstream);
		
		// e)
		System.out.println("\nResultado final: ");
		for(String s: palavras) {
			System.out.println(s);
			escreve.write(s + " ");
		}
		
		escreve.close();
		
		
		
		
	}

}
