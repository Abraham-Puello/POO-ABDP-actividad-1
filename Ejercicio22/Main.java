package Ejercicio22;

class Libro {
    String titulo;
    String autor;
    int paginas;

    void mostrarInfo() {
        System.out.println(titulo + " - " + autor + " (" + paginas + " pags)");
    }
}

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.titulo = "Cien Años de Soledad";
        l1.autor = "Gabriel Garcia Marquez";
        l1.paginas = 496;

        Libro l2 = new Libro();
        l2.titulo = "El coronel no tiene quién le escriba";
        l2.autor = "Gabriel Garcia Marquez";
        l2.paginas = 96;

        Libro l3 = new Libro();
        l3.titulo = "Don Quijote de la Mancha";
        l3.autor = "Miguel de Cervantes";
        l3.paginas = 863;

        Libro l4 = new Libro();
        l4.titulo = "Clean Code";
        l4.autor = "Robert C. Martin";
        l4.paginas = 464;

        l1.mostrarInfo();
        System.out.println();
        l2.mostrarInfo();
        System.out.println();
        l3.mostrarInfo();
        System.out.println();
        l4.mostrarInfo();

        /*
         * Escribí una sola vez la clase Libro y con ella produje cuatro libros
         * completamente distintos. La clase es plantilla porque define la forma
         * (que atributos existen, de que tipo, y que metodos se pueden invocar)
         * sin comprometerse con ningun valor concreto: en la clase, "titulo" es
         * apenas un espacio vacio con nombre y tipo.
         *
         * Los objetos son casos concretos porque cada uno llena esos espacios con
         * datos reales y pasa a existir en memoria con identidad propia. Dos de
         * ellos comparten autor y aun asi son objetos diferentes.
         *
         * Esa es la magia de la POO: un solo molde e infinitas "piezas" unicas
         */
    }
}