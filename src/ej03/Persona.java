package ej03;

public class Persona {
		
	private String nombre;
	private String apellido;
	
	public Persona() {
		  this.nombre = "";
		this.apellido = "";
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	public String getNombreCompleto() {
		
		
		return '"'+ this.nombre +" "+  this.apellido + '"';
	}

}
