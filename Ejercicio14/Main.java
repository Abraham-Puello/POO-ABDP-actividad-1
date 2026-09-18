package Ejercicio14;

class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    void consignar(double valor) {
        if (valor > 0)
            saldo += valor;
    }

    void retirar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido.");
        } else if (valor > saldo) {
            System.out.println("Fondos insuficientes. Saldo disponible: $" + saldo);
        } else {
            saldo -= valor;
            System.out.println("Retiro exitoso de $" + valor);
        }
    }

    void mostrarCuenta() {
        System.out.println("Cuenta N:" + numero + " | " + titular + " | Saldo: $" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        c1.numero = "98765";
        c1.titular = "Pedro Gomez";
        c1.saldo = 200000;

        c1.mostrarCuenta();
        System.out.println();
        c1.retirar(50000);
    }
}