package Ejercicio63;

class Hospital {
    String nombre;
    String ciudad;
    int camasTotales;
    int camasOcupadas;
    boolean urgenciasHabilitadas;

    Hospital(String nombre, String ciudad, int camasTotales) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.camasTotales = camasTotales;
        this.camasOcupadas = 0;
        this.urgenciasHabilitadas = true;
    }

    int camasDisponibles() {
        return camasTotales - camasOcupadas;
    }

    void ingresarPaciente() {
        if (camasDisponibles() <= 0)
            System.out.println("Sin camas disponibles.");
        else {
            camasOcupadas++;
            System.out.println("Paciente ingresado.");
        }
    }

    void darDeAlta() {
        if (camasOcupadas <= 0)
            System.out.println("No hay pacientes hospitalizados.");
        else {
            camasOcupadas--;
            System.out.println("Alta registrada.");
        }
    }

    void cerrarUrgencias() {
        urgenciasHabilitadas = false;
    }

    void habilitarUrgencias() {
        urgenciasHabilitadas = true;
    }

    void mostrarEstado() {
        System.out.println(nombre + " (" + ciudad + ") | ocupacion: " + camasOcupadas
                + "/" + camasTotales + " | urgencias: "
                + (urgenciasHabilitadas ? "ABIERTAS" : "CERRADAS"));
    }
}

public class Main {
    public static void main(String[] args) {
        Hospital h = new Hospital("Hospital Universitario del Caribe", "Cartagena", 3);
        h.mostrarEstado();
        h.ingresarPaciente();
        h.ingresarPaciente();
        h.ingresarPaciente();
        h.ingresarPaciente(); // rechazado por indisponibilidad
        System.out.println();
        h.mostrarEstado();
        System.out.println();
        h.darDeAlta();
        h.mostrarEstado();
        System.out.println();
        h.cerrarUrgencias();
        h.mostrarEstado();
    }
}