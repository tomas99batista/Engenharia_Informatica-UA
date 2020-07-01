
public abstract class Teste {
	
	private String disciplina, professor, data, lista;

	public Teste(String disciplina, String professor, String data, String lista) {
		super();
		this.disciplina = disciplina;
		this.professor = professor;
		this.data = data;
		this.lista = lista;
	}
	

	public String getDisciplina() {
		return disciplina;
	}


	@Override
	public String toString() {
		return "Disciplina:" + disciplina + ", Professor:" + professor + ", Data:" + data + ", Sala:" + lista
				;
	}
	
	
}
