package aula11;


public abstract class Veiculo implements Comparable<Veiculo> {
	// atributos
	private String matricula;
	private int ano;
	private String cor;
	
	// construtor
	public Veiculo(String matricula, int ano, String cor) {
		this.matricula = matricula;
		this.ano = ano;
		this.cor = cor;
	}
	
	// metodo toString
	@Override
	public String toString() {
		return "Veiculo [cor=: " + cor + ", ano: " + ano + ", matricula: " + matricula + "]";
	}

	// getters and setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public int compareTo(Veiculo v) {
		return this.matricula.compareTo(v.matricula);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		Veiculo other = (Veiculo) obj;
		
		if(matricula.equals(other.matricula))
			return true;
		return false;
	}
	
	
	
}
