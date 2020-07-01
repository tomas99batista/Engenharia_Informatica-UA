package A09;

import java.util.*;

import a09.Box;

public class Test2 {

	public static void main(String[] args) {
		
		Map<String, Pessoa> m = new TreeMap<>();
		
		m.put("a", new Pessoa(10, "Ana"));
		m.put("b", new Pessoa(20, "Maria"));

		System.out.println(m);
		
		Set<String> keys = m.keySet();
		for(String s : keys)
			System.out.println("map1: "+ m.get(s));
		
		for(Map.Entry<String, Pessoa> e : m.entrySet())
			System.out.println("map2: "+ e.getKey() + ", " + e.getValue());
			
		for(Pessoa b : m.values())
			System.out.println("map3: " + b);
	}

}
