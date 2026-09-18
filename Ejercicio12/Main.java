package Ejercicio12;

class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void acelerar() {
        velocidadActual += 10;
    }

    void frenar() {
        if (velocidadActual >= 10) {
            velocidadActual -= 10;
        } else {
            velocidadActual = 0;
        }
    }

    void mostrarEstado() {
        System.out.println(marca + " " + modelo + " -> " + velocidadActual + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.marca = "Tesla";
        v1.modelo = "Model Y";
        v1.velocidadActual = 25;

        v1.mostrarEstado();
        v1.frenar();
        v1.mostrarEstado();
        v1.frenar();
        v1.mostrarEstado();
        v1.frenar();
        v1.mostrarEstado();
    }
}