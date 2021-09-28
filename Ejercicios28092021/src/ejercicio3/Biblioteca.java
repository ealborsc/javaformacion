package ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Biblioteca {

	public static void main(String[] args) {
		Publicacion publicacionUno = new Publicacion("El aguardiente y la quiemada", LocalDate.of(2001, 7, 15), false);
		Publicacion publicacionDos = new Publicacion("Para o pobre sempre é noite", LocalDate.of(2020, 12, 1), false);
		Publicacion publicacionTres = new Publicacion("A quiemada", LocalDate.of(1983, 1, 15), false);
		Publicacion publicacionCuatro = new Publicacion("Melodías de la mar", LocalDate.of(1984, 3, 4), true);
		Publicacion publicacionCinco = new Publicacion("La memoria, ¿un remedio contra el mal?", LocalDate.of(2009, 5, 15), false);
		Publicacion publicacionSeis = new Publicacion("Entre el estado y la libertad", LocalDate.of(1986, 10, 23), false);
		Publicacion[] publicaciones = {publicacionUno, publicacionDos, publicacionTres, publicacionCuatro, publicacionCinco, publicacionSeis}; 
		DateTimeFormatter miFormato = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		int ano = 2002;
		
		System.out.println("\t\t INVENTARIO\n");
		for(int i = 0; i<publicaciones.length; i++) {
			System.out.println("TITULO: "+publicaciones[i].getNombre());
			System.out.println("FECHA PUBLICACION: "+ publicaciones[i].getFechaPublicacion().format(miFormato));
			System.out.println( "PRESTADO: "+(publicaciones[i].isStatus() ? "Sí": "No"));
			System.out.println("");
		}
		
		System.out.println("Hay "+Biblioteca.saldoPrestados(publicaciones)+" prestados");
		System.out.println("Hay "+Biblioteca.cantPublicaciones(ano, publicaciones)+ " publicaciones anteriores a "+ano);
		

	}
	
	public static int saldoPrestados(Publicacion[] publicaciones) {
		int prestados = 0;
		for(int i = 0; i<publicaciones.length; i++) {
			if(publicaciones[i].isStatus())
				prestados++;
		}
		return prestados;
	}
	
	public static int cantPublicaciones(int ano, Publicacion[] publicaciones) {
		int anteriores = 0;
		for(int i = 0; i<publicaciones.length; i++) {
			if(publicaciones[i].getFechaPublicacion().getYear()<ano)
				anteriores++;
		}
		return anteriores;
	}

}
