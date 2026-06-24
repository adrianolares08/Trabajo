package segungopractico;

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

	public Libro(String titulo, String autor, String genero, String isbn) {
		super(titulo, autor);
		this.genero = genero;
		this.isbn = isbn;
	}
	public String toString() {
		return "Titulo:" + this.getTitulo() + " / Autor:" + this.getAutor() + " / Genero:" + this.getGenero() + " / ISBN:" + this.getIsbn();

}
}