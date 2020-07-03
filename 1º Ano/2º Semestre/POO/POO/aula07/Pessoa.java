package aula07;

public class Pessoa {
	
	private String nome;
	private String apelido;
	private int cc;
	private Data dataNasc;
	
	public Pessoa(String nome, String apelido, int cc, Data dataNasc) {
		this.nome = nome;
		this.cc = cc;
		this.dataNasc = dataNasc;
	}
	public Pessoa(String nome, String apelido) {
		this.nome = nome;
		this.apelido = apelido;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " " + apelido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	

	
}
