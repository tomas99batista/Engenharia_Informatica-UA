public class ExameEscrito extends Teste implements Prazo{
	
	private int versoes, prazo;
	private Consulta consulta;
	
	
	public ExameEscrito(String disciplina, String professor, String data, String lista) {
		super(disciplina, professor, data, lista);
		consulta=consulta.SEM;
		versoes=1;
	}


	public ExameEscrito(String disciplina, String professor, String data, String lista, int versoes) {
		super(disciplina, professor, data, lista);
		consulta=consulta.SEM;
		this.versoes = versoes;
	}


	public void setConsulta(boolean x) {
		consulta=consulta.SEM;
		if (x==true)
			consulta=consulta.COM;
	}


	@Override
	public void setPrazo(int x) {
		prazo=x;
		
	}


	@Override
	public int getPrazo() {
		return prazo;
	}


	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Exame Escrito] ");
		sb.append(super.toString());
		sb.append(" Versoẽs:"+versoes+", Consulta:"+consulta);
		if (prazo !=0)
			sb.append(", Prazo:"+prazo);
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	

}
