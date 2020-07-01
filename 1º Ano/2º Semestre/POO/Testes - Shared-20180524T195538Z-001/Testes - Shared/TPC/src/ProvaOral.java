
public class ProvaOral extends Teste{
	
	private Lingua lingua;
	
	public ProvaOral(String disciplina, String professor, String data, String lista) {
		super(disciplina, professor, data, lista);
		lingua=Lingua.UK;		
	}

	public ProvaOral(String disciplina, String professor, String data, String lista, Lingua lingua) {
		super(disciplina, professor, data, lista);
		this.lingua = lingua;
	}

	public void setLingua(Lingua lingua) {
		this.lingua = lingua;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Prova Oral] ");
		sb.append(super.toString());
		sb.append(", Língua:"+lingua);
		return sb.toString();

	}
	
	
	
	
	
	
	

}
