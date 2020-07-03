package aula08;

import aula07.Circulo;
import aula07.ColecaoFiguras;
import aula07.Figura;
import aula07.Ponto;
import aula07.Quadrado;
import aula07.Retangulo;

public class A08E02 {

	public static void main(String[] args) {
		
		Conjunto<Figura> figuras = new Conjunto<>();
		Conjunto<Pessoa> pessoas = new Conjunto<>();
		Conjunto<Integer> inteiros = new Conjunto<>();
		
		//-----------------------------Figuras-----------------------------//
		
		Circulo c1 = new Circulo(2);        
		Circulo c2 = new Circulo(1, 3, 2);        
		
		Quadrado q1 = new Quadrado(2);        
		Quadrado q2 = new Quadrado(3, 4, 2);        
		
		Retangulo r1 = new Retangulo(2, 3);        
		Retangulo r2 = new Retangulo(3, 4, 2, 3);
		
		System.out.println(figuras.addElement(c1)); // true
		System.out.println(figuras.addElement(c2)); // true
		System.out.println(figuras.addElement(q1)); // true
		System.out.println(figuras.addElement(q2)); // true
		System.out.println(figuras.addElement(r1)); // true
		System.out.println(figuras.addElement(r2)); // true
		
		System.out.println(figuras.addElement(c1)); // false
		
		System.out.println("Size: " + figuras.size()); // size = 6
		
		
		System.out.println(figuras.containsElement(r1)); // true
		System.out.println(figuras.removeElement(r1));	 // true
		System.out.println(figuras.containsElement(r1)); // false
		System.out.println(figuras.removeElement(r1));   // false
		
		System.out.println("Size: " + figuras.size()); // size = 5
		
		System.out.println(figuras);
		
		System.out.println(figuras.isEmpty()); // false
		System.out.println(figuras.removeAll()); // true
		System.out.println(figuras.isEmpty()); // true
		
		System.out.println(figuras);
		
		//-----------------------------Pessoas-----------------------------//
		
		Pessoa p1 = new Pessoa("Tiago", "Mendes");
		Pessoa p2 = new Pessoa("Cristiano", "Ronaldo");
		Pessoa p3 = new Pessoa("Quim", "Barreiros");
		Pessoa p4 = new Pessoa("Zeze", "Camarinha");
		
		System.out.println(pessoas.addElement(p1)); // true
		System.out.println(pessoas.addElement(p2)); // true
		System.out.println(pessoas.addElement(p3)); // true
		System.out.println(pessoas.addElement(p4)); // true
		
		
		System.out.println(pessoas.addElement(p1)); // false
		
		System.out.println("Size: " + pessoas.size()); // size = 4
		
		
		System.out.println(pessoas.containsElement(p1)); // true
		System.out.println(pessoas.removeElement(p1));	 // true
		System.out.println(pessoas.containsElement(p1)); // false
		System.out.println(pessoas.removeElement(p1));   // false
		
		System.out.println("Size: " + pessoas.size()); // size = 3
		
		System.out.println(pessoas);
		
		System.out.println(pessoas.isEmpty()); // false
		System.out.println(pessoas.removeAll()); // true
		System.out.println(pessoas.isEmpty()); // true
		
		System.out.println(pessoas);
		
		//-----------------------------Inteiros-----------------------------//
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		Integer i3 = new Integer(3);
		Integer i4 = new Integer(4);
		Integer i5 = new Integer(5);
		
		System.out.println(inteiros.addElement(i1)); // true
		System.out.println(inteiros.addElement(i2)); // true
		System.out.println(inteiros.addElement(i3)); // true
		System.out.println(inteiros.addElement(i4)); // true
		System.out.println(inteiros.addElement(i5)); // true
		
		
		System.out.println(inteiros.addElement(i1)); // false
		
		System.out.println("Size: " + inteiros.size()); // size = 5
		
		
		System.out.println(inteiros.containsElement(i1)); // true
		System.out.println(inteiros.removeElement(i1));	 // true
		System.out.println(inteiros.containsElement(i1)); // false
		System.out.println(inteiros.removeElement(i1));   // false
		
		System.out.println("Size: " + inteiros.size()); // size = 4
		
		System.out.println(inteiros);
		
		System.out.println(inteiros.isEmpty()); // false
		System.out.println(inteiros.removeAll()); // true
		System.out.println(inteiros.isEmpty()); // true
		
		System.out.println(pessoas);
		
	}

}
