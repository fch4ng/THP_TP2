package ej10;

public class Robot {
	
	private String nombre;

	public Robot(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void saludar() {
		
		System.out.println("Hola, mi nombre es " + getNombre() + " En que puedo ayudarte?" );
		
	}
	
	public void saludar (Persona persona) {
		
		System.out.println("Hola " + persona.getNombre() + " mi nombre es " + getNombre() + " En que puedo ayudarte?" );
		
	}

}
