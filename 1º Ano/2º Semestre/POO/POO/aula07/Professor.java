package aula07;

public class Professor extends Pessoa {
	private String areaInvestigacao;

	public Professor(String nome, String apelido, int cc, Data dataNasc, String areaInvestigacao) {
		super(nome, apelido, cc, dataNasc);
		this.areaInvestigacao = areaInvestigacao;
	}

	public Professor(String nome, String apelido, String areaInvestigacao) {
		super(nome, apelido);
		this.areaInvestigacao = areaInvestigacao;
	}

	@Override
	public String toString() {
		return super.toString() + ", Area de investigacao: " + areaInvestigacao;
	}
	
	
	

}
