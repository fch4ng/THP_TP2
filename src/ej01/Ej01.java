package ej01;

import java.util.Scanner;

public class Ej01 {
	
	private static Scanner input = new Scanner(System.in);

	public int sumar(int num1, int num2) {
		int suma;
		
		suma = num1 + num2;
		return suma;

	}
	
	public void pedirNumero (String mensaje, int numMin, int numMax) {
		int numX;
		
		System.out.println(mensaje);
		numX = Integer.parseInt(input.next());
		
		if (numX < numMin || numX > numMax) {
			
			System.out.println("Numero inrgesado fuera de rango");
		}else {
					
			System.out.println("El numero ingresado es " + numX);
		}
	}

	
	
}
