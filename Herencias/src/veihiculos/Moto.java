package veihiculos;

public class Moto extends Vehiculo1 {

	String asiento;
	String manubrio;
	String nroRuedas;

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	public String getManubrio() {
		return manubrio;
	}

	public void setManubrio(String manubrio) {
		this.manubrio = manubrio;
	}

	public String getNroRuedas() {
		return nroRuedas;
	}

	public void setNroRuedas(String nroRuedas) {
		this.nroRuedas = nroRuedas;
	}

	public Moto(String nombre, String nroMotor, String color, String asiento, String manubrio, String nroRuedas) {
		super(nombre, nroMotor, color);
		this.asiento = asiento;
		this.manubrio = manubrio;
		this.nroRuedas = nroRuedas;
	}

}
