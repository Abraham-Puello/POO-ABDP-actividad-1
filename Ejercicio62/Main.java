package Ejercicio62;

class Biblioteca {
    String nombre;
    String direccion;
    int totalLibros;
    int librosPrestados;
    boolean abierta;

    Biblioteca(String nombre, String direccion, int totalLibros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.totalLibros = totalLibros;
        this.librosPrestados = 0;
        this.abierta = false;
    }

    void abrir() {
        abierta = true;
        System.out.println(nombre + " abierta a los estudiantes.");
    }

    void cerrar() {
        abierta = false;
        System.out.println(nombre + " cerrada.");
    }

    int librosDisponibles() {
        return totalLibros - librosPrestados;
    }

    void prestarLibro() {
        if (!abierta)
            System.out.println("La biblioteca esta cerrada.");
        else if (librosDisponibles() <= 0)
            System.out.println("No hay ejemplares disponibles.");
        else {
            librosPrestados++;
            System.out.println("Prestamo registrado.");
        }
    }

    void recibirDevolucion() {
        if (librosPrestados <= 0)
            System.out.println("No hay prestamos pendientes.");
        else {
            librosPrestados--;
            System.out.println("Devolucion registrada.");
        }
    }

    void mostrarEstado() {
        System.out.println(nombre + " (" + direccion + ") | disponibles: "
                + librosDisponibles() + "/" + totalLibros + " | "
                + (abierta ? "ABIERTA" : "CERRADA"));
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Biblioteca Central U. de Cartagena", "Centro", 12000);
        b.mostrarEstado();
        b.prestarLibro(); // cerrada
        System.out.println();
        b.abrir();
        b.prestarLibro();
        b.prestarLibro();
        System.out.println();
        b.mostrarEstado();
        System.out.println();
        b.recibirDevolucion();
        b.mostrarEstado();
        System.out.println();
        b.cerrar();
    }
}