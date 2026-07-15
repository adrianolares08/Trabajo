package empresa;

public class Empleado implements gmail {

	int IdEmpleado;
	String cargo;

	public int getIdEmpleado() {
		return IdEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Empleado(int idEmpleado, String cargo) {
		super();
		IdEmpleado = idEmpleado;
		this.cargo = cargo;
	}

	@Override
	public void enviar() {
		// TODO Auto-generated method stub

		System.out.println("El Empleado acaba de enviar un Mail al Encargado");

	}
	

	@Override
	public void enviare() {
		
		// TODO Auto-generated method stub

	}
}
