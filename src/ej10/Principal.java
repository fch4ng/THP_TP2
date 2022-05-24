package ej10;

public class Principal {

	public static void main(String[] args) {

		
		Robot robot1 = new Robot("robocop");
		Persona per1 = new Persona("Fran");
		
		robot1.saludar();
		
		robot1.saludar(per1);
	}

}
