package examePratico;

public class Suite extends Cabine {
	
	private int numQuartos;
	
	public Suite(int num, int capacidade) {
		super(num, capacidade);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Suite c/" + numQuartos + " quartos " + super.toString();
	}



	public int getNumQuartos() {
		return numQuartos;
	}

	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}
	
	

}
