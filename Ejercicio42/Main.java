package Ejercicio42;

class Curso {
    String nombre;
    String docente;
    int creditos;

    Curso(String nombre, String docente, int creditos) {
        this.nombre = nombre;
        this.docente = docente;
        this.creditos = creditos;
    }

    void mostrarInfo() {
        System.out.println(nombre + " | Docente: " + docente + " | Creditos: " + creditos);
    }
}

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("Programacion Orientada a Objetos", "John Carlos Arrieta Arrieta", 3);
        Curso c2 = new Curso("Bases de Datos", "Carlos Caceres", 4);

        c1.mostrarInfo();
        System.out.println();
        c2.mostrarInfo();

        /*
         *
         * c1 y c2 pertenecen a la misma clase porque la pertenencia a una clase no
         * depende de los valores, sino de la estructura y del comportamiento. Los dos
         * objetos tienen exactamente los mismos tres atributos, del mismo tipo, y los
         * dos responden al mismo metodo mostrarInfo().
         *
         * Que uno se llame POO y el otro Bases de Datos, o que uno tenga 3 creditos y
         * el otro 4, es una diferencia de estado, no de naturaleza. Es la misma idea de
         * que dos personas distintas siguen siendo personas.
         *
         * La clase responde a "que cosa es esto"; el objeto responde a
         * "cual cosa es esta".
         */
    }
}