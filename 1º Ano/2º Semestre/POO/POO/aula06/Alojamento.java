package aula06;

import java.util.Random;

public class Alojamento {
	
	Random rand = new Random();
	
	private static int contador = 0;
	private int id = 0;
	private String nome;
	private String local;
	private double preco;
	private boolean disponibilidade = true;
	private double avaliacao = 1.0;
	
	public Alojamento(String nome, String local, double preco, boolean disponibilidade) {
		id = contador;
		contador++;
		this.nome = nome;
		this.local = local;
		this.preco = preco;
		this.disponibilidade = disponibilidade;
		
		double start = 1.0, end = 5.0;
		
		// novo numero aleatorio entre 0 e 1
		double random = new Random().nextDouble();
		
		// novo numero aleatorio entre 1.0 e 5.0
		double n = start + (random * (end - start));
		
		this.avaliacao = n;
	}

	@Override
	public String toString() {
		return "Alojamento " + id + " - Nome: " + nome + ", Local:" + local + ", Preco: " + preco
				+ ", Disponibilidade: " + disponibilidade + ", Avaliacao: " + avaliacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public void checkin() {
		this.disponibilidade = false;
	}
	public void checkout() {
		this.disponibilidade = true;
	}
	
}
