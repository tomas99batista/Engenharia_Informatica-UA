package aula02;
import java.util.Scanner;

public class A02E05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// declaracao de variaveis
		int mes, ano; 
		boolean bissexto = false;
		
		// leitura do mes e consequente validacao
		do {
			
			System.out.print("Escreva o numero do mes (1 a 12): ");
			mes = sc.nextInt();
			
		} while( mes <= 0 || mes > 12);
		
		// leitura do ano e consequente validacao
		do {
			
			System.out.print("Escreva o numero do ano (max 4 digitos): ");
			// coloquei a restricao de 4 digitos para nao ser um numero muito grande
			ano = sc.nextInt();
			
		} while( ano < 0 || ano > 9999);
		
		// averiguar o tipo do ano (comum ou bissexto)
		if( ano % 4 == 0 ) {
			if ( ano % 100 == 0 ) {
				if ( ano % 400 == 0)
					bissexto = true;
			} else {
				bissexto = true;
			}
			
		}
			
		
		// impressao do numero de dias do mes
		if ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 )
			System.out.println("O mês tem 31 dias.");
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			System.out.println("O mês tem 30 dias.");
		else // se o mes for fevereiro
			if ( bissexto )
				System.out.println("O mês tem 29 dias.");
			else
				System.out.println("O mês tem 28 dias.");
		
		sc.close();
	}

}
