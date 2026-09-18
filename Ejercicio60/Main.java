package Ejercicio60;

class Avion {
    String aerolinea;
    String destino;
    int pasajeros;
    int capacidad;

    Avion(String aerolinea, String destino, int capacidad) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.capacidad = capacidad;
        this.pasajeros = 0;
    }

    void abordar(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad invalida.");
        } else if (pasajeros + cantidad > capacidad) {
            System.out.println("No hay cupo. Disponibles: " + (capacidad - pasajeros));
        } else {
            pasajeros += cantidad;
            System.out.println("Abordaron " + cantidad + " pasajero(s).");
        }
    }

    void mostrarVuelo() {
        System.out.println(aerolinea + " -> " + destino + " | Pasajeros: "
                + pasajeros + "/" + capacidad);
    }
}

public class Main {
    public static void main(String[] args) {
        Avion a = new Avion("Avianca", "Cartagena - Bogota", 150);

        a.mostrarVuelo();
        System.out.println();
        a.abordar(60);
        a.mostrarVuelo();
        System.out.println();
        a.abordar(80);
        a.mostrarVuelo();
        System.out.println();
        a.abordar(30); // rechazado por falta de cupo
        a.mostrarVuelo();
    }
}