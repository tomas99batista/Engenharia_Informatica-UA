package aula11;

public class MotoCombustao extends Moto implements MotorCombustao {
	
	private double emissaoC02;

	public MotoCombustao(String matricula, int ano, String cor, int potencia, double emissaoC02) {
		super(matricula, ano, cor, potencia);
		this.emissaoC02 = emissaoC02;
	}

	@Override
	public double getEmissaoCO2() {
		return this.emissaoC02;
	}
	
	

}
