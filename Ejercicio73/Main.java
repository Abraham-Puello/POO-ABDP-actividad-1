package Ejercicio73;

class Producto {
    String nombre;
    int precio;
    int stock;

    Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    Producto(Producto otro) { // constructor copia
        this.nombre = otro.nombre;
        this.precio = otro.precio;
        this.stock = otro.stock;
    }

    void mostrarProducto() {
        System.out.println(nombre + " | $" + precio + " | stock: " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Producto original = new Producto("Teclado mecanico", 180000, 12);

        Producto respaldo = new Producto(original); // otra copia sin modificar

        original.mostrarProducto();
        respaldo.mostrarProducto();

        System.out.println("\nModifico el stock del original...");
        original.stock = 0;
        original.mostrarProducto();
        respaldo.mostrarProducto();
    }
}