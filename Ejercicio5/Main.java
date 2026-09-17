package Ejercicio5;

class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarMascota() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        m1.nombre = "Tobi";
        m1.especie = "Perro";
        m1.edad = 4;
        m1.mostrarMascota();
    }
}