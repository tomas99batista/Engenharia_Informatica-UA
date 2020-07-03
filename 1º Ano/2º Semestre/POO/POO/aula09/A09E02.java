package aula09;

import java.util.*;

public class A09E02 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		// a) registo com o nome de todos os empregados
		
		List<Pessoa> empregados = new ArrayList<>();
		
		// adicionar
		empregados.add(new Pessoa("Tiago Mendes"));
		empregados.add(new Pessoa("Cristiano Ronaldo"));
		empregados.add(new Pessoa("Jorge Mendes"));
		empregados.add(new Pessoa("Jorge Jesus"));
		empregados.add(new Pessoa("Tiago Silva"));
		empregados.add(new Pessoa("Bruno de Carvalho"));
		empregados.add(new Pessoa("Donald Trump"));
		Pessoa p1 = new Pessoa("Kim Jon Un");
		empregados.add(p1);
		
		System.out.println("Lista de empregados: ");
		for(Pessoa e : empregados) {
			System.out.println(e);
		}
		
		
		empregados.remove(p1);
		System.out.println("\nLista de empregados 2: ");
		for(Pessoa e : empregados) {
			System.out.println(e);
		}
		
		
		// b) atribuir brinquedo a funcionario
		
		List<Brinquedo> brinquedos = new ArrayList<>();
		
		brinquedos.add(new Brinquedo("Thor"));
		brinquedos.add(new Brinquedo("Iron Man"));
		brinquedos.add(new Brinquedo("Spider Man"));
		brinquedos.add(new Brinquedo("Thanos"));
		brinquedos.add(new Brinquedo("Black Widow"));
		brinquedos.add(new Brinquedo("Rocket"));
		brinquedos.add(new Brinquedo("Black Panther"));
		brinquedos.add(new Brinquedo("Scarlet Witch"));
		brinquedos.add(new Brinquedo("Vision"));
		brinquedos.add(new Brinquedo("Hulk"));
		brinquedos.add(new Brinquedo("Peter Quill"));
		brinquedos.add(new Brinquedo("Doctor Strange"));
		
		System.out.println("\nLista de brinquedos: ");
		for(Brinquedo b : brinquedos) {
			System.out.println(b);
		}
		
		Map<Brinquedo, Pessoa> presentes = new HashMap<>();
		
		for(int i = 0; i < 12 ; i++) {
			int index2 = random.nextInt(empregados.size());
			presentes.put(brinquedos.get(i), empregados.get(index2));
		}
		
		System.out.println("\nBrinquedo - Empregado");
		for(Brinquedo b : presentes.keySet()) {
			System.out.println(b + ": " + presentes.get(b));
		}
		
		// c) atribuir nome de funcionario a brinquedo
		
		Set<String> produtos = new HashSet<>();
		
		for(Pessoa e : empregados) {
			String[] nomes = e.getNome().split(" ");
			produtos.add(nomes[0]);
		}
		
		System.out.println("\nBriquedos com nome de pessoas: ");
		Iterator<String> i1 = produtos.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		// d) Nomes mais populares
		
		Map<String, Integer> contador = new TreeMap<>();
		
		for(Pessoa e : empregados) {
			String[] nomes = e.getNome().split(" ");
			if(!contador.containsKey(nomes[0])) {
				contador.put(nomes[0],  1);
			} else {
				contador.put(nomes[0], contador.get(nomes[0]) + 1);
			}
		}
		
		System.out.println("\nNomes mais populares: ");
		for(String s : contador.keySet()) {
			System.out.println(s + ": " + contador.get(s));
		}
		
		
		// e) bilhetes para o futebol
		
		Map<Pessoa, Integer> bilhetes = new HashMap<>();
		
		for(int i = 0 ; i < empregados.size() ; i++) {
			int numBilhetes = random.nextInt(50) + 10;
			bilhetes.put(empregados.get(i), numBilhetes);
		}
		
		System.out.println("\nNumero de bilhetes por empregado: ");
		for(Pessoa p : bilhetes.keySet()) {
			System.out.println(p + ": " + bilhetes.get(p));
		}
		

	}

}
