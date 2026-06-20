package primerejerciocio;

public class Electronica extends Producto {

	String marca;
	int garantia;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public Electronica(String nombre, double precio, int nroID, String marca, int garantia) {
		super(nombre, precio, nroID);
		this.marca = marca;
		this.garantia = garantia;
	}
	
	public String toString() {
		
		return "Nombre:" + this.getNombre() + "  Precio:" + this.getPrecio() + "  NroID:" + this.getNroID() + "  Marca:" + this.getMarca() + "  Garantia:" + this.getGarantia();
		
	}
}
