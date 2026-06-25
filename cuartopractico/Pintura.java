package cuartopractico;

public class Pintura extends ObraArte {

	String estilos;
	String tipo;

	public String getEstilos() {
		return estilos;
	}

	public void setEstilos(String estilos) {
		this.estilos = estilos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Pintura(String nombre, String autor, String estilos, String tipo) {
		super(nombre, autor);
		this.estilos = estilos;
		this.tipo = tipo;
	}
	
	public String toString() {
		return "Nombre: " + this.getNombre() + " / Autor:" + this.getAutor() + " / Estilo:" + this.getEstilos() + " / Tipo:" + this.getTipo();

}

}
