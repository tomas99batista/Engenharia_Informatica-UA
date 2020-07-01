package teste_deste_ano;

public class Bola extends ObjetoMovel {
	
	private static int nBolas=0;
	public Bola(CorDaBola c){
		super(c);
		nBolas++;
	}	
	
	static int getnBolas(){
		return nBolas;
		
	}
	
}
