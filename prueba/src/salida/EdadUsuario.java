package salida;

import java.util.Scanner;

public class EdadUsuario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿cuantos años tienes?");
		int edad = sc.nextInt();
		
//		edadd++
//		edad = edad + 1;
		
		System.out.println("el año que viene tendrás " + edad++ +"años");
		System.out.println(edad);
	
		

	}

}
