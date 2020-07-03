package aula06;

public class Apartamento extends Alojamento {
	private int nQuartos;

	public Apartamento(String nome, String local, double preco, boolean disponibilidade, int nQuartos) {
		super(nome, local, preco, disponibilidade);
		this.nQuartos = nQuartos;
	}

	@Override
	public String toString() {
		return "APARTAMENTO: " + super.toString() + ", Numero de quartos: " + nQuartos;
	}

	public int getnQuartos() {
		return nQuartos;
	}

	public void setnQuartos(int nQuartos) {
		this.nQuartos = nQuartos;
	}
	
	
	
	
	
	

}
