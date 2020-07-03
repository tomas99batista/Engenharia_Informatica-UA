package aula10;

public class Atraso implements Comparable<Atraso>{
	
	private Companhia companhia;
	private String atraso;
	
	public Atraso(Companhia companhia, String atraso) {
		this.companhia = companhia;
		this.atraso = atraso;
	}
	
	

	public Companhia getCompanhia() {
		return companhia;
	}



	public void setCompanhia(Companhia companhia) {
		this.companhia = companhia;
	}



	public String getAtraso() {
		return atraso;
	}



	public void setAtraso(String atraso) {
		this.atraso = atraso;
	}



	@Override
	public int compareTo(Atraso o) {
		return this.atraso.compareTo(o.atraso);
	}
	
	
}
