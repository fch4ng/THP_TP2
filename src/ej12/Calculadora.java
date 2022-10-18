package ej12;

public class Calculadora {
	
	    	int suma;
	       int resta;
	 int multiplicar;
	     int dividir;
	    
	       public Calculadora() {
	   		
	   		       setSuma(0);
	   		      setResta(0);
	   		setMultiplicar(0);
	   		    setDividir(0);
	   	}

		public int getSuma() {
			return suma;
		}

		public int getResta() {
			return resta;
		}

		public int getMultiplicar() {
			return multiplicar;
		}

		public int getDividir() {
			return dividir;
		}

		private int setSuma(int suma) {
			return this.suma = suma;
		}

		private int setResta(int resta) {
			return this.resta = resta;
		}

		private int setMultiplicar(int multiplicar) {
			return this.multiplicar = multiplicar;
		}

		private int setDividir(int dividir) {
			return this.dividir = dividir;
		}   
	    
		public int sumar(int nroA, int nroB) {
			
			int suma = 0;
			
			suma = nroA + nroB;
			
			return setSuma(suma);
		}

		public int resta(int nroA, int nroB) {
			
			int resta = 0;
			
			resta = nroA - nroB;
			
			return setResta(suma);
		}
		
		public int multiplicar(int nroA, int nroB) {
			
			int multiplicar = 0;
			
			multiplicar = nroA * nroB;
			
			return setMultiplicar(multiplicar);
		}

		public int dividir(int nroA, int nroB) {
			
			int dividir = 0;
			
			dividir = nroA / nroB;
			
			return setDividir(dividir);
		}

}
