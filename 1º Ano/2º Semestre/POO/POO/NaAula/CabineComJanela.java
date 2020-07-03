package NaAula;

public class CabineComJanela extends Cabine
    implements PacoteExtra
    {

	private TipoDeJanela tipoJanela;
	private Extra extra;

	public CabineComJanela(int num,	int capacidadeMaxima, TipoDeJanela tipoJanela) {
		
		super(num, capacidadeMaxima);	
		this.tipoJanela=tipoJanela;
	
	}
	
	public CabineComJanela(int num, int capacidade, 
			TipoDeJanela tipoJanela, 
			String[] passageiros) {
		
		this(num, capacidade, tipoJanela);
		
		setPassageiros(passageiros);
	}

	public void pacoteExtra(Extra extra) {
		// TODO Auto-generated method stub
		
		this.extra=extra;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
//Cabine com Janela MAR 
		return "Cabine com Janela " + tipoJanela + " " + extra +super.toString();
	}

	
	

}
