package A01;

public class Ex2 {

	public static void main(String[] args) {
		int x;
		double y;
		char z;
		String s;
		
		x = 10;
		y = 5.5;
		z = 'a';
		s = "ola";
		
		System.out.printf("%5s %3d %4.1f %3c\n", s, x, y, z);
		
		int k = 10;
		System.out.println(k);
		
		System.out.println(x + y);
		System.out.println("y = " + y);
		
		s = "y = " + y;
		System.out.println(s);
		
		y = x / 3;
		System.out.println("y depois da divisao " + y);
		y = x / 3.0;
		System.out.println("y depois da divisao " + y);
		x = (int)(y / 3);
		System.out.println("x depois da divisao " + x);
	}

}
