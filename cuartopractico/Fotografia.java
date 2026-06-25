package cuartopractico;

public class Fotografia extends ObraArte {

	String resolucion;
	String ubicacion;

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Fotografia(String nombre, String autor, String resolucion, String ubicacion) {
		super(nombre, autor);
		this.resolucion = resolucion;
		this.ubicacion = ubicacion;
	}
	
	public String toString() {
		return "Nombre: " + this.getNombre() + " / Autor:" + this.getAutor() + " / Resolucion:" + this.getResolucion() + " / Lugar:" + this.getUbicacion();

}

}
