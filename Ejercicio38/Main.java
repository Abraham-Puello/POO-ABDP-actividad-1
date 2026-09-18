package Ejercicio38;

class Ventilador {
    String marca;
    int velocidad; // 0 a 3
    boolean encendido;

    Ventilador(String marca) {
        this.marca = marca;
        this.velocidad = 0;
        this.encendido = false;
    }

    void encender() {
        if (encendido) {
            System.out.println("Ya estaba encendido.");
            return;
        }
        encendido = true;
        velocidad = 1;
        System.out.println("Ventilador encendido en velocidad 1.");
    }

    void apagar() {
        if (!encendido) {
            System.out.println("Ya estaba apagado.");
            return;
        }
        encendido = false;
        velocidad = 0;
        System.out.println("Ventilador apagado.");
    }

    void subirVelocidad() {
        if (!encendido)
            System.out.println("Primero debe encender el ventilador.");
        else if (velocidad >= 3)
            System.out.println("Ya esta en la velocidad maxima (3).");
        else {
            velocidad++;
            System.out.println("Velocidad ahora en " + velocidad);
        }
    }

    void mostrarEstado() {
        System.out.println("Ventilador " + marca + " | velocidad: " + velocidad + " | "
                + (encendido ? "ENCENDIDO" : "APAGADO"));
    }
}

public class Main {
    public static void main(String[] args) {
        Ventilador v = new Ventilador("Samurai");
        v.mostrarEstado();
        v.subirVelocidad(); // rechazado, esta apagado
        System.out.println();
        v.encender();
        v.subirVelocidad();
        v.subirVelocidad();
        v.subirVelocidad(); // tope
        System.out.println();
        v.mostrarEstado();
        System.out.println();
        v.apagar();
        v.mostrarEstado();
    }
}