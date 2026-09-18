package Ejercicio69;

class ActividadAcademica {
    String titulo;
    String asignatura;
    boolean entregada;

    ActividadAcademica(String titulo, String asignatura, boolean entregada) {
        this.titulo = titulo;
        this.asignatura = asignatura;
        this.entregada = entregada;
    }

    void mostrar() {
        System.out.println("  " + titulo + " (" + asignatura + ") -> "
                + (entregada ? "entregada" : "pendiente"));
    }
}

class Bus {
    String ruta;
    String placa;
    int pasajeros;

    Bus(String ruta, String placa, int pasajeros) {
        this.ruta = ruta;
        this.placa = placa;
        this.pasajeros = pasajeros;
    }

    void mostrar() {
        System.out.println("  Ruta " + ruta + " | " + placa + " | " + pasajeros + " pasajeros");
    }
}

class PedidoDomicilio {
    String cliente;
    int total;
    String estado;

    PedidoDomicilio(String cliente, int total, String estado) {
        this.cliente = cliente;
        this.total = total;
        this.estado = estado;
    }

    void mostrar() {
        System.out.println("  " + cliente + " | $" + total + " | " + estado);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Cinco actividades:");
        new ActividadAcademica("Taller Clases y Objetos", "POO", true).mostrar();
        new ActividadAcademica("Quiz de herencia", "POO", false).mostrar();
        new ActividadAcademica("Modelo entidad-relacion", "Bases de Datos", true).mostrar();
        new ActividadAcademica("Informe de laboratorio", "Redes", false).mostrar();
        new ActividadAcademica("Ensayo de etica profesional", "Etica", true).mostrar();

        System.out.println("\nCinco buses:");
        new Bus("T102", "WXY-123", 28).mostrar();
        new Bus("T103", "ABC-456", 40).mostrar();
        new Bus("A101", "DEF-789", 12).mostrar();
        new Bus("X104", "GHI-321", 0).mostrar();
        new Bus("T105", "JKL-654", 35).mostrar();

        System.out.println("\nCinco pedidos:");
        new PedidoDomicilio("Ana Ruiz", 54000, "ENTREGADO").mostrar();
        new PedidoDomicilio("Pedro Gomez", 32000, "EN_CAMINO").mostrar();
        new PedidoDomicilio("Laura Martinez", 78500, "RECIBIDO").mostrar();
        new PedidoDomicilio("Carlos Diaz", 19000, "CANCELADO").mostrar();
        new PedidoDomicilio("Rosa Beltran", 96000, "ENTREGADO").mostrar();

    }
}