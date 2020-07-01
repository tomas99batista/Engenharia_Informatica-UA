package aula06;

import java.lang.Math;

public class Objetomovel {
	
	private int x;
	private int y;
	private double velMax;
	private double distancia;
	
	// construtor
	public Objetomovel(int x, int y, double velMax) {
		this.x = x;
		this.y = y;
		this.velMax = velMax;
	}

	//toString
	@Override
	public String toString() {
		return "(x: " + x + ", y: " + y + ", velMax: " + velMax + ", distancia:" + distancia + ")";
	}

	// getters and setters
	
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

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	// metodo move
	public void move(int newX, int newY) {
		this.distancia += Math.sqrt(Math.pow((this.x - newX), 2) + Math.pow((this.y - newY), 2));
		this.x = newX;
		this.y = newY;
		
	}
	
	

}
