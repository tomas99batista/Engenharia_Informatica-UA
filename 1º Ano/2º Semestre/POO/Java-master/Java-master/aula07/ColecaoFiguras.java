package aula07;

import java.util.ArrayList;
import java.util.List;

public class ColecaoFiguras {
	private double maxArea;
	private List<Figura> colecao = new ArrayList<Figura>();
	private double areaTotal;
	
	public ColecaoFiguras(double maxArea) {
		this.maxArea = maxArea;
	}

	public boolean addFigura(Figura f) {
		if(exists(f)) {
			return false;
		}
		if((f.area() + this.areaTotal) <= maxArea) {
			areaTotal += f.area();
			colecao.add(f);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean delFigura(Figura f) {
		areaTotal -= f.area();
		colecao.remove(f);
		return true;
	}
	
	public double areaTotal() {
		return this.areaTotal;
	}
	
	public boolean exists(Figura f) {
		for(Figura figura : colecao) {
			if(figura.equals(f)) {
				return true;
			}
		}
		return false;
	}
	
	public Figura[] getFiguras() {
		Figura[] f = new Figura[colecao.size()];
		for(int i = 0; i < colecao.size(); i++){
			f[i] = colecao.get(i);
		}
		return f;
	}
	
	public Ponto[] getCentros() {
		Ponto[] p = new Ponto[colecao.size()];
		for(int i = 0; i < colecao.size(); i++){
			p[i] = colecao.get(i).getCentro();
			
		}
		return p;
	}
}
