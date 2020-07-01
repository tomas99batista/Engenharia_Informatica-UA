package a02;

import java.util.*;

public class A02E09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza um NUM: "); 
		byte b = sc.nextByte();
		String bits = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
		System.out.println("O nº " + b + " é " + bits);
		sc.close();
}}