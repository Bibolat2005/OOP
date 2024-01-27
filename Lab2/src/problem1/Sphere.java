package problem1;

public class Sphere extends Shape{
	private int radius;
	final double PI=3.14;
	
	public Sphere() {
		
	}
	public Sphere(int radius){
		this.radius=radius;
	}
	public double surfaceArea() {
		return 4 * PI * Math.pow(radius, 2);
	}
	public double volume() {
		double v=(4/3 )* PI * Math.pow(radius, 3);
		return v;
	}
	public String toString() {
		return "Sphere surface area " + surfaceArea() + ", volume " + volume();
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
