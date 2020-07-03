package examePratico;

public class CarroCombustao extends Automovel implements MotorCombustao {
	
	// Atributos
	private double emissao;
	
	// Construtor
	public CarroCombustao(String matricula, int ano, String cor, double potencia, double emissao) {
		super(matricula, ano, cor, potencia);
		this.emissao = emissao;
	}
	
	// Metodo toString()
	@Override
	public String toString() {
		return "CarroCombustao [" + super.toString() + ", emissao=" + emissao + "]";
	}

	// Metodo getEmissaoC02;
	@Override
	public double getEmissaoCO2() {
		return this.emissao;
	}

}
