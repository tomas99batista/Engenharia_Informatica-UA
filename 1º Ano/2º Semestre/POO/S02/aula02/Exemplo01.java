package aula02;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		boolean x = true; // false
		Scanner kb = new Scanner(System.in);
		
		if(x){
			System.out.println("verdadeira");
		}
		else
		{
			System.out.println("falso");
		}
	
		System.out.println(x ? "Verdadeiro" : "falso");
		
		System.out.print("Numero:");
		int n = kb.nextInt();
		if(n > 0)
			System.out.println("positivo");
		else if(n == 0)
			System.out.println("Zero");
		else
			System.out.println("Negativo");
	}

}
