package Ejercicio59;

class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    UsuarioSistema(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = true;
    }

    void activar() {
        if (activo)
            System.out.println("El usuario ya estaba activo.");
        else {
            activo = true;
            System.out.println("Usuario " + nombreUsuario + " activado.");
        }
    }

    void desactivar() {
        if (!activo)
            System.out.println("El usuario ya estaba inactivo.");
        else {
            activo = false;
            System.out.println("Usuario " + nombreUsuario + " desactivado.");
        }
    }

    void mostrarEstado() {
        // La clave no se imprime: se enmascara.
        System.out.println(nombreUsuario + " | clave: ****** | "
                + (activo ? "ACTIVO" : "INACTIVO"));
    }
}

public class Main {
    public static void main(String[] args) {
        UsuarioSistema u = new UsuarioSistema("lmartinez", "Segura2026*");

        u.mostrarEstado();
        u.desactivar();
        System.out.println();
        u.mostrarEstado();
        u.desactivar();
        System.out.println();
        u.activar();
        u.mostrarEstado();
    }
}