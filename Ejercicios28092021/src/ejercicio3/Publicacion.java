package ejercicio3;

import java.time.LocalDate;

public class Publicacion {
	private String nombre;
	private LocalDate fechaPublicacion;
	private boolean status; //es true si esta prestado y false si no lo esta
	//Otro argumento podría ser "Tipo : revista, libro, periodico (un enum)
	
	
	public Publicacion() {
		super();
	}
	public Publicacion(String nombre, LocalDate fechaPublicacion, boolean status) {
		super();
		this.nombre = nombre;
		this.fechaPublicacion = fechaPublicacion;
		this.status = status;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
		
}
