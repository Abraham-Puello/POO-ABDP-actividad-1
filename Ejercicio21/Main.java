package Ejercicio21;

class Producto {
    String nombre;
    String categoria;
    double precio;
    int stock;

    void mostrarProducto() {
        System.out.println(nombre + " | categoria: " + categoria + " | $" + precio + " | stock: " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Teclado mecanico";
        p1.categoria = "Perifericos"; // igual en ambos
        p1.precio = 180000;
        p1.stock = 12;

        Producto p2 = new Producto();
        p2.nombre = "Mouse inalambrico";
        p2.categoria = "Perifericos"; // igual en ambos
        p2.precio = 65000;
        p2.stock = 30;

        p1.mostrarProducto();
        p2.mostrarProducto();

        /*
         * Coinciden en "categoria" pero siguen siendo dos objetos distintos.
         * Compartir un valor NO los convierte en el mismo objeto: cada uno
         * tiene su propia copia del atributo categoria en su propia memoria.
         * Si cambio p1.categoria, p2.categoria no se entera del cambio
         */
        System.out.println();
        p1.categoria = "Accesorios";
        System.out.println("Despues de cambiar solo p1:");
        p1.mostrarProducto();
        p2.mostrarProducto();
    }
}