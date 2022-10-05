package ej06;

import java.util.Scanner;

public class test {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		      final String FINAL = "FIN";
		final int CIENRESULTADOS = 100;
		        
		           String lanzar = "";
		      int acumResultados = 0;
		   	  int contResultados = 0;
		
				int resultado1;
				int resultado2;
				int promResultados;
		
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		
		do {//revisa loop e if porque los valores se repiten sin cambiar nunca
			
			resultado1 = dado1.getValor();
			resultado2 = dado2.getValor();
			
			if(resultado1 == resultado2) {
				System.out.println("Ambos dados dieron el mismo resultado");
			}else if(resultado1 > resultado2){
				System.out.println("El resultado mayor es " + resultado1 + " dado 1");
			}else{
				System.out.println("El resultado mayor es " + resultado2 + " dado 2");
			}
			
			acumResultados = acumResultados + (resultado1 + resultado2);
			contResultados++;
			
			promResultados = acumResultados / CIENRESULTADOS;
			
			System.out.println("Desea volver a lanzar los dados? (FIN para terminar)");
			lanzar = input.nextLine();
			
		}while(!lanzar.equals(FINAL));
		
		if(contResultados == CIENRESULTADOS){
			
			System.out.println("El resultado de los primero 100 lanzamientos es de " + promResultados);
			
		}else{
			
			System.out.println("No se llegaron a los 100 lanzamientos");
			
		}
		
		

	}

}
