package Ejercicio4;

class CuentaBancaria {
    String numero;
    String titular;
    int saldo;

    void mostrarCuenta() {
        System.out.println("Cuenta N: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + " pesos");
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        c1.numero = "98765";
        c1.titular = "Pedro Gomez";
        c1.saldo = 1750000;
        c1.mostrarCuenta();
    }
}