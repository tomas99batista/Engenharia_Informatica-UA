package teste_deste_ano;

public class Jogo {

	private Equipa e1;
	private Equipa e2;
	private Bola bola;
	private int tempo;
	
	public Jogo(Equipa e1, Equipa e2, Bola bola, int i) {
		this.e1=e1;
		this.e2=e2;
		this.bola=bola;
		this.tempo=i;
	}

	public Equipa getE1() {
		return e1;
	}

	public void setE1(Equipa e1) {
		this.e1 = e1;
	}

	public Equipa getE2() {
		return e2;
	}

	public void setE2(Equipa e2) {
		this.e2 = e2;
	}

	public Bola getBola() {
		return bola;
	}

	public void setBola(Bola bola) {
		this.bola = bola;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	@Override
	public String toString() {
		return "Jogo entre " + e1.getNomeEquipa() + " e " + e2.getNomeEquipa();
	}

}
