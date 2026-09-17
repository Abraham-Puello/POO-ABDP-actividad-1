package Ejercicio6;

class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Codigo: " + codigo + " | Semestre: " + semestre);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante(); // instanciacion
        est1.nombre = "Laura Martinez"; // asignacion manual de atributos
        est1.codigo = "120480007";
        est1.semestre = 3;

        est1.mostrarInfo();
    }
}
