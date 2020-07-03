package aula08;

public class Carne extends Alimento {
	
	private Variedade variedade;
	
	public Carne(double proteinas, double calorias, double peso, Variedade variedade) {
		super(proteinas, calorias, peso);
		this.variedade = variedade;
	}

	@Override
	public String toString() {
		return "Carne " + variedade + ", " + super.toString();
	}
	
	
	
	

}
