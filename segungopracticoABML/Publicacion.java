package segungopracticoABML;

public abstract class Publicacion {

	String titulo;
	String autor;
	int Id;

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

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Publicacion(String titulo, String autor, int id) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		Id = id;
	}

}
