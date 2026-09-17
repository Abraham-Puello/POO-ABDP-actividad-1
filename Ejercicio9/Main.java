package Ejercicio9;

class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarMascota() {
        System.out.println(nombre + " (" + especie + ") - " + edad + " años");
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        m1.nombre = "Tobi";
        m1.especie = "Perro";
        m1.edad = 4;

        System.out.print("Estado inicial:  ");
        m1.mostrarMascota();

        m1.edad = 5;
        System.out.print("Primer cambio:   ");
        m1.mostrarMascota();

        m1.edad = 6;
        System.out.print("Segundo cambio:  ");
        m1.mostrarMascota();

        // El objeto sigue siendo el mismo,
        // lo que cambio fue su edad
    }
}