package aula11;

import java.io.*;
import java.util.*;

public class A11E01 {

	public static void main(String[] args) throws IOException {
		
		try {
			
			Scanner input = new Scanner(new FileReader("veiculos.csv"));
			
			List<Veiculo> veiculos = new ArrayList<>();
			
			while(input.hasNext()) {
				
				String[] linha = input.next().split(";");
				String matricula = linha[1];
				String cor = linha[2];
				int ano = Integer.parseInt(linha[3]);
				int potencia = 0;
				if(linha.length >= 5) {
					potencia = Integer.parseInt(linha[4]);
				}
				
				
				
				if(linha[0].equals("CarroHibrido")) {
					veiculos.add(new CarroHibrido(matricula, ano, cor, potencia, Double.parseDouble(linha[5]), Double.parseDouble(linha[6])));
				} else if(linha[0].equals("CarroEletrico")) {
					veiculos.add(new CarroEletrico(matricula, ano, cor, potencia, Double.parseDouble(linha[5])));
				} else if(linha[0].equals("CarroCombustao")) {
					veiculos.add(new CarroCombustao(matricula, ano, cor, potencia, Double.parseDouble(linha[5])));
				} else if(linha[0].equals("Bicicleta")) {
					veiculos.add(new Bicicleta(matricula, ano, cor));
				} else if(linha[0].equals("MotoEletrica")) {
					veiculos.add(new MotoEletrica(matricula, ano, cor, potencia, Double.parseDouble(linha[5])));
				} else if(linha[0].equals("MotoCombustao")) {
					veiculos.add(new MotoCombustao(matricula, ano, cor, potencia, Double.parseDouble(linha[5])));
				}
			}
			
			for(Veiculo v : veiculos) {
				System.out.println(v);
			}
			
		} catch(Exception FileNotFoundException) {
			
			System.out.println("\nErro ao abrir o ficheiro!");
			
		}

	}

}
