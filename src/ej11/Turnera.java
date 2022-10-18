package ej11;

public class Turnera {
	
	int ultimoNumeroOtorgado;
	
	public Turnera(int ultimoNumeroOtorgado) {
		this.ultimoNumeroOtorgado = ultimoNumeroOtorgado;
	}
	
	public int obtenerUltimoNumeroOtorgado() {
		return ultimoNumeroOtorgado;
	}
	
	public void otorgarProximoNumero() {
		obtenerUltimoNumeroOtorgado() +=; //ver video como resolvio contador
	}
	
	public void resetearContador(int valorDeReseteo) {
		
		final int VALORMINIMO = 0;
		
		if(valorDeReseteo != null && valorDeReseteo >= VALORMINIMO) {
			
			setUltimoNumero(valorDeReseteo);
		}else {
			setUltimoNumero(VALORMINIMO);
		}
	}

	private int setUltimoNumero(int valorDeReseteo) {
		return this.ultimoNumeroOtorgado = valorDeReseteo;
		
	}
	
	

}
