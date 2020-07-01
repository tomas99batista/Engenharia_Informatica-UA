package a12;

public class A {

	static class B{
		private int a, b;
		public B(int a, int b){
			this.a = a;
			this.b = b;
		}
		public String toString(){
			return "static " + a + ", " + b;
		}
	}

	class C{
		private int xx, yy;
		public C(){
			this.xx = x;
			this.yy = y;
		}

		public String toString(){
			return "interna " + xx + ", " + yy;
		}
	}

	private int x, y;
	private B b;

	public A(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		b = new B(0, 0);
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + ", b=" + b + "]";
	}

	public void f(){
		class D{
			public int ff(){
				return 10;
			}
		}

		D d = new D();

		System.out.println("f() new D() " + d.ff());
	}

}
