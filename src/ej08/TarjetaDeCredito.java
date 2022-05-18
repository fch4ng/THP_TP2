package ej08;

public class TarjetaDeCredito {
	
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra, double acumuladoActual) {
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		acumuladoActual = 0;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}


	public void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	
	public double montoDisponible() {
		
		double montoDisponible = limiteDeCompra - acumuladoActual;
		
		return montoDisponible;
	}
	
	private boolean compraPosible(double montoCompra, double montoDisponible) {
		
		boolean compraPosible;
		
		compraPosible = montoDisponible >= montoCompra;
		
		return compraPosible;
	}
	
	public boolean realizarCompra(double comprar) {
		
		//compraPosible(double montoCompra, double montoDisponible); puedo llamar a un metodo desde adentro de otro para verifcar si la compra es posible?
		
		return;
	}
	
	private double acumularGastoActual() {
		
	}
}

