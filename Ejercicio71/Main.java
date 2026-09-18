package Ejercicio71;

class Estudiante {
    String nombre;
    String codigo;
    int semestre;

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
        Estudiante est1 = new Estudiante("Laura Martinez", "1204", 3);
        Estudiante est2 = new Estudiante("Luis Perez", "1058", 4);
        Estudiante est3 = new Estudiante("Marta Salgado", "1102", 1);

        est1.mostrarInfo();
        System.out.println();
        est2.mostrarInfo();
        System.out.println();
        est3.mostrarInfo();
    }
}