package ej12;

public class Test {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		Calculadora calculin = new Calculadora();
		
		System.out.println(calculin.sumar(a, b));
		
		System.out.println(calculin.resta(a, b));
		
		System.out.println(calculin.resta(b, a));
		
		System.out.println(calculin.multiplicar(a, b));
		
		System.out.println(calculin.dividir(a, b));
		
		System.out.println(calculin.dividir(b, a));
		
		System.out.println(calculin.dividir(a, 0));
		
		System.out.println(calculin.dividir(b, 0));
		
		System.out.println(calculin.dividir(0, a));
		
		System.out.println(calculin.dividir(0, b));

	}

}
