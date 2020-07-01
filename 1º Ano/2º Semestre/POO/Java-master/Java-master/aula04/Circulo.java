package aula04;
import java.lang.Math;

public class Circulo {
	
	private Ponto centro;
	private double raio;
	private String cor;
	
	public Circulo(Ponto centro, double raio, String cor) {
		
		System.out.println("A criar um circulo");
		this.centro = centro;
		this.raio = raio;
		this.cor = cor;
		
	}
	
	//@Override
	public String toString() {
		return "Circulo [centro = " + centro + ", raio = " + raio + ", cor = " + cor + "]\n";
	}

	public Circulo(double x, double y, double raio, String cor) {
		
		this.centro = new Ponto(x,y);
		this.raio = raio;
		this.cor = cor;
		
	}

	public Ponto getCentro() {
		return centro;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	// metodo para calcular a area
	public double getArea() {
		double area = Math.PI * raio * raio;
		return area;
	}
	
	// metodo para calcular o perimetro
	public double getPerimetro() {
		return 2 * Math.PI * raio;
	}
	
	public boolean intersectCircles(Circulo c) {
		if (this.centro.pointsDistance(c.centro) <= this.raio + c.raio) {
			return true;
		} else {
			return false;
		}
	}
	
}
