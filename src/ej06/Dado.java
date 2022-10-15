package ej06;

public class Dado {
	
	private static final int CANTIDAD_DE_CARAS = 6;
	             private int valor;
	             private int cantidadDeCaras;
	
	public Dado() {
		this.setCantidadDeCaras(cantidadDeCaras);
		this.tirar();
	}

	public int tirar() {
		this.valor = this.calcularValor();
		return this.valor;
		
	}

	private int calcularValor() {
		return ((int)(Math.random() * this.cantidadDeCaras)); 
	}

	public int getValor() {
		return this.valor;
	}

	private void setCantidadDeCaras(int cantidadDeCaras) {
		this.cantidadDeCaras = CANTIDAD_DE_CARAS;
	}

	
}
