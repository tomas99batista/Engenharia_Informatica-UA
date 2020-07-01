package aula07;

public class AlunoPosGrad extends Aluno {
	
	private Professor orientador;

	public AlunoPosGrad(String nome, String apelido, int cc, Data dataNasc, Data dataIns) {
		super(nome, apelido, cc, dataNasc, dataIns);
		// TODO Auto-generated constructor stub
	}

	public AlunoPosGrad(String nome, String apelido, int cc, Data dataNasc) {
		super(nome, apelido, cc, dataNasc);
		// TODO Auto-generated constructor stub
	}

	public AlunoPosGrad(String nome, String apelido) {
		super(nome, apelido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + ", Professor Orientador - " + orientador;
	}
	
	
	
	
	
	

}
