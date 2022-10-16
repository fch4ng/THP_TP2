package ej08;

public class TarjetaDeCredito {
	
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.acumuladoActual = 0;
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
		
		if (montoDisponible < 0) {
			
			montoDisponible = 0;
		}
		
		return montoDisponible;
	}
	
	private boolean compraPosible(double montoDeCompra) {
		
		boolean compraPosible = false;
		
		if (montoDisponible() > montoDeCompra) {
			compraPosible = true;
		}else {
			
		}
				
		return compraPosible;
	}
	
	private void acumularGastoActual(double montoDeCompra) {
		
		acumuladoActual = acumuladoActual + montoDeCompra;
	}
	
	public boolean realizarCompra(double montoDeCompra) {
		
		boolean realizarCompra = false;
		
		if(compraPosible(montoDeCompra)) {
			
			realizarCompra = true;
			
			acumularGastoActual(montoDeCompra);
		}
		
		return realizarCompra;
	}



	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoActual=" + acumuladoActual + ", montoDisponible()=" + montoDisponible() + "]";
	}
}

