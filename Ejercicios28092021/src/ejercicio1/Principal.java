package ejercicio1;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		String frase;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		frase = scan.nextLine();
		System.out.println(Principal.fraseInvertida(frase));
		
		scan.close();

	}
	
	
	public static String fraseInvertida(String frase) {
		String[] palabras = frase.split(" ");
		frase = palabras[0];
		for(int i = 1; i<palabras.length; i++) {
			frase = palabras[i]+" "+frase;
		}
		return frase;
	}
	

}
