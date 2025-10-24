package numeros;

public class NumeroInvertido {

    int numero;

    public void setNumero(int n) {
        numero = n;
    }

    public void invertirNumero() {
        int decenas = numero / 10;
        int unidades = numero % 10;
        int invertido = (unidades * 10) + decenas;
        System.out.println("El número invertido es: " + invertido);
    }
}