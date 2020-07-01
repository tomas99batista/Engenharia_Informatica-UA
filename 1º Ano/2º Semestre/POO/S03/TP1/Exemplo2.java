package A03;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		String s;
		do{
			System.out.print("texto?");
			s = kb.next();
			if(s.compareTo("poo") > 0){
				System.out.println(s + " e maior do que poo");
			}
			else if(s.compareTo("poo") < 0){
				System.out.println(s + " e menor do que poo");
			}
			else{
				System.out.println("IGUAIS");
			}
		}while(!s.equalsIgnoreCase("fim")); // s.equals()
	}

}
