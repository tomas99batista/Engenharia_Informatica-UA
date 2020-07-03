package aula07;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private String nome;
	private Professor professor;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Disciplina(String nome, /*dados do professor*/ String nP, String aP, String aI) {
		//nP - nome do professor ; aP - apelido do professor; aI - area de investigacao do professor
		this.nome = nome;
		this.professor = new Professor(nP, aP, aI);
	}
	
	// metodo para inscrever um aluno
	public boolean inscreverAluno(Aluno a) {
		if(alunoExiste(a)) {
			return false;
		} else {
			alunos.add(a);
			return true;
		}
		
	}
	
	// metodo para averiguar se o aluno ja esta inscrito na disciplina
	public boolean alunoExiste(Aluno a) {
		for(Aluno aluno : alunos) {
			if(aluno.equals(a)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String dados = "";
		dados += ("Disciplina - " + nome + "\n\n");
		dados += ("Professor responsavel - " + professor + "\n\n");
		dados += ("Numero de alunos inscritos - " + alunos.size() + "\n\nAlunos:\n\n");
		for(Aluno aluno : alunos) {
			dados += (aluno + "\n\n");
		}
		return dados;
	}
	
}
