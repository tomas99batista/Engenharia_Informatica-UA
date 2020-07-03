package aula10;

public class Companhia implements Comparable<Companhia> {
	
	// Atributos
	private String sigla;
	private String nome;
	
	// Construtor
	public Companhia(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	
	// Metodo toString
	@Override
	public String toString() {
		return sigla + " - " + nome;
	}

	// Getters and Setters
	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Companhia o) {
		return sigla.compareTo(o.getSigla());
	}
	
	
	
	
}
