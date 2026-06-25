package tercerpractico;

public abstract class Edificio {

	String direccion;
	double metroscuadrados;

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

	public Edificio(String direccion, double metroscuadrados) {
		super();
		this.direccion = direccion;
		this.metroscuadrados = metroscuadrados;
	}

}
