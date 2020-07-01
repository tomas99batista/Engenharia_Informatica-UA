package A01;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		double b = 20.5;
		double c;
		int d;
		c = a + b; // conversao automatica
		d = (int)(a + b); // mudança de tipo
		
		System.out.println("c = " + c);
		System.out.println(d);
		
		// divisoes
		System.out.println("d1 = " + (a / 3));
		System.out.println("d2 = " + (a / 3.0));
		System.out.println("d3 = " + (a / b));
		System.out.println("d4 = " + (a / (int)b));
	}

}
