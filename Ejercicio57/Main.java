package Ejercicio57;

class NotaAcademica {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    NotaAcademica(String asignatura, double nota1, double nota2, double nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double calcularDefinitiva() {
        return (nota1 + nota2 + nota3) / 3;
    }

    boolean aprobo() {
        return calcularDefinitiva() >= 3.0;
    }

    void mostrarReporte() {
        System.out.printf("%s | %.1f  %.1f  %.1f | Definitiva: %.2f -> %s%n",
                asignatura, nota1, nota2, nota3, calcularDefinitiva(),
                (aprobo() ? "APROBADO" : "REPROBADO"));
    }
}

public class Main {
    public static void main(String[] args) {
        NotaAcademica n1 = new NotaAcademica("Programación Orientada a Objetos", 4.5, 4.0, 4.8);
        NotaAcademica n2 = new NotaAcademica("Cálculo Integral", 2.5, 3.0, 2.0);

        n1.mostrarReporte();
        System.out.println();
        n2.mostrarReporte();
    }
}