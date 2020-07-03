package aula11;

public class CarroEletrico extends Automovel implements MotorEletrico {
	
	private double autonomia;
	
	public CarroEletrico(String matricula, int ano, String cor, int potencia, double autonomia) {
		super(matricula, ano, cor, potencia);
		this.autonomia = autonomia;
	}
	
	

	@Override
	public String toString() {
		return "CarroEletrico [autonomia=" + autonomia + super.toString() + "]";
	}



	@Override
	public double getAutonomia() {
		return this.autonomia;
	}

}
