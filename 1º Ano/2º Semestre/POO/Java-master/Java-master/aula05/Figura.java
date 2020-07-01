package aula05;

public class Figura {
	private Ponto centro;
	private String cor;
	
	public Figura(double x, double y, String cor) {
		this.centro = new Ponto(x, y);
		this.cor = cor;
	}
	
	public Figura(Ponto p, String cor) {
		this.centro = p;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Centro: " + centro + ", Cor: " + cor;
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
	
	
	
	

}
