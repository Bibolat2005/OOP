package problem1;

public class Cube extends Shape{
	private int a;
	
	public Cube() {
		
	}
	public Cube(int a){
		this.a = a;
	}
	public double surfaceArea() {
		return 6*Math.pow(a, 2);
	}
	
	public double volume() {
		return Math.pow(a, 2);
	}
	
	public String toString() {
		return "Cube surface area " + surfaceArea() + ", volume " + volume();
	}
	
	public int getInt() {
		return a;
	}
	
	public void setInt(int a) {
		this.a = a;
	}
}