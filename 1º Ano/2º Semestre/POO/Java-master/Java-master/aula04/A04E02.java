package aula04;

public class A04E02 {

	public static void main(String[] args) {
		
		// array para armazenar 10 livros
		Livro catalogo[] = new Livro[10];
		int nLivros = 0; // variavel de contagem
		
		// array para armazenar 10 alunos
		Utilizador alunos[] = new Utilizador[10];
		int nUtilizadores = 0;
		
		catalogo[nLivros] = new Livro("Java 8", "CONDICIONAL");
		nLivros++;
		
		catalogo[nLivros] = new Livro("POO em Java 8");
		nLivros++;
		
		catalogo[nLivros] = new Livro("Java para totós", "NORMAL");
		nLivros++;
		
		catalogo[2].setTipo("CONDICIONAL");
		
		System.out.println("ID: " + catalogo[1].getMyId() + ", " + catalogo[1].getTitulo());
		
		alunos[nUtilizadores] = new Utilizador("Catarina Marques", 80232, "MIEGI");
		nUtilizadores++;
		
		alunos[nUtilizadores] = new Utilizador("Joao Silva", 90123, "LEI");
		nUtilizadores++;
		
		alunos[1].setnMec(80123);
		
		for(int i = 0; i < nLivros ; i++) {
			System.out.println(catalogo[i]);
		}
		
		for(Utilizador u : alunos) {
			if(u == null)
				break;
			System.out.println(u);
		}
		
		
		
		

	}

}
