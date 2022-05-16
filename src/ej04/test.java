package ej04;

public class test {

	public static void main(String[] args) {
		
		Persona persona  = new Persona();
		Persona persona1 = new Persona();
		
		
		persona.setNombre("Fulano");
		persona.setApellido("Gomez");
		
		System.out.println(persona.getNombreCompleto());
	
		persona1.setNombre("Ryan");
		persona1.setApellido("Reynolds");
		
		System.out.println(persona1.getNombreCompleto());
	
	
	
	}

}
