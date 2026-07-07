package tercerpracticoABML;

public class Casa extends Edificio {

	int nropisos;
	int nrodormitorios;

	public int getNropisos() {
		return nropisos;
	}

	public void setNropisos(int nropisos) {
		this.nropisos = nropisos;
	}

	public int getNrodormitorios() {
		return nrodormitorios;
	}

	public void setNrodormitorios(int nrodormitorios) {
		this.nrodormitorios = nrodormitorios;
	}

	public Casa(String direccion, double metroscuadrados, int nropisos, int nrodormitorios,  int id) {
		super(direccion, metroscuadrados, id);
		this.nropisos = nropisos;
		this.nrodormitorios = nrodormitorios;
	}

	public String toString() {
		return "Direccion: " + this.getDireccion() + " / Metros Cuadrados:" + this.getMetroscuadrados()
				+ " / Numero De Pisos:" + this.getNropisos() + " / Numero De Dormitorios:" + this.getNrodormitorios()
				+ " / ID del Domicilio: " + this.getId();

	}
}
