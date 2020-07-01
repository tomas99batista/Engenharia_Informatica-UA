package examePratico;

public class Automovel extends Veiculo {
	
	// Atributos
	private double potencia;

	// Construtor
	public Automovel(String matricula, int ano, String cor, double potencia) {
		super(matricula, ano, cor);
		this.potencia = potencia;
	}
	
	// Metodo toString
	@Override
	public String toString() {
		return "[potencia=" + potencia + ", " + super.toString() + "]";
	}
	
	

}
