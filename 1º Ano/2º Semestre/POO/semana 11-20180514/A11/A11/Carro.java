package A11;

public class Carro {
	private int idade;
	private String marca;

	public Carro(int idade, String marca) {
		super();
		this.idade = idade;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Carro [idade=" + idade + " marca= " + marca + "]";
	}
	
	
}
