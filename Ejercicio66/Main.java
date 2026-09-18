package Ejercicio66;

class ActividadAcademica {
    String titulo;
    String asignatura;
    String fechaEntrega;
    boolean entregada;
    double nota;

    ActividadAcademica(String titulo, String asignatura, String fechaEntrega) {
        this.titulo = titulo;
        this.asignatura = asignatura;
        this.fechaEntrega = fechaEntrega;
        this.entregada = false;
        this.nota = 0.0;
    }

    void entregar() {
        if (entregada)
            System.out.println("Esta actividad ya fue entregada.");
        else {
            entregada = true;
            System.out.println("\"" + titulo + "\" entregada en SIMA-PESAD.");
        }
    }

    void calificar(double nota) {
        if (!entregada)
            System.out.println("No se puede calificar: aun no se ha entregado.");
        else if (nota < 0 || nota > 5)
            System.out.println("Nota fuera del rango 0.0 - 5.0");
        else {
            this.nota = nota;
            System.out.println("Nota registrada: " + nota);
        }
    }

    void mostrarFicha() {
        System.out.println(titulo + " | " + asignatura + " | vence: " + fechaEntrega
                + " | " + (entregada ? "ENTREGADA" : "PENDIENTE") + " | nota: " + nota);
    }
}

public class Main {
    public static void main(String[] args) {
        ActividadAcademica a1 = new ActividadAcademica(
                "Taller Clases y Objetos", "Programacion Orientada a Objetos", "2026-09-18");

        a1.mostrarFicha();
        a1.calificar(4.5); // rechaza
        System.out.println();
        a1.entregar();
        a1.calificar(4.5);
        System.out.println();
        a1.mostrarFicha();
    }
}