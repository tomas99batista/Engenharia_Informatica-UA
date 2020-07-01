package examePratico;

public class CarroHibrido extends Automovel implements MotorHibrido {
	
	// Atributos
	private double autonomia;
	private double emissao;
	
	// Construtor
	public CarroHibrido(String matricula, int ano, String cor, double potencia, double autonomia, double emissao) {
		super(matricula, ano, cor, potencia);
		this.autonomia = autonomia;
		this.emissao = emissao;
	}
	
	// Metodo toString();
	@Override
	public String toString() {
		return "CarroHibrido [" + super.toString() + ", autonomia=" + autonomia + ", emissao=" + emissao + "]";
	}

	// Metodo getEmissaoCO2;
	@Override
	public double getEmissaoCO2() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// Metodo getAutonomia();
	@Override
	public double getAutonomia() {
		// TODO Auto-generated method stub
		return 0;
	}

}
