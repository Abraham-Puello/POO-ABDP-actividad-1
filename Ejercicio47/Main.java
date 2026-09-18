package Ejercicio47;

class Producto {
    String nombre;
    int stock;

    void mostrarProducto() {
        System.out.println(nombre + " - stock: " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.nombre = "Teclado";
        p.stock = 12;
        p.mostrarProducto();
    }
}