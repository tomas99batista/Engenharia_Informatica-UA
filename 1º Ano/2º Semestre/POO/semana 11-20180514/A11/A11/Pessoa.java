package A11;

public class Pessoa {
	private int idade;
	
	public Pessoa(int idade){
		this.idade = idade;
	}

	public Pessoa(String idade){
		this.idade = Integer.parseInt(idade);
	}

	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + "]";
	}
}
