package teste_deste_ano;

public class ObjetoMovel {
	
	private CorDaBola c;
	private int x=0, y=0;
	private double velocidade=0, distancia=0;
	
	
	public ObjetoMovel (CorDaBola c){
		this.c=c;
	}
	
	public ObjetoMovel (int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void move(int newX, int newY){
		this.distancia=Math.sqrt(Math.pow(newX-this.x, 2)+Math.pow(newY-this.y, 2));
		this.x=newX;
		this.y=newY;
	}
	
	public void move(int newX, int newY, double velocidade){
		this.distancia=Math.sqrt(Math.pow(newX-this.x, 2)+Math.pow(newY-this.y, 2));
		this.velocidade=velocidade;
		this.x=newX;
		this.y=newY;
	}
	
	public CorDaBola getC() {
		return c;
	}

	public void setC(CorDaBola c) {
		this.c = c;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

}
