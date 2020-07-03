package aula09;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Pessoa p) {
		return this.nome.compareTo(p.nome);
	}

}
