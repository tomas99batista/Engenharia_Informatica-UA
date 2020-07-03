package aula11;

import java.util.*;

public class Pais {
	
	private String nome;
	private Localidade capital;
	private Set<Regiao> regioes = new HashSet<>();
	
	public Pais(String nome, Localidade capital) {
		this.nome = nome;
		this.capital = capital;
	}
	
	public Pais(String nome) {
		this.nome = nome;
	}

	public void addRegiao(Regiao r) {
		regioes.add(r);
		
	}
	
	public int getPopulacao() {
		int populacaoTotal = 0;
		for(Regiao r : regioes) {
			populacaoTotal += r.getPopulacao();
		}
		
		return populacaoTotal;
	}

	@Override
	public String toString() {
		
		if(this.capital == null) {
			return "Pais: " + nome + ", Populacao: " + this.getPopulacao() + " (Capital *Indefinida*)";
		} else {
			return "Pais: " + nome + ", Populacao: " + this.getPopulacao() + " (" + this.capital + ")";

		}
	}
	
	public void removeRegiao(Regiao r) {
		if(regioes.contains(r)) {
			regioes.remove(r);
		} else {
			System.out.println("\nEssa regiao nao faz parte do pais!");
		}
	}
	
	
	
}
