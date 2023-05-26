package ej12;

public class Test {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		Calculadora calculin = new Calculadora();
		
		System.out.println("Suma " + calculin.sumar(a, b));
		
		System.out.println("Resta " + calculin.resta(a, b));
		
		System.out.println("Resta " +calculin.resta(b, a));
		
		System.out.println("Multiplicacion " +calculin.multiplicar(a, b));
		
		System.out.println("Division " +calculin.dividir(a, b));
		
		System.out.println("Division " +calculin.dividir(b, a));
		
		System.out.println("Division " + calculin.dividir(a, 0));
		
		System.out.println("Division " +calculin.dividir(b, 0));
		
		System.out.println("Division " + calculin.dividir(0, a));
		
		System.out.println("Division " + calculin.dividir(0, b));

	}

}
