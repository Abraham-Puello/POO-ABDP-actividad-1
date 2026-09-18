package Ejercicio16;

class Producto {
    String nombre;
    double precio;
    int stock;

    void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock)
            stock -= cantidad;
    }

    void reabastecer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Se agregaron " + cantidad + " unidad(es) al inventario.");
        } else {
            System.out.println("La cantidad a reabastecer debe ser positiva.");
        }
    }

    void mostrarProducto() {
        System.out.println(nombre + " | $" + precio + " | stock: " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Mouse";
        p1.precio = 65000;
        p1.stock = 4;

        p1.mostrarProducto();
        p1.vender(2);
        p1.mostrarProducto();
        p1.reabastecer(20);
        p1.mostrarProducto();
    }
}