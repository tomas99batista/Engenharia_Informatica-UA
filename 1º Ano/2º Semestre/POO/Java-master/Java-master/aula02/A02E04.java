package aula02;
import java.util.Scanner;

public class A02E04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// declaracao de variaveis
		double primeiro, soma, max, min, num; 
		int contador = 1;
		
		// leitura do primeiro valor
		System.out.print("Leitura do primeiro número: ");
		primeiro = sc.nextDouble();
		
		// inicializacao de estatisticas
		soma = primeiro; max = primeiro; min = primeiro;
		
		do { // ciclo para ler valores ate o numero introduzido ser igual ao primeiro
			
			// leitura de um novo numero
			System.out.print("Novo número: ");
			num = sc.nextDouble();
			
			// atualizar o valor das variaveis max e min conforme o numero introduzido
			if (num > max)
				max = num;
			else if ( num < min)
				min = num;
			else
				// se o numero introduzido for igual ao primeiro, o ciclo e interrompido
				break;
			
			soma += num; // soma de todos os numeros introduzidos
			contador ++; // contagem de quantos numeros foram introduzidos
			
			
		} while ( num != primeiro );
		
		// impressao de resultados
		System.out.println("Valor máximo: " + max);
		System.out.println("Valor minimo: " + min);
		System.out.println("Média: " + (soma / contador));
		System.out.println("Número de elementos lidos: " + contador);
		
		sc.close();
		
	}

}
