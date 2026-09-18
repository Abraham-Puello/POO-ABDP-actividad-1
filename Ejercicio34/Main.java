package Ejercicio34;

class Libro {
    String titulo;
    String autor;
    int paginas;

    Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    Libro(Libro otro) {
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.paginas = otro.paginas;
    }

    void mostrarInfo() {
        System.out.println(titulo + " - " + autor + " (" + paginas + " pags)");
    }
}

public class Main {
    public static void main(String[] args) {
        Libro original = new Libro("Rayuela", "Julio Cortazar", 600);
        Libro copia = new Libro(original);

        System.out.println("Al inicio son identicos en contenido:");
        System.out.print("Original: ");
        original.mostrarInfo();
        System.out.print("Copia:    ");
        copia.mostrarInfo();

        copia.titulo = "Rayuela (edicion anotada)";
        copia.paginas = 720;

        System.out.println("\nDespues de modificar la copia:");
        System.out.print("Original: ");
        original.mostrarInfo();
        System.out.print("Copia:    ");
        copia.mostrarInfo();
    }
}