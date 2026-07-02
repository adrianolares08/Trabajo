package primerejerciocioABML;

public class Alimento extends Producto {

	String fechaVenci;
	int calorias;

	public String getFechaVenci() {
		return fechaVenci;
	}

	public void setFechaVenci(String fechaVenci) {
		this.fechaVenci = fechaVenci;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public Alimento(String nombre, double precio, int nroID, String fechaVenci, int calorias) {
		super(nombre, precio, nroID);
		this.fechaVenci = fechaVenci;
		this.calorias = calorias;
	}

	
	public String toString() {
		return "Nombre: " + this.getNombre() + "  Precio:" + this.getPrecio() + "  NroID:" + this.getNroID() + "  Fecha de Vencimiento:" + this.getFechaVenci() + "  Calorias:" + this.getCalorias();
		
	}
}
