package aula06;

import java.util.*;

public class A06E02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// criacao de uma nova agencia de viagens
		AgenciaViagens agencia = new AgenciaViagens("Viajens Aveiro", "Aveiro");
		
		// adicionar alojamentos a agencia de viagens
		    // quartos de hoteis
		agencia.addAlojamento(new QuartoHotel("Melia Ria", "Aveiro", 85.0, true, "double"));
		agencia.addAlojamento(new QuartoHotel("Melia Ria", "Aveiro", 80.0, false, "twin"));
		agencia.addAlojamento(new QuartoHotel("Melia Ria", "Aveiro", 75.0, true, "single"));
		agencia.addAlojamento(new QuartoHotel("Montebelo", "Viseu", 90.0, true, "double"));
		agencia.addAlojamento(new QuartoHotel("Montebelo", "Viseu", 90.0, false, "twin"));
		
		    // apartamentos
		agencia.addAlojamento(new Apartamento("ApartAveiro", "Aveiro", 150.0, true, 3));
		agencia.addAlojamento(new Apartamento("ApartAveiro", "Aveiro", 200.0, true, 2));
		agencia.addAlojamento(new Apartamento("ApartAveiro", "Aveiro", 250.0, false, 5));
		agencia.addAlojamento(new Apartamento("ApartViseu", "Viseu", 150.0, true, 1));
		agencia.addAlojamento(new Apartamento("ApartViseu", "Viseu", 50.0, true, 9));
		
		// adicionar carros a agencia
		agencia.addCarro(new Carro('A', "gasolina", true));
		agencia.addCarro(new Carro('A', "gasoleo", true));
		agencia.addCarro(new Carro('B', "gasolina", false));
		agencia.addCarro(new Carro('C', "gasoleo", false));
		agencia.addCarro(new Carro('D', "gasolina", true));
		
		// arrays com os alojamentos e carros da agencia
		Alojamento[] alojamentos = agencia.getAlojamentos();
		Carro[] carros = agencia.getCarros();
		
		// declaracao de variaveis
		int id;
		
		System.out.println("\nBem vindo a nossa Agencia de Viagens!");
		
		int op = 0;
		while(op != 10) {
			op = menu();
			switch(op) {
			case 10:
				System.out.println("Obrigado por viajar com a Viajens Aveiro! Volte sempre.");
				break;
			case 1:
				agencia.printQHotel();
				break;
			case 2:
				agencia.printApartamentos();
				break;
			case 3:
				agencia.printCarros();
				break;
			case 4:
				// fazer um checkin de um quarto de hotel
				System.out.print("\nEscolha o id do quarto de hotel: ");
				id = sc.nextInt();
				for(Alojamento alj : alojamentos) {
					if(alj instanceof QuartoHotel) {
						if(alj.getId() == id && alj.isDisponibilidade()) {
							alj.checkin();
							System.out.println("\nQuarto de hotel alugado com sucesso!");
						} else if(alj.getId() == id) {
							System.out.println("\nQuarto de hotel indisponivel.");
						}
					}
				}
				break;
			case 5:
				// fazer um checkin de um apartamento
				System.out.print("\nEscolha o id do apartamento: ");
				id = sc.nextInt();
				for(Alojamento alj : alojamentos) {
					if(alj instanceof Apartamento) {
						if(alj.getId() == id && alj.isDisponibilidade()) {
							alj.checkin();
							System.out.println("\nApartamento alugado com sucesso!");
						} else if(alj.getId() == id) {
							System.out.println("\nApartamento indisponivel.");
						}
					}
				}
				break;
			case 6:
				// levantar um carro
				System.out.print("\nEscolha o id do carro: ");
				id = sc.nextInt();
				for(Carro c : carros) {
					if(c.getId() == id && c.isDisponibilidade()) {
						c.levantar();
						System.out.println("\nCarro levantado com sucesso!");
					} else if(c.getId() == id) {
						System.out.println("\nCarro indisponivel!");
					}
				}
				break;
			case 7:
				// fazer um checkout de um quarto de hotel
				System.out.print("\nEscolha o id do quarto de hotel: ");
				id = sc.nextInt();
				for(Alojamento alj : alojamentos) {
					if(alj instanceof QuartoHotel) {
						if(alj.getId() == id && !alj.isDisponibilidade()) {
							alj.checkout();
							System.out.println("\nQuarto de hotel devolvido com sucesso!");
						} else if(alj.getId() == id) {
							System.out.println("\nQuarto de hotel disponivel para alugar.");
						}
					}
				}
				break;
			case 8:
				// fazer um checkout de um apartamento
				System.out.print("\nEscolha o id do apartamento: ");
				id = sc.nextInt();
				for(Alojamento alj : alojamentos) {
					if(alj instanceof Apartamento) {
						if(alj.getId() == id && !alj.isDisponibilidade()) {
							alj.checkout();
							System.out.println("\nApartamento devolvido com sucesso!");
						} else if(alj.getId() == id) {
							System.out.println("\nApartamento disponivel para alugar.");
						}
					}
				}
				break;
			case 9:
				// devolver um carro
				System.out.print("\nEscolha o id do carro: ");
				id = sc.nextInt();
				for(Carro c : carros) {
					if(c.getId() == id && !c.isDisponibilidade()) {
						c.entregar();
						System.out.println("\nCarro devolvido com sucesso!");
					} else if(c.getId() == id) {
						System.out.println("\nCarro disponivel para alugar!");
					}
				}
				break;
			default:
				System.out.println("\nNao implementado!");
				break;
			}
		}
	}
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1) Quartos de hoteis");
		System.out.println("2) Apartamentos");
		System.out.println("3) Carros");
		System.out.println("4) Alugar quarto de hotel");
		System.out.println("5) Alugar apartamento");
		System.out.println("6) Alugar carro");
		System.out.println("7) Devolver quarto de hotel");
		System.out.println("8) Devolver apartamento");
		System.out.println("9) Devolver carro");
		System.out.println("10) Sair");
		System.out.print("Opcao? ");
		return sc.nextInt();
	}

}
