package poo.cuentas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1️º Pedimos los datos del titular
        System.out.print("Introduce el nombre del titular: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce el DNI del titular: ");
        String dni = sc.nextLine();

        // 2️º Creamos la cuenta
        CuentaCorriente cuenta = new CuentaCorriente(dni, nombre);
        System.out.println("\nCuenta creada correctamente.\n");

        int opcion;

        // 3️º Menú de operaciones
        do {
            System.out.println("------ MENÚ ------");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Sacar dinero");
            System.out.println("3. Mostrar información");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Cantidad a ingresar: ");
                    double ingreso = sc.nextDouble();
                    cuenta.ingresar(ingreso);
                    break;
                case 2:
                    System.out.print("Cantidad a sacar: ");
                    double retirada = sc.nextDouble();
                    cuenta.sacar(retirada);
                    break;
                case 3:
                    cuenta.mostrarInformacion();
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
