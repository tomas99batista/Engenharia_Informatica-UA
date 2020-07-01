
public class TesteComputador extends Teste implements Prazo{
	
	private String link;
	private int prazo;
	
	public TesteComputador(String disciplina, String professor, String data, String lista) {
		super(disciplina, professor, data, lista);
	}
	
	public TesteComputador(String disciplina, String professor, String data, String lista, String link) {
		super(disciplina, professor, data, lista);
		this.link=link;
	}

	@Override
	public void setPrazo(int x) {
		prazo=x;
		
	}

	@Override
	public int getPrazo() {
		return prazo;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Teste Computador] ");
		sb.append(super.toString());
		sb.append(", Link:"+link);
		if (prazo !=0)
			sb.append(", Prazo:"+prazo);
		return sb.toString();
	}
	
	

}
