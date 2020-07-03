package aula11;

public class CarroCombustao extends Automovel implements MotorCombustao {
	
	private double emissaoCO2;

	public CarroCombustao(String matricula, int ano, String cor, int potencia, double emissaoC02) {
		super(matricula, ano, cor, potencia);
		this.emissaoCO2 = emissaoC02;
	}
	
	

	@Override
	public String toString() {
		return "CarroCombustao [emissaoCO2=" + emissaoCO2 + super.toString() + "]";
	}



	@Override
	public double getEmissaoCO2() {
		return this.emissaoCO2;
	}

}
