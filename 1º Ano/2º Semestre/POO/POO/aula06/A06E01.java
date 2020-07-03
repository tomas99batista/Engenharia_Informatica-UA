package aula06;

import java.util.*;
import java.lang.Math;

public class A06E01 { // igual à entidade "Jogo" pedido no enunciado

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nJogo de futebol robotico");
		
		// criar equipa 1
		System.out.println("\nEquipa 1:");
		System.out.print("  Nome: ");
		String nome = sc.nextLine();
		System.out.print("  Responsavel: ");
		String nomeR = sc.nextLine();
		Equipa equipa1 = new Equipa(nome, nomeR);
		
		// criar equipa 2
		System.out.println("\nEquipa 2:");
		System.out.print("  Nome: ");
		nome = sc.nextLine();
		System.out.print("  Responsavel: ");
		nomeR = sc.nextLine();
		Equipa equipa2 = new Equipa(nome, nomeR);
		
		// adicionar bola
		System.out.println("\nAdicionar bola: ");
		System.out.print("  Cor da bola: ");
		String cor = sc.nextLine();
		Bola bola = new Bola(0, 0, 10.0, cor);
		
		
		// preencher equipa 1
		System.out.println("\nEquipa 1:");
		System.out.println("\nGuarda-Redes adicionado!");
		equipa1.addRobo((int)(Math.random() * 10), (int)(Math.random() * 10), Math.round(Math.random() * 10), "GUARDAREDES");
		
		System.out.println("Defesa adicionado!");
		equipa1.addRobo((int)(Math.random() * 10), (int)(Math.random() * 10), Math.round(Math.random() * 10), "DEFESA");
		
		System.out.println("Medio adicionado!");
		equipa1.addRobo((int)(Math.random() * 10), (int)(Math.random() * 10), Math.round(Math.random() * 10), "MEDIO");
		
		System.out.println("Medio adicionado!");
		equipa1.addRobo((int)(Math.random() * 10), (int)(Math.random() * 10), Math.round(Math.random() * 10), "MEDIO");
		
		System.out.println("Avancado adicionado!");
		equipa1.addRobo((int)(Math.random() * 10), (int)(Math.random() * 10), Math.round(Math.random() * 10), "AVANCADO");
		
		// preencher equipa 2
		System.out.println("\nEquipa 2:");
		System.out.println("\nGuarda-Redes adicionado!");
		equipa2.addRobo((int)(Math.random() * 10), (int)(Math.random() * 10), Math.round(Math.random() * 10), "GUARDAREDES");
				
		System.out.println("Defesa adicionado!");
		equipa2.addRobo((int)(Math.random() * 10), (int)(Math.random() * 10), Math.round(Math.random() * 10), "DEFESA");
				
		System.out.println("Medio adicionado!");
		equipa2.addRobo((int)(Math.random() * 10), (int)(Math.random() * 10), Math.round(Math.random() * 10), "MEDIO");
				
		System.out.println("Medio adicionado!");
		equipa2.addRobo((int)(Math.random() * 10), (int)(Math.random() * 10), Math.round(Math.random() * 10), "MEDIO");
				
		System.out.println("Avancado adicionado!\n");
		equipa2.addRobo((int)(Math.random() * 10), (int)(Math.random() * 10), Math.round(Math.random() * 10), "AVANCADO");
		
		System.out.println(equipa1);
		System.out.println("\n" + equipa2);
		
		// arrays de jogadores das equipas
		Robo[] jogadores1 = equipa1.getJogadores();
		Robo[] jogadores2 = equipa2.getJogadores();
		
		// mover um jogador
		System.out.println("\nMover um jogador: ");
		System.out.println(jogadores1[3].getId() + ": X - " + jogadores1[3].getX() + ", Y - " + jogadores1[3].getY() + ", distancia - " + jogadores1[3].getDistancia());
		jogadores1[3].move((int)(Math.random() * 10), (int)(Math.random() * 10));
		System.out.println(jogadores1[3].getId() + " nova posicao: X - " + jogadores1[3].getX() + ", Y - " + jogadores1[3].getY() + ", distancia - " + jogadores1[3].getDistancia());
		
		
		// marcar golo
		System.out.println("\nMarcar golo - " + jogadores2[2].getId());
		jogadores2[2].marcarGolo(); equipa1.sofrerGolo();
		jogadores2[2].marcarGolo(); equipa1.sofrerGolo();
		jogadores2[2].marcarGolo(); equipa1.sofrerGolo();
		System.out.println("Numero de golos marcados: " + jogadores2[2].getnGolos());
		
		System.out.println("\nMarcar golo - " + jogadores2[1].getId());
		jogadores2[1].marcarGolo(); equipa1.sofrerGolo();
		jogadores2[1].marcarGolo(); equipa1.sofrerGolo();
		System.out.println("Numero de golos marcados: " + jogadores2[1].getnGolos());
		
		// estatisticas do jogo
		System.out.println("Estatisticas do jogo: ");
		System.out.println(equipa1.getNome() + " " + equipa1.getnGolosM() + " - " + equipa2.getnGolosM() + " " + equipa2.getNome());
		for(int i = 0; i < 5 ; i++) {
			System.out.printf("%7s%5d%7s%5d\n", jogadores1[i].getId(), jogadores1[i].getnGolos(), jogadores2[i].getId(), jogadores2[i].getnGolos() );
		} 
		System.out.println("\nCor da bola: " + bola.getCor());
		
		
		
		
		sc.close();
	}

}
