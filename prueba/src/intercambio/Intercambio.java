package intercambio;

public class Intercambio {

    int a;
    int b;

    public void setA(int x) {
        a = x;
    }

    public void setB(int y) {
        b = y;
    }

    public void intercambiar() {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
