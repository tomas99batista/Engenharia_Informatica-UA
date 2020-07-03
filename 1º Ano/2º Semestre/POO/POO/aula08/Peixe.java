package aula08;

public class Peixe extends Alimento {

	private Tipo tipo;
	
	public Peixe(double proteinas, double calorias, double peso, Tipo tipo) {
		super(proteinas, calorias, peso);
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Peixe " + tipo + ", " + super.toString();
	}

}
