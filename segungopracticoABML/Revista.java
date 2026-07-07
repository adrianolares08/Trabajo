package segungopracticoABML;

public class Revista extends Publicacion {

	String periodicidad;
	String temaPrincipal;

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	public String getTemaPrincipal() {
		return temaPrincipal;
	}

	public void setTemaPrincipal(String temaPrincipal) {
		this.temaPrincipal = temaPrincipal;
	}

	public Revista(String titulo, String autor, int id, String periodicidad, String temaPrincipal, int idr) {
		super(titulo, autor, id);
		this.periodicidad = periodicidad;
		this.temaPrincipal = temaPrincipal;
	}

	public String toString() {
		return "Titulo: " + this.getTitulo() + " / Autor:" + this.getAutor() + " / Periodicidad:"
				+ this.getPeriodicidad() + " / Tema Principal:" + this.getTemaPrincipal() + " / ID:" + this.getId();

	}

}
