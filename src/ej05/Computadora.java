package ej05;

public class Computadora {
	
	private String calle;
	private String numero;
	private String ciudad;
	
	public Computadora() {
		 this.calle = "";
		this.numero = "";
		this.ciudad = "";
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getDomicilio() {
		
		
		return this.calle +" "+ this.numero +" "+ this.ciudad;
	}
	
	

}
