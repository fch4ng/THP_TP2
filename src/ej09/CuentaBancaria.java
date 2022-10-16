package ej09;

public class CuentaBancaria {
	
	private String  cbu;
	private double  saldo = 0;
	private Persona titular;
	private Tipo    tipo;
	
	public CuentaBancaria(String cbu, double saldo, Persona titular, Tipo tipo) {
		
		this.cbu     = cbu;
		this.saldo   = saldo;
		this.titular = titular;
		this.tipo    = tipo;
	}

	public String getCbu() {
		return cbu;
	}

	private void setCbu(String cbu) {
		this.cbu = cbu;
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
	
	private void generarCbu() {
		
		String cbu;
		
		cbu = "tengo q ver que quiere decir el enunciado con los primeros dos digitos" + "-" + Persona.getDni() + "-" + Persona.getDni().length(7);
		
		setCbu(cbu);
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
