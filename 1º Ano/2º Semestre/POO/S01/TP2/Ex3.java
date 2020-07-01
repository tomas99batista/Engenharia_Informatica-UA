package A01;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("num?");
		int x = kb.nextInt();
		System.out.println(x);
		
		System.out.print("num?");
		double y = kb.nextDouble();
		System.out.println(y);
		System.out.println("sqrt: " + Math.sqrt(y));
	}

}
