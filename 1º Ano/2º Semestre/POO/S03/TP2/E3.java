package A03;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		String s1, s2;
		
		System.out.print("texto1?");
		s1 = kb.nextLine();
		System.out.print("texto1?");
		s2 = kb.nextLine();
		
		if(s1.equalsIgnoreCase(s2)){ // equals()
			System.out.println("Iguais");
		}
		else{
			System.out.println("Diferentes");
		}
		
		if(s1.compareTo(s2) > 0){
			System.out.println(s1 + " e maior do que " + s2);
		}
		else if(s1.compareTo(s2) < 0){
			System.out.println(s1 + " e menor do que " + s2);
		}
		else{
			System.out.println(s1 + " e igual a " + s2);
		}
	}

}
