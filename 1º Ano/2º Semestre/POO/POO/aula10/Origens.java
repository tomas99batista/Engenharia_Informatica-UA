package aula10;

public class Origens implements Comparable<Origens>{
	private String origem;
	private int ocorrencias;
	
	public Origens(String origem, int ocorrencias) {
		this.origem = origem;
		this.ocorrencias = ocorrencias;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(Voo voo) {
		this.origem = origem;
	}

	public int getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(int ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	@Override
	public int compareTo(Origens o) { 
		if(o.ocorrencias != this.ocorrencias)
			return o.ocorrencias - this.ocorrencias;
		else
			return 1;
	}
	
	
}
