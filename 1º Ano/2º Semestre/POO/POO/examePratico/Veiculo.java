package examePratico;

public class Veiculo implements Comparable<Veiculo> {
	
	// Atributos
	private String matricula;
	private int ano;
	private String cor;
	
	// Construtor
	public Veiculo(String matricula, int ano, String cor) {
		this.matricula = matricula;
		this.ano = ano;
		this.cor = cor;
	}
	
	// Metodo toString
	@Override
	public String toString() {
		return "Veiculo [cor=" + cor + ", ano=" + ano + ", matricula=" + matricula + "]";
	}

	@Override
	public int compareTo(Veiculo o) {
		return this.matricula.compareTo(o.matricula);
	}
	
	
}
