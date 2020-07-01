package aula01;
import java.util.Scanner;

public class A01E04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double v1, v2, vmf; // declaracao de variaveis
		
		// primeira leitura do teclado
		System.out.print("Velocidade média do primeiro percurso: ");
		v1 = sc.nextDouble();
		
		// segunda leitura do teclado
		System.out.print("Velocidade média do segundo percurso: ");
		v2 = sc.nextDouble();
		
		// formula de calculo
		vmf = ( 2 * v1 * v2 ) / ( v1 + v2 );
		
		// impressao do resultado com duas casas decimais
		System.out.printf("A velocidade média final é de %.2f", vmf);
		
		
		sc.close();
	}

}
