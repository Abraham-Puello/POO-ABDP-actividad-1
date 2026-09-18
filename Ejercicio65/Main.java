package Ejercicio65;

class EquipoDeFutbol {
    String nombre;
    String ciudad;
    int puntos;
    int partidosJugados;
    int golesAFavor;
    int golesEnContra;

    EquipoDeFutbol(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = 0;
        this.partidosJugados = 0;
        this.golesAFavor = 0;
        this.golesEnContra = 0;
    }

    void registrarPartido(int gf, int gc, int puntosGanados) {
        golesAFavor += gf;
        golesEnContra += gc;
        partidosJugados++;
        puntos += puntosGanados;
    }

    void ganar(int gf, int gc) {
        registrarPartido(gf, gc, 3);
    }

    void empatar(int gf, int gc) {
        registrarPartido(gf, gc, 1);
    }

    void perder(int gf, int gc) {
        registrarPartido(gf, gc, 0);
    }

    int diferenciaDeGol() {
        return golesAFavor - golesEnContra;
    }

    void mostrarTabla() {
        System.out.printf("%-22s PJ:%d  Pts:%d  GF:%d  GC:%d  DIF:%+d%n",
                nombre, partidosJugados, puntos, golesAFavor, golesEnContra, diferenciaDeGol());
    }
}

public class Main {
    public static void main(String[] args) {
        EquipoDeFutbol e1 = new EquipoDeFutbol("Real Cartagena", "Cartagena");
        EquipoDeFutbol e2 = new EquipoDeFutbol("Junior", "Barranquilla");

        e1.ganar(2, 1);
        e1.empatar(0, 0);
        e1.perder(1, 3);

        e2.ganar(3, 0);
        e2.ganar(1, 0);
        e2.perder(0, 2);

        e1.mostrarTabla();
        e2.mostrarTabla();
    }
}