package Ejercicio39;

class Cancion {
    String titulo;
    String artista;
    int duracion; // en segundos

    Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    void mostrarInfo() {
        int minutos = duracion / 60;
        int segundos = duracion % 60;
        System.out.println("\"" + titulo + "\" - " + artista
                + " (" + minutos + ":" + (segundos < 10 ? "0" : "") + segundos + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("La Bicicleta", "Carlos Vives y Shakira", 232);
        Cancion c2 = new Cancion("La distancia", "Manuel Medrano", 197);
        Cancion c3 = new Cancion("Por amarte a ciegas", "Arcangel", 234);

        c1.mostrarInfo();
        System.out.println();
        c2.mostrarInfo();
        System.out.println();
        c3.mostrarInfo();
    }
}