package teste_deste_ano;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RoboCopa {
	public static void main(String[] args) {
		RoboCopa exam = new RoboCopa();
		exam.parte1();
		exam.parte2();
	}

	private void parte1() {
		
		Bola bola = null;
		bola = new Bola(CorDaBola.Amarela);
		showOMStatus(bola);
		
		Equipa e1 = new Equipa("BeiraMar", "JJ");
		Robo r[] = {
				new Robo("Ron", TipoJogador.GuardaRedes, 5, 0), //int x = 5 && int y = 0
				new Robo("Mes", TipoJogador.Avançado, 2, 40),
				new Robo("Pau", TipoJogador.Defesa, 7, 10),
				new Robo("Ema", TipoJogador.Médio, 5, 25),
				new Robo("Tim", TipoJogador.Médio, 1, 20) };
		for (ObjetoMovel o: r)
			showOMStatus(o);
		
		e1.add(r[0]);
		e1.add(r[1]);
		e1.add(r[2]);
		e1.add(r[1]);
		e1.add(r[3]);
		e1.add(r[4]);
		e1.remove(r[3]);
		System.out.print("-- " + e1);

		Equipa e2 = new Equipa("PortoDAveiro", "Lopes");
		e2.add(new Robo("Liu", TipoJogador.GuardaRedes, 5, 80));
		e2.add(new Robo("Min", TipoJogador.Avançado, 3, 10));
		e2.add(new Robo("Hus", TipoJogador.Defesa, 6, 70));
		e2.add(new Robo("Taw", TipoJogador.Médio, 5, 65));
		e2.add(new Robo("Taw", TipoJogador.Médio, 5, 65));
		System.out.print("-- " + e2);

		if(Bola.getnBolas() == 0)
			bola = new Bola(CorDaBola.Azul);
		else
			System.out.println("Já temos bola!");
		
		Jogo tacoataco = new Jogo(e1, e2, bola, 20);
		System.out.println("--- " + tacoataco);
	 	
		// simulação simples de movimentos e golos de uma equipa
		Robo[] r2 = e2.getRobos();
	 	r2[1].marcaGolo();
	 	r2[1].move(40, 40);
	 	r2[1].move(60, 40);
	 	r2[1].move(70, 40);
	 	r2[1].marcaGolo(); 
	 	r2[2].move(55, 55, 20);
	 	r2[3].move(40, 20);
	 	r2[3].move(60, 20);
	 	r2[3].move(70, 20);
	 	r2[3].marcaGolo(); 
	 	for (Robo rob: r)
	 		showRoboStatus(rob);
	 	
		System.out.println("Score: " + e1.getGolosMarcados() + " - "+e2.getGolosMarcados());
	}

	private void showOMStatus(ObjetoMovel om) {
		System.out.printf("OM: %3d %3d %3.0f %5.1f\n", om.getX(), om.getY(), om.getVelocidade(), om.getDistancia());
	}

	private void showRoboStatus(Robo rob) {
		System.out.printf("%-10s %-15s %3d %3d %3.0f %5.1f %3d\n", rob.getId(), rob.getTipo(), 
 				rob.getX(), rob.getY(), rob.getVelocidade(), rob.getDistancia(), rob.getGolos());
	}
	
	private void parte2() {
		List <Equipa> equipas = new ArrayList<Equipa> ();
		List <Robo> robos = new ArrayList<Robo> ();
		
		try{
			Scanner reader = new Scanner(new File("robos.txt"), "utf-8");	
			while(reader.hasNextLine()){
				String[] c = reader.nextLine().split("\t");
				if(!(c[2].equals("Posição"))){
					if(c[2].equals("Guarda-redes")){
						c[2]="GuardaRedes";
					}
					robos.add(new Robo(c[0], TipoJogador.valueOf(c[2]),0,0));
					Equipa e1 = new Equipa(c[1], "Unknow");
					e1.add(new Robo(c[0], TipoJogador.valueOf(c[2]),0,0));
					if(equipas.size()==0){
						equipas.add(e1);
					}else{
						for(int x=0; x<equipas.size(); x++){
							if(c[1].equals(equipas.get(x).getNomeEquipa())){
								equipas.get(x).add(new Robo(c[0], TipoJogador.valueOf(c[2]),0,0));
								break;
							}else{
								if(x==equipas.size()-1){
									equipas.add(e1);
								}
							}
						}
					
					//equipas.add(e1);
					}
				}
			}
			reader.close();
		}catch (FileNotFoundException e){
			System.out.println("Ficheiro não encontrado.");
		}
		try{
			FileWriter g = new FileWriter("parte2.txt");
			g.write("Lista de equipas ("+equipas.size()+" equipas)\n");
			g.write(""+equipas);
			g.write("Lista de robôs ("+robos.size()+" robôs)\n");
			g.write(""+robos);
			g.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.printf("Lista de equipas (%d equipas)\n", equipas.size());
		System.out.println(equipas);
		System.out.printf("Lista de robôs (%d robôs)\n", robos.size());
		System.out.println(robos);
	}
	
}
