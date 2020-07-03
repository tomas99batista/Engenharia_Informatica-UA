package aula06;

public class Carro {
	private char classe = 'A';
	private String tipo = "gasolina";
	private boolean disponibilidade;
	private static int contador = 1;
	private int id;
	
	public Carro(char classe, String tipo, boolean disponibilidade) {
		switch(classe) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F': this.classe = classe; break;
		default: this.classe = 'A'; break;
		}
		
		if(tipo.toLowerCase().equals("gasolina") || tipo.toLowerCase().equals("gasoleo")) {
			this.tipo = tipo;
		}
		this.disponibilidade = disponibilidade;
		this.id = contador;
		contador++;
	}

	@Override
	public String toString() {
		return "Carro - ID: " + id +" Classe: " + classe + ", Tipo: " + tipo + ", Disponibilidade: " + disponibilidade;
	}
	
	public void levantar() {
		this.disponibilidade = false;
	}
	
	public void entregar() {
		this.disponibilidade = true;
	}

	public char getClasse() {
		return classe;
	}

	public void setClasse(char classe) {
		this.classe = classe;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
