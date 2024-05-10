package UsuarioPrestamo;

import DocumentosBiblioteca.SistemaPrestamo;

public class Prestamo extends SistemaPrestamo {
    private boolean multa;

    public void prestar() {
        System.out.println("Prestando un libro.");
    }
    public void generarMulta() {
        System.out.println("Generando una multa.");
    }
    public void vencido() {
        System.out.println("El préstamo ha vencido.");
    }
    public void noPrestar() {
        System.out.println("No se puede prestar el libro.");
    }
}
