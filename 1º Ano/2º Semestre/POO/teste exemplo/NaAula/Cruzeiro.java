package NaAula;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * um cruzeiro tem nome de navio, 
 * lista de cidades que visita, 
 * data quando começa (strings), 
 * um conjunto de cabines (ordenadas pelo seu número) 
 * e duração em dias;
 * @author AJST
 *
 */
public class Cruzeiro {

	private String nomeNavio;
	private String[] cidadesVisitadas;
	private String dataInicio;
	private int duracao;
	
	private Set<Cabine> conjuntoCabines;
	
	// new Cruzeiro("Sea Princess", aux , "22/01/2017");
	public Cruzeiro(String nomeNavio, 
			String[] cidadesVisitadas, 
			String dataInicio) {
		
		this.nomeNavio=nomeNavio;
		this.cidadesVisitadas=cidadesVisitadas;
		this.dataInicio=dataInicio;
		
		conjuntoCabines= new TreeSet<>();
		
	}

	public void setDuracao(int duracao) {
		// TODO Auto-generated method stub
		this.duracao=duracao;
	}

	public void add(Cabine cabine) {
		 
		conjuntoCabines.add(cabine);
		// TODO: completar ?
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	
//  Navio Sea Princess, partida em 22/01/2017
//		Itinerário:[Lisboa, Barcelona, Rodes, Southampton]
//				Cabine com Janela MAR [ 

	StringBuilder sb=new StringBuilder();
	
	
	sb.append("Navio "+ nomeNavio);
	sb.append(", partida em "+dataInicio+"\n");
	sb.append("Itinerário:"+Arrays.toString(cidadesVisitadas));
	
	for (Cabine c: conjuntoCabines)
			sb.append(c+"\n");
	
	
	
		
	return sb.toString();	
	}

	public double getPercentagem() {
		// TODO Auto-generated method stub
		
		int livres=0;
		
		for (Cabine c:conjuntoCabines)
			if (c.getNumOcupantes()==0)
				livres++;
		
		return livres/ (double) conjuntoCabines.size();
	}
	
public void printCabines(){
		
		for (Cabine c:conjuntoCabines)
			if (c.getNumOcupantes()>0)
				System.out.println(c);
			
	}

	

}
