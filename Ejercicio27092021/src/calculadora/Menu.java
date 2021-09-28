package calculadora;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		Operaciones operaciones = new Operaciones();
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		String ans;
		double x = 0, y = 0;
		
		do {
			System.out.println("PROXIMA OPERACION");
			System.out.println(" 1.SUMA\n 2.RESTA\n 3.MULTIPLICACION\n 4.DIVISION\n 5.SALIR");
			opcion = scan.nextInt();
			if(opcion>0 && opcion<5) {
				System.out.println("Introduce dos numeros");
				x = scan.nextDouble();
				y = scan.nextDouble();
				String saltoLinea = scan.nextLine();
			}
			switch(opcion) {
				case 1: System.out.println(x + " + " + y + " = " + operaciones.suma.operaciones(x, y));
						System.out.println("¿Otra operacion?");
						ans =  scan.nextLine();//no me funciona
						ans.toLowerCase(); break;
				case 2: System.out.println(x + " - " + y + " = " + operaciones.resta.operaciones(x, y));
						System.out.println("¿Otra operacion?");
						ans =  scan.nextLine();//no me funciona
						ans.toLowerCase();break;
				case 3: System.out.println(x + " x " + y + " = " + operaciones.mult.operaciones(x, y));
						System.out.println("¿Otra operacion?");
						ans =  scan.nextLine();//no me funciona
						ans.toLowerCase(); break;
				case 4: try {
							System.out.println(x + " / " + y + " = " + operaciones.div.operaciones(x, y));
							System.out.println("¿Otra operacion?");
							ans =  scan.nextLine();//no me funciona
							ans.toLowerCase();
					
						} catch (ArithmeticException exc) {
							System.out.println(exc);						
							System.out.println("¿Otra operacion?");
							ans =  scan.nextLine();//no me funciona
							ans.toLowerCase();
						} break;
				case 5: ans = ""; break;
				default: System.out.println("No es un numero valido");
						 ans = "si"; break;
			}
		} while(ans.matches("si"));
		System.out.println("Gracias por usar la calculadora");
		scan.close();

	}

}
