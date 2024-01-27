package problem1;

public class Cylinder extends Shape{
	final double PI=3.14;
	private int radius;
	private int height;
	
	public Cylinder() {
		
	}
	
	public Cylinder(int radius, int height){
		this.radius=radius;
		this.height=height;
	}
	public double surfaceArea() {
		return (PI * Math.pow(radius, 2) * 2) + 2 * PI * radius * height;
	}
	public double volume() {
		return (PI * Math.pow(radius, 2) * height);
	}
	public String toString() {
		return "Cylinder surface area " + surfaceArea() + ", volume" + volume();
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}
