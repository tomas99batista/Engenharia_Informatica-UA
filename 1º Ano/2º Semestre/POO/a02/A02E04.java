package a02;

import java.util.Scanner;

public class A02E04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double media, inicial, pedido, max, min, count, total;
		System.out.print("Insira o primeiro número: ");
		inicial = sc.nextDouble();
		max = inicial;
		min = inicial;
		count = 1;
		total = inicial;
		do {
			System.out.print("Digite mais: ");
			pedido = sc.nextDouble();
			count += 1;
	
			total += pedido;
			
			if(pedido > max) {
			max = pedido;
			}
			else if(pedido < min) {
			min = pedido;
			};
			}while(pedido != inicial);
			media = total/count;
	System.out.print("Máximo: " + max + "; Mínimo: " + min + "; Média: " + media + "; Nº elementos lidos: " + count);
	sc.close();
	}
}
