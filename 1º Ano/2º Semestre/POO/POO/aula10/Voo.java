package aula10;

public class Voo implements Comparable<Voo>{
	
	// Atributos
	private String nome;
	private String horaChegada;
	private String origem;
	private String atraso;
	private Companhia companhia;
	
	// Construtor
	public Voo(String nome, String horaChegada, String origem, String atraso, Companhia companhia) {
		this.nome = nome;
		this.horaChegada = horaChegada;
		this.origem = origem;
		this.atraso = atraso;
		this.companhia = companhia;
	}
	
	// Metodo toString()
	@Override
	public String toString() {
		return "Voo [nome=" + nome + ", horaChegada=" + horaChegada + ", origem=" + origem + ", atraso=" + atraso
				+ ", companhia=" + companhia + "]";
	}
	
	// Getters and Setters
	public String getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getAtraso() {
		return atraso;
	}

	public void setAtraso(String atraso) {
		this.atraso = atraso;
	}

	public Companhia getCompanhia() {
		return companhia;
	}

	public void setCompanhia(Companhia companhia) {
		this.companhia = companhia;
	}

	public double convertToMinutes(String horaChegada) {
		int hora, minutos;
		hora = Integer.parseInt(horaChegada.substring(0, 2));
		minutos = Integer.parseInt(horaChegada.substring(3, 5));
		return hora * 60 + minutos;
	}
	
	public String newHour(String horaChegada, String atraso) {
		double horaC = this.convertToMinutes(horaChegada);
		double atr = this.convertToMinutes(atraso);
		
		double novaHora = horaC + atr;
		
		return "" + (int)(novaHora / 60) + ":" + (int)(novaHora - ((int)(novaHora / 60) * 60));
	}

	@Override
	public int compareTo(Voo o) {
		return (int) (this.convertToMinutes(this.horaChegada) - o.convertToMinutes(o.horaChegada));
	}
	
	
	
}
