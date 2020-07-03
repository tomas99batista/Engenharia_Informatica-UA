package aula06;

public class QuartoHotel extends Alojamento {
	private String tipo = "single";

	public QuartoHotel(String nome, String local, double preco, boolean disponibilidade, String tipo) {
		super(nome, local, preco, disponibilidade);
		if(tipo.toLowerCase().equals("single") || tipo.toLowerCase().equals("double") || tipo.toLowerCase().equals("twin")) {
			this.tipo = tipo;
		}
	}

	@Override
	public String toString() {
		return "QUARTO DE HOTEL: " + super.toString() + ", Tipo: " + tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
