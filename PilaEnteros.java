package proyecto;

import java.util.Arrays;

public class PilaEnteros {

	Integer pila [];
	final int MAX_ELEMENTOS;
	int cima;
	
	public PilaEnteros(int maxelementos) {
		this.pila = new Integer[maxelementos];
		this.MAX_ELEMENTOS = maxelementos;
		this.cima =-1;
	}
	
	public boolean isEmpty() { // si esta vacio
		boolean verificar;
		if(this.cima <0) {
			verificar = true;
		}else {
			verificar = false;
		}
		return verificar;
	}
	
	public boolean isFull () { // si esta lleno
		boolean verificar;
		if(this.cima == this.MAX_ELEMENTOS-1) {
			verificar = true;
		}else {
			verificar = false;
		}
		return verificar;
	}
	
	public Integer top() { // ver el ultimo elemento 
		Integer elemento;
		if (this.isEmpty() == true) {
			elemento = null;
		}else {
			elemento = this.pila[this.cima];
		}
		return elemento;
	}
	
	public Integer pop( ) { // ver el ultimo elemento y quitarlo
		Integer elemento; 
		if (this.isEmpty() == true) {
			elemento = null;
		}else {
			elemento = this.pila[this.cima];
			this.pila[this.cima]=null;
			this.cima = this.cima -1;
		}
		return elemento;
	}
	
	public boolean push(Integer producto) { // añadir un elemento a la pila
		boolean verificar;
		if (this.isFull() == true) {
			verificar = false;
		}else {
			verificar = true;
			this.cima++;
			this.pila[this.cima] = producto;
			
		}
		return verificar;
	}

	@Override
	public String toString() {
		return "PilaEnteros [pila=" + Arrays.toString(pila) + ", MAX_ELEMENTOS=" + MAX_ELEMENTOS + ", cima=" + cima
				+ "]";
	}
	
	
}
