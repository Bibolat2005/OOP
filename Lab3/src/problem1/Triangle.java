package problem1;

public class Triangle extends Shape implements Perimeter{
	public double a, b, c;
	public double height;
	
	public Triangle(double a, double b, double c, double height) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.height = height;
	}

	@Override
	public double getArea() {
		return 0.5*this.b*this.height;
	}

	public double getPerimeter() {
		return a+b+c;
	}

	@Override
	public String toString() {
		return "Triangle [Area()=" + getArea() + ", Perimeter()=" + getPerimeter() + "]";
	}

}
