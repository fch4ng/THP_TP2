package ej14;

public class Promedio {
	
	final private int VALOR_INICIAL = 0;
    private int valor;
    
        Contador contador = new Contador();
    Acumulador acumulador = new Acumulador();

	    public Promedio() {
		
	    	setValor(VALOR_INICIAL);
	    	
	    }
	
	    private int setValor(int valor) {
			
			return this.valor = valor;		
		}

	    public int obtenerValor() {
			return valor;
		}
	    
	    private void promedioNotas() {
	    	
	    	int promedio;
	    	    		
	    		promedio = acumulador.obtenerValor() / contador.obtenerValor();
	    	
	    	setValor(promedio);
	    }
	    	
	    //
}
