package DocumentosBiblioteca;
import java.util.Date;

public abstract class Publicacion {
    protected String autor;
    protected String categoria;
    protected String codigoBiblioteca;
    protected Date fechaPublicacion;
    protected String isbn;
    protected String tipo;
    protected String titulo;

    public Publicacion(String autor, String categoria, String codigoBiblioteca,
                       Date fechaPublicacion, String isbn, String tipo, String titulo) {
        this.autor = autor;
        this.categoria = categoria;
        this.codigoBiblioteca = codigoBiblioteca;
        this.fechaPublicacion = fechaPublicacion;
        this.isbn = isbn;
        this.tipo = tipo;
        this.titulo = titulo;
    }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public String getCodigoBiblioteca() { return codigoBiblioteca; }
    public void setCodigoBiblioteca(String codigoBiblioteca) { this.codigoBiblioteca = codigoBiblioteca; }

    public void setFechaPublicacion(Date fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }


    public abstract void informacionLibros();

    public abstract String getTitulo();
}
