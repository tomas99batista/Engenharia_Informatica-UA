package examePratico;

import java.util.*;

public class Cruzeiro {

	// Atributos
	private String nome;
	private List<String> cidades = new ArrayList<>();
	private String dataInicio;
	private Set<Cabine> cabines = new TreeSet<>();
	private int duracao;
	
	// Construtor
	public Cruzeiro(String nome, String[] cidades, String dataInicio) {
		this.nome = nome;
		for(String s : cidades) {
			this.cidades.add(s);
		}
		this.dataInicio = dataInicio;
	}
	
	

	@Override
	public String toString() {
		String s = "";
		s += "Navio " + this.nome + ", partida em " + this.dataInicio + "\n";
		s += "Itinerário: " + this.cidades + "\n";
		for(Cabine c : cabines) {
			s += "" + c + "\n";
		}
		return s;
	}



	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public void add(Cabine c) {
		cabines.add(c);
	}



	public Set<Cabine> getCabines() {
		return cabines;
	}

	public void setCabines(Set<Cabine> cabines) {
		this.cabines = cabines;
	}
	
	
	
	
	
}
