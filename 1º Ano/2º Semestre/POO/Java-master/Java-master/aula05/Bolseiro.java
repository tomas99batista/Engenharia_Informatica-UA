package aula05;

public class Bolseiro extends Aluno {
	
	private int bolsa = 0;

	public Bolseiro(String nome, int cc, Data dataNasc, Data dataIns, int bolsa) {
		super(nome, cc, dataNasc, dataIns);
		this.bolsa = bolsa;
	}

	public Bolseiro(String nome, int cc, Data dataNasc, int bolsa) {
		super(nome, cc, dataNasc);
		this.bolsa = bolsa;
	}
	
	public Bolseiro(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);
		this.bolsa = bolsa;
	}


	@Override
	public String toString() {
		return super.toString() + ", Bolsa: " + bolsa;
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	
	
	

}
