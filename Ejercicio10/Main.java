package Ejercicio10;

class CuentaBancaria {
    String numero;
    String titular;
    int saldo;

    void mostrarCuenta() {
        System.out.println("Cuenta N: " + numero + " | " + titular + " | Saldo: " + saldo + " COP");
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        c1.numero = "98765";
        c1.titular = "Pedro Gomez";
        c1.saldo = 1750000;

        CuentaBancaria c2 = new CuentaBancaria();
        c2.numero = "45321";
        c2.titular = "Ana Ruiz";
        c2.saldo = 631000;

        c1.mostrarCuenta();
        System.out.println();
        c2.mostrarCuenta();
    }
}