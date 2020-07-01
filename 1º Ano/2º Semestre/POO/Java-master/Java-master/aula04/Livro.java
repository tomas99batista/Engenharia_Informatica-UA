package aula04;

public class Livro {
	private static int id = 100;
	private String titulo;
	private String tipo = "NORMAL";
	private int myId;
	private boolean isBorrowed = false;
	
	public Livro(String titulo, String tipo) {
		this.titulo = titulo;
		if(tipo.equals("NORMAL")) {
			this.tipo = tipo;
			this.isBorrowed = false;
		} else if(tipo.equals("CONDICIONAL")) {
			this.tipo = tipo;
			this.isBorrowed = true;
		} else {
			System.out.println("Tipo invalido!");
			this.tipo = "NORMAL";
		}
		this.myId = id;
		id++;
	}
	
	public Livro(String titulo) {
		this.titulo = titulo;
		this.myId = id;
		this.isBorrowed = false;
		id++;
	}
	
	@Override
	public String toString() {
		return "Livro (Titulo: " + titulo + ", Tipo: " + tipo + ", myId: " + myId + ")";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getMyId() {
		return myId;
	}

	public void setMyId(int myId) {
		this.myId = myId;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
	
	
	
	
	
	
	
	
}
