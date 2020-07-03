package NaAula;

public class CabineComVaranda extends Cabine 
implements PacoteExtra
{

	private TipoDeVaranda tipoVaranda;

	public CabineComVaranda(int num, 
			int capacidadeMaxima, 
			TipoDeVaranda tipoVaranda) {
		
		super(num, capacidadeMaxima);
		 this.tipoVaranda=tipoVaranda;
	}

	@Override
	public void pacoteExtra(Extra extra) {
		// TODO Auto-generated method stub
	}

	public void setTipoVaranda(TipoDeVaranda tipoVaranda) {
		// TODO Auto-generated method stub
		this.tipoVaranda=tipoVaranda;
	}

	
}
