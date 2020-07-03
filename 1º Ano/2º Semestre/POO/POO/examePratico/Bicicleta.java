package examePratico;

public class Bicicleta extends Veiculo {

	public Bicicleta(String matricula, int ano, String cor) {
		super(matricula, ano, cor);
	}

	@Override
	public String toString() {
		return "Bicicleta [" + super.toString() + "]";
	}
	
	

}
