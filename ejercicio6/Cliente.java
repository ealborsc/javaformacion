package ejercicio6;

public class Cliente {
	
	private String nombre;
	private String apellidoUno;
	private String apellidoDos;
	private String telf;
	private String email;
	
	
	
	public Cliente(String nombre, String apellidoUno, String apellidoDos, String telf, String email) {
		super();
		this.nombre = nombre;
		this.apellidoUno = apellidoUno;
		this.apellidoDos = apellidoDos;
		this.telf = telf;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidoUno() {
		return apellidoUno;
	}
	
	public void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}
	
	public String getApellidoDos() {
		return apellidoDos;
	}
	
	public void setApellidoDos(String apellidoDos) {
		this.apellidoDos = apellidoDos;
	}
	
	public String getTelf() {
		return telf;
	}
	
	public void setTelf(String telf) {
		this.telf = telf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
