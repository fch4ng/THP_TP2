package ej14;

public class Contador {
	
	final private int VALOR_INICIAL = 0;
	      private int valor;

	public Contador() {
		
		setValor(VALOR_INICIAL);
		
	}

	private int setValor(int valor) {
		
		return this.valor = valor;		
	}
	
	private void incrementarValor() {
		
		setValor(valor++);
	}

	public int obtenerValor() {
		return valor;
	}
}
