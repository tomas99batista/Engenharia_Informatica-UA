package aula07;

public class A07E02 {

	public static void main(String[] args) {
		
		// criacao da disciplina poo
		Disciplina poo = new Disciplina("Programacao Orientada a Objetos", "Antonio", "Neves", "Programacao");
		
		// criar alunos
		Aluno a1 = new Aluno("Tiago", "Mendes");
		Aluno a2 = new Aluno("Flavia", "Figueiredo");
		Aluno a3 = new Aluno("Tiago", "Melo");
		Aluno a4 = new Aluno("Luis", "Silva");
		Aluno a5 = new Aluno("Rafael", "Lopes");
		Aluno a6 = new Aluno("Mariana", "Gameiro");
		
		// inscricao de alunos na disciplina com a consequente confirmacao
		System.out.println(poo.inscreverAluno(a1));
		System.out.println(poo.inscreverAluno(a1));
		System.out.println(poo.inscreverAluno(a2));
		System.out.println(poo.inscreverAluno(a2));
		System.out.println(poo.inscreverAluno(a3));
		System.out.println(poo.inscreverAluno(a3));
		System.out.println(poo.inscreverAluno(a4));
		System.out.println(poo.inscreverAluno(a4));
		System.out.println(poo.inscreverAluno(a5));
		System.out.println(poo.inscreverAluno(a6));
		
		// impressao das informacoes relativas a disciplina
		System.out.println();
		System.out.println(poo);

	}

}
