package atp1;

public class XPTO3b {
	public static void main(String[] args) {
		MyClass1b obj1 = new MyClass1b(25.30);
		System.out.printf("%.1f\n", obj1.getS());
		MyClass1b obj2 = new MyClass2b(10.0, 5);
		System.out.printf("%.1f\n", obj2.getS());
		MyClass2b obj3 = new MyClass2b();
		System.out.printf("%.1f\n", obj3.getX());
		System.out.printf("%.1f\n", obj3.getS());
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
class MyClass1b{
	private double s;
	public MyClass1b(double s){
		this.s = s;
	}
	public double getS(){
		return this.s;
	}
	public String toString(){
		return "MyClass1:" + (int)Math.round(this.s);
	}
}
class MyClass2b extends MyClass1b{
	private int x;
	public MyClass2b(double s, int x){
		super(s);
		this.x = x;
	}
	public MyClass2b(){
		super(5.1);
		this.x = 5;
	}
	public double getX(){
		return this.x;
	}
	public String toString(){
		return "MyClass2b:" + super.getS() + "," + this.x;
	}
}
