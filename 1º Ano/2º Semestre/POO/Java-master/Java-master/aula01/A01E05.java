package aula01;
import java.util.Scanner;


public class A01E05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int seg, min, hr; // atribuicao de variaveis
		
		// leitura do tempo em segundos
		System.out.print("Insira um tempo em segundos: ");
		seg = sc.nextInt();
		
		// calculo do numero de horas
		hr = (int)(seg / 3600); 
	    seg = seg - hr * 3600; // tempo que sobra em segundos
	    
	    // calculo do numero de minutos
	    min = (int)(seg / 60);
	    seg = seg - min * 60; // numero de segundos
	    
	    // impressao de resultados
	    System.out.printf("%02d:%02d:%02d\n", hr,min,seg);
	    
	    sc.close();

	}

}
