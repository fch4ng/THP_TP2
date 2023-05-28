package ej14;

public class Acumulador {

	final private int VALOR_INICIAL = 0;
    private int valor;

	    public Acumulador() {
		
	    	setValor(VALOR_INICIAL);
		
	    }

		private int setValor(int valor) {
			
			return this.valor = valor;		
		}
		
		private void incrementarValor(int valorIncrementar) {
			
			setValor(valor + valorIncrementar);
		}
		
		public int obtenerValor() {
			return valor;
		}
}
