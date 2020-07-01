package aula08;

import java.util.ArrayList;
import java.util.List;

public class Conjunto<E> {
	
	private List<E> colecao = new ArrayList<>();
	
	// metodo para averiguar se um determinado elemento esta contido na lista 'colecao'
	public boolean containsElement(E elemento) {
		if(colecao.contains(elemento)) {
			return true;
		} else {
			return false;
		}
	}
	
	// metodo para adicionar um elemento novo a lista 'colecao'
	public boolean addElement(E elemento) {
		if(!this.containsElement(elemento)) {
			colecao.add(elemento);
			return true;
		} else {
			return false;
		}
	}
	
	// metodo para remover um determinado elemento da lista 'colecao'
	public boolean removeElement(E elemento) {
		if(this.containsElement(elemento)) {
			colecao.remove(elemento);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removeElement(int index) {
		if(this.containsElement(colecao.get(index))) {
			colecao.remove(colecao.remove(index));
			return true;
		} else {
			return false;
		}
	}
	
	// metodo que retorna o tamanho do conjunto
	public int size() {
		return colecao.size();
	}
	
	// metodo que retorna se o conjunto esta vazio ou nao
	public boolean isEmpty() {
		return colecao.isEmpty();
	}
	
	public boolean removeAll() {
		return colecao.removeAll(colecao);
	}
	
	// metodo que retorna um array de elementos
	@SuppressWarnings("unchecked")
	public E[] giveElements() {
		E[] elementos = (E[]) new Object[colecao.size()];
		
		for(int i = 0; i < colecao.size(); i++) {
			elementos[i] = colecao.get(i);
		}
		
		return elementos;
	}

	@Override
	public String toString() {
		
		String text = "";
		
		for(E elemento : colecao) {
			text += (elemento.toString() + "\n");
		}
		
		return text;
	}

	public E getElement(int i) {
		return colecao.get(i);
	}
	
}
