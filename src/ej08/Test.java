package ej08;

public class Test {

	public static void main(String[] args) {
		
		TarjetaDeCredito tarjeta0 = new TarjetaDeCredito("4145-4141-2222-1111", "Juan Perez" , 1000);
		
		tarjeta0.realizarCompra(4000);
		
		tarjeta0.toString();
		
		tarjeta0.actualizarLimite(3000);
		
		tarjeta0.realizarCompra(4000);
		
		tarjeta0.toString();

	}

}
