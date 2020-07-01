package aula06;

public class Robo extends Objetomovel {
	
	private static int contador = 1;
	private String id;
	private String tipo;
	private int nGolos; 

	public Robo(int x, int y, double velMax, String tipo) {
		super(x, y, velMax);
		this.id = "Robo" + contador;
		contador++;
		switch(tipo.toUpperCase()) {
		case "GUARDAREDES":
			this.tipo = "GUARDAREDES";
			break;
		case "DEFESA":
			this.tipo = "DEFESA";
			break;
		case "MEDIO":
			this.tipo = "MEDIO";
			break;
		case "AVANCADO":
			this.tipo = "AVANCADO";
			break;
		default:
			this.tipo = "DESCONHECIDO";
			break;
		}
		
	}

	@Override
	public String toString() {
		return super.toString() + ", id: " + id + ", tipo: " + tipo + ", nGolos: " + nGolos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getnGolos() {
		return nGolos;
	}

	public void setnGolos(int nGolos) {
		this.nGolos = nGolos;
	}
	
	// marcar golo
	public void marcarGolo() {
		this.nGolos += 1;
	}
	
	

}
