package aula08;

public class A08E03 { 
	
	public static void main(String[] args) { 
		Ementa ementa = new Ementa("Especial Caloiro", "Snack da UA"); 
		Prato[] pratos = new Prato[10];
		
		for (int i=0; i < pratos.length; i++){ 
			pratos[i] = randPrato(i); 
			int cnt = 0; 
			
			while (cnt <2){ 
				// Adicionar 2 Ingredientes a cada Prato 
				Alimento aux = randAlimento(); 
				if (pratos[i].addElement(aux)) 
					cnt++; 
				else 
					System.out.println("ERRO: Nao e possivel adicionar '" + aux + "' ao -> " + pratos[i]); 
				} 
			
			ementa.addElement(pratos[i]);
			
		} 
		
		System.out.println("\n" + ementa); 
		
	} 
		
	//-----------------------------------------------------------------------
	// Retorna um Alimento Aleatoriamente 
	
	public static Alimento randAlimento() { 
		switch ((int) (Math.random() * 4)) { 
		default: 
			case 0: 
				return new Carne(22.3, 345.3, 300, Variedade.FRANGO); 
			case 1: 
				return new Peixe(31.3, 25.3, 200, Tipo.CONGELADO); 
			case 2: 
				return new Legume(21.3, 22.4, 150, "Couve Flor"); 
			case 3: 
				return new Cereal(19.3, 32.4, 110, "Milho"); 
			} 
		} 
	
	
	//-----------------------------------------------------------------------
	// Retorna um Tipo de Prato Aleatoriamente 
	
	public static Prato randPrato(int i) { 
		switch ((int) (Math.random() * 3)) { 
		default: 
			case 0: 
				return new Prato("Prato N." + i); 
			case 1: 
				return new PratoVegetariano("Prato N." + i + " (Vegetariano)"); 
			case 2: 
				return new PratoDieta("Prato N." + i + " (Dieta)", 90.8); 
			} 
		} 
}
