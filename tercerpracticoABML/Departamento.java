package tercerpracticoABML;

public class Departamento extends Edificio {

	int nropiso;
	int nroapartamento;

	public int getNropiso() {
		return nropiso;
	}

	public void setNropiso(int nropiso) {
		this.nropiso = nropiso;
	}

	public int getNroapartamento() {
		return nroapartamento;
	}

	public void setNroapartamento(int nroapartamento) {
		this.nroapartamento = nroapartamento;
	}

	public Departamento(String direccion, double metroscuadrados, int nropiso, int nroapartamento, int id) {
		super(direccion, metroscuadrados, id);
		this.nropiso = nropiso;
		this.nroapartamento = nroapartamento;
	}

	public String toString() {
		return "Direccion: " + this.getDireccion() + " / Metros Cuadrados:" + this.getMetroscuadrados()
				+ " / Numero de Piso:" + this.getNropiso() + " / Numero De Departamento:" + this.getNroapartamento()
				+ " / ID del Domicilio: " + this.getId();

	}

}
