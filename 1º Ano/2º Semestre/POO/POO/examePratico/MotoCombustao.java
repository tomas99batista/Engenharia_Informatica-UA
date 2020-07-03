package examePratico;

public class MotoCombustao extends Moto implements MotorCombustao {
	
	// Atributos
	private double emissao;
	
	// Construtor
	public MotoCombustao(String matricula, int ano, String cor, double potencia, double emissao) {
		super(matricula, ano, cor, potencia);
		this.emissao = emissao;
	}
	
	// Metodo toString();
	@Override
	public String toString() {
		return "MotoCombustao [" + super.toString() + "emissao=" + emissao + "]";
	}

	// Metodo getEmissaoCO2;
	@Override
	public double getEmissaoCO2() {
		return this.emissao;
	}

}
