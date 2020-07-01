package atp1;

public class XPTO2b {
	public static void main(String[] args) {
		OneClass obj1 = new OneClass("ola");
		OneClass obj2 = new OneClass("aveiro");
		System.out.println(obj1.f(obj2));
		System.out.println(obj2.f(obj1));
		System.out.println(OneClass.g());
		System.out.println("" + obj1 + "," + obj2);
	}
}
class OneClass{
	private String x, y;
	private static int z = 10;
	public OneClass(){
		this.x = "poo";
		this.y = "prog";
		z = z + 10;
	}
	public OneClass(String s){
		this.x = s;
		this.y = s + z;
		z = z + 10;
		System.out.println("myclass=" + z);
	}
	public String f(OneClass o){
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
