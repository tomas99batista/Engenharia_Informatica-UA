import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Escola {
	
	private String nome, endereco;

	private Set<Teste> conjunto = new HashSet <>();
	
	public Escola(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void add(Teste t){
		conjunto.add(t);
	}
	
	

	public Set<Teste> getConjunto() {
		return conjunto;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Escola ");
		sb.append(nome+", Endereço:"+endereco+"\n");
		for(Teste t: conjunto)
			sb.append(t +"\n");
		return sb.toString();
	}
	
	
	
	

}
