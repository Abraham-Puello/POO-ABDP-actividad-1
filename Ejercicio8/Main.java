package Ejercicio8;

class Producto {
    String nombre;
    int precio, stock;

    void mostrarProducto() {
        System.out.println(nombre + " | $" + precio + " | stock: " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Teclado";
        p1.precio = 180000;
        p1.stock = 12;

        Producto p2 = new Producto();
        p2.nombre = "Mouse";
        p2.precio = 65000;
        p2.stock = 30;

        Producto p3 = new Producto();
        p3.nombre = "Monitor";
        p3.precio = 850000;
        p3.stock = 5;

        p1.mostrarProducto();
        p2.mostrarProducto();
        p3.mostrarProducto();

        // Los tres comparten la estructura definida por la clase Producto
        // usando los mismos atributos y el mismo metodo, pero cada uno guarda valores
        // propios
    }
}