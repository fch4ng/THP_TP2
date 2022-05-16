package ej03;

public class test {

	public static void main(String[] args) {

		Persona persona = new Persona();
		
		persona.setNombre("Fran");
		persona.setApellido("Chang");
		
		System.out.println(persona.getNombreCompleto());

	}

}
