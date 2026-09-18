package Ejercicio44;

class Paciente {
    String nombre;
    String documento;
    int edad;
    String diagnostico;

    Paciente(String nombre, String documento, int edad) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.diagnostico = "Sin diagnostico";
    }

    void registrarDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    void mostrarHistoria() {
        System.out.println(nombre + " (CC: " + documento + ", " + edad + " años) -> " + diagnostico);
    }
}

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Rosa Beltran", "45123789", 62);
        p1.registrarDiagnostico("Control de hipertensión");
        p1.mostrarHistoria();

        /*
         * POR QUE SE RELACIONAN PERO NO SON LA MISMA IDEA
         *
         * Las dos expresiones describen el mismo hecho tecnico visto desde angulos
         * distintos: la linea new Paciente(...) instancia y crea al mismo tiempo.
         *
         * "Instanciar la clase Paciente" pone el acento en el proceso y en el origen:
         * hay una clase, un molde, y de ese molde se produce una ocurrencia.
         * 
         * "Crear un paciente" pone el acento en el resultado y en el dominio: ya existe
         * Rosa Beltran en el sistema del hospital. Es vocabulario de negocio; a la
         * enfermera que consulta la historia clinica no le interesa que hubo un new.
         *
         * Pedagogicamente conviene separarlas porque el principiante que solo escucha
         * "crear objetos" tiende a olvidar que detras siempre hay una clase que lo
         * hizo posible. Decirlo como instanciacion obliga a recordar el molde.
         */
    }
}