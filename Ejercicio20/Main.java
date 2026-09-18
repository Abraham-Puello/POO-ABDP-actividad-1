package Ejercicio20;

class Vehiculo {
    String marca;
    String modelo;
    String color;
    int velocidadActual;

    void mostrarEstado() {
        System.out.println(marca + " " + modelo + " (" + color + ") -> " + velocidadActual + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.marca = "Ford";
        miVehiculo.modelo = "Focus";
        miVehiculo.color = "Rojo";
        miVehiculo.velocidadActual = 80;

        Vehiculo vehiculoDeMama = new Vehiculo();
        vehiculoDeMama.marca = "Tesla";
        vehiculoDeMama.modelo = "Model Y";
        vehiculoDeMama.color = "Azul";
        vehiculoDeMama.velocidadActual = 0;

        Vehiculo vehiculoDeCarreras = new Vehiculo();
        vehiculoDeCarreras.marca = "Ford";
        vehiculoDeCarreras.modelo = "Mustang";
        vehiculoDeCarreras.color = "Amarillo";
        vehiculoDeCarreras.velocidadActual = 160;

        miVehiculo.mostrarEstado();
        vehiculoDeMama.mostrarEstado();
        vehiculoDeCarreras.mostrarEstado();

        /*
         * QUE COMPARTEN:
         * - La misma clase de origen: los tres son Vehiculo
         * - La misma estructura: los tres tienen marca, modelo, color y velocidadActual
         * - El mismo comportamiento disponible: los tres saben mostrarEstado()
         * - El mismo tipo: los tres pueden guardarse en una variable de tipo Vehiculo
         *
         * EN QUE SE DIFERENCIAN:
         * - En el estado: cada uno guarda valores propios en sus atributos
         * - En la identidad: son tres zonas de memoria independientes. Si acelero
         * vehiculoDeCarreras, los otros dos no cambian
         *
         */
    }
}