package ejercicio4;

import java.util.Scanner;

public class EjercicioCuatro {

	public static void main(String[] args) {
		int[] nums = {0,0,0,0,0,0,0,0,0,0};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce 10 n�meros");
		for (int i=1; i<nums.length ; i++) {
			nums[i]=scan.nextInt();
		}
		nums[0] = scan.nextInt();
		
		System.out.println("Los n�meros introducidos y desplazados son");
		for (int i=0; i<nums.length ; i++) {
			System.out.println(nums[i]);
		}
		
		scan.close();

	}

}
