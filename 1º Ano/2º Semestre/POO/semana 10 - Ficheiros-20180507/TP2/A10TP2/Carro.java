package A10TP2;

public class Carro implements Comparable<Carro>{
	private String matricula, marca;
	private int nif;
	public Carro(String matricula, String marca, int nif) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.nif = nif;
	}
	@Override
	public String toString() {
		return "Carro [matricula=" + matricula + ", marca=" + marca + ", nif=" + nif + "]";
	}
	
	@Override
	public int compareTo(Carro o) {
		if(this.nif < o.nif)
			return -1;
		else if(this.nif == o.nif)
			return 0;
		else
			return 1;
	}
	
	/*@Override
	public int compareTo(Carro o) {
		return this.matricula.compareTo(o.matricula);
	}*/
}
