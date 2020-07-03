package aula08;

public class Prato extends Conjunto<Alimento> {
	
	private String nome;
	private DiaSemana diaSem;
	private static int id = 0;
	private int myID;
	
	public Prato(String nome, DiaSemana diaSem) {
		this.nome = nome + id; 
		this.myID = id; id++;
		this.diaSem = diaSem;
	}
	
	public Prato(String nome) {
		this.nome = nome + id;
		this.myID = id; id++;
	}
	
	public double getCalorias() {
		int calorias = 0;
		Alimento[] alimentos = this.giveElements();
		for(Alimento a : alimentos) {
			calorias += a.getCalorias();
		}
		return calorias;
	}
	
	public double getProteinas() {
		int proteinas = 0;
		Alimento[] alimentos = this.giveElements();
		for(Alimento a : alimentos) {
			proteinas += a.getProteinas();
		}
		return proteinas;
	}
	
	public double getPesoTotal() {
		int pesoTotal = 0;
		Alimento[] alimentos = this.giveElements();
		for(Alimento a : alimentos) {
			pesoTotal += a.getPeso();
		}
		return pesoTotal;
	}
	
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Dia da Semana: " + diaSem;
	}

	public void informacoes() {
		for(int i = 0; i < this.size() ; i++) {
			System.out.println(this.getElement(i));
		}
	}

	public int getMyID() {
		return myID;
	}

	public void setMyID(int myID) {
		this.myID = myID;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Prato.id = id;
	}
	
	
	
}
