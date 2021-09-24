package ejerciciosindividuales;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] num = {0,0,0,0,0,0,0};
		int[] nums = {0,0,0,0,0,0,0,0,0,0};
		Scanner scan = new Scanner(System.in);
		
		//Ejercicio1
		
		System.out.println("Introduce 7 números");
		for (int i=0; i<num.length ; i++) {
			num[i]=scan.nextInt();
		}
		
		System.out.println("Los números introducidos son");
		for (int i=0; i<num.length ; i++) {
			System.out.println(num[i]);
		}
		
		//Ejercicio2
		
		System.out.println("Introduce 7 números");
		for (int i=0; i<num.length ; i++) {
			num[i]=scan.nextInt();
		}
		
		System.out.println("Los números introducidos son");
		for (int i=(num.length -1) ; i>=0 ; i--) {
			System.out.println(num[i]);
		}
		
		
		//Ejercicio3
		System.out.println("Introduce 10 números");
		for (int i=0; i<nums.length ; i++) {
			nums[i]=scan.nextInt();
		}
		
		System.out.println("Los números introducidos son");
		for (int i=0; i<(nums.length /2) ; i++) {
			System.out.println("Número "+ (i+1) + ": "+nums[i]);
			System.out.println("Número "+ (nums.length-i) + ": "+nums[nums.length-i-1]);
		}
		
		
		//Ejercicio4
		System.out.println("Introduce 10 números");
		for (int i=1; i<nums.length ; i++) {
			nums[i]=scan.nextInt();
		}
		nums[0] = scan.nextInt();
		
		System.out.println("Los números introducidos y desplazados son");
		for (int i=0; i<nums.length ; i++) {
			System.out.println(nums[i]);
		}
		
		
		//Ejercicio5
		
		
	}

}
