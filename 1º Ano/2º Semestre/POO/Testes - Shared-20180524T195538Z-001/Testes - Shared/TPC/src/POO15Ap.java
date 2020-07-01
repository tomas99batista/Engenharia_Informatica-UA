import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class POO15Ap {
	public static void main(String[] args) {
		POO15Ap ap = new POO15Ap();
		Escola e = ap.alinea1();
		ap.alinea2(e);
		ap.alinea3();
	}
	
	public Escola alinea1() {
		System.out.println("\nA1)");
		Escola ih = new Escola("International House Aveiro","Rua Domingos Carrancho, 1, 3800-145 Aveiro");
		ExameEscrito e1 = new ExameEscrito("Inglês para Empresas","Anthony Laurel", "12.06.2015 15h", "15; 22", 4); // 4 versões
		e1.setConsulta(true);
		e1.setPrazo(6);
		ih.add(e1);
		ih.add(new ExameEscrito("Alemão", "Manfred Glesner", "12.06.2015 10h", "13"));
		TesteComputador t1 = new TesteComputador("Italiano Intermédio", "Luca Benini", "01.06.2015 10h", "25");
		t1.setLink("http://www.ihaveiro.com/outras-linguas/tii");
		ih.add(t1);
		ih.add(new ProvaOral("Inglês Avançado", "Anthony Laurel", "05.06.2015 10h", "3", Lingua.UK));
		System.out.println(ih); // imprime todas as provas da escola
		try {
		PrintWriter fl = new PrintWriter(new File("output2.txt"));
		fl.println(ih);
		fl.close();
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		return ih;
	}
	
	public void alinea2(Escola e){
		System.out.println("A2)");
		Comparator<Teste> comparador = new Comparator<Teste>() {
			@Override
			public int compare(Teste o1, Teste o2) {
				return(o1.getDisciplina().compareTo(o2.getDisciplina()));
			}
		};
		Set<Teste> ordenado = new TreeSet<>(comparador);
		for(Teste t : e.getConjunto()){
			if (t instanceof Prazo){
				ordenado.add(t);
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append("Exames com Prazos por Ordem Alfabética \n");
		for(Teste t: ordenado){
			sb.append(t+"\n");
		}
		System.out.println(sb.toString());
	}
	
	public void alinea3(){
		System.out.println("A3)");
		Scanner sfc =null;
		String professor=null;
		File input = new File("samples_s2.txt");
		Map<String, Integer> lista = new HashMap<>();
		int i=1;
		int x;
		try{
			sfc = new Scanner(input);
			while(sfc.hasNextLine()){
				String linha= sfc.nextLine();
				String[] array = linha.split("\t");
				professor = array[2];
				
				if (!professor.equals("Professor")){
				if(lista.containsKey(professor)){
					x=lista.get(professor);
					x=x+1;
					lista.put(professor, x);
				}
				else{
					lista.put(professor, 1);
				}
			}
			}
		}catch(FileNotFoundException e){
			System.out.println("Ficheiro inexisteste: "+e);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("Lista de Testes por Professor\n");
		for(String prof: lista.keySet()){
			sb.append(prof + " => "+ lista.get(prof)+"\n");
		}
		
		System.out.println(sb.toString());
		
		
	}
}




