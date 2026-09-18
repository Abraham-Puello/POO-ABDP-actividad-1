package Ejercicio15;

class Producto {
    String nombre;
    double precio;
    int stock;

    void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad invalida.");
        } else if (cantidad > stock) {
            System.out.println("No hay stock suficiente. Disponibles: " + stock);
        } else {
            stock -= cantidad;
            System.out.println("Venta de " + cantidad + " unidad(es) de " + nombre);
        }
    }

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

        p1.mostrarProducto();
        System.out.println();
        p1.vender(3);
        System.out.println();
        p1.mostrarProducto();
    }
}