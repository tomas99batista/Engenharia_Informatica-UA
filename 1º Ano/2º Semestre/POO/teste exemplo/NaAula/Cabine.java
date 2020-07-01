package NaAula;

import java.util.Arrays;

/**
 * cabine tem número, 
 * capacidade máxima de pessoas que pode acomodar (inteiros) 
 * e lista de ocupantes (strings);
 * @author AJST
 *
 */
public class Cabine implements Comparable<Cabine> {

	private int num;
	private int capacidadeMaxima;
	private String[] listaOcupantes;
	
	public Cabine(int num, int capacidadeMaxima){
		
		this.num=num;
		this.capacidadeMaxima=capacidadeMaxima;
		
	
	}
	
	
	public void setPassageiros(String[] passageiros) {
		// TODO Auto-generated method stub
	
		if (passageiros.length > capacidadeMaxima)
			throw new 	IllegalArgumentException();
			
		listaOcupantes=passageiros;
		
		
	}


	@Override
	public int compareTo(Cabine other) {
		
		return this.num-other.num;
		// return this.nome.compareTo(other.nome);
	}

	public void setMaxOcupantes(int capacidadeMaxima) {
		// TODO Auto-generated method stub
		this.capacidadeMaxima=capacidadeMaxima;
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
// [ Nº1( max 4 pessoas ) : [Marcelo R. de Sousa]]
		return "[ Nº" + num + "( max " + capacidadeMaxima + " pessoas):"
				+ (listaOcupantes!=null ? Arrays.toString(listaOcupantes): "Disponível") + "]";
	}


	public int getNumOcupantes() {
		// TODO Auto-generated method stub
		return (listaOcupantes!=null ? listaOcupantes.length : 0);
	}

	
	}
