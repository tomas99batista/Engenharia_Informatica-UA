package A01;
import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		// Leitura de dados do teclado
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Texto?");
		String s = kb.nextLine();
		System.out.println("O texto introduzido foi:" + s);
		
		System.out.print("Valor?");
		int a = kb.nextInt();
		kb.nextLine(); // "limpar" o scanner depois de inteiros ou reais
		System.out.println(a);
		System.out.print("Texto?");
		s = kb.nextLine();
		System.out.println("O texto introduzido foi (2):" + s);

		
	}

}
