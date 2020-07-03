package aula10;

import java.util.*;
import java.io.*;

public class A10E03 {

	public static void main(String[] args){
		
		try {
			// Ler o ficheiro
			Scanner input = new Scanner(new FileReader("voos.txt"));
			Scanner input2 = new Scanner(new FileReader("companhias.txt"));
			
			// Ignorar a primeira linha
			String firstLine = input.next();
			String firstLine2 = input2.nextLine();
			
			// Conjuntos para guardar os voos e as companhias
			List<Voo> voos = new LinkedList<>();
			Set<Companhia> companhias = new TreeSet<>();
			Map<Companhia, List<String>> atrasos = new TreeMap<>();
			
			
			while(input2.hasNext()) {
				// Armazenar num array cada palavra de uma linha do ficheiro "companhias.txt"
				String[] linha = input2.nextLine().split("\t");
				// Adicionar ao conjunto 'companhias' todas as companhias lidas do ficheiro "companhias.txt"
				companhias.add(new Companhia(linha[0], linha[1]));
			}
			
			while(input.hasNext()) {
				// Armazenar num array cada palavra de uma linha do ficheiro "voos.txt"
				String[] linha = input.nextLine().split("\t");
				// Atribuir cada palavra armazenada no array a uma variavel, para facilitar a compreensao
				String horaChegada = linha[0];
				String nome = linha[1];
				String origem = linha[2];
				String atraso;
				
				if(linha.length == 4) {
					atraso = linha[3];
				} else {
					atraso = null;
				}
				
				// Verificar se as primeiras duas letras do nome do Voo sao iguais a sigla de uma certa companhia
				for(Companhia c : companhias) {
					if(c.getSigla().equals(nome.substring(0, 2))) {
						// Adicionar ao conjunto 'voos' um novo voo
						voos.add(new Voo(nome, horaChegada, origem, atraso, c));
						
						if(atraso != null) {
							if(!atrasos.containsKey(c)) {
								atrasos.put(c, new ArrayList<String>());
								atrasos.get(c).add(atraso);
							} else {
								atrasos.get(c).add(atraso);
							}
						}
					}
				}
				
			}
			
			System.out.printf("%-10s%-10s%-20s%-25s%-10s%-15s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
			
			FileWriter outputstream = new FileWriter("Infopublico.txt");
			PrintWriter escreve = new PrintWriter(outputstream);
			
			
			for(Voo v : voos) {
				String atraso = "";
				String novaHora = "";
				if(!(v.getAtraso() == null)) {
					atraso = v.getAtraso();
					novaHora = v.newHour(v.getHoraChegada(), atraso);
				}
				
				
				System.out.printf("%-10s%-10s%-20s%-25s%-10s%-15s\n", v.getHoraChegada(), v.getNome(), v.getCompanhia().getNome()
						, v.getOrigem(), atraso, novaHora);
				
				String voo = String.format("%-10s%-10s%-20s%-25s%-10s%-15s\n", v.getHoraChegada(), v.getNome(), v.getCompanhia().getNome()
						, v.getOrigem(), atraso, novaHora);
				
				escreve.write(voo);
				
				
			}
			
			escreve.close();
			
			Set<Atraso> atrasosMedios = new TreeSet<>();
			
			for(Companhia c : atrasos.keySet()) {
				atrasosMedios.add(new Atraso(c, atrasoMedio(atrasos.get(c))));
			}
			
			System.out.printf("\n%-30s%-10s\n","Companhia","Atraso");
			
			for(Atraso a : atrasosMedios) {
				System.out.printf("%-30s%-10s\n",a.getCompanhia(),a.getAtraso());
			}
			
			Map<String, Integer> contador = new HashMap<>();
			Set<Origens> origens = new TreeSet<>();
			
			for(Voo v : voos) {
				if(!contador.containsKey(v.getOrigem())) {
					contador.put(v.getOrigem(), 1);
				} else {
					contador.put(v.getOrigem(), contador.get(v.getOrigem()) + 1);
				}
			}
			
			
			for(String s : contador.keySet()) {
				origens.add(new Origens(s, contador.get(s)));
			}
			
			System.out.printf("\n%-25s%-5s\n", "Origem", "Voo");
			
			FileWriter cidades = new FileWriter("cidades.txt");
			PrintWriter ce = new PrintWriter(cidades);
			
			ce.write(String.format("\n%-25s%-5s\n", "Origem", "Voo"));
			
			for(Origens o : origens) {
				String s = String.format("%-25s%-5d\n", o.getOrigem(), o.getOcorrencias());
				System.out.print(s);
				ce.write(s);
				
			}
			
			ce.close();
			
			
		} catch(Exception e) {
			System.out.println("\nErro ao abrir o ficheiro!");
		}
		

	}
	
	public static String atrasoMedio(List<String> list) {
		
		int totalMinutos = 0;
		
		for(String hora : list) {
			totalMinutos += convertToMinutes(hora);
		}
		
		double atrasoMedio = totalMinutos / list.size();
		
		return "" + (int)(atrasoMedio / 60) + ":" + (int)(atrasoMedio - ((int)(atrasoMedio / 60) * 60));
		
	}
	
	public static int convertToMinutes(String hora) {
		int horas, minutos;
		horas = Integer.parseInt(hora.substring(0, 2));
		minutos = Integer.parseInt(hora.substring(3, 5));
		return horas * 60 + minutos;
	}

}
