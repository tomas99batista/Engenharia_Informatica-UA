package aula04;

public class Utilizador {
	private String nome;
	private String curso;
	private int nMec;
	private int livrosEmprestados = 0;
	
	public Utilizador(String nome, int nMec, String curso) {
		this.nome = nome;
		this.nMec = nMec;
		this.curso = curso;
		this.livrosEmprestados = 0;
	}

	@Override
	public String toString() {
		return "Utilizador (Nome: " + nome + ", Curso: " + curso + ", nMec: " + nMec + ")";
	}

	public int getLivrosEmprestados() {
		return livrosEmprestados;
	}

	public void setLivrosEmprestados(int livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}
	
	public void emprestaLivros(int n) {
		this.livrosEmprestados += n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getnMec() {
		return nMec;
	}

	public void setnMec(int nMec) {
		this.nMec = nMec;
	}
	
	
	
}
