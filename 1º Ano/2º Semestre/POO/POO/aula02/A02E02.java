package aula02;
import java.util.Scanner;

public class A02E02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num; // declaracao de variaveis
		
		// leitura de um valor N natural
		do {
			
			System.out.print("Número positivo: ");
			num = sc.nextInt();
			
		} while (num <= 0);
		
		System.out.println("Contagem decrescente: ");
		
		// contagem decrescente e consequente impressao
		while (num >= 0) {
			System.out.println(num);
			num--;
		}
		
		sc.close();
		
	}

}
