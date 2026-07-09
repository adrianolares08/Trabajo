package animales;

public class Dinosaurio implements acciones {

	String NombreDino;

	@Override
	public void comer() {
		// TODO Auto-generated method stub

		System.out.println("El dinosaurio acaba de comer 5 kilos de comida");

	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub

		System.out.println("El dinosaurio esta durmiendo");

	}

	public String getNombreDino() {
		return NombreDino;
	}

	public void setNombreDino(String nombreDino) {
		NombreDino = nombreDino;
	}

	public Dinosaurio(String nombreDino) {
		super();
		NombreDino = nombreDino;
	}

}
