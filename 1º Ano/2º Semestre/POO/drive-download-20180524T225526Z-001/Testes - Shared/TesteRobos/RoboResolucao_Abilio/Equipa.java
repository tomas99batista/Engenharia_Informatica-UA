package teste_deste_ano;

import java.util.ArrayList;
import java.util.List;

public class Equipa implements Comparable<Object> {
	
	private String NomeEquipa, NomeResponsável;
	private int GolosMarcados=0, GolosSofridos=0;
	List<Robo> robos = new ArrayList<Robo>();

	public Equipa(String NomeEquipa, String NomeResponsável) {
		this.NomeEquipa=NomeEquipa;
		this.NomeResponsável=NomeResponsável;
	}
	
	public void add(Robo d){
		if(!(robos.contains(d))){
			robos.add(d);
		}
	}
	
	public void remove(Robo d){
		robos.remove(d);
	}

	public String getNomeEquipa() {
		return NomeEquipa;
	}

	public void setNomeEquipa(String nomeEquipa) {
		NomeEquipa = nomeEquipa;
	}

	public String getNomeResponsável() {
		return NomeResponsável;
	}

	public void setNomeResponsável(String nomeResponsável) {
		NomeResponsável = nomeResponsável;
	}

	public int getGolosMarcados() {
		int s=0;
		for(int u=0; u<robos.size(); u++){
			s+=robos.get(u).getGolos();
		}
		return s;
	}

	public void setGolosMarcados(int golosMarcados) {
		GolosMarcados = golosMarcados;
	}

	public int getGolosSofridos() {
		return GolosSofridos;
	}

	public void setGolosSofridos(int golosSofridos) {
		GolosSofridos = golosSofridos;
	}

	public Robo[] getRobos() {
		Robo[] a = new Robo[robos.size()];
		for(int n=0; n<robos.size(); n++){
			a[n]=robos.get(n);
		}
		return a;
	}

	public void setRobos(List<Robo> robos) {
		this.robos = robos;
	}
	
	@Override
	public String toString() {
		String x="";
		for(int g=0; g<robos.size(); g++){
			x=x+robos.get(g).toString();
		}
		x=x+"\n  ";
		return "Equipa " + NomeEquipa + ", treinada por " + NomeResponsável + "(4 jogadores)\n  robos= " + x +
				 "golosMarcados=" + GolosMarcados+"\n";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
