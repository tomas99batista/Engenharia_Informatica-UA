package aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class A10E02 {

	public static void main(String[] args) throws IOException {
		
		// Ler um ficheiro
		Scanner input = new Scanner(new FileReader("major.txt"));
		
		// Mapa dentro de um Mapa para guardar o numero de ocorrencias de pares
		Map<String, Map<String, Integer>> pares = new TreeMap<>();
		
		String firstString = input.next().toLowerCase();
		
		while(input.hasNext()) {
			
			String secondString = input.next().toLowerCase();
			
			if(secondString.length() > 2 && secondString.matches("[a-zA-Z]+")) {
				
				if(!pares.containsKey(firstString)) {
					pares.put(firstString, new TreeMap<String, Integer>());
					pares.get(firstString).put(secondString, 1);
					firstString = secondString;
					
				} else {
					if(pares.get(firstString).containsKey(secondString)) {
						pares.get(firstString).put(secondString, pares.get(firstString).get(secondString) + 1);
					} else {
						pares.get(firstString).put(secondString, 1);
						
					}
					firstString = secondString;
				}
				
			}
			
		}
		
		for(String s : pares.keySet()) {
			System.out.println(s + pares.get(s));
		}
		
		
		
		
	}

}
