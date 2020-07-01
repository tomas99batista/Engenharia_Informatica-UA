package aula11;

public class MotoEletrica extends Moto implements MotorEletrico {
	
	private double autonomia;

	public MotoEletrica(String matricula, int ano, String cor, int potencia, double autonomia) {
		super(matricula, ano, cor, potencia);
		this.autonomia = autonomia;
	}

	
	
	@Override
	public double getAutonomia() {
		return this.autonomia;
	}

}
