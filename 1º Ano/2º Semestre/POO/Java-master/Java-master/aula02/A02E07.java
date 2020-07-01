package aula02;

import java.util.Random;

public class A02E07 {

	public static void main(String[] args) {
		
		// criar um vetor bidimensional
		double[][] notas = new double[16][3]; // 16 alunos com 3 componentes cada
		
		// inicializacao de variaveis
		double start = 0.0, end = 20.0;
		
		// ciclos for para preencher o vetor notas
		for ( int i = 0 ; i < 16 ; i++ ) { // ciclo para cada aluno
			
			for( int j = 0; j < 3 ; j++ ) { // ciclo para cada componente
				
				if (j == 2) {
					
					if( notas[i][j-2] < 7 || notas[i][j-1] < 7) {
						
						notas[i][j] = 66; // reprovado por nota minima
						
					} else {
						
						// nota final
						notas[i][j] = Math.round( notas[i][j-2] * 0.4 + notas[i][j-1] * 0.6 );
						
					}
				} else {
					
					// novo numero aleatorio entre 0 e 1
					double random = new Random().nextDouble();
					
					// novo numero aleatorio entre 0.0 e 20.0
					double n = start + (random * (end - start));
					
					// preenchimento do array
					notas[i][j] = n;
					
				}
				
			}
			
		}
		
		// impressao do array 'notas'
		System.out.printf("%s %10s %10s\n", "NotaT", "NotaP", "Pauta");
		
		for (int i = 0 ; i < 16 ; i++) {
			
			// cada linha corresponde a um aluno
			System.out.printf("%.1f %10.1f %10.0f\n", notas[i][0], notas[i][1], notas[i][2]);
			
		}
		
	}

}
