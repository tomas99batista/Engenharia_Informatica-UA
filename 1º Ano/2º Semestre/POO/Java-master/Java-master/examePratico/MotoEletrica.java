package examePratico;

public class MotoEletrica extends Moto implements MotorEletrico {

	// Atributos
	private double autonomia;
	
	// Construtor
	public MotoEletrica(String matricula, int ano, String cor, double potencia, double autonomia) {
		super(matricula, ano, cor, potencia);
		this.autonomia = autonomia;
	}
	
	// Metodo toString();
	@Override
	public String toString() {
		return "MotoEletrica [" + super.toString() + "autonomia=" + autonomia + "]";
	}

	// Metodo getAutonomia();
	@Override
	public double getAutonomia() {
		return this.autonomia;
	}

	

}
