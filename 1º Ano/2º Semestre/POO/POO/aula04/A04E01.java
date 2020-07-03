package aula04;
import java.lang.Math;

public class A04E01 {

	public static void main(String[] args) {
		
		// primeiro ponto
		System.out.println("Ponto 1");
		Ponto p1 = new Ponto(Math.round(Math.random() * 10), Math.round(Math.random() * 10));
		System.out.println("Ponto 1 to String: " + p1.toString());
		
		// segundo ponto
		System.out.println("Ponto 2");
		Ponto p2 = new Ponto(Math.round(Math.random() * 10), Math.round(Math.random() * 10));
		System.out.println("Ponto 2 to String: " + p2.toString());
		
		// primeiro circulo
		System.out.println("Circulo 1");
		Circulo c1 = new Circulo(p1, Math.round(Math.random() * 10), "preto");
		System.out.println("Circulo 1 to String: " + c1.toString());
		
		// segundo circulo
		System.out.println("Circulo 2");
		Circulo c2 = new Circulo(Math.round(Math.random() * 10), Math.round(Math.random() * 10), Math.round(Math.random() * 10), "amarelo");
		System.out.println("Circulo 2 to String: " + c2.toString());
		
		// alterar a cor do primeiro circulo
		c1.setCor("vermelho");
		System.out.println("Cor do primeiro circulo: " + c1.getCor());
		
		// alterar o raio do segundo circulo
		c2.setRaio(3.5);
		System.out.println("Raio do segundo circulo: " + c2.getRaio() + "\n");
		
		// circulo 1 e 2 depois das alteracoes
		System.out.println("Circulo 1 to String: " + c1.toString());
		System.out.println("Circulo 2 to String: " + c2.toString());
		
		// area dos circulos
		System.out.println("Area do circulo 1: " + c1.getArea());
		System.out.println("Area do circulo 2: " + c2.getArea() + "\n");
		
		// perimetro dos circulos
		System.out.println("Perimetro do circulo 1: " + c1.getPerimetro());
		System.out.println("Perimetro do circulo 2: " + c2.getPerimetro() + "\n");
		
		// averiguar se os circulos se intersetam
		boolean intersect = c1.intersectCircles(c2);
		if (intersect) {
			System.out.println("Os circulos intersectam-se.");
		} else {
			System.out.println("Os circulos nao se intersectam.");
		}
		
		// criar um quadrado
		System.out.println("\nQuadrado 1: ");
		Quadrado q1 = new Quadrado(p1, Math.round(Math.random() * 10), "vermelho");
		System.out.println("Quadrado 1 to String: " + q1.toString());
		
		// criar o segundo quadrado utilizando um construtor diferente
		// este quadrado nao tem cor
		System.out.println("\nQuadrado 2: ");
		Quadrado q2 = new Quadrado(Math.round(Math.random() * 10), Math.round(Math.random() * 10), Math.round(Math.random() * 10));
		System.out.println("Quadrado 2 to String: " + q2.toString());
		
		// criar um terceiro quadrado utilizando outro construtor
		// este quadrado so tem um valor para o lado
		System.out.println("\nQuadrado 3: ");
		Quadrado q3 = new Quadrado(Math.round(Math.random() * 10));
		System.out.println("Quadrado 3 to String: " + q3.toString());
		
		// calcular as areas dos quadrados
		System.out.println("\nArea do quadrado 1: " + q1.getArea());
		System.out.println("Area do quadrado 2: " + q2.getArea());
		System.out.println("Area do quadrado 3: " + q3.getArea());
		
		// calcular os perimetros dos quadrados
		System.out.println("\nPerimetro do quadrado 1: " + q1.getPerimetro());
		System.out.println("Perimetro do quadrado 2: " + q2.getPerimetro());
		System.out.println("Perimetro do quadrado 3: " + q3.getPerimetro());
		
		// calcular as diagonais dos quadrados
		System.out.println("\nDiagonal do quadrado 1: " + q1.getDiagonal());
		System.out.println("Diagonal do quadrado 2: " + q2.getDiagonal());
		System.out.println("Diagonal do quadrado 3: " + q3.getDiagonal());
		
		// criar um novo retangulo
		System.out.println("\nRetangulo 1: ");
		Retangulo r1 = new Retangulo(Math.round(Math.random() * 10), Math.round(Math.random() * 10), p1, "vermelho");
		System.out.println("Retangulo 1 to String: " + r1.toString());
		
		// criar um segundo retangulo
		// este retangulo nao tem centro nem cor
		System.out.println("\nRetangulo 2: ");
		Retangulo r2 = new Retangulo(Math.round(Math.random() * 10), Math.round(Math.random() * 10));
		System.out.println("Retangulo 2 to String: " + r2.toString());
		
		// criar um terceiro retangulo
		System.out.println("\nRetangulo 3: ");
		Retangulo r3 = new Retangulo(Math.round(Math.random() * 10), Math.round(Math.random() * 10), p2);
		System.out.println("Retangulo 3 to String: " + r3.toString());
		
		// mudar o comprimento do primeiro retangulo
		System.out.println("\nMudar o comprimento do primeiro retangulo: ");
		System.out.println("Antigo comprimento: " + r1.getComprimento());
		r1.setComprimento(Math.round(Math.random() * 10));
		System.out.println("Novo comprimento: " + r1.getComprimento());
		
		// area dos retangulos
		System.out.println("\nÁrea do retangulo 1: " + r1.getArea());
		System.out.println("Área do retangulo 2: " + r2.getArea());
		System.out.println("Área do retangulo 3: " + r3.getArea());
		
		// perimetro dos retangulos
		System.out.println("\nPerimetro do retangulo 1: " + r1.getPerimetro());
		System.out.println("Perimetro do retangulo 2: " + r2.getPerimetro());
		System.out.println("Perimetro do retangulo 3: " + r3.getPerimetro());
		
		// diagonal dos retangulos
		System.out.println("\nDiagonal do retangulo 1: " + r1.getDiagonal());
		System.out.println("Diagonal do retangulo 2: " + r2.getDiagonal());
		System.out.println("Diagonal do retangulo 3: " + r3.getDiagonal());
		
	}
	
}
