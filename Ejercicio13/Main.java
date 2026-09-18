package Ejercicio13;

class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    void consignar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Consignacion exitosa de $" + valor);
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
        }
    }

    void mostrarCuenta() {
        System.out.println("Cuenta N: " + numero + " | " + titular + " | Saldo: $" + saldo);
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
        c1.consignar(150000);
        System.out.println();
        c1.mostrarCuenta();
    }
}