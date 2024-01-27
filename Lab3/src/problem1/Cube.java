package problem1;

public class Cube extends Shape implements Volume, Perimeter{
	public int a;
	
	Cube(int a){
		this.a=a;
	}
	
	@Override
	public double getArea() {
		return 6*a*a;
	}

	@Override
	public double getPerimeter() {
		return 12*a;
	}

	@Override
	public double getVolume() {
		return a*a*a;
	}


	@Override
	public String toString() {
		return "Cube [a=" + a + ", Area()=" + getArea() + ", Perimeter()=" + getPerimeter() + ", Volume()="
				+ getVolume() + "]";
	}
	
	
}
