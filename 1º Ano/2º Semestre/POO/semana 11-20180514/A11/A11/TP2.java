package A11;
import java.util.*;
import java.io.*;

public class TP2 {

	public static void main(String[] args) {
		
		Scanner sc = null;
		try{
			sc = new Scanner(new FileReader("tp2aula11.txt"));
		}
		catch(FileNotFoundException e){
			System.out.println("ERRO " + e);
			System.exit(0);
		}
		
		List<Pessoa> lp = new ArrayList<>();
		List<Carro> lc = new ArrayList<>();
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			String a[] = s.split(";");
			
			if(a[0].equals("Pessoa"))
				lp.add(new Pessoa(a[1]));//Integer.parseInt(a[1])));
			else if(a[0].equals("Carro"))
				lc.add(new Carro(Integer.parseInt(a[1]), a[2]));
		}
		
		System.out.println(lp);
		
		for(Carro c : lc)
			System.out.println(c);
		
		sc.close();
		
	}

}
