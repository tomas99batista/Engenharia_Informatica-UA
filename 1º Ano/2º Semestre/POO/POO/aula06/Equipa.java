package aula06;

import java.util.Arrays;

public class Equipa {
	
	private String nome;
	private String responsavel;
	private int nGolosM;
	private int nGolosS;
	private Robo[] jogadores = new Robo[5];
	private int contador = 0;
	
	public Equipa(String nome, String responsavel) {
		this.nome = nome;
		this.responsavel = responsavel;
	}
	
	@Override
	public String toString() {
		return "Equipa(" + " Nome: " + nome + ", Responsavel: " + responsavel + ", nGolosM: " + nGolosM + ", nGolosS: " + nGolosS
				+ ", jogadores: " + Arrays.toString(jogadores) + ")";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public int getnGolosM() {
		int ngolos = 0;
		for(Robo r : jogadores) {
			ngolos += r.getnGolos();
		}
		this.nGolosM = ngolos;
		return this.nGolosM;
	}

	public int getnGolosS() {
		return nGolosS;
	}

	public Robo[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Robo[] jogadores) {
		this.jogadores = jogadores;
	}
	
	public void sofrerGolo() {
		this.nGolosS += 1;
	}
	
	public void addRobo(int x, int y, double velMax, String tipo) {
		if(jogadores.length <= 5) {
			jogadores[contador] = new Robo(x, y, velMax, tipo);
			contador++;
		} else {
			System.out.println("Equipa cheia!");
		}
		
	}
	
}
