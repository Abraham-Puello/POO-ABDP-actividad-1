package Ejercicio31;

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

    void mostrarProducto() {
        System.out.println(nombre + " | $" + precio + " | stock: " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p1 = Producto.crearProductoBasico("Cargador USB-C", 45000);
        p1.mostrarProducto();
    }
}