package aula11;

public class Localidade {
	
	private String nome;
	private int populacao;
	private TipoLocalidade tipoLocalidade;
	
	public Localidade(String nome, int populacao, TipoLocalidade tipoLocalidade) {
		this.nome = nome;
		this.populacao = populacao;
		this.tipoLocalidade = tipoLocalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public TipoLocalidade getTipoLocalidade() {
		return tipoLocalidade;
	}

	public void setTipoLocalidade(TipoLocalidade tipoLocalidade) {
		this.tipoLocalidade = tipoLocalidade;
	}

	@Override
	public String toString() {
		return "Capital: " + nome + ", populacao: " + populacao;
	}
	
	
}
