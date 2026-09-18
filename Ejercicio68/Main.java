package Ejercicio68;

class PedidoDomicilio {
    String cliente;
    String direccion;
    int subtotal, costoEnvio;
    String estado; // RECIBIDO, EN_CAMINO, ENTREGADO, CANCELADO

    PedidoDomicilio(String cliente, String direccion, int subtotal, int costoEnvio) {
        this.cliente = cliente;
        this.direccion = direccion;
        this.subtotal = subtotal;
        this.costoEnvio = costoEnvio;
        this.estado = "RECIBIDO";
    }

    int calcularTotal() {
        return subtotal + costoEnvio;
    }

    void despachar() {
        if (!estado.equals("RECIBIDO"))
            System.out.println("Solo se despachan pedidos recibidos.");
        else {
            estado = "EN_CAMINO";
            System.out.println("Pedido de " + cliente + " en camino.");
        }
    }

    void entregar() {
        if (!estado.equals("EN_CAMINO"))
            System.out.println("El pedido aun no ha salido.");
        else {
            estado = "ENTREGADO";
            System.out.println("Pedido entregado. Cobrar $" + calcularTotal());
        }
    }

    void cancelar() {
        if (estado.equals("ENTREGADO"))
            System.out.println("No se puede cancelar un pedido entregado.");
        else {
            estado = "CANCELADO";
            System.out.println("Pedido cancelado.");
        }
    }

    void mostrarPedido() {
        System.out.println(cliente + " | " + direccion + " | Total: $" + calcularTotal()
                + " | Estado: " + estado);
    }
}

public class Main {
    public static void main(String[] args) {
        PedidoDomicilio p = new PedidoDomicilio("Ana Ruiz", "Manga, Cra 21 #25-40", 48000, 6000);
        p.mostrarPedido();
        p.entregar(); // rechaza
        System.out.println();
        p.despachar();
        p.entregar();
        System.out.println();
        p.cancelar(); // rechaza porque ya fue entregado
        System.out.println();
        p.mostrarPedido();
    }
}