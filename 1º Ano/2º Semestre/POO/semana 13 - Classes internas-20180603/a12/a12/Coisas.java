package a12;

import java.io.*;

public class Coisas implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int a, b;
	private String c;

	public Coisas(int a, int b, String c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Coisas [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
