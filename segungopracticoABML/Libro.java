package segungopracticoABML;

public class Libro extends Publicacion {

	String genero;
	String isbn;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Libro(String titulo, String autor, int id, String genero, String isbn, int idl) {
		super(titulo, autor, id);
		this.genero = genero;
		this.isbn = isbn;
	}
	public String toString() {
		return "Titulo:" + this.getTitulo() + " / Autor:" + this.getAutor() + " / Genero:" + this.getGenero()
				+ " / ISBN:" + this.getIsbn() + " / ID:" + this.getId();

	}
}