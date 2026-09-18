package Ejercicio24;

class Libro {
    String titulo;
    String autor;
    int paginas;

    Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    void mostrarInfo() {
        System.out.println(titulo + " - " + autor + " (" + paginas + " pags)");
    }
}

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Rayuela", "Julio Cortazar", 600);
        l1.mostrarInfo();

    }
}