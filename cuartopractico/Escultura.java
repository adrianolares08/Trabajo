package cuartopractico;

public class Escultura extends ObraArte {

	String material;
	double peso;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Escultura(String nombre, String autor, String material, double peso) {
		super(nombre, autor);
		this.material = material;
		this.peso = peso;
	}
	
	public String toString() {
		return "Nombre: " + this.getNombre() + " / Autor:" + this.getAutor() + " / Material:" + this.getMaterial() + " / Peso:" + this.getPeso();

}

}
