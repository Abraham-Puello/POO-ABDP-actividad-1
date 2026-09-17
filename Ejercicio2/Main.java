package Ejercicio2;

class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.marca = "Ford";
        v1.modelo = "Focus";
        v1.velocidadActual = 80;
        v1.mostrarEstado();
    }
}