package Ejercicio30;

class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    Estudiante() {
        this.nombre = "Sin nombre";
        this.codigo = "0000";
        this.semestre = 0;
    }

    Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = 0;
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
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante("Laura Martinez", "1204");
        Estudiante e3 = new Estudiante("Luis Perez", "1058", 4);

        System.out.print("Vacio:        ");
        e1.mostrarInfo();
        System.out.print("2 parámetros: ");
        e2.mostrarInfo();
        System.out.print("3 parámetros: ");
        e3.mostrarInfo();
    }
}