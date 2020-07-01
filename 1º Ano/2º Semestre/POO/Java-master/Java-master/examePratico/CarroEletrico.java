package examePratico;

public class CarroEletrico extends Automovel implements MotorEletrico {
	
	// Atributos
	private double autonomia;
	
	// Construtor
	public CarroEletrico(String matricula, int ano, String cor, double potencia, double autonomia) {
		super(matricula, ano, cor, potencia);
		this.autonomia = autonomia;
	}
	
	// Metodo toString
	@Override
	public String toString() {
		return "CarroEletrico [" + super.toString() + ", autonomia=" + autonomia + "]";
	}

	// Metodo getAutonomia();
	@Override
	public double getAutonomia() {
		return this.autonomia;
	}

}
