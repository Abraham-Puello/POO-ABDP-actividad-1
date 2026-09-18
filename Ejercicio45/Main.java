package Ejercicio45;

class Estudiante {
    String nombre;
    String codigo;

    void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Codigo: " + codigo);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.nombre = "Laura Martinez";
        e.codigo = "1204";
        e.mostrarInfo();
    }
}