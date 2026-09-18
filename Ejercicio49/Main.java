package Ejercicio49;

class Estudiante {
    String nombre;
    double promedio;

    Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    void compararCon(Estudiante otro) { // ahora si hay referencia
        if (this.promedio > otro.promedio) {
            System.out.println(this.nombre + " tiene mejor promedio que " + otro.nombre);
        } else if (this.promedio < otro.promedio) {
            System.out.println(otro.nombre + " tiene mejor promedio que " + this.nombre);
        } else {
            System.out.println(this.nombre + " y " + otro.nombre + " estan empatados.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Laura", 4.5);
        Estudiante e2 = new Estudiante("Luis", 3.9);
        Estudiante e3 = new Estudiante("Marta", 4.5);

        e1.compararCon(e2);
        e3.compararCon(e2);
        System.out.println();
        e1.compararCon(e3);
    }
}