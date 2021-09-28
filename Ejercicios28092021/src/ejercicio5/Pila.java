package ejercicio5;

import java.util.Arrays;

public class Pila implements ColeccionInterfaz {
	private int tamano;
	private int contador = 0;
	private int pila[];
	
	
	public Pila(int tamano) {
		super();
		this.tamano = tamano;
		this.pila = new int[this.tamano];
	}
	
	public int[] getPila() {
		return pila;
	}
	
	public int getTamano() {
		return tamano;
	}
	
	
	public boolean anadir(int objeto) {
		if (this.contador==0) {
			for (int i = 0; i<tamano;i++)
				this.pila[i]=0;
		
		}
		try {
			this.pila[this.contador] = objeto;
			this.contador=this.contador + 1;
			return true;
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Tu pila ya está llena");
			return false;
		}
	}
	
	public boolean estaVacia() {
		if(this.contador == 0)
			return true;
		else
			return false;
	}
	
	public int extraer() {
		if(this.estaVacia()) {
			System.out.println("NoSuchElementException");
			return 999999;
		}
		else {
			this.contador=this.contador-1;
			return this.pila[this.contador+1];
		}
	}
	
	public int primero() {
		if(this.estaVacia()) {
			System.out.println("NoSuchElementException");
			return 999999;
		}
		else {
			return this.pila[this.contador+1];
		}
		

	}

	@Override
	public String toString() {
		int[] pilaa = new int[this.contador];
		for(int i=0;i<this.contador;i++) {
			pilaa[i]=this.pila[i];
		}
		return "Pila [tamano=" + tamano + ", pila=" + Arrays.toString(pilaa) + ", contador=" + contador + "]";
	}
	
	

}
