package segungopractico;

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

	public ArticuloCientifico(String titulo, String autor, String campoInvestigacion, String universidad) {
		super(titulo, autor);
		this.campoInvestigacion = campoInvestigacion;
		this.universidad = universidad;
	}
	public String toString() {
		return "Titulo: " + this.getTitulo() + " / Autor:" + this.getAutor() + " / Campo de Investigacion:" + this.getCampoInvestigacion() + " / Universidad:" + this.getUniversidad();

}

}
