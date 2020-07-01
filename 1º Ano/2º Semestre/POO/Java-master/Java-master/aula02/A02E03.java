package aula02;
import java.util.Scanner;

public class A02E03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num; boolean primo = true; // declaracao de variaveis

		do { // leitura do numero natural

			System.out.print("Número natural: ");
			num = sc.nextInt();

		} while( num <= 0 );

		// averiguar se um numero e primo
		for (int i = 2 ; i < num ; i++) {

			if ( num % i == 0 )
				primo = false;

		}

		// impressao de resultados
		if (primo)
			System.out.println("É primo.");
		else
			System.out.println("Não é primo.");

		sc.close();
	}

}
