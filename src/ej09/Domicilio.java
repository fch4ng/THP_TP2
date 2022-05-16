package ej09;

public class Domicilio {
	
	private String calle;
	private String altura;
	private String barrio;
	
	public Domicilio(String calle, String altura, String barrio) {
		this.calle = calle;
		this.altura = altura;
		this.barrio = barrio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	
	

}
