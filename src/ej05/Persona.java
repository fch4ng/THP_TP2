package ej05;

public class Persona {
		
	private String nombre;
	private String apellido;
	private Computadora domicilio;
	
	public Persona() {
		  nombre = "";
		apellido = "";
		}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Computadora getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Computadora domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombreCompleto() {
		
		
		return '"'+ nombre +" "+  apellido + '"';
	}
	
	public String getDomicilioCompleto() {
		
		
		return '"'+ domicilio.getCalle() +'"'+ domicilio.getNumero() +" "+  domicilio.getCiudad() + '"';
	}

}
