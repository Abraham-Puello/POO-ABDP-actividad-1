package Ejercicio33;

class Libro {
    String titulo;
    String autor;
    int paginas;

    Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    Libro(Libro otro) { // copia constructor
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.paginas = otro.paginas;
    }

    void mostrarInfo() {
        System.out.println(titulo + " - " + autor + " (" + paginas + " pags)");
    }
}