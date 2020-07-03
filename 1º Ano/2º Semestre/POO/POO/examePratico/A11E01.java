package examePratico;

import java.util.*;
import java.io.*;

public class A11E01 {

	public static void main(String[] args) {
		
		Scanner input = null;
		
		// Tratamento da possibilidade de ocorrencia de erros ao abrir o ficheiro "veiculos.csv"
		try {
			input = new Scanner(new FileReader("veiculos.csv"));
		} catch(FileNotFoundException e) {
			System.out.println("\nErro ao abrir o ficheiro!");
		}
		
		// Conjunto de veiculos (Set<Veiculo>) para armazenar todos os veiculos lidos do ficheiro
		Set<Veiculo> veiculos = new TreeSet<>();
		
		while(input.hasNext()) {
			
			// Array com as todas as palavras de uma linha do ficheiro
			String[] linha = input.next().split(";");
			
			// Declaracao de variaveis para facilitar a leitura
			String nome = linha[0];
			String matricula = linha[1];
			String cor = linha[2];
			int ano = Integer.parseInt(linha[3]);
			double potencia = 0.0;
			
			if(linha.length >= 5) {
				potencia = Double.parseDouble(linha[4]);
			}
			
			switch(nome) {
			case "CarroHibrido":
				veiculos.add(new CarroHibrido(matricula, ano, cor, potencia, Double.parseDouble(linha[5])
						, Double.parseDouble(linha[6])));
				break;
			case "CarroEletrico":
				veiculos.add(new CarroEletrico(matricula, ano, cor, potencia, Double.parseDouble(linha[5]))); 
				break;
			case "CarroCombustao":
				veiculos.add(new CarroCombustao(matricula, ano, cor, potencia, Double.parseDouble(linha[5]))); 
				break;
			case "Bicicleta":
				veiculos.add(new Bicicleta(matricula, ano, cor));
				break;
			case "MotoEletrica":
				veiculos.add(new MotoEletrica(matricula, ano, cor, potencia, Double.parseDouble(linha[5])));
				break;
			case "MotoCombustao":
				veiculos.add(new MotoCombustao(matricula, ano, cor, potencia, Double.parseDouble(linha[5])));
				break;
			}
			
			
		}
		
		List<Automovel> carros = new ArrayList<>();
		List<Moto> motos = new ArrayList<>();
		List<Bicicleta> bicicletas = new ArrayList<>();
		
		for(Veiculo v : veiculos) {
			if(v.getClass().getName().contains("Carro"))
				carros.add((Automovel) v);
			else if(v.getClass().getName().contains("Moto"))
				motos.add((Moto) v);
			else 
				bicicletas.add((Bicicleta) v);
			System.out.println(v);
		}
		
		System.out.println("\nLista de carros [" + carros.size() + "]:\n");
		for(Automovel c : carros) {
			System.out.println(c);
		}
		
		System.out.println("\nLista de motos [" + motos.size() + "]:\n");
		for(Moto m : motos) {
			System.out.println(m);
		}
		
		System.out.println("\nLista de bicicletas [" + bicicletas.size() + "]:\n");
		for(Bicicleta b : bicicletas) {
			System.out.println(b);
		}
		
		FileWriter fe = null;
		PrintWriter pe = null;
		
		try {
			fe = new FileWriter("veiculos2.txt");
			pe = new PrintWriter(fe);
		} catch(IOException e) {
			System.out.println("\nErro ao abrir ficheiro!");
		}
		
		for(Veiculo v : veiculos) {
			pe.write(v.toString()+"\n");
		}
		
		pe.close();
		

	}

}
