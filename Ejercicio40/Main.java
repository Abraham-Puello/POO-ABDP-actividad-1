package Ejercicio40;

class Pelicula {
    String nombre;
    String genero;
    int minutos;

    Pelicula(String nombre, String genero, int minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    void mostrarFicha() {
        System.out.println("---------------------------");
        System.out.println("Pelicula: " + nombre);
        System.out.println("Genero:   " + genero);
        System.out.println("Duracion: " + minutos + " min (" + (minutos / 60) + "h " + (minutos % 60) + "m)");
    }
}

public class Main {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("El laberinto del fauno", "Fantasia oscura", 118);
        Pelicula p2 = new Pelicula("Ciudad de Dios", "Drama", 130);

        p1.mostrarFicha();
        p2.mostrarFicha();
        System.out.println("---------------------------");
    }
}