package aula08;

public class Cereal extends Alimento implements AlimentoVegetariano {
	
	private String nome;
	
	public Cereal(double proteinas, double calorias, double peso, String nome) {
		super(proteinas, calorias, peso);
		this.nome = nome;
		
	}
	
	@Override
	public String toString() {
		return "Cereal " + nome + ", " + super.toString();
	}

}
