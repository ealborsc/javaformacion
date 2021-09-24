package ejercicio1;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		int[] num = {0,0,0,0,0,0,0};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce 7 números");
		for (int i=0; i<num.length ; i++) {
			num[i]=scan.nextInt();
		}
		
		System.out.println("Los números introducidos son");
		for (int i=0; i<num.length ; i++) {
			System.out.println(num[i]);
		}
		scan.close();

	}

}
