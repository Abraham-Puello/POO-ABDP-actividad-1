package Ejercicio64;

class Tienda {
    String nombre;
    String propietario;
    boolean abierta;
    int ventasDelDia, caja;

    Tienda(String nombre, String propietario, int cajaInicial) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.caja = cajaInicial;
        this.abierta = false;
        this.ventasDelDia = 0;
    }

    void abrir() {
        abierta = true;
        System.out.println(nombre + " abierta.");
    }

    void cerrar() {
        abierta = false;
        System.out.println(nombre + " cerrada.");
    }

    void registrarVenta(int monto) {
        if (!abierta) {
            System.out.println("La tienda esta cerrada.");
            return;
        }
        if (monto <= 0) {
            System.out.println("Monto invalido.");
            return;
        }
        caja += monto;
        ventasDelDia++;
        System.out.println("Venta registrada por $" + monto);
    }

    void registrarGasto(int monto) {
        if (monto > caja)
            System.out.println("No hay efectivo suficiente en caja.");
        else {
            caja -= monto;
            System.out.println("Gasto de $" + monto);
        }
    }

    void cerrarCaja() {
        System.out.println("--- Cierre de " + nombre + " ---");
        System.out.println("Propietario: " + propietario);
        System.out.println("Ventas del dia: " + ventasDelDia);
        System.out.println("Efectivo en caja: $" + caja);
        ventasDelDia = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Tienda t = new Tienda("Tienda La Esquina", "Rosa Beltran", 50000);
        t.registrarVenta(12000); // cerrada
        System.out.println();
        t.abrir();
        t.registrarVenta(12000);
        t.registrarVenta(8500);
        System.out.println();
        t.registrarGasto(20000);
        System.out.println();
        t.registrarGasto(480000); // rechaza el gasto
        System.out.println();
        t.cerrarCaja();
        System.out.println();
        t.cerrar();
    }
}