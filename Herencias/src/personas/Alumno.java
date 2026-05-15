package personas;

public class Alumno extends Persona {
	
	int IdAlumno;
	String grupo;
	double promedio;
	
	
	public int getIdAlumno() {
		return IdAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		IdAlumno = idAlumno;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public Alumno(String nombre, String apellido, int edad, int cI, int idAlumno, String grupo, double promedio) {
		super(nombre, apellido, edad, cI);
		IdAlumno = idAlumno;
		this.grupo = grupo;
		this.promedio = promedio;
	}
	

}
