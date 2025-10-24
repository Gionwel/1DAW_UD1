package numeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número de dos cifras: ");
        int n = entrada.nextInt();

        NumeroInvertido num = new NumeroInvertido();
        num.setNumero(n);
        num.invertirNumero();
        
        
    }
}



