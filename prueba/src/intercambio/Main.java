package intercambio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer número (a): ");
        int num1 = entrada.nextInt();

        System.out.print("Introduce el segundo número (b): ");
        int num2 = entrada.nextInt();

        Intercambio datos = new Intercambio();
        datos.setA(num1);
        datos.setB(num2);

        datos.intercambiar();

        entrada.close();
    }
}
