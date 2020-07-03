package aula08;

public class Legume extends Alimento implements AlimentoVegetariano {
	
	private String nome;
	
	public Legume(double proteinas, double calorias, double peso, String nome) {
		super(proteinas, calorias, peso);
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Legume " + nome + ", " + super.toString();
	}
}
