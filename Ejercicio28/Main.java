package Ejercicio28;

class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    CuentaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    void mostrarCuenta() {
        System.out.println("Cuenta " + numero + " | " + titular + " | Saldo: $" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("98765", "Pedro Gomez", 200000);
        CuentaBancaria c2 = new CuentaBancaria("45321", "Ana Ruiz", 1500000);
        CuentaBancaria c3 = new CuentaBancaria("77012", "Carlos Diaz", 45000);

        c1.mostrarCuenta();
        System.out.println();
        c2.mostrarCuenta();
        System.out.println();
        c3.mostrarCuenta();
    }
}