package aula04;

public class Emprestimo {

	private int nMec;
	private int id;
	
	public Emprestimo(int nMec, int id){
		this.nMec = nMec;
		this.id = id;
	}

	public int getnMec() {
		return nMec;
	}

	public void setnMec(int nMec) {
		this.nMec = nMec;
	}

	//@Override
	public String toString() {
		return "Emprestimo (nMec: " + nMec + ", id: " + id + ")";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}