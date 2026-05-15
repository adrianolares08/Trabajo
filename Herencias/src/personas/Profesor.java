package personas;

public class Profesor extends Persona {
	
	String materia;
	double salario;
	double AniosTrabajados;
	
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getAniosTrabajados() {
		return AniosTrabajados;
	}
	public void setAniosTrabajados(double aniosTrabajados) {
		AniosTrabajados = aniosTrabajados;
	}
	public Profesor(String materia, double salario, double aniosTrabajados) {
		super();
		this.materia = materia;
		this.salario = salario;
		AniosTrabajados = aniosTrabajados;
	}

}