package aula05;

import java.util.Arrays;

public class Conjunto {
	
	private int[] array = new int[100]; // array com a dimensao generica de 100 
	private static int contador = 0; // variavel estatica, comum a todos os objetos da classe 'Conjunto'
	
	
	public void insert(int n) {
		
		// ciclo para averiguar se o inteiro 'n' esta no array
		for(int i = 0 ; i <= contador ; i++) {
			if(n == array[i]) {
				return;
			}
		}
		
		// adicao do inteiro 'n' ao array
		array[contador] = n;
		contador++;
		
	}
	
	// metodo para averiguar se um inteiro 'n' esta contido no conjunto
	public boolean contains(int n) {
		for(int i = 0; i < contador; i++) {
			if(array[i] == n) {
				return true;
			}
		}
		return false;
	}
	
	// metodo para retirar um inteiro 'n' ao conjunto
	public void remove(int n) {
		// ciclo para averiguar se o inteiro 'n' esta no conjunto
		for(int i = 0; i < contador; i++) {
			if(array[i] == n) { // em caso afirmativo:
				// ciclo para deslocar todos os inteiros seguintes a 'n' uma posicao para a esquerda
				for(int c = i; c < contador; c++) {
					array[c] = array[c+1];
				}
			}
		}
		contador--;
	}
	
	// metodo para apagar todos os elementos
	public void empty() {
		for(int i = 0 ; i < contador ; i++) {
			array[i] = 0;
		}
		contador = 0;
	}
	
	
	
	
	
	public static int getContador() {
		return contador;
	}

	public int size() {
		int c = 0;
		for(int i = 0; i < contador; i++) {
			if(this.array[i] != 0) {
				c++;
			}
		}
		return c;
	}
	
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public Conjunto unir(Conjunto c) {
		Conjunto c1 = new Conjunto();
		
		// ciclo para preencher o novo conjunto com os elementos do conjunto 'this'
		for(int i = 0; i < contador; i++) {
			c1.insert(array[i]);
		}
		
		// ciclo para adicionar elementos do conjunto 'c' ao novo conjunto que nao estejam repetidos
		for(int i = 0; i < c.getContador(); i++) {
			if(this.contains(c.getArray()[i]) == false) {
				c1.insert(c.getArray()[i]);
			}
		}
		
		return c1;
	}
	
	public Conjunto subtrair(Conjunto c) {
		Conjunto c1 = new Conjunto();
		
		// ciclo para preencher o novo conjunto com os elementos do conjunto 'this'
		for(int i = 0; i < contador; i++) {
			c1.insert(array[i]);
		}
		
		// ciclo para retirar ao novo conjunto elementos do conjunto 'c' repetidos
		for(int i = 0; i < c.getContador(); i++) {
			if(this.contains(c.getArray()[i])) {
				c1.remove(c.getArray()[i]);
			}
		}
		
		return c1;
	}
	
	public Conjunto intersect(Conjunto c) {
		Conjunto c1 = new Conjunto();
		
		for(int i = 0; i < contador; i++) {
			if(c.contains(array[i]) && c1.contains(array[i]) == false) {
				c1.insert(array[i]);
			}
		}
		
		return c1;
	}
	
	
	
	// metodo toString() para imprimir um objeto
	@Override
	public String toString() {
		String numeros = " ";
		for(int i = 0; i < contador; i++) {
			if(this.array[i] != 0) {
				numeros += this.array[i] + " ";
			}
		}
		return "[" + numeros + "]";
	}
	
	
	
	

}
