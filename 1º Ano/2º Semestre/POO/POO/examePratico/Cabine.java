package examePratico;

import java.util.*;

public class Cabine implements Comparable<Cabine> {
	
	// Atributos
	private int num;
	private int maxOcupantes;
	private String[] passageiros;
	
	// Construtor
	public Cabine(int num, int maxOcupantes) {
		this.num = num;
		this.maxOcupantes = maxOcupantes;
	}
	
	

	@Override
	public String toString() {
		
		if(this.passageiros == null) {
			return "[ Nº" + num + "( max " + maxOcupantes + " pessoas ) : Disponivel para venda! ]";
		}
		return "[ Nº" + num + "( max " + maxOcupantes + " pessoas ) : " + Arrays.toString(passageiros) + "]";
	}



	public String[] getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(String[] passageiros) {
		
		if(passageiros.length > this.maxOcupantes) {
			System.out.println("\nNao adicionado devido a excesso de ocupantes!!");
			return;
		}
		this.passageiros = passageiros;
		
	}

	public int getMaxOcupantes() {
		return maxOcupantes;
	}

	public void setMaxOcupantes(int maxOcupantes) {
		this.maxOcupantes = maxOcupantes;
	}

	@Override
	public int compareTo(Cabine o) {
		return this.num - o.num;
	}
	
}
