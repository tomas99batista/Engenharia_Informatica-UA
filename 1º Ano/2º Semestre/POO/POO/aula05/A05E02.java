package aula05;

import java.lang.Math;

//testes passados
//gestao de um cruzeiro com cabine com janelas, mais que um quarto etc etc

public class A05E02 {

	public static void main(String[] args) {
		
		Ponto p1 = new Ponto(Math.round(Math.random() * 10), Math.round(Math.random() * 10));
		System.out.println("Ponto 1: " + p1.toString());
		
		Figura f1 = new Figura(Math.round(Math.random() * 10), Math.round(Math.random() * 10), "Vermelho");
		System.out.println("\nFigura 1: " + f1.toString());
		
		Figura f2 = new Figura(p1, "Amarelo");
		System.out.println("\nFigura 2: " + f2.toString());
		
		Circulo c1 = new Circulo(Math.round(Math.random() * 10), Math.round(Math.random() * 10), "Verde", Math.round(Math.random() * 10));
		System.out.println("\nCirculo 1: " + c1.toString() + ", Area: " + c1.area() + ", Perimetro: " + c1.perimetro());
		
		Circulo c2 = new Circulo(p1, "Roxo", Math.round(Math.random() * 10));
		System.out.println("\nCirculo 2: " + c2.toString() + ", Area: " + c2.area() + ", Perimetro: " + c2.perimetro());
		
		Retangulo r1 = new Retangulo(Math.round(Math.random() * 10), Math.round(Math.random() * 10), "Cinza", Math.round(Math.random() * 10),Math.round(Math.random() * 10));
		System.out.println("\nRetangulo 1: " + r1.toString() + ", Area: " + r1.area() + ", Perimetro: " + r1.perimetro());
		
		Retangulo r2 = new Retangulo(p1, "Laranja", Math.round(Math.random() * 10), Math.round(Math.random() * 10));
		System.out.println("\nRetangulo 2: " + r2.toString() + ", Area: " + r2.area() + ", Perimetro: " + r2.perimetro());
		
		// Como um quadrado e um retangulo, podemos criar um retangulo utilizado a classe quadrado
		Retangulo r3 = new Quadrado(p1, "Rosa", Math.round(Math.random() * 10));
		System.out.println("\nRetangulo 3: " + r3.toString() + ", Area: " + r3.area() + ", Perimetro: " + r3.perimetro());
		
		Retangulo q1 = new Quadrado(Math.round(Math.random() * 10), Math.round(Math.random() * 10), "Azul", Math.round(Math.random() * 10));
		System.out.println("\nQuadrado 1: " + q1.toString() + ", Area: " + q1.area() + ", Perimetro: " + q1.perimetro());
		
		Retangulo q2 = new Quadrado(p1, "Preto", Math.round(Math.random() * 10));
		System.out.println("\nQuadrado 2: " + q2.toString() + ", Area: " + q2.area() + ", Perimetro: " + q2.perimetro());
		
		if(c1.intersectsWith(c2)) {
			System.out.println("Os circulos 1 e 2 intersetam-se.");
		} else {
			System.out.println("Os circulos 1 e 2 nao se intersetam.");
		}
		
	}

}
