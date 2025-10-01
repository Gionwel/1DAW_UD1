package salida;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {

    
        Scanner pepe = new Scanner(System.in);

    
        System.out.print("Escribe tu nombre: ");

      
        String nombre = pepe.next();  

     
        System.out.printf("Hola %s \n", nombre);

  
    }
}
