package aula11;

public class CarroHibrido extends Automovel implements MotorCombustao, MotorEletrico {
	
	private double autonomia;
	private double emissaoC02;

	public CarroHibrido(String matricula, int ano, String cor, int potencia, double autonomia, double emissaoC02) {
		super(matricula, ano, cor, potencia);
		this.autonomia = autonomia;
		this.emissaoC02 = emissaoC02;
	}

	
	
	@Override
	public String toString() {
		return "CarroHibrido [autonomia=" + autonomia + ", emissaoC02=" + emissaoC02 + super.toString() + "]";
	}



	@Override
	public double getAutonomia() {
		return this.autonomia;
	}

	@Override
	public double getEmissaoCO2() {
		return this.emissaoC02;
	}

}
