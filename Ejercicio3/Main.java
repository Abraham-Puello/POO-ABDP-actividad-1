package Ejercicio3;

class Producto {
    String nombre;
    double precio;
    int stock;

    void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Teclado mecanico";
        p1.precio = 180000;
        p1.stock = 12;
        p1.mostrarProducto();
    }
}