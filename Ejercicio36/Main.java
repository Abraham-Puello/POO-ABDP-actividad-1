package Ejercicio36;

class Puerta {
    String material;
    boolean abierta;

    Puerta(String material) {
        this.material = material;
        this.abierta = false;
    }

    void abrir() {
        if (abierta)
            System.out.println("La puerta ya estaba abierta.");
        else {
            abierta = true;
            System.out.println("Puerta abierta.");
        }
    }

    void cerrar() {
        if (!abierta)
            System.out.println("La puerta ya estaba cerrada.");
        else {
            abierta = false;
            System.out.println("Puerta cerrada.");
        }
    }

    void mostrarEstado() {
        System.out.println("Puerta de " + material + " -> " + (abierta ? "ABIERTA" : "CERRADA"));
    }
}

public class Main {
    public static void main(String[] args) {
        Puerta p1 = new Puerta("Madera");
        Puerta p2 = new Puerta("Vidrio");

        p1.mostrarEstado();
        p2.mostrarEstado();

        p1.abrir();
        System.out.println("\nEstado despues de abrir solo p1:");
        p1.mostrarEstado();
        p2.mostrarEstado();
    }
}