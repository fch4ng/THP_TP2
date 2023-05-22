package ej11;

public class Turnera {
	
	int ultimoNumeroOtorgado;
	
	public Turnera() {
		this.ultimoNumeroOtorgado = 0;
	}
	
	public int obtenerUltimoNumeroOtorgado() {
		return ultimoNumeroOtorgado;
	}
	
	public void otorgarProximoNumero() {
		ultimoNumeroOtorgado += 1;
	}
	
	public void resetearContador(int valorDeReseteo) {
		
		final int VALORMINIMO = 0;
		
		if(valorDeReseteo > VALORMINIMO) {
			
			setUltimoNumero(valorDeReseteo);
		}else {
			setUltimoNumero(VALORMINIMO);
		}
	}

	public void resetearContador() {
	
		final int VALORMINIMO = 0;
	
		setUltimoNumero(VALORMINIMO);
		}
	
	private int setUltimoNumero(int valorDeReseteo) {
		return this.ultimoNumeroOtorgado = valorDeReseteo;
		
	}
	
	

}
