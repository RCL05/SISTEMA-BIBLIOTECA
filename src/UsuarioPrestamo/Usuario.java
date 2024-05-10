package UsuarioPrestamo;

import DocumentosBiblioteca.SistemaPrestamo;

public class Usuario extends SistemaPrestamo {
    private String apellido;
    private String ci;
    private String email;
    private String nombre;

    // Getters y setters
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    // ... Agrega los demás getters y setters aquí ...

    public void devolver() {
        System.out.println("El usuario " + this.nombre + " está devolviendo un libro.");
    }
    public void prestar() {
        System.out.println("El usuario " + this.nombre + " está prestando un libro.");
    }

    public void setNombre(String nombreEjemplo) {
    }
}

