package cuartopractico;

public abstract class ObraArte {

	String nombre;
	String autor;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public ObraArte(String nombre, String autor) {
		super();
		this.nombre = nombre;
		this.autor = autor;
	}

}
