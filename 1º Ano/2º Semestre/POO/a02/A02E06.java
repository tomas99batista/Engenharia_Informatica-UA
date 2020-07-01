package a02;
import java.util.Random;
import java.util.Scanner;

public class A02E06 {
	public static void main(String[] args) {
	Random r = new Random();
	
	int numero, tentativas;
	Scanner sc = new Scanner(System.in);
	String resposta;
	do{
		int randomInt = r.nextInt(100) + 1;
		//System.out.println(randomInt); ajuda no development
		tentativas = 0;
			do{	System.out.print("Tentativa: ");
				numero = sc.nextInt();
				tentativas ++;
				if(numero < randomInt) {
				System.out.print("Número muito baixo, ");}
				else if(numero > randomInt) {
				System.out.print("Número muito alto, ");}
			}while(numero!=randomInt);
			System.out.println("Parabéns, adivinhaste com " + tentativas + " tentativas! ");
			
			do {
				System.out.print("Jogar? ");
				resposta = sc.next();
			} while( !(resposta.equals("sim")) && !(resposta.equals("nao")) );
			
	}while(resposta.equals("sim"));		
			
			
		
	System.out.print("fim!");
	sc.close();
}
}
