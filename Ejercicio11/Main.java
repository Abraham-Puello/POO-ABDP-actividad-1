package Ejercicio11;

class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void acelerar() {
        velocidadActual = velocidadActual + 10;
    }

    void mostrarEstado() {
        System.out.println(marca + " " + modelo + " -> " + velocidadActual + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.marca = "Ford";
        v1.modelo = "Focus";
        v1.velocidadActual = 20;

        v1.mostrarEstado();
        v1.acelerar();
        v1.mostrarEstado();
    }
}