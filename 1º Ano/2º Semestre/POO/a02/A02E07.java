package a02;

import java.util.Random;

public class A02E07 {

	public static void main(String[] args) {
		double[][] notas = new double[16][3]; 
		double start = 0.0, end = 20.0;
		for ( int i = 0 ; i < 16 ; i++ ) { 			
			for( int j = 0; j < 3 ; j++ ) { 				
				if (j == 2) {
					if( notas[i][j-2] < 7 || notas[i][j-1] < 7) {
						notas[i][j] = 66;
					}
					else {
					notas[i][j] = Math.round( notas[i][j-2] * 0.4 + notas[i][j-1] * 0.6 );}} 
				else {
					double random = new Random().nextDouble();
					double n = start + (random * (end - start));
					notas[i][j] = n;
}}}
		System.out.printf("%s %10s %10s\n", "NotaT", "NotaP", "Pauta");
		for (int i = 0 ; i < 16 ; i++) {
		System.out.printf("%.1f %10.1f %10.0f\n", notas[i][0], notas[i][1], notas[i][2]);
}}}
