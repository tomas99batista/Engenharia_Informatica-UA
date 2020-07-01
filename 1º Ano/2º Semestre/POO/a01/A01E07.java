package a01;

import java.util.Scanner;
import java.lang.Math;

public class A01E07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double catetoa, catetob, hipotenusa, angulo;
		System.out.print("Insira o valor do cateto A aqui: ");
		catetoa = sc.nextDouble();
		
		System.out.print("Insira o valor do cateto B aqui: ");
		catetob = sc.nextDouble();
		hipotenusa = Math.sqrt((catetoa * catetoa) + (catetob * catetob));
		//Math.pow(x,2)
		angulo = Math.asin(catetob / hipotenusa);
		angulo = (angulo * 180) / Math.PI;
		System.out.print("Hipotenusa: " + hipotenusa + "  O angulo formado é: " + angulo);
		sc.close();
		}
}
