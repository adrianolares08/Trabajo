package veihiculos;

public class Auto extends Vehiculo1 {

	int cantPuertas;
	String comodidad;
	String capacidadPerson;

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}

	public String getComodidad() {
		return comodidad;
	}

	public void setComodidad(String comodidad) {
		this.comodidad = comodidad;
	}

	public String getCapacidadPerson() {
		return capacidadPerson;
	}

	public void setCapacidadPerson(String capacidadPerson) {
		this.capacidadPerson = capacidadPerson;
	}

	public Auto(String nombre, String nroMotor, String color, int cantPuertas, String comodidad,
			String capacidadPerson) {
		super(nombre, nroMotor, color);
		this.cantPuertas = cantPuertas;
		this.comodidad = comodidad;
		this.capacidadPerson = capacidadPerson;
	}

}
