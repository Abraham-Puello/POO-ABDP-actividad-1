package Ejercicio54;

class Semaforo {
    String colorActual;

    Semaforo() {
        this.colorActual = "ROJO";
    }

    void cambiarColor() {
        if (colorActual.equals("ROJO")) {
            colorActual = "VERDE";
        } else if (colorActual.equals("VERDE")) {
            colorActual = "AMARILLO";
        } else {
            colorActual = "ROJO";
        }
    }

    void mostrarColor() {
        System.out.println("Semaforo en: " + colorActual);
    }
}

public class Main {
    public static void main(String[] args) {
        Semaforo s = new Semaforo();

        s.mostrarColor();
        for (int i = 1; i <= 5; i++) {
            s.cambiarColor();
            s.mostrarColor();
        }
    }
}