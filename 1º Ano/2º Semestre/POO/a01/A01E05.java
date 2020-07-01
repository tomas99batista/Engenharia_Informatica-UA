package a01;

import java.util.Scanner;
public class A01E05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double horas, minutos, segundosin, segundos;
		System.out.print("Insira os segundos: ");
		segundosin = sc.nextDouble();
		horas = (int) (segundosin / 3600);
		minutos = (segundosin % 3600) / 60;
		segundos = (minutos % (int)(minutos)) * 60;
		minutos = (int) minutos;
		System.out.println(horas + "h : " + minutos + "m : " + segundos +"s");
		sc.close();
		}
}
