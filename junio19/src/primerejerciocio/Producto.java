package primerejerciocio;

public abstract class Producto {

	String nombre;
	double precio;
	int NroID;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNroID() {
		return NroID;
	}

	public void setNroID(int nroID) {
		NroID = nroID;
	}

	public Producto(String nombre, double precio, int nroID) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		NroID = nroID;
	}

}
