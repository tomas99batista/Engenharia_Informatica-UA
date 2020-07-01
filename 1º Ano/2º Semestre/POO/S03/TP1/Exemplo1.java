package A03;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		String s1 = "ola";
		String s2 = new String("ola");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toString());
		
		System.out.println("texto?");
		String s3 = kb.nextLine(); // ou next
		System.out.println(s3);
		
		System.out.println(s1 + s2 + s3 + 123 + 35.5);
	}

}
