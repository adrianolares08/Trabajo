package personas;

public abstract class Persona {
	
	String nombre;
	String apellido;
	int edad;
	int CI;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCI() {
		return CI;
	}
	public void setCI(int cI) {
		CI = cI;
	}
	public Persona(String nombre, String apellido, int edad, int cI) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		CI = cI;
	}
	

}
