package figurasGeometricas;

public class Triangulo extends FiguraGeometrica {
	
	
	double base;
	double altura;
	double lados;
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLados() {
		return lados;
	}
	public void setLados(double lados) {
		this.lados = lados;
	}
	public Triangulo(double area, double perimetro, String color, double base, double altura, double lados) {
		super(area, perimetro, color);
		this.base = base;
		this.altura = altura;
		this.lados = lados;
	}

}
