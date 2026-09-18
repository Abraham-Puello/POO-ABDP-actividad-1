package Ejercicio23;

class Libro {
    String titulo;
    String autor;
    int paginas;

    Libro() { // constructor vacio
        titulo = "Sin titulo";
        autor = "Desconocido";
        paginas = 0;
        System.out.println(">> Libro con valores vacíos");
    }

    void mostrarInfo() {
        System.out.println(titulo + " - " + autor + " (" + paginas + " pags)");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.mostrarInfo();

        l1.titulo = "Rayuela";
        l1.autor = "Julio Cortazar";
        l1.paginas = 600;
        l1.mostrarInfo();
    }
}