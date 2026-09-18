package Ejercicio61;

class Docente {
    String nombre;
    String cedula;
    String asignatura;
    int añosExperiencia;
    boolean activo;

    Docente(String nombre, String cedula, String asignatura, int añosExperiencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.asignatura = asignatura;
        this.añosExperiencia = añosExperiencia;
        this.activo = true;
    }

    void cambiarAsignatura(String nueva) {
        asignatura = nueva;
        System.out.println(nombre + " ahora dicta " + nueva);
    }

    void cumplirAñoExperiencia() {
        añosExperiencia++;
    }

    void mostrarPerfil() {
        System.out.println(nombre + " | CC " + cedula + " | " + asignatura
                + " | " + añosExperiencia + " años de experiencia| " + (activo ? "ACTIVO" : "INACTIVO"));
    }
}

public class Main {
    public static void main(String[] args) {
        Docente d1 = new Docente("John Carlos Arrieta Arrieta", "73123456",
                "Programacion Orientada a Objetos", 12);
        Docente d2 = new Docente("Marta Ceballos", "45987123", "Bases de Datos", 7);

        d1.mostrarPerfil();
        System.out.println();
        d2.mostrarPerfil();
        System.out.println();
        d1.cumplirAñoExperiencia();
        System.out.println();
        d1.mostrarPerfil();
    }
}