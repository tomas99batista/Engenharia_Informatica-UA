package A10;

import java.io.*;
import java.util.*;

public class CountWords{

	public static void main(String[] args)  throws IOException{
		
		Scanner sc = new Scanner(new FileReader("alice.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("contagens.txt"));
		Map<String, Integer> m = new HashMap<>();
		
		while(sc.hasNext()){
			String s = sc.next();
			//System.out.println(s);
			if(m.containsKey(s))
				m.put(s, m.get(s) + 1);
			else
				m.put(s, 1);
		}
		sc.close();
		System.out.println(m);
		
		for(String s : m.keySet())
			pw.println(s + " : " + m.get(s));
		
		pw.close();
	}

}
