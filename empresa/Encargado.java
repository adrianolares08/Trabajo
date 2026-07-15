package empresa;

public class Encargado implements gmail {

	int Idencargado;
	int salario;

	public int getIdencargado() {
		return Idencargado;
	}

	public void setIdencargado(int idencargado) {
		Idencargado = idencargado;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Encargado(int idencargado, int salario) {
		super();
		Idencargado = idencargado;
		this.salario = salario;
	}

	@Override
	public void enviar() {
		// TODO Auto-generated method stub

		System.out.println("El Encargado acaba de enviar un Mail al Dueño");

	}
	
	@Override
	public void enviare() {
		// TODO Auto-generated method stub

		System.out.println("El Encargado acaba de enviar un Mail a un Empleado");

	}

}
