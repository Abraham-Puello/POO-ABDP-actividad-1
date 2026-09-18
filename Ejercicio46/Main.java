package Ejercicio46;

class Vehiculo {
    String marca;
    int velocidadActual;

    void mostrarEstado() {
        System.out.println(marca + " -> " + velocidadActual + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        v.marca = "Ford";
        v.velocidadActual = 80;
        v.mostrarEstado();
    }
}