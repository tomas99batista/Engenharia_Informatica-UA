package exa03;

public class E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ola";
		String s2 = new String("ola");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);
		System.out.println(s1 + s2 + 12345 + 22.5); // conversao automatica de tipos
		
		String s3 = "POO, e    muito;;;;; facil;123!";
		int l = 0;
		for(int i = 0 ; i < s3.length() ; i++){
			char c = s3.charAt(i);
			System.out.println(i + " -> " + c);
			if(Character.isLetter(c)){
				l++;
			}
		}
		
		System.out.println("letras = " + l);
		
		String palavras[] = s3.split("[ ,!?.;]");
		for(String s : palavras){
			System.out.println(s);
		}
	
		String s4 = "01-01-2000";
		String palavras2[] = s4.split("-");
		for(String s : palavras2){
			System.out.println("data " + s);
		}
		
	}

}
