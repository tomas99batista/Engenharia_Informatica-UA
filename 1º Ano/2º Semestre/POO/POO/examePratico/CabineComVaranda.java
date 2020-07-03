package examePratico;

public class CabineComVaranda extends Cabine implements Extras {
	
	private TipoDeVaranda tipoVaranda;
	private Extra extra;
	
	public CabineComVaranda(int num, int maxOcupantes,TipoDeVaranda tipoVaranda) {
		super(num, maxOcupantes);
		this.tipoVaranda = tipoVaranda;
	}
	
	

	@Override
	public String toString() {
		return "Cabine Com Varanda " + this.tipoVaranda + " " + super.toString();
	}



	public TipoDeVaranda getTipo() {
		return tipoVaranda;
	}

	public void setTipoVaranda(TipoDeVaranda tipoVaranda) {
		this.tipoVaranda = tipoVaranda;
	}

	@Override
	public void pacoteExtra(Extra extra) {
		this.extra = extra;
		
	}
	
	

}
