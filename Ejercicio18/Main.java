package Ejercicio18;

class Mascota {
    String nombre;
    String especie;
    int edad;

    void cumplirAños() {
        edad++;
        System.out.println("Feliz cumpleaños, " + nombre + "! Ahora tiene " + edad + " años.");
    }

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

        m1.mostrarMascota();
        m1.cumplirAños();
        m1.mostrarMascota();
    }
}