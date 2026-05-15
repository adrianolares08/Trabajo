package figurasGeometricas;

public class Circulo extends FiguraGeometrica {
	
	double radio;
	double diametro;
	double circunferencia;
	
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getCircunferencia() {
		return circunferencia;
	}
	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}
	public Circulo(double area, double perimetro, String color, double radio, double diametro, double circunferencia) {
		super(area, perimetro, color);
		this.radio = radio;
		this.diametro = diametro;
		this.circunferencia = circunferencia;
	}

}
