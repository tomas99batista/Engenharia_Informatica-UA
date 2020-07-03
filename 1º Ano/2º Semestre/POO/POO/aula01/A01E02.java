package aula01;
import java.util.Scanner;

public class A01E02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double km, miles; // declaracao de variaveis
		
		// pedido da distancia pelo teclado
		System.out.print("Insira distância em km: "); 
		km = sc.nextDouble(); // atribuicao do valor lido
		
		miles = km / 1.609; // formula de conversao
		
		System.out.println("A distância em milhas é " + miles); // impressao final
		
		sc.close();
		
		

	}

}
