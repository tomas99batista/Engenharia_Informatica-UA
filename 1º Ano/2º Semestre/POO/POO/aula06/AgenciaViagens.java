package aula06;

import java.util.Arrays;

public class AgenciaViagens {
	private Alojamento[] alojamentos = new Alojamento[10];
	private Carro[] carros = new Carro[5];
	private String nome;
	private String endereco;
	private int contador1;
	private int contador2;
	
	public AgenciaViagens(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Agencia de Viagens - Alojamentos: " + Arrays.toString(alojamentos) + ", Carros: " + Arrays.toString(carros)
				+ ", Nome: " + nome + ", Endereco: " + endereco;
	}

	public Alojamento[] getAlojamentos() {
		return alojamentos;
	}

	public void setAlojamentos(Alojamento[] alojamentos) {
		this.alojamentos = alojamentos;
	}

	public Carro[] getCarros() {
		return carros;
	}

	public void setCarros(Carro[] carros) {
		this.carros = carros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	// metodo para adicionar um alojamento
	public void addAlojamento(Alojamento alojamento) {
		alojamentos[contador1] = alojamento;
		contador1++;
	}
	
	public void addCarro(Carro carro) {
		carros[contador2] = carro;
		contador2++;
	}
	
	public void printQHotel() {
		for(Alojamento alj : alojamentos) {
			if(alj instanceof QuartoHotel) {
				System.out.println("\n" + alj);
			}
		}
	}
	
	public void printApartamentos() {
		for(Alojamento alj : alojamentos) {
			if(alj instanceof Apartamento) {
				System.out.println("\n" + alj);
			}
		}
	}
	
	public void printCarros() {
		for(Carro c : carros) {
			System.out.println("\n" + c);
		}
	}
	
}
