package Ejercicio41;

class Empleado {
    String nombre;
    String cargo;
    double salario;

    Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    void aumentarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    void mostrarInfo() {
        System.out.println(nombre + " | " + cargo + " | $" + salario);
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Maria Lopez", "Analista", 3200000);
        Empleado e2 = new Empleado("Jorge Silva", "Desarrollador", 4500000);

        e1.mostrarInfo();
        e2.mostrarInfo();

        e1.aumentarSalario(10);
        System.out.println("\nDespues del aumento a e1:");
        e1.mostrarInfo();
        e2.mostrarInfo();

        /*
         *
         * Con programacion procedural tendria que declarar nombreEmpleado1,
         * cargoEmpleado1, salarioEmpleado1, nombreEmpleado2, cargoEmpleado2... y asi
         * hasta agotar la paciencia. Con diez empleados serian treinta variables
         * sueltas, sin ninguna relacion explicita entre ellas: el lenguaje no sabria
         * que salarioEmpleado1 "pertenece" a nombreEmpleado1. Esa relacion existiria
         * solo en mi cabeza y en la disciplina con que nombro las variables.
         *
         * Ademas, la funcion aumentarSalario tendria que recibir el salario por
         * parámetro y devolver el nuevo valor, y yo tendria que acordarme de
         * reasignarlo a la variable correcta. Un descuido y termino aumentandole el
         * sueldo al empleado equivocado.
         *
         * Al modelarlo como clase, cada Empleado es una unidad: sus datos y las
         * operaciones que actuan sobre esos datos viajan juntos. e1.aumentarSalario(10)
         * no puede tocar por accidente a e2, porque el metodo opera sobre el estado
         * del objeto que lo recibio. El codigo tambien se lee mas cerca del dominio:
         * habla de empleados que reciben aumentos, no de variables que se suman.
         */
    }
}