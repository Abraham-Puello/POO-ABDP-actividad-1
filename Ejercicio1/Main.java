class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Semestre: " + semestre);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        est1.nombre = "Laura Martinez";
        est1.codigo = "1204";
        est1.semestre = 3;
        est1.mostrarInfo();
    }
}