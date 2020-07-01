package aula09;

public class Brinquedo implements Comparable<Brinquedo> {
	
	private String nome;
	
	public Brinquedo(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Brinquedo [nome=" + nome + "]";
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int compareTo(Brinquedo o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
