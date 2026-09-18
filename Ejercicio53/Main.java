package Ejercicio53;

class Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;

    Reserva(String nombreCliente, String fecha) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = false;
    }

    void confirmar() {
        if (activa)
            System.out.println("La reserva ya estaba confirmada.");
        else {
            activa = true;
            System.out.println("Reserva de " + nombreCliente + " confirmada.");
        }
    }

    void cancelar() {
        if (!activa)
            System.out.println("No hay una reserva activa que cancelar.");
        else {
            activa = false;
            System.out.println("Reserva de " + nombreCliente + " cancelada.");
        }
    }

    void mostrarEstado() {
        System.out.println(nombreCliente + " | " + fecha + " | "
                + (activa ? "ACTIVA" : "NO ACTIVA"));
    }
}

public class Main {
    public static void main(String[] args) {
        Reserva r = new Reserva("Ana Ruiz", "2026-10-05");
        r.mostrarEstado();
        r.cancelar();
        System.out.println();
        r.confirmar();
        r.mostrarEstado();
        System.out.println();
        r.cancelar();
        r.mostrarEstado();
    }
}