package Ejercicio43;

class Computador {
    String marca;
    String procesador;
    int ramGB;
    boolean encendido;

    Computador(String marca, String procesador, int ramGB) {
        this.marca = marca;
        this.procesador = procesador;
        this.ramGB = ramGB;
        this.encendido = false;
    }

    void encender() {
        encendido = true;
        System.out.println(marca + " encendido.");
    }

    void mostrarFicha() {
        System.out.println(marca + " | " + procesador + " | " + ramGB + "GB RAM | "
                + (encendido ? "ENCENDIDO" : "APAGADO"));
    }
}

public class Main {
    public static void main(String[] args) {
        Computador pc1 = new Computador("Lenovo ThinkPad", "Intel i5", 16);
        Computador pc2 = new Computador("HP Pavilion", "AMD Ryzen 5", 8);

        pc1.mostrarFicha();
        pc2.mostrarFicha();
        System.out.println();
        pc1.encender();
        pc1.mostrarFicha();
        pc2.mostrarFicha();

        /*
         * DIFERENCIA
         *
         * La clase Computador es el plano: dice que todo computador de este sistema
         * tendra marca, procesador, memoria RAM y un estado de encendido, y que sabra
         * encenderse y mostrar su ficha. Pero el plano no se puede usar. No puedo
         * escribir un documento en la clase Computador. En el plano, "ramGB" es apenas
         * un campo vacio: no son 8 ni 16 gigas, es la promesa de que habra un numero
         * ahi.
         *
         * pc1 es la maquina concreta: ocupa memoria real, tiene 16GB especificos, una
         * marca especifica y, en este momento, esta encendido. Tiene identidad: aunque
         * comprara otro ThinkPad identico, seria otra maquina, con su propio numero de
         * serie y su propio estado.
         *
         * El plano se diseña una vez; las maquinas se fabrican tantas veces como haga
         * falta. Eso es exactamente lo que hace new.
         */
    }
}