package ej09;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private CuentaBancaria cuentaBancaria;
	
	public Persona(String dni, String nombre, String apellido, Domicilio domicilio, CuentaBancaria cuentaBancaria) {
		
		this.dni            = dni;
		this.nombre         = nombre;
		this.apellido       = apellido;
		this.domicilio      = domicilio;
		this.cuentaBancaria = cuentaBancaria;
	}

	public  String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	

}
