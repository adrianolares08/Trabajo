package personas;

public class Director extends Persona {
	
	double aniosDeDirector;
	int nroOficina;
	double turno;
	
	
	public double getAniosDeDirector() {
		return aniosDeDirector;
	}
	public void setAniosDeDirector(double aniosDeDirector) {
		this.aniosDeDirector = aniosDeDirector;
	}
	public int getNroOficina() {
		return nroOficina;
	}
	public void setNroOficina(int nroOficina) {
		this.nroOficina = nroOficina;
	}
	public double getTurno() {
		return turno;
	}
	public void setTurno(double turno) {
		this.turno = turno;
	}
	public Director(double aniosDeDirector, int nroOficina, double turno) {
		super();
		this.aniosDeDirector = aniosDeDirector;
		this.nroOficina = nroOficina;
		this.turno = turno;
	}

}
