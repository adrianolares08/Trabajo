package tercerpracticoABML;

public abstract class Edificio {

	String direccion;
	double metroscuadrados;
	int Id;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getMetroscuadrados() {
		return metroscuadrados;
	}

	public void setMetroscuadrados(double metroscuadrados) {
		this.metroscuadrados = metroscuadrados;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Edificio(String direccion, double metroscuadrados, int id) {
		super();
		this.direccion = direccion;
		this.metroscuadrados = metroscuadrados;
		Id = id;
	}

}
