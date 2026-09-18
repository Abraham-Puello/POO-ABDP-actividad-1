package Ejercicio52;

class FacturaSimple {
    String numero;
    String cliente;
    double valor;

    FacturaSimple(String numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    void aplicarDescuento() {
        double descuento = valor * 0.10;
        valor = valor - descuento;
        System.out.println("Descuento aplicado: $" + descuento);
    }

    void mostrarFactura() {
        System.out.println("Factura " + numero + " | Cliente: " + cliente + " | Total: $" + valor);
    }
}

public class Main {
    public static void main(String[] args) {
        FacturaSimple f1 = new FacturaSimple("F-001", "Sazón Barril", 1200000);

        f1.mostrarFactura();
        System.out.println();
        f1.aplicarDescuento();
        f1.mostrarFactura();
    }
}