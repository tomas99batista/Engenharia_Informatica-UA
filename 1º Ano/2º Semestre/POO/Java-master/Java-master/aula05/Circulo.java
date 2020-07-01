package aula05;

public class Circulo extends Figura {
	
	private double raio = 1.0;

	public Circulo(double x, double y, String cor, double raio) {
		super(x, y, cor);
		this.raio = raio;
	}

	public Circulo(Ponto p, String cor, double raio) {
		super(p, cor);
		this.raio = raio;
	}

	@Override
	public String toString() {
		return super.toString() + ", Raio: " + raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		return Math.PI * raio * raio;
	}
	
	public double perimetro() {
		return 2 * Math.PI * raio; 
	}
	
	public boolean intersectsWith(Circulo c) {
		if(this.getCentro().distance(c.getCentro()) <= this.raio + c.raio){
			return true;
		} else {
			return false;
		}
	}
	
	
	

}
