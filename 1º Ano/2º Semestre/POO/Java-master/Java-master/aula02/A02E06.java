package aula02;

import java.util.Random;
import java.util.Scanner;

public class A02E06 {

	public static void main(String[] args) {
		
		// utilização da classe Random para gerar um numero aleatorio
		Random rand  = new Random(); 
		
		Scanner sc = new Scanner(System.in);
		
		// atribuicao de variaveis
		int n,tentativa, contador;
		String resposta;
		
		do { // inicio de um novo jogo
			
			// inicializacao de variáveis
			n = rand.nextInt(100) + 1; // 100 é o máximo e 1 é o mínimo
			contador = 0; 
			
			do { // ciclo até o utilizador acertar no número aleatório
				
				// tentativa do utilizador
				System.out.print("Tentativa: ");
				tentativa = sc.nextInt();
				contador++;
				
				// classificacao da tentativa
				if ( ( tentativa < n ) ) {
					System.out.println("Tentativa baixa: ");
				} else if ( ( tentativa > n ) ) {
					System.out.println("Tentativa alta");
				}
				
			} while ( tentativa != n );
			
			// impressao de uma mensagem de parabens 
			System.out.println("Acertou, parabéns! O número é " + n + " e precisou de " + contador + " tentativas.");
			
			
			
			do {
				
				// este ciclo só termina se o utilizador digitar ou "sim" ou "não"
				// pedido para jogar outra vez
				System.out.print("Novo jogo? (sim/não): ");
				resposta = sc.next();
				
			} while( !(resposta.equals("sim")) && !(resposta.equals("não")) );
			
		} while ( resposta.equals("sim") );
		
		// fim do programa
		System.out.println("Obrigado por jogar!");
		
		sc.close();
	}

}
