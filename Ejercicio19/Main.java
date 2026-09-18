package Ejercicio19;

class Estudiante {
    /*
     * POR QUÉ "Estudiante" ES UNA CLASE:
     * - Es una definición, No ocupa un espacio de datos
     * propio hasta que alguien la use con new.
     * - Describe qué caracteristicas tendra cualquier estudiante del sistema
     * (nombre, codigo, semestre) y que podra hacer (mostrarInfo).
     * - Aqui "nombre" no vale nada todavia: es solo la declaracion de que
     * existira un atributo llamado nombre de tipo String.
     * - No puedo preguntarle a la clase "cual es tu nombre?", porque la clase
     * no es nadie en particular. Es la categoria, no el individuo.
     */
    String nombre;
    String codigo;
    int semestre;

    void mostrarInfo() {
        System.out.println(nombre + " | " + codigo + " | Semestre " + semestre);
    }
}

public class Main {
    public static void main(String[] args) {
        /*
         * POR QUE "est1" ES UN OBJETO:
         * - Nace de la instanciacion: new Estudiante() reserva memoria y produce
         * una entidad concreta a partir de la definición.
         * - Tiene identidad, pues es un individuo distinto de cualquier otro
         * estudiante.
         * - Sus atributos si tienen valores reales ("Laura", "120480007", 3).
         * - Tiene comportamiento. Puedo pedirle est1.mostrarInfo() y responde
         * con sus propios datos.
         *
         * Tal como lo dijo el documento, la clase es la receta, el objeto es el plato
         * servido.
         */
        Estudiante est1 = new Estudiante();
        est1.nombre = "Laura Martinez";
        est1.codigo = "1204";
        est1.semestre = 3;
        est1.mostrarInfo();

        Estudiante est2 = new Estudiante();
        est2.nombre = "Luis Perez";
        est2.codigo = "1058";
        est2.semestre = 4;
        est2.mostrarInfo();

        // Una sola clase, dos objetos en memoria.
    }
}