package ej05;

public class test {

	public static void main(String[] args) {
		
		Persona persona0  = new Persona();
		Persona persona1 = new Persona();
		Domicilio domicilio0 = new Domicilio();
		
		
		persona0.setNombre("Fulano");
		persona0.setApellido("Gomez");
		
		persona1.setNombre("Ryan");
		persona1.setApellido("Reynolds");
		
		domicilio0.setCalle("Lavalle");
		domicilio0.setNumero("1877");
		domicilio0.setCiudad("CABA");
		
		persona0.setDomicilio(domicilio0);
		
		persona1.setDomicilio(domicilio0);
		domicilio0.setCalle("Riobamba");
		
		
		System.out.println(persona0.getNombreCompleto());
		System.out.println(persona0.getDomicilioCompleto());
		
		System.out.println(persona1.getNombreCompleto());
		System.out.println(persona1.getDomicilioCompleto());
	}

}
