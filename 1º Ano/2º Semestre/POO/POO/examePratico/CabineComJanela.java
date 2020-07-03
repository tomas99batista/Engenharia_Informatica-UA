package examePratico;

public class CabineComJanela extends Cabine implements Extras {

	private TipoDeJanela tipo;
	private Extra extra;
	
	public CabineComJanela(int num, int capacidade, TipoDeJanela tipo) {
		super(num, capacidade);
		this.tipo = tipo;
	}
	
	public CabineComJanela(int num, int capacidade, TipoDeJanela tipo, String[] passageiros) {
		super(num, capacidade);
		this.tipo = tipo;
		this.setPassageiros(passageiros);
	}

	@Override
	public String toString() {
		return "Cabine Com Janela " + this.tipo + " " + super.toString();
	}

	@Override
	public void pacoteExtra(Extra extra) {
		this.extra = extra;
	}

}
