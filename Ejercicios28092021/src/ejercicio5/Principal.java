package ejercicio5;

public class Principal {
	public static void main(String[] args) {
	
		Pila miPila = new Pila(8);
		
		System.out.println("Está vacia? "+(miPila.estaVacia()? "SI":"NO"));
		System.out.println("Mi primer elemento "+miPila.primero());
		
		for(int i = 0; i<5; i++) {
			miPila.anadir(2*i);
			System.out.println(miPila.getPila()[i]);
		}
		
		
		System.out.println("Está vacia? "+(miPila.estaVacia()? "SI":"NO"));
		
		System.out.println("Mi primer elemento "+miPila.primero());
		miPila.toString();
		miPila.extraer();
		miPila.toString();
}
}
