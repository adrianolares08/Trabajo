package empresa;

public class Dueño implements gmail {

	int IdDueño;
	String empresa;

	public int getIdDueño() {
		return IdDueño;
	}

	public void setIdDueño(int idDueño) {
		IdDueño = idDueño;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Dueño(int idDueño, String empresa) {
		super();
		IdDueño = idDueño;
		this.empresa = empresa;
	}

	@Override
	public void enviar() {

		System.out.println("El Dueño acaba de enviar un Mail al Encargado");

		
	}
	
	@Override
	public void enviare() {
		
		// TODO Auto-generated method stub

	}

}
