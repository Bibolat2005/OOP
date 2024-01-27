package problem1;

public class Cylinder extends Shape implements Volume {
	final double PI = 3.14;
	public int radius;
	public int height;

	Cylinder(int radius, int height){
		this.radius=radius;
		this.height=height;
	}

	@Override
	public double getVolume() {
		double v = PI*radius*radius*height;
		return v;
	}

	@Override
	public double getArea() {
		double s = 2*PI*radius*(height+radius);
		return s;
	}

	@Override
	public String toString() {
		return "Volume()=" + getVolume() + ", Area()=" + getArea() + "]";
	}

}