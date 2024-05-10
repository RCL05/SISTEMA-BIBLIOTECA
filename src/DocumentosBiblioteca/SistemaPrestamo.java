package DocumentosBiblioteca;

import java.util.Date;

public class SistemaPrestamo {
    private Date fechaDevolucion;
    private Date fechaPrestamo;
    private String nombreLibro;
    private String nombreUsuario;

    // Getters y setters
    // ...

    public void buscarLibro() {
        System.out.println("Buscando libro: " + this.nombreLibro);
    }
    public void devolucionLibro() {
        System.out.println("Devolviendo libro: " + this.nombreLibro);
    }
    public void disponibilidadLibro() {
        System.out.println("Verificando disponibilidad del libro: " + this.nombreLibro);
    }
}
