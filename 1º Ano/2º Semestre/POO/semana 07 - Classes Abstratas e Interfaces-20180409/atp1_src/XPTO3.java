package atp1;

public class XPTO3 {
	public static void main(String[] args) {
		MyClass1 obj1 = new MyClass1(25.30);
		System.out.printf("%.1f\n", obj1.getS());
		MyClass1 obj2 = new MyClass2(10.0, 5);
		System.out.printf("%.1f\n", obj2.getS());
		MyClass2 obj3 = new MyClass2();
		System.out.printf("%.1f\n", obj3.getX());
		System.out.printf("%.1f\n", obj3.getS());
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
class MyClass1{
	private double s;
	public MyClass1(double s){
		this.s = s;
	}
	public double getS(){
		return this.s;
	}
	public String toString(){
		return "MyClass1:" + (int)Math.round(this.s);
	}
}
class MyClass2 extends MyClass1{
	private int x;
	public MyClass2(double s, int x){
		super(s);
		this.x = x;
	}
	public MyClass2(){
		super(5.1);
		this.x = 5;
	}
	public double getX(){
		return this.x;
	}
	public String toString(){
		return "MyClass2:" + super.getS() + "," + this.x;
	}
}
