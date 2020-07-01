package atp1;

public class XPTO2 {
	public static void main(String[] args) {
		OneClass obj1 = new OneClass("poo");
		OneClass obj2 = new OneClass("prog");
		System.out.println(obj1.f(obj2));
		System.out.println(obj2.f(obj1));
		System.out.println(OneClass.g());
		System.out.println("" + obj1 + "," + obj2);
	}
}
class MyClass{
	private String x, y;
	private static int z = 10;
	public MyClass(){
		this.x = "qqcoisa";
		this.y = "qqcoisa10";
		z = z + 10;
	}
	public MyClass(String s){
		this.x = s;
		this.y = s + z;
		z = z + 10;
		System.out.println("New=" + z);
	}
	public String f(MyClass o){
		if(this.x.compareTo(o.x) < 0)
			return this.x;
		else
			return o.y;
	}
	public static int g(){
		return z;
	}
	public String toString(){
		return this.x + "-" + this.y;
	}
}
