
package animales;

public class Perro implements acciones {

	String NombrePerro;

	@Override
	public void comer() {
		// TODO Auto-generated method stub

		System.out.println("El perro acaba de comer 600 gramos de comida");

	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub

		System.out.println("El perro esta durmiendo");

	}

	public String getNombrePerro() {
		return NombrePerro;
	}

	public void setNombrePerro(String nombrePerro) {
		NombrePerro = nombrePerro;
	}

	public Perro(String nombrePerro) {
		super();
		NombrePerro = nombrePerro;
	}

}
