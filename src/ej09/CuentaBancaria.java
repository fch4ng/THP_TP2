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

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	} 
	
	public void generarCbu() {
		
	}
	
	public void depositar(double saldo) {
		
	}
	
	public boolean extraer(double saldo) {
	
		return;
	}

}
