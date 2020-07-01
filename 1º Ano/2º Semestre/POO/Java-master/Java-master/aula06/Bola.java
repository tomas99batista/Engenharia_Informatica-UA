package aula06;

public class Bola extends Objetomovel {
	
	private String cor = "UNKNOWN";

	public Bola(int x, int y, double velMax, String cor) {
		super(x, y, velMax);
		switch (cor.toUpperCase()) {
		case "AMARELA":
			this.cor = cor;
			break;
		case "AZUL":
			this.cor = cor;
			break;
		case "LARANJA":
			this.cor = cor;
			break;
		case "VERMELHA":
			this.cor = cor;
			break;
		default:
			this.cor = "UNKNOWN";
		}
	}

	@Override
	public String toString() {
		return super.toString() + " , cor: " + cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	

}
