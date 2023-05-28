package ej14;

import java.util.Scanner;

public class Test {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int nota;
		
		    Promedio promedioDeNotas = new Promedio();
		
		do {
		
		System.out.println("Ingrese nota");
		
		nota = Integer.parseInt(input.next());
		
		//aqui tengo que comenzar a acumular las notas y contarlas para sacar promedio
		
		}while(nota != 0);
		
		System.out.println("Cantidad de Alumnos " + promedioDeNotas.contador.obtenerValor());
		
		System.out.println("Promedio de Notas " + promedioDeNotas.obtenerValor());
		
	}
	
}

	
	
