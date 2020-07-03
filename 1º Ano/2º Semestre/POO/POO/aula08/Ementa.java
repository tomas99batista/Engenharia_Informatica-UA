package aula08;

public class Ementa extends Conjunto<Prato> {
	
	private String nome;
	private String local;
	
	public Ementa(String nome, String local) {
		this.nome = nome;
		this.local = local;
	}

	@Override
	public String toString() {
		return "Ementa (Nome: " + nome + ", Local: " + local + ")";
	}
	
}
