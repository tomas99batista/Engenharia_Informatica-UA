package aula11;

public class Automovel extends Veiculo {
	
	// atributos
	private int potencia;

	// construtor
	public Automovel(String matricula, int ano, String cor, int potencia) {
		super(matricula, ano, cor);
		this.potencia = potencia;
		
	}
	
	// metodo toString
	@Override
	public String toString() {
		return "Carro [potencia=" + potencia + super.toString() + "]";
	}
	
	// getters and setterss
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	

}
