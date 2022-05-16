package ej06;

public class Dado {
	
	private int valor;
	
	public Dado() {
		
		valor = (int)(Math.random() * 6);
	}

	public int getValor() {
		return valor;
	}

	
}
