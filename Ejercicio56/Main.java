package Ejercicio56;

class Temperatura {
    double celsius;

    Temperatura(double celsius) {
        this.celsius = celsius;
    }

    double aFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    void mostrar() {
        System.out.println(celsius + " C equivalen a " + aFahrenheit() + " F");
    }
}

public class Main {
    public static void main(String[] args) {
        Temperatura t1 = new Temperatura(32); // un dia normal en Cartagena
        Temperatura t2 = new Temperatura(0);
        Temperatura t3 = new Temperatura(-10);

        t1.mostrar();
        System.out.println();
        t2.mostrar();
        System.out.println();
        t3.mostrar();
    }
}