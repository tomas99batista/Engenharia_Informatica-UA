package aula08;

import java.util.ArrayList;
import java.util.List;

public class A08E01 {

	public static void main(String[] args) {
		
		// lista para armazenar objetos do tipo "Integer" (inteiro)
		List<Integer> c1 = new ArrayList<>();
		
		// ciclo para adicionar objetos a lista 'c1'
		for (int i = 10; i <= 100; i+=10)
			c1.add(i);
		
		// impressao do tamanho da lista
		System.out.println("Size: " + c1.size());
		
		// ciclo para imprimir todos os elementos da lista 'c1'
		for (int i = 0; i < c1.size(); i++)
			System.out.println("Elemento: " + c1.get(i));
		
		// lista para armazenar objetos do tipo "String"
		List<String> c2 = new ArrayList<>();
		
		// adicionar 3 elementos a lista 'c2'
		c2.add("Chuva");
		c2.add("Frio");
		c2.add("Vento");
		
		// impressao do tamanho da lista c2
		System.out.println("Size: " + c2.size());
		
		// impressao de todos os elementos da lista 'c2'
		for (int i = 0; i < c2.size(); i++)
			System.out.println("Elemento: " + c2.get(i));
		
		// remover 2 elementos da lista 'c2'
		c2.remove(0);
		c2.remove(0);
		
		// ciclo para imprimir os elementos da lista 'c2' apos a remocao
		for (int i = 0; i < c2.size(); i++)
			System.out.println("Elemento: " + c2.get(i));
		
		// lista para armazenar objetos do tipo 'Pessoa'
		List<Pessoa> pessoas = new ArrayList<>();
		
		// criacao de uma nova pessoa
		Pessoa p1 = new Pessoa("Tiago", "Mendes");
		
		// adicionar elementos a lista 'pessoas'
		pessoas.add(p1);
		pessoas.add(new Pessoa("Cristiano", "Ronaldo"));
		
		System.out.println("\nSize: " + pessoas.size() + "\n");
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
		}
		
		if(pessoas.isEmpty()) {
			System.out.println("\nA lista pessoas esta vazia.");
		} else {
			System.out.println("\nA lista pessoas nao esta vazia.");
		}
		
		pessoas.removeAll(pessoas);
		
		System.out.println("\nSize: " + pessoas.size());
		
		if(pessoas.isEmpty()) {
			System.out.println("\nA lista pessoas esta vazia.");
		} else {
			System.out.println("\nA lista pessoas nao esta vazia.");
		}
		
		
		

	}

}
