package problem1;

public abstract class Shape {
	public abstract double surfaceArea();
	public abstract double volume();
	public String toString() {
		return surfaceArea() + " " + volume();
	}
}
