package aula05;

public class Quadrado extends Retangulo {

	public Quadrado(double x, double y, String cor, double l) {
		super(x, y, cor, l, l);
	}

	public Quadrado(Ponto p, String cor, double l) {
		super(p, cor, l, l);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
