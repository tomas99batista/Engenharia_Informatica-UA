package a02;

import java.util.Scanner;

public class A02E01 {
	public static void main(String[] args) {
	double notaP, notaT, notaF;
	Scanner sc = new Scanner(System.in);
	System.out.print("Insira a nota da componente teórica: ");
	notaT = sc.nextDouble();
	System.out.print("Insira a nota da componente prática: ");
	notaP = sc.nextDouble();
	if((notaP <= 7.0) || (notaT <= 7.0)) {
		System.out.print("66");
	}
	else{
		notaF = 0.4 * notaT + 0.6 * notaP;
		System.out.print("Nota Final: " + notaF);
	}
	sc.close();
}
}
