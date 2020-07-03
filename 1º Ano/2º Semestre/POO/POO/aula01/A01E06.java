package aula01;
import java.util.Scanner;
import java.lang.Math;

public class A01E06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1, y1, x2, y2, d; // atribuicao de variaveis

		//  leitura das coordenadas do ponto (1)
	    System.out.println("Coordenadas do ponto (1): ");
	    System.out.print("Abcissa 1: ");
	    x1 = sc.nextDouble();
	    System.out.print("Ordenada 1: ");
	    y1 = sc.nextDouble();
	    
	    //  leitura das coordenadas do ponto (2)
	    System.out.println("Coordenadas do ponto (2): ");
	    System.out.print("Abcissa 2: ");
	    x2 = sc.nextDouble();
	    System.out.print("Ordenada 2: ");
	    y2 = sc.nextDouble();

	    // calculo da distancia
	    d = Math.sqrt( (x1 - x2) * (x1 - x2)  +  (y1 - y2) * (y1 - y2) );
	    
	    // impressao de resultados
	    System.out.println("A distância entre os pontos é " + d);

	    sc.close();

	}

}
