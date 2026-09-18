package Ejercicio35;

class Lampara {
    String marca;
    boolean encendida;

    Lampara(String marca) {
        this.marca = marca;
        this.encendida = false;
    }

    void encender() {
        if (encendida)
            System.out.println("La lámpara ya estaba encendida.");
        else {
            encendida = true;
            System.out.println("Lámpara encendida.");
        }
    }

    void apagar() {
        if (!encendida)
            System.out.println("La lámpara ya estaba apagada.");
        else {
            encendida = false;
            System.out.println("Lámpara apagada.");
        }
    }

    void mostrarEstado() {
        System.out.println("Lámpara " + marca + " -> " + (encendida ? "ENCENDIDA" : "APAGADA"));
    }
}

public class Main {
    public static void main(String[] args) {
        Lampara l = new Lampara("Philips");
        l.mostrarEstado();
        System.out.println();
        l.encender();
        l.mostrarEstado();
        System.out.println();
        l.encender();
        System.out.println();
        l.apagar();
        l.mostrarEstado();
    }
}