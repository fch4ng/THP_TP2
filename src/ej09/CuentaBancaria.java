package ej09;

public class CuentaBancaria {
	
	private String  cbu;
	private double  saldo = 0;
	private Persona titular;
	private Tipo    tipo;
	
	public CuentaBancaria(Persona titular, Tipo tipo) {
		
		setCbu(generarCbu());
		this.saldo   = saldo;
		this.titular = titular;
		this.tipo    = tipo;
	}

	public String getCbu() {
		return cbu;
	}

	private void setCbu() {
		this.cbu = generarCbu();
	}

	public Persona getTitular() {
		return titular;
	}

	private void setTitular(Persona titular) {
		this.titular = titular;
	}

	public Tipo getTipo() {
		return tipo;
	}

	private void setTipo(Tipo tipo) {
		this.tipo = tipo;
	} 
	
	private String generarCbu() {
		
		String cbu;
		
		cbu = "tengo q ver que quiere decir el enunciado con los primeros dos digitos" + "-" + titular.getDni() + "-" + titular.getDni().length(7);
		
	}
	
	public double obtenerSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double dineroDepositado) {
		
		double saldoActualizado;
		
		saldoActualizado = obtenerSaldo() + dineroDepositado;
		
		setSaldo(saldoActualizado);
		
	}
	
	public boolean extraer(double dineroSolicitado) {
		
		double saldoActualizado;
		boolean extraccionExitosa = false;
		
		if (obtenerSaldo() > dineroSolicitado) {
			
			saldoActualizado = obtenerSaldo() - dineroSolicitado;
			
			setSaldo(saldoActualizado);
			
			extraccionExitosa = true;
		}
	
		return extraccionExitosa;
	}
		
	
}
