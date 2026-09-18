package Ejercicio51;

class Rectangulo {
    double base;
    double altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return 2 * (base + altura);
    }

    void mostrarResultados() {
        System.out.println("Rectángulo de " + base + " x " + altura);
        System.out.println("  Area:      " + calcularArea());
        System.out.println("  Perimetro: " + calcularPerimetro());
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5, 3);
        Rectangulo r2 = new Rectangulo(10, 10);

        r1.mostrarResultados();
        System.out.println();
        r2.mostrarResultados();
    }
}