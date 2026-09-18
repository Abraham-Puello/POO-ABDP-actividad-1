package Ejercicio50;

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
        Mascota m1 = new Mascota(); // Aqui se construye el objeto
        m1.nombre = "Tobi";
        m1.especie = "Perro";
        m1.edad = 4;
        m1.mostrarMascota();

        Mascota m2 = new Mascota();
        m2.nombre = "Michi";
        m2.especie = "Gato";
        m2.edad = 2;
        m2.mostrarMascota();

    }
}