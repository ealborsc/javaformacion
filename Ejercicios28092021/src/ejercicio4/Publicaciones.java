package ejercicio4;

import java.time.LocalDate;

public class Publicaciones implements Prestable{
	private String titulo;
	private Tipo tipo;
	private String codigo;
	private LocalDate fecha;
	private boolean prestado = false; //no se pasa en el constructor TRUE: prestado; FALSE: no prestado
	private int numero; //solo para revistas, un metodo constructor sin este parametro para poder hacer libros
	
	
	//METODO CONSTRUCTOR DE LIBROS
	public Publicaciones(String titulo, Tipo tipo, String codigo, LocalDate fecha) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
		this.codigo = codigo;
		this.fecha = fecha;
	}
	
	//METODO CONSTRUCTOR DE REVISTAS
	public Publicaciones(String titulo, Tipo tipo, String codigo, LocalDate fecha, int numero) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
		this.codigo = codigo;
		this.fecha = fecha;
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void prestar() {
		if (this.prestado)
			System.out.println(this.titulo+" ya esta prestado");
		else
			this.prestado = true;
	}
	
	public void devolver() {
		if (this.prestado)
			this.prestado = false;
		else
			System.out.println(this.titulo+ " ya esta en la biblioteca");
	}
	public boolean prestado() {
		return this.prestado;
	}
	
	
}
