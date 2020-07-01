package aula08;

import java.util.*;

public class ProgramaEmenta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // objeto 'sc' para ler dados do teclado
		
		// o objeto 'p1' da classe 'Prato' e apenas de auxilio
		Prato p1 = new Prato("Prato"); boolean escolhido = false;
		
		System.out.println("Bem-vindo ao Refeitório de Santiago da Universidade de Aveiro!");
		
		Ementa ementa = new Ementa("Ementa", "Refeitório de Santiago");
		
		// lista para armazenar alimentos aleatorios
		List<Alimento> alimentos = new ArrayList<>();
		
		// contador de alimentos; contador de pratos;
		int contador = 0 , contadorP = 0;
		
		// ciclo do menu
		int op = 0;
		while(op != 11) {
			op = menu();
			
			switch(op) {
			
			// terminar programa
			case 11: 
				System.out.println("\nObrigado por utilizar os nossos serviços."); break;
			
			// adicionar carne
			case 1: 
				Variedade variedade = Variedade.OUTRA;
				switch((int)(Math.random() * 5)) {
				case 1:
					variedade = Variedade.VACA; break;
				case 2:
					variedade = Variedade.PORCO; break;
				case 3:
					variedade = Variedade.PERU; break;
				case 4:
					variedade = Variedade.FRANGO; break;
				
				}
				alimentos.add(new Carne((Math.random() * 300), (Math.random() * 300), (Math.random() * 300), variedade));
				System.out.println("\nIngrediente Carne adicionado!"); 
				System.out.println(alimentos.get(contador));
				contador++;
				break;
			
			// adicionar peixe
			case 2:
				Tipo tipo = Tipo.CONGELADO;
				switch((int)(Math.random() * 3)) {
				case 1:
					tipo = Tipo.CONGELADO; break;
				case 2:
					tipo = Tipo.FRESCO; break;
				}
				alimentos.add(new Peixe((Math.random() * 300), (Math.random() * 300), (Math.random() * 300), tipo));
				System.out.println("\nIngrediente Peixe adicionado!"); 
				System.out.println(alimentos.get(contador));
				contador++;
				break;
				
			// adicionar cereal
			case 3:
				alimentos.add(new Cereal((Math.random() * 300), (Math.random() * 300), (Math.random() * 300), "Pao")); 
				System.out.println("\nIngrediente Cereal adicionado!"); 
				System.out.println(alimentos.get(contador));
				contador++;
				break;
				
			// adicionar legume	
			case 4:
				alimentos.add(new Legume((Math.random() * 300), (Math.random() * 300), (Math.random() * 300), "Cenoura")); 
				System.out.println("\nIngrediente Legume adicionado!");
				System.out.println(alimentos.get(contador));
				contador++;
				break;
				
			// adicionar um novo prato
			case 5:
				DiaSemana diaSem = DiaSemana.DOMINGO;
				switch((int)(Math.random() * 8)) {
				case 1:
					diaSem = DiaSemana.DOMINGO; break;
				case 2:
					diaSem = DiaSemana.SEGUNDA; break;
				case 3:
					diaSem = DiaSemana.TERCA; break;
				case 4:
					diaSem = DiaSemana.QUARTA; break;
				case 5:
					diaSem = DiaSemana.QUINTA; break;
				case 6:
					diaSem = DiaSemana.SEXTA; break;
				case 7:
					diaSem = DiaSemana.SABADO; break;
				}
				ementa.addElement(new Prato("Prato ", diaSem));
				System.out.println("\nPrato adicionado!"); 
				System.out.println(ementa.getElement(contadorP)); 
				contadorP++;
				break;
				
			// remover um prato
			case 6:
				if(ementa.size() > 0) {
					ementa.removeElement((int)(Math.random() * (ementa.size() - 1)));
					System.out.println("\nPrato removido!");
					contadorP--;
					break;
				} else {
					System.out.println("\nNenhum Prato adicionado ainda!");
				}
				
			// selecionar um prato
			case 7:
				if(ementa.size() > 0) {
					System.out.println("\nLista de pratos: ");
					for(int i = 0; i < ementa.size(); i++) {
						System.out.println(ementa.getElement(i));
					}
					int p;
					do {
						System.out.print("Escolha do Prato: ");
						p = sc.nextInt();
						if(p > 0 && p <= (Prato.getId() - 1)) {
							for(int i = 0; i < ementa.size(); i++) {
								if(ementa.getElement(i).getMyID() == p) {
									p1 = ementa.getElement(i);
									System.out.println("\nPrato selecionado!\n" + p1);
									escolhido = true;
									break;
								}
							}
						} else {
							System.out.println("\nPrato invalido!");
						}
						
					} while(!(p > 0 && p <= (Prato.getId() - 1)));
					
				} else {
					System.out.println("\nAinda nao existem pratos!");
				}
				break;
				
			// adicionar ingrediente ao prato
			case 8:
				
				if(alimentos.size() > 0 && escolhido) {
					System.out.println("\nIngrediente disponiveis: \n");
					for(int i = 0; i < alimentos.size() ; i++) {
						System.out.println("" + (i + 1) + " - " + alimentos.get(i));
					}
					int p;
					do {
						System.out.print("Escolha do ingrediente: ");
						p = sc.nextInt();
						if(p > 0 && p <= alimentos.size()) {
							p1.addElement(alimentos.get(p - 1));
							System.out.println("\nIngrediente escolhido!\n" + alimentos.get(p - 1));
							
							System.out.println("\n" + p1);
							p1.informacoes();
						} else {
							System.out.println("\nIngrediente indisponivel!");
						}
					} while(!(p > 0 && p <= alimentos.size()));
				} else {
					System.out.println("\nAinda nao existem ingredientes!");
				}
				break;
			
			// remover ingrediente ao prato
			case 9:
				if(p1.size() > 0 && escolhido) {
					System.out.println("\nIngrediente disponiveis: \n");
					for(int i = 0; i < p1.size() ; i++) {
						System.out.println("" + (i + 1) + " - " + p1.getElement(i));
					}
					
					int p;
					do {
						System.out.print("Escolha do ingrediente: ");
						p = sc.nextInt();
						if(p > 0 && p <= p1.size()) {
							p1.removeElement(p-1);
							System.out.println("\nIngrediente escolhido!\n" + p1.getElement(p - 1));
							System.out.println("\n" + p1);
							p1.informacoes();
						} else {
							System.out.println("\nIngrediente indisponivel!");
						}
					} while(!(p > 0 && p <= p1.size()));
				} else {
					System.out.println("\nAinda nao existem ingredientes!");
				}
				break;
				
			// imprimir a ementa
			case 10:
				if(ementa.size() > 0) {
					System.out.println(ementa);
					for(int i = 0; i < ementa.size() ; i++) {
						System.out.println("\n" + ementa.getElement(i));
						ementa.getElement(i).informacoes();
					}
				} else {
					System.out.println("\nEmenta vazia!");
				}
				break;
			default:
				System.out.println("\nNao implementado."); 
				break;
			}
		}
		

	}
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n- Ingrediente");
		System.out.println("   1 - Adicionar Carne");
		System.out.println("   2 - Adicionar Peixe");
		System.out.println("   3 - Adicionar Cereal");
		System.out.println("   4 - Adicionar Legume");
		System.out.println("\n- Prato");
		System.out.println("   5 - Cria Prato");
		System.out.println("   6 - Apaga Prato");
		System.out.println("   7 - Seleciona Prato");
		System.out.println("   8 - Adiciona Ingrediente");
		System.out.println("   9 - Remove Ingrediente");
		System.out.println("\n- Ementa");
		System.out.println("   10 - Imprime Ementa");
		System.out.println("\n- Sair (11)");
		System.out.print("\nOpcao? ");
		return sc.nextInt();
	}

}
