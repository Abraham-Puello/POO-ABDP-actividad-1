package Ejercicio37;

class Celular {
    String marca;
    int bateria;
    boolean prendido;

    Celular(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
        this.prendido = false;
    }

    void encender() {
        if (bateria <= 0)
            System.out.println("Sin bateria: no se puede encender.");
        else if (prendido)
            System.out.println("El celular ya estaba prendido.");
        else {
            prendido = true;
            System.out.println("Celular encendido.");
        }
    }

    void apagar() {
        if (!prendido)
            System.out.println("El celular ya estaba apagado.");
        else {
            prendido = false;
            System.out.println("Celular apagado.");
        }
    }

    void cargarBateria(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad de carga invalida.");
            return;
        }
        bateria += cantidad;
        if (bateria > 100)
            bateria = 100;
        System.out.println("Bateria cargada. Nivel actual: " + bateria + "%");
    }

    void mostrarEstado() {
        System.out.println("Celular " + marca + " | Bateria: " + bateria + "% | "
                + (prendido ? "PRENDIDO" : "APAGADO"));
    }
}

public class Main {
    public static void main(String[] args) {
        Celular c = new Celular("Samsung", 0);
        c.mostrarEstado();
        c.encender();
        System.out.println();
        c.cargarBateria(45);
        c.encender();
        c.mostrarEstado();
        System.out.println();
        c.cargarBateria(20);
        c.mostrarEstado();
    }
}