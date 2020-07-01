package aula01;
import java.util.Scanner;
import java.lang.Math;

public class A01E07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// atribuicao de variaveis
	    double a, b, c, g;
	    
	    // leitura do cateto A
	    System.out.print("Cateto A: ");
	    a = sc.nextInt();
	    
	    // leitura do cateto B
	    System.out.print("Cateto B: ");
	    b = sc.nextInt();
	    
	    // calculo da hipotenusa C
	    c = Math.sqrt( a * a + b * b );
	    
	    // calculo do angulo (em graus) de A com C
	    g = Math.toDegrees(Math.atan( b / a)); // usei a funcao arco-tangente
	    
	    // impressao de resultados
	    System.out.println("Hipotenusa: " + c);
	    System.out.println("Ângulo (em graus) do cateto A com a hipotenusa C: " + g);
	    
	    
	    sc.close();

	}

}
