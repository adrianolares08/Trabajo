package primerejerciocioABML;

public class Ropa extends Producto {

	String talle;
	String material;

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Ropa(String nombre, double precio, int nroID, String talle, String material) {
		super(nombre, precio, nroID);
		this.talle = talle;
		this.material = material;
	}
	
	public String toString() { 
		
		return "Nombre:" + this.getNombre() + "  Precio:" + this.getPrecio() + "  NroID:" + this.getNroID() + "  Talle:" + this.getTalle() + "  Material:" + this.getMaterial();
		
	}
}
