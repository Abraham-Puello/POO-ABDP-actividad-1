package Ejercicio25;

class Libro {
    String titulo;
    String autor;
    int paginas;

    Libro() {
        this.titulo = "Sin titulo";
        this.autor = "Desconocido";
        this.paginas = 0;
    }

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
        Libro vacio = new Libro();
        Libro completo = new Libro("Rayuela", "Julio Cortazar", 600);

        System.out.print("Constructor vacio:   ");
        vacio.mostrarInfo();
        System.out.println();
        System.out.print("Constructor con parámetros:  ");
        completo.mostrarInfo();

    }
}