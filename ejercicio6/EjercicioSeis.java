package ejercicio6;

import java.util.LinkedList;
import java.util.Scanner;

public class EjercicioSeis {

	public static void main(String[] args) {
		LinkedList<Cliente> clientes = new LinkedList<Cliente>();
		Scanner scan = new Scanner(System.in);
		Scanner scann = new Scanner(System.in);
		int num;
		String ans;
		
		System.out.println("¿Cuantos clientes quieres introducir?");
		num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			clientes.add(EjercicioSeis.nuevoCliente(scann));
			System.out.println("Cliente añadido");
		}
		
		EjercicioSeis.imprimirClientes(clientes);
		
		do {
			System.out.println("¿Quieres introducir otro cliente?");
			ans = EjercicioSeis.primeraMayuscula(scann);
			if (ans.matches("Si")) {
				clientes.add(EjercicioSeis.nuevoCliente(scann));
				System.out.println("Cliente añadido");
			}
			
		} while (ans.matches("Si"));
		
		EjercicioSeis.imprimirClientes(clientes);
		
		scan.close();

	}
	
	
	
	
	//MÉTODOS USADOS EN EL main
	
	
	public static Cliente nuevoCliente(Scanner scan) {
			System.out.println("Nombre");
			String nombre = EjercicioSeis.primeraMayuscula(scan);
			
			System.out.println("Primer apellido");
			String apellidoUno = EjercicioSeis.primeraMayuscula(scan);
			
			System.out.println("Segundo apellido");
			String apellidoDos = EjercicioSeis.primeraMayuscula(scan);
			
			String telf = "0";
			do {
			System.out.println("Telefono");
			telf = scan.nextLine();
			} while (telf.matches("\\d*9") != true);
			
			System.out.println("e-mail");
			String email = scan.nextLine().toLowerCase();
			
			Cliente nuevoCliente = new Cliente(nombre, apellidoUno, apellidoDos, telf, email);
			return nuevoCliente;
		}
	
	
	public static String primeraMayuscula(Scanner scan) {
		
		String palabra = scan.nextLine();
		palabra = palabra.substring(0,1).toUpperCase()+palabra.substring(1).toLowerCase();
		return palabra;
	}
	
	
	public static void imprimirClientes(LinkedList<Cliente> clientes) {
			System.out.println("\t\t LISTA DE CLIENTES");
			System.out.println("************************************************************************");
			for(int i = 0; i<clientes.size(); i++) {
				System.out.println("");
				System.out.println("NUMERO CLIENTE: "+ (i+1));
				System.out.println("NOMBRE: " + clientes.get(i).getNombre());
				System.out.println("PRIMER APELLIDO: " + clientes.get(i).getApellidoUno());
				System.out.println("SEGUNDO APELLIDO: " + clientes.get(i).getApellidoDos());
				System.out.println("NUMERO DE TELEFONO: " + clientes.get(i).getTelf());
				System.out.println("E-MAIL: " + clientes.get(i).getEmail());				
				System.out.println("************************************************************************");
				System.out.println("");
			}
		}
		
	
	
	
	}
	

