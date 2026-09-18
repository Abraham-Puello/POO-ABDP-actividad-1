package Ejercicio27;

class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    CuentaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = (saldoInicial >= 0) ? saldoInicial : 0; // regla: no se abre en negativo
    }

    void mostrarCuenta() {
        System.out.println("Cuenta N: " + numero + " | " + titular + " | Saldo: $" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("98765", "Pedro Gomez", 200000);
        c1.mostrarCuenta();

        System.out.println();

        CuentaBancaria c2 = new CuentaBancaria("11111", "Cuenta inválida", -5000);
        c2.mostrarCuenta(); // el constructor corrigio el valor a 0
    }
}