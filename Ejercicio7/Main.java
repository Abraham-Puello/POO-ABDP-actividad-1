package Ejercicio7;

class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void mostrarEstado() {
        System.out.println(marca + " " + modelo + " -> " + velocidadActual + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.marca = "Ford";
        v1.modelo = "Focus";
        v1.velocidadActual = 80;

        Vehiculo v2 = new Vehiculo();
        v2.marca = "Tesla";
        v2.modelo = "Model Y";
        v2.velocidadActual = 0;

        v1.mostrarEstado();
        v2.mostrarEstado();

    }
}