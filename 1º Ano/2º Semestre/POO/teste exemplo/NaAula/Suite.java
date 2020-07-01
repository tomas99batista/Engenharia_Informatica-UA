package NaAula;

public class Suite extends Cabine {

	private int numQuartos;

	public Suite(int num, int capacidade) {
		// TODO Auto-generated constructor stub
		super(num, capacidade);
	}

	public void setNumQuartos(int numQuartos) {
		// TODO Auto-generated method stub
		this.numQuartos=numQuartos;
		
	}

	public String toString(){
		return "Suite c/" + numQuartos + super.toString();
	}
	
}
