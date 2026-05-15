package figurasGeometricas;

public abstract class FiguraGeometrica {
	
	double area;
	double perimetro;
	String color;
	
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public FiguraGeometrica(double area, double perimetro, String color) {
		super();
		this.area = area;
		this.perimetro = perimetro;
		this.color = color;
	}

}
