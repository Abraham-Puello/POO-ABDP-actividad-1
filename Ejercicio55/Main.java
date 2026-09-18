package Ejercicio55;

class Reloj {
    int hora;
    int minuto;
    int segundo;

    Reloj(int hora, int minuto, int segundo) {
        this.hora = (hora >= 0 && hora < 24) ? hora : 0;
        this.minuto = (minuto >= 0 && minuto < 60) ? minuto : 0;
        this.segundo = (segundo >= 0 && segundo < 60) ? segundo : 0;
    }

    void avanzarSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
        }
        if (minuto == 60) {
            minuto = 0;
            hora++;
        }
        if (hora == 24) {
            hora = 0;
        }
    }

    void mostrarHora() {
        System.out.println(dosDigitos(hora) + ":" + dosDigitos(minuto) + ":" + dosDigitos(segundo));
    }

    String dosDigitos(int n) {
        return (n < 10) ? "0" + n : "" + n;
    }
}

public class Main {
    public static void main(String[] args) {
        Reloj r = new Reloj(23, 59, 57);

        r.mostrarHora();
        for (int i = 0; i < 4; i++) {
            r.avanzarSegundo();
            r.mostrarHora();
        }
    }
}