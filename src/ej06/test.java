package ej06;

public class test {

	public static void main(String[] args) {
		
		FINAL String = "FIN";//no entiendo el error
		int resultado1;
		int resultado2;
		int acumResultados = 0;
		int contResultados = 0;
		int promResultados;
		
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		
		do {
			
			resultado1 = dado1.getValor();
			resultado2 = dado2.getValor();
			
			if(resultado1 == resultado2) {
				System.out.println("Ambos dados dieron el mismo resultado");
			}else if(resultado1 > resultado2){
				System.out.println("El resultado mayor es" + resultado1);
			}else{
				System.out.println("El resultado mayor es" + resultado2);
			}
			
			acumResultados = acumResultados + (resultado1 + resultado2);
			contResultados++;
			
			promResultados = acumResultados / contResultados; //esta bien hacer el conteo asi?
			
		}while(lanzar != FIN);//como hago para ciclar?

	}

}
