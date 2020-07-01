package aula11;

public class Estado extends Regiao {
	
	private Localidade localidade;
	
	public Estado(String nome, int populacao, Localidade localidade) {
		super(nome, populacao);
		this.localidade = localidade;
		
	}

	public Localidade getCapital() {
		return this.localidade;
	}

	@Override
	public String toString() {
		return "Estado [localidade=" + localidade + "]";
	}
	
	

}
