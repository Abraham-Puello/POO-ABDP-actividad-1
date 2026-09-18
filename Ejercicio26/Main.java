package Ejercicio26;

class Producto {
    String nombre;
    double precio;
    int stock;

    Producto() {
        this.nombre = "Producto genérico";
        this.precio = 0;
        this.stock = 0;
    }

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarProducto() {
        System.out.println(nombre + " | $" + precio + " | stock: " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        Producto p2 = new Producto("Monitor de 24 pulgadas", 850000, 5);

        p1.mostrarProducto();
        System.out.println();
        p2.mostrarProducto();
    }
}