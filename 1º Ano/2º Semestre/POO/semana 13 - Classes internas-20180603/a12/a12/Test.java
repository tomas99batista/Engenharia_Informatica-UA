package a12;

public class Test {

	public static void main(String[] args) {
		A a = new A(10, 20);
		System.out.println(a);
		
		A.B b = new A.B(1, 1);
		System.out.println(b);
		
		A.C c = a.new C();
		System.out.println(c);
		
		a.f();	
	}
}
