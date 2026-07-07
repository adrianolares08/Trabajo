package segungopracticoABML;

public class ArticuloCientifico extends Publicacion {

	String campoInvestigacion;
	String universidad;

	public String getCampoInvestigacion() {
		return campoInvestigacion;
	}

	public void setCampoInvestigacion(String campoInvestigacion) {
		this.campoInvestigacion = campoInvestigacion;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public ArticuloCientifico(String titulo, String autor, int id, String campoInvestigacion, String universidad, int idac) {
		super(titulo, autor, id);
		this.campoInvestigacion = campoInvestigacion;
		this.universidad = universidad;
	}

	public String toString() {
		return "Titulo: " + this.getTitulo() + " / Autor:" + this.getAutor() + " / Campo de Investigacion:"
				+ this.getCampoInvestigacion() + " / Universidad:" + this.getUniversidad() + " / ID:" + this.getId();

	}

}
