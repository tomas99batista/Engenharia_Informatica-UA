package teste_deste_ano;

public class Robo extends ObjetoMovel {

	private TipoJogador tipo;
	private String id;
	private int golos=0;
	
	public Robo(String id, TipoJogador tipo, int x, int y) {
		super(x, y);
		this.id=id;
		this.tipo=tipo;
	}

	public TipoJogador getTipo() {
		return tipo;
	}

	public void setTipo(TipoJogador tipo) {
		this.tipo = tipo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGolos() {
		return golos;
	}

	public void marcaGolo() {
		this.golos++;
	}

	@Override
	public String toString(){
		return "id="+id+", tipo="+tipo+" *;* ";
	}
}
