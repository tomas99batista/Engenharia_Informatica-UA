package A11;

import java.io.*;
import java.util.*;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner sc = null;
		try{
			sc = new Scanner(new FileReader("x.txt"));		
		}
		catch (FileNotFoundException e){
			System.out.println("Erro ao aceder ao ficheiro \n");// + e);
		}

		List<Integer> l = new ArrayList<>();
		try{
			System.out.println(l.get(0));
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Indice errado \n" + e);
		}
	
		int i = 0;
		try{
			i = Integer.parseInt("abc");
		}
		catch(NumberFormatException e){
			System.out.println("Conversao errada \n" + e);
		}
	}

}
