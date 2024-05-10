package DocumentosBiblioteca;

import java.util.Date;

public class Repositorio extends Publicacion {


    private  String autor  ;
    private  String categoria;
    private  String codigoBiblioteca;
    private String fechaPublicacion;
    private  String isbn;
    private  String tipo;
    private  String titulo;


    public Repositorio() {
        super("Autor Ejemplo", "Categoría Ejemplo", "Código Ejemplo", new Date(),
                "ISBN Ejemplo", "Tipo Ejemplo", "Título Ejemplo");
        this.autor = "Robert Kiyosaki";
        this.categoria = "Finanzas";
        this.codigoBiblioteca = "0916";
        this.fechaPublicacion = ("01/2022");
        this.isbn = "978-607-747-016-0";
        this.tipo = "físico";
        this.titulo = "Padre Rico, Padre Pobre";
    }


    public void informacionLibros() {
        System.out.println("Información del libro: " + this.titulo);
    }

    @Override
    public String getTitulo() {
        return "";
    }

    public String getIsbn() {
        return "";
    }

    public String getTipo() {
        return "";
    }
    public String getAutor() {
        return "";
    }
    public String getCategoria() {
        return "";
    }
    public String getCodigoBiblioteca() {
        return "";
    }
    public String getFechaPublicacion() {
        return "";
    }
    public String setAutor() {
        return "";
    }
    public String setCategoria() {
        return "";
    }
    public String setCodigoBiblioteca() {
        return "";
    }
    public String setFechaPublicacion() {
        return "";
    }
    public String setIsbn() {
        return "";
    }
    public String setTipo() {
        return "";
    }
    public String setTitulo() {
        return "";
    }

}
