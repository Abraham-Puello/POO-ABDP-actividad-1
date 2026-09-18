package Ejercicio67;

class Bus {
    String ruta;
    String placa;
    int pasajeros;
    int capacidad;
    boolean enServicio;

    Bus(String ruta, String placa, int capacidad) {
        this.ruta = ruta;
        this.placa = placa;
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.enServicio = false;
    }

    void iniciarRecorrido() {
        enServicio = true;
        System.out.println("Bus " + placa + " inicia ruta " + ruta);
    }

    void terminarRecorrido() {
        enServicio = false;
        pasajeros = 0;
        System.out.println("Recorrido terminado.");
    }

    void subirPasajeros(int cantidad) {
        if (!enServicio) {
            System.out.println("El bus no esta en servicio.");
            return;
        }
        if (pasajeros + cantidad > capacidad)
            System.out.println("Bus lleno. Cupos: " + (capacidad - pasajeros));
        else {
            pasajeros += cantidad;
            System.out.println(cantidad + " pasajero(s) abordaron.");
        }
    }

    void bajarPasajeros(int cantidad) {
        if (cantidad > pasajeros)
            pasajeros = 0;
        else
            pasajeros -= cantidad;
        System.out.println("Bajaron pasajeros. Quedan " + pasajeros);
    }

    void mostrarEstado() {
        System.out.println("Ruta " + ruta + " | " + placa + " | " + pasajeros + "/" + capacidad
                + " | " + (enServicio ? "EN SERVICIO" : "FUERA DE SERVICIO"));
    }
}

public class Main {
    public static void main(String[] args) {
        Bus b = new Bus("Transcaribe T102", "WXY-123", 40);
        b.mostrarEstado();
        System.out.println();
        b.iniciarRecorrido();
        b.subirPasajeros(25);
        b.subirPasajeros(20); // no hay cupo
        System.out.println();
        b.bajarPasajeros(10);
        b.mostrarEstado();
        System.out.println();
        b.terminarRecorrido();
        b.mostrarEstado();
    }
}