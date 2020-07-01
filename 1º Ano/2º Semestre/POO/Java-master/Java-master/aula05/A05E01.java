package aula05;

public class A05E01 {

	public static void main(String[] args) {
		
		Aluno al = new Aluno("Andreia Melo", 9855678, new Data(18, 7, 1990), new Data(1, 9, 2014));
		Bolseiro bls = new Bolseiro("Igor Santos", 8976543, new Data(11, 5, 1985));
		
		bls.setBolsa(745);
		
		System.out.println("\nAluno: " + al.getNome());
		System.out.println(al);
		
		System.out.println("\nBolseiro: " + bls.getNome() + ", N Mec: " + bls.getMyNMec() + ", Bolsa: " + bls.getBolsa());
		System.out.println(bls);
		
		

	}

}
