package segungopractico;

public abstract class Publicacion {

	String titulo;
	String autor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Publicacion(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

}
