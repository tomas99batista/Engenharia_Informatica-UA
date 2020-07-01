package aula11;

public class Provincia extends Regiao {

	private String governador;
	
	public Provincia(String nome, int populacao, String governador) {
		super(nome, populacao);
		this.governador = governador;
	}

	@Override
	public String toString() {
		return "Provincia [governador=" + governador + "]";
	}
	
	

}
