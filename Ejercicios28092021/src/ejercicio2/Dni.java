package ejercicio2;

import java.util.Scanner;

public class Dni {

	public static void main(String[] args) {
		int dni = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Introduce numero dni");
		dni = scan.nextInt();
		} while (dni>99999999);
		
		System.out.println("DNI con letra: "+dni+"-"+letraDni(dni));
		
		scan.close();
	}
	
	public static char letraDni(int num) {
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		return letras[num%23];
	}

}
