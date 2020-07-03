package aula02;

import java.util.*;

public class A02E09 {

	public static void main(String[] args) {

		/* RESOLVI ESTE EXERCICIO DA MESMA MANEIRA DO EXERCICIO 8 */
		/*NAO CONSEGUI FAZER PARA NUMEROS REAIS*/

		Scanner sc = new Scanner(System.in);

		// começamos por introduzir um valor inteiro do tipo byte, entre -128 e 127
		System.out.print("Introduza um valor ( [-128,127] ): ");
		byte b = sc.nextByte();
		/* nota: poderia fazer um ciclo do...while(); para validar se o utilizador introduzia
		   um numero entre -128 e 127, mas para isso a variavel b teria de ser do tipo 'int',
		   e no enunciado pede-se a introducao de um valor do tipo 'byte'.
		   Se o utilizador digitar um numero fora deste intervalo, ira aparecer uma excecao.
		 */

		String bits = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
		/* a operação "b & 0xFF" faz o seguinte: pega nos 8 bits da representação de b em byte,
		   e passa-os para a função .toBinaryString(), representando-os como um inteiro.
		   Como esta função recebe uma representação em 8 bits,
		   se introduzirmos um valor que seja representado, por exemplo, apenas com 4 bits,
		   os 4 bits restantes seriam impressos como espaços em branco.
		   Para prevenir isso, fazemos o .replace(' ', '0'), para substituir bits 'vazios' por 0. */

		// impressao de resultados em complemento para 2
		System.out.println("O número " + b + " em binário com 8 bits é " + bits);

		sc.close();

	}

}
