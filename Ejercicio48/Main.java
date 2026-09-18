package Ejercicio48;

class CuentaBancaria {
    String titular;
    double saldo;

    void consignar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido.");
            return;
        }
        this.saldo = this.saldo + valor; // this.saldo = atributo del objeto
        System.out.println("Consignado: $" + valor);
    }

    void mostrarCuenta() {
        System.out.println(titular + " -> Saldo: $" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria();
        c.titular = "Pedro Gomez";
        c.saldo = 100000;

        c.mostrarCuenta();
        System.out.println();
        c.consignar(50000);
        c.mostrarCuenta(); // ahora si refleja 150000
    }
}