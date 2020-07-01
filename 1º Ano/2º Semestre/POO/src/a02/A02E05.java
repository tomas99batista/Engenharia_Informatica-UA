package a02;

import java.util.Scanner;

public class A02E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes, ano;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o mês: ");
		mes = sc.nextInt();
		if(mes <= 0 || mes > 12) {
			System.out.print("Mês não válido, tente again: ");
			mes = sc.nextInt();
		}
		System.out.print("Insira o ano: ");
		ano = sc.nextInt();
		if(ano <= 0) {
			System.out.print("Ano não válido, try again: ");
		}
		sc.close();
		
		if(ano % 4 == 0 && ano % 100 != 0) {
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				System.out.print("O mês tem 31 dias e o ano é bissexto");
			}
			
			else if(mes== 2) {
				System.out.print("O mês tem 29 dias e o ano é bissexto");
			}
			
			else {
				System.out.print("O mês tem 30 dias e o ano é bissexto");
			}
		}
		
		else if(ano % 400 == 0) {
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				System.out.print("O mês tem 31 dias e o ano é bissexto");
			}
			
			else if(mes== 2) {
				System.out.print("O mês tem 29 dias e o ano é bissexto");
			}
			
			else {
				System.out.print("O mês tem 30 dias e o ano é bissexto");
			}
		}
		
		else {
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				System.out.print("O mês tem 31 dias e o ano não é bissexto");
			}
			
			else if(mes== 2) {
				System.out.print("O mês tem 28 dias e o ano não é bissexto");
			}
			
			else {
				System.out.print("O mês tem 30 dias e o ano não é bissexto");
			}
			
		}
	}

}
