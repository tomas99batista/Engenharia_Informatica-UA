package A10TP2;

import java.util.*;
import java.io.*;

public class CopyFiles {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new FileReader("texto.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("tp2.txt"));
		
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			System.out.println(s);
			pw.println(s);
		}
		
		pw.close();
		sc.close();
	}

}
