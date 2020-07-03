package aula04;

public class Retangulo {
	
	private double comprimento;
	private double largura;
	private Ponto centro;
	private String cor;
	
	public Retangulo(double comprimento, double largura, Ponto centro, String cor) {
		System.out.println("A criar um retangulo...");
		this.comprimento = comprimento;
		this.largura = largura;
		this.centro = centro;
		this.cor = cor;
	}
	
	public Retangulo(double comprimento, double largura) {
		System.out.println("A criar um retangulo...");
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public Retangulo(double comprimento, double largura, Ponto centro) {
		System.out.println("A criar retangulo...");
		this.comprimento = comprimento;
		this.largura = largura;
		this.centro = centro;
	}

	//@Override
	public String toString() {
		return "Retangulo [comprimento=" + comprimento + ", largura=" + largura + ", centro=" + centro + ", cor=" + cor + "]";
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public Ponto getCentro() {
		return centro;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	// metodo para calcular a area
	public double getArea() {
		return largura * comprimento;
	}
	
	// metodo para calcular o perimetro
	public double getPerimetro() {
		return 2 * largura + 2 * comprimento;
	}
	
	// metodo para calcular a diagonal
	public double getDiagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(comprimento, 2));
	}
	
	
	
	

}
