package aula04;
import java.lang.Math;


public class Ponto {
	
	private double x;
	private double y;
	
	public Ponto (double x, double y) {
		
		System.out.println("A criar um ponto");
		this.x = x;
		this.y = y;
		
	}

	//@Override
	public String toString() {
		return "Ponto (x= " + x + ", y= " + y + ")\n";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double pointsDistance(Ponto p) {
		// este metodo calcula a distancia entre dois pontos utilizando o Teorema de Pitagoras
		return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
	}
	
	
}
