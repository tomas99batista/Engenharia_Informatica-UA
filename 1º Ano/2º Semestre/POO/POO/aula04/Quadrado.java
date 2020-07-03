package aula04;
import java.lang.Math;

public class Quadrado {
	
	private Ponto centro;
	private double lado;
	private String cor;
	
	public Quadrado(Ponto centro, double lado, String cor) {
		
		System.out.println("A criar um quadrado");
		this.centro = centro;
		this.lado = lado;
		this.cor = cor;
		
	}
	
	public Quadrado(double lado) { 
		
		System.out.println("A criar um quadrado");
		this.lado = lado; 
		
	}
	
	public Quadrado(double x, double y, double lado) { 
		
		System.out.println("A criar um quadrado");
		this.centro = new Ponto(x,y); 
		this.lado = lado; 
		
	}

	//@Override
	public String toString() {
		return "Quadrado [centro = " + centro + ", lado = " + lado + ", cor = " + cor + "]";
	}

	public Ponto getCentro() {
		return centro;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	// metodo para calcular a area de um quadrado
	public double getArea() {
		return Math.pow(lado, 2);
	}
	
	// metodo para calcular o perimetro de um quadrado
	public double getPerimetro() {
		return lado * 4;
	}
	
	// metodo para calcular a diagonal
	public double getDiagonal() {
		return Math.sqrt(Math.pow(lado, 2) * 2);
	}
}
