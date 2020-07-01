package a02;

import java.util.Scanner;

public class A02E09PEDRO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String bin = "";
		System.out.println("Introduza um numero: ");
		num = sc.nextInt();
		String bin2 = (num>=0)? "0":"1";
		int c = (num>=0)? num:num*(-1)-1;
		do {
			bin += c%2;
			c = c/2;
		} while(c!=0);
		if (num <0){
			String stuff = "";
			for (int b = 0; b < bin.length(); b++)
				stuff += (bin.split("")[b].equals("0"))? "1":"0";
			bin = stuff;
		}
		for (int b = bin.length()-1; b>=0; b--){
			bin2 += bin.split("")[b];
		}
		String bin3 = "";
		for (int d = 0; d<(8-bin2.length()); d++) //Completar os 8 bits, numeros maiores requerem maior numero de bits
			bin3 += (num>=0)? "0":"1";
		bin3 += bin2;
		System.out.println(bin3);
		System.out.println(Integer.toBinaryString(num)); //Confirmaçao da string obtida com a funçao implementada pelo java
		System.out.println(bin3.equals(Integer.toBinaryString(num)));
		sc.close();
	}
}
