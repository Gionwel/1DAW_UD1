package poo.personas;

public class Main {

    public static void main(String[] args) {

       
        Persona p1 = new Persona();
        p1.nombre = "Pepe";
        p1.edad = 28;
        p1.estatura = 1.89;

        System.out.println(p1.nombre);

        
        Persona p2 = new Persona();
        p2.nombre = "María";
        p2.edad = 25;
        p2.estatura = 1.70;

       
        System.out.println(p2.nombre);
        System.out.println(p2.edad);
        System.out.println(p2.estatura);
    }
}
