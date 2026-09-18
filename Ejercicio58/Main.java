package Ejercicio58;

class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    double calcularValorTotal() {
        return cantidad * precioUnitario;
    }

    void mostrarItem() {
        System.out.println(nombre + " | " + cantidad + " x $" + precioUnitario
                + " = $" + calcularValorTotal());
    }
}

public class Main {
    public static void main(String[] args) {
        InventarioItem i1 = new InventarioItem("Teclado mecanico", 12, 180000);
        InventarioItem i2 = new InventarioItem("Mouse inalambrico", 30, 65000);
        InventarioItem i3 = new InventarioItem("Monitor 24 pulgadas", 5, 850000);

        i1.mostrarItem();
        i2.mostrarItem();
        i3.mostrarItem();

        double total = i1.calcularValorTotal() + i2.calcularValorTotal() + i3.calcularValorTotal();
        System.out.println("\nValor total del inventario: $" + total);
    }
}