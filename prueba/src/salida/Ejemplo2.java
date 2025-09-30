package salida;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);

       
        System.out.print("Introduce la primera nota entera: ");
        int nota1 = entrada.nextInt();

        
        System.out.print("Introduce la segunda nota entera: ");
        int nota2 = entrada.nextInt();

       
        double media = (nota1 + nota2) / 2;

       
        System.out.printf("La media es: %.3f%n", media);

    }
}