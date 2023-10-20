package ej09;

public class Principal {

	public static void main(String[] args) {
		
		Domicilio domicilioUnico = new Domicilio("Yatay", "240", "Almagro");
		
		Persona persona0 = new Persona("12345678", "Fulano", "Gomez", domicilioUnico);
		
		Persona persona1 = new Persona("9123456", "Megana", "Torres", domicilioUnico);
		
		CuentaBancaria cuentaCorriente = new CuentaBancaria(persona1, Tipo.CUENTA_CORRIENTE);
		
		CuentaBancaria cajaDeAhorro = new CuentaBancaria(persona0, Tipo.CAJA_DE_AHORRO);
		
		persona0.setCuentaBancaria(cuentaCorriente);
		
		persona1.setCuentaBancaria(cajaDeAhorro);

	}

}

/*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "ej09.Tipo.ordinal()" because "this.tipo" is null
at ej09.CuentaBancaria.generarCbu(CuentaBancaria.java:45)
at ej09.CuentaBancaria.<init>(CuentaBancaria.java:12)
at ej09.Principal.main(Principal.java:13)*/