package ej09;

public class Principal {

	public static void main(String[] args) {
		
		Domicilio domicilioUnico = new Domicilio("Yatay", "240", "Almagro");
		
		Persona persona0 = new Persona("12345678", "Fulano", "Gomez", domicilioUnico);
		
		CuentaBancaria cajaDeAhorro = new CuentaBancaria(persona0, Tipo.CAJA_DE_AHORRO);
		
		Persona persona1 = new Persona("9123456", "Megana", "Torres", domicilioUnico);
		
		CuentaBancaria cuentaCorriente = new CuentaBancaria(persona1, Tipo.CUENTA_CORRIENTE);

	}

}
