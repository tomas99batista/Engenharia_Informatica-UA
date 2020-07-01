package A09;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		
		//List<Pessoa> l = new ArrayList<>();
		
		List<Pessoa> l = new LinkedList<>();
		
		Pessoa p = new Pessoa(30, "Ana");
		l.add(p);
		l.add(p);
		l.add(new Pessoa(20, "Maria"));
		l.add(new Pessoa(30, "Joao"));

		System.out.println(l);
		
		//Set<Pessoa> s = new HashSet<>();
		Set<Pessoa> s = new TreeSet<>();
		
		s.add(p);
		p.setNome("joana");
		s.add(p);
		s.add(new Pessoa(20, "Maria"));
		s.add(new Pessoa(5, "Joao"));
		
		System.out.println(s);
		
		for(Pessoa i : l)
			System.out.println("b" + i); 
		
		Iterator<Pessoa> it = l.iterator();
		while(it.hasNext()){
			Pessoa i = it.next();
			System.out.println("c" + i); 
		}
		
		for(int i = 0 ; i < l.size() ; i++){
			System.out.println("d" + l.get(i));
		}
	}

}
