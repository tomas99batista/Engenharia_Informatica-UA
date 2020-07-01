package aula03;

import java.util.*;

public class A03E03 {

	public static void main(String[] args) {
		
		// variavel de controlo
		int controlo = 0; // utilizei esta variavel para retornar os valores lidos na funcao "readValues" um a um
		
		// leitura do mes
		int mes = readValues(controlo);
		controlo = 1;
		
		// leitura do ano
		int ano = readValues(controlo);
		controlo = 2;
		
		// leitura do dia da semana em que comeca o mes
		int diaSem = readValues(controlo);
		
		// calculo do numero de dias do mes
		int diasMes = monthDays(mes, ano);
		
		// impressao do calendario
		printResults(diaSem, diasMes);
	
	}
	
	public static int readValues(int controlo) {
		
		Scanner sc = new Scanner(System.in);
		
		if (controlo == 0) {
			
			int mes;
			
			do { // ciclo para averiguar se o utilizador introduz um mes valido
				
				System.out.print("Por favor, insira o numero do mes [1-12]: ");
				mes = sc.nextInt();
				
			} while ( mes <= 0 || mes > 12);

			return mes;
			
		} else if (controlo == 1) {
			 
			int ano;
			
			do { // ciclo para averiguar se o utilizador introduz um ano valido
				
				// estabeleci o maximo do ano para 9999 para nao ultrapassar os 4 digitos
				System.out.print("Por favor, insira o numero do ano [max: 9999]: ");
				ano = sc.nextInt();
				
			} while ( ano < 0 || ano > 9999);
			
			return ano;
			
		} else {
			
			int diaSem;
			
			System.out.println("1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo");
			
			do { // ciclo para averiguar se o utilizador introduz um dia de semana valido
				
				System.out.print("Por favor, insira o numero do dia da semana: ");
				diaSem = sc.nextInt();
				
			} while ( diaSem < 1 || diaSem > 7);
			
			
			return diaSem;
			
		}
				
		
	}
	
	public static int monthDays(int mes, int ano) {
		
		// para fazer esta funcao, aproveitei o codigo ja desenvolvido no exercicio 5 da aula pratica 2
		
		boolean bissexto = false;
		
		// averiguar o tipo do ano (comum ou bissexto)
		if( ano % 4 == 0 )
			if ( ano % 100 == 0 ) {
				if ( ano % 400 == 0)
					bissexto = true;
			} else {
				bissexto = true;	
			}
					
		// retorno do numero de dias do mes
		if ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 )
			return 31;
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return 30;
		else // se o mes for fevereiro
			if ( bissexto )
				return 29;
			else
				return 28;

	}
	
	public static void printResults(int diaSem, int diasMes) {
		
		// impressao do cabecalho
		System.out.println("-----------------------");
		System.out.printf("|%3s%3s%3s%3s%3s%3s%3s|\n", "Mo", "Tu", "We", "Th", "Fr", "Sa", "Su");
		System.out.println("-----------------------");
		
		int dias, controlo = 0;
		
		// preenchimento da primeira fila
		
		System.out.print("|");
		
		for ( int i = 1 ; i <= diaSem ; i++) {
			if ( i == diaSem) {
				controlo = i;
				break;
			} else {
				System.out.printf("   ");
			}
		}
		
		controlo = 7 - controlo + 1;
		
		for ( int j = 1 ; j <= controlo ; j++) { // este ciclo preenche os dias da primeira semana
			System.out.printf("%3d", j);
		}
		
		System.out.print("|\n");
		
		
		// preenchimento do resto do calendario
		dias = controlo + 1;
		
		do { // ciclo para preencher o calendario ate chegar ao numero de dias desse mes
			
			System.out.print("|");
			
			for(int i = 1 ; i <= 7 ; i++) { // ciclo para preencher cada semana
				
				if (dias <= diasMes) {
					System.out.printf("%3d", dias);
					dias++;
				} else if ( dias > diasMes) {
					for ( int c = 0 ; c <= 7 - i ; c++) { // ciclo para alinhar a ultima barra vertical 
						System.out.printf("   ");
					}
					break;
					
				}
				
			}
			
			System.out.print("|\n");
			
			
			
		} while( dias <= diasMes );
		
		System.out.println("-----------------------");
		
		
	}

}
