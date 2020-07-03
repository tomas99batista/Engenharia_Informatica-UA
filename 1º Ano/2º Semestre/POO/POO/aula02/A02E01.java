package aula02;

import java.util.Scanner;
import java.lang.Math;

public class A02E01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double notaP, notaT; // declaracao de variaveis
		long notaF; // o eclipse aconselhou-me a alterar o tipo desta variavel de double para long

		do { // ciclo para validar se as notas das componentes pedidas estao entre 0 e 20

			// ler a nota da componente pratica, notaP
			System.out.print("Nota pratica: ");
			notaP = sc.nextDouble();

			// ler a nota da componente teorica, notaT
			System.out.print("Nota teorica: ");
			notaT = sc.nextDouble();

		} while ( ( notaP < 0 ) || ( notaT < 0 ) || ( notaP > 20 ) || ( notaT > 20) );

		// calculo da nota final do aluno
		if(notaP <= 7 || notaT <= 7)
			notaF = 66; // reprovado por nota minima
		else
			notaF = Math.round(0.4 * notaT + 0.6 * notaP); // nota final

		// impressao da nota final
		System.out.println("A nota final do aluno é " + notaF);

		sc.close();

	}

}
