package ej13;

public class Superheroe {
	
	private String nombre;
	   private int fuerza;
	   private int resistencia;
	   private int superpoderes;
	   
	     final int MAX_ATRIBUTO = 100;
	     final int MIN_ATRIBUTO = 0;
		
	     
	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
			setNombre(nombre);
			setFuerza(fuerza);
			setResistencia(resistencia);
			setSuperpoderes(superpoderes);
		}


	private int setFuerza(int fuerza) {
		
		if(fuerza > MAX_ATRIBUTO) {
			
			fuerza = MAX_ATRIBUTO;
			
		}else if (fuerza < MIN_ATRIBUTO) {
			
			fuerza = MIN_ATRIBUTO;
			
		}
		
		return this.fuerza = fuerza;
	}


	private int setResistencia(int resistencia) {
		
		if(resistencia > MAX_ATRIBUTO) {
			
			resistencia = MAX_ATRIBUTO;
			
		}else if (resistencia < MIN_ATRIBUTO) {
			
			resistencia = MIN_ATRIBUTO;
			
		}
		
		return this.resistencia = resistencia;
	}


	private int setSuperpoderes(int superpoderes) {
		
		if(superpoderes > MAX_ATRIBUTO) {
			
			superpoderes = MAX_ATRIBUTO;
			
		}else if (superpoderes < MIN_ATRIBUTO) {
			
			superpoderes = MIN_ATRIBUTO;
			
		}
		
		return this.superpoderes = superpoderes;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public int getFuerza() {
		return fuerza;
	}


	public int getResistencia() {
		return resistencia;
	}


	public int getSuperpoderes() {
		return superpoderes;
	}
	     
	public void competir(Superheroe superHeroeAComparar) {
		
		  = this.fuerza > superHeroeAComparar.getFuerza();
		
	}


	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	
	

}
