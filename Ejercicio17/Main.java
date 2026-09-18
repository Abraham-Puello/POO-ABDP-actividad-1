package Ejercicio17;

class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    void cambiarSemestre(int nuevoSemestre) {
        if (nuevoSemestre >= 1 && nuevoSemestre <= 10) {
            semestre = nuevoSemestre;
            System.out.println(nombre + " ahora esta en semestre " + semestre);
        } else {
            System.out.println("Semestre fuera de rango (1 a 10).");
        }
    }

    void mostrarInfo() {
        System.out.println(nombre + " | " + codigo + " | Semestre " + semestre);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        est1.nombre = "Laura Martinez";
        est1.codigo = "120480007";
        est1.semestre = 3;

        est1.mostrarInfo();
        System.out.println();
        est1.cambiarSemestre(4);
        System.out.println();
        est1.mostrarInfo();
    }
}