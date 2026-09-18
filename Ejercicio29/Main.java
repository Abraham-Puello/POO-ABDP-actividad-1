package Ejercicio29;

class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    Estudiante() {
        this("Sin nombre", "0000");
    }

    Estudiante(String nombre, String codigo) {
        this(nombre, codigo, 0);
    }

    Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    void mostrarInfo() {
        System.out.println(nombre + " | " + codigo + " | Semestre " + semestre);
    }
}

public class Main {
    public static void main(String[] args) {
        new Estudiante().mostrarInfo();
        System.out.println();
        new Estudiante("Laura Martinez", "1204").mostrarInfo();
        System.out.println();
        new Estudiante("Luis Perez", "1058", 4).mostrarInfo();
    }
}