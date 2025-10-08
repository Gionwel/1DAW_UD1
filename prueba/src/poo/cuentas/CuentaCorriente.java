/*EJERCICIO

Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el saldo. Las típicas operaciones con una cuenta corriente son: 
Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0. 
Ingresar dinero: se incrementa el saldo. 
Sacar dinero: el método retira el dinero de la cuenta. Se permite el saldo negativo. 
Mostrar información: muestra la información disponible de la cuenta corriente.
*/

package poo.cuentas;

public class CuentaCorriente {

    // Atributos (datos de la cuenta)
	String dni;
    public String nombre;
    private double saldo;

    // Constructor: se necesita DNI y nombre, saldo inicial = 0
    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0.0;
    }

    // Método para ingresar dinero
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Has ingresado " + cantidad + " euros.");
        } else {
            System.out.println("Cantidad no válida.");
        }
    }

    // Método para sacar dinero
    public void sacar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad no válida.");
        } else if (cantidad > saldo) {
            System.out.println("No hay saldo suficiente para sacar " + cantidad + " euros.");
        } else {
            saldo -= cantidad;
            System.out.println("Has sacado " + cantidad + " euros.");
        }
    }

    // Método para mostrar la información de la cuenta
    public void mostrarInformacion() {
        System.out.println("\n--- Información de la Cuenta ---");
        System.out.println("Titular: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo actual: " + saldo + " euros");
        System.out.println("--------------------------------\n");
    }
}
