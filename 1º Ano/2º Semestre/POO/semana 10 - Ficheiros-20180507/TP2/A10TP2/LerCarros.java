package A10TP2;

import java.io.*;
import java.util.*;

public class LerCarros {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new FileReader("carros.csv"));
		List<Carro> l = new ArrayList<>();
		
		//Carro x = new Carro("00-00-AA", "Seat", 000000);
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			String a[] = s.split(";");
			Carro c = new Carro(a[0], a[1], Integer.parseInt(a[2]));
			System.out.println(c);
			l.add(c);
		}
		
		System.out.println("lista: " + l);
		Collections.sort(l);
		System.out.println("ordenada: " + l);
		sc.close();
	}

}
