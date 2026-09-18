package Ejercicio32;

class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    static Producto crearProductoBasico(String nombre, double precio) {
        return new Producto(nombre, precio, 0);
    }

    void reabastecer(int cantidad) {
        if (cantidad > 0)
            stock += cantidad;
    }

    void mostrarProducto() {
        System.out.println(nombre + " | $" + precio + " | stock: " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p1 = Producto.crearProductoBasico("Cargador USB-C", 45000);
        Producto p2 = Producto.crearProductoBasico("Memoria USB 64GB", 38000);

        p1.mostrarProducto();
        p2.mostrarProducto();

        System.out.println("\nDespues de reabastecer:");
        p1.reabastecer(20);
        p2.reabastecer(15);
        p1.mostrarProducto();
        p2.mostrarProducto();
    }
}