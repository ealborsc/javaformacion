package ejercicio3;

import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		int[] nums = {0,0,0,0,0,0,0,0,0,0};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce 10 n�meros");
		for (int i=0; i<nums.length ; i++) {
			nums[i]=scan.nextInt();
		}
		
		System.out.println("Los n�meros introducidos son");
		for (int i=0; i<(nums.length /2) ; i++) {
			System.out.println("N�mero "+ (i+1) + ": "+nums[i]);
			System.out.println("N�mero "+ (nums.length-i) + ": "+nums[nums.length-i-1]);
		}
		
		scan.close();

	}

}
