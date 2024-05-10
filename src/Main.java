import DocumentosBiblioteca.Repositorio;
import UsuarioPrestamo.Usuario;

public class Main {
    public static void main(String[] args) {

        Repositorio repositorio = new Repositorio();
        System.out.println("Autor del libro: " + repositorio.getAutor());
        System.out.println("Categoría del libro: " + repositorio.getCategoria());
        System.out.println("Código de la biblioteca: " + repositorio.getCodigoBiblioteca());
        System.out.println("Fecha de publicación: " + repositorio.getFechaPublicacion());
        System.out.println("ISBN del libro: " + repositorio.getIsbn());
        System.out.println("Tipo de libro: " + repositorio.getTipo());
        System.out.println("Título del libro: " + repositorio.getTitulo());

        repositorio.informacionLibros();

        Usuario usuario = new Usuario();
        usuario.setNombre("Nombre Ejemplo");
        usuario.prestar();

    }
}
