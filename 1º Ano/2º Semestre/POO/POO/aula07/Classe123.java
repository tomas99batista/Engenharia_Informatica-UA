package aula07;

public class Classe123 extends Pessoa implements IDemo123 {

	public Classe123(String nome, String apelido, int cc, Data dataNasc) {
		super(nome, apelido, cc, dataNasc);
		// TODO Auto-generated constructor stub
	}

	public Classe123(String nome, String apelido) {
		super(nome, apelido);
		// TODO Auto-generated constructor stub
	} 
	
	
	
	
	
	public void metodo11(IDemo1 interface1) {}
	public void metodo21(IDemo2 interface2) {}
	public void metodo31(IDemo3 interface3) {}
	public void metodo123(IDemo123 interface123) {}
	
	
}
