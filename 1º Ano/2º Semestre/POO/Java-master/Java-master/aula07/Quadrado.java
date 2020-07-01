package aula07;

public class Quadrado extends Retangulo {

	public Quadrado(double x, double y, String cor, double l) {
		super(x, y, cor, l, l);
	}

	public Quadrado(Ponto p, String cor, double l) {
		super(p, cor, l, l);
	}
	
	public Quadrado(double l) {
		super(l,l);
	}
	
	public Quadrado(double x, double y, double l) {
		super(x,y,l,l);
	}
	
	@Override
	public String toString() {
		return "Quadrado e " +  super.toString();
	}

}
