package poo.personas;

public class Persona {

	
	
	String nombre = "";
	int edad;
	double estatura; 
	
	static String diaDeLaSemana = "Martes";       
	
	void saludar1() {
		System.out.println("Hola mi nombre es " + this.nombre);
		System.out.println("T estamos a " + diaDeLaSemana +" "+this.nombre);
		
		
	}
	
	void saludar() {
		System.out.println("Hola!!!");
	}
	
	
	void presentarse() {
	
		
	}
	
}
