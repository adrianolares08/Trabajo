package veihiculos;

public abstract class Vehiculo1 {
	private String nombre;
	private String nroMotor;
	private String color;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNroMotor(String nroMotor) {
		this.nroMotor = nroMotor;
	}

	public String getNroMotor() {
		return nroMotor;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public Vehiculo1(String nombre, String nroMotor, String color) {
		super();
		this.nombre = nombre;
		this.nroMotor = nroMotor;
		this.color = color;
	}

}
