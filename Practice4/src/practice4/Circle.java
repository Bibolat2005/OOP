package practice4;

public class Circle extends Shape {
	int radius;
	Circle(Color color, int pos, int radius){
		super(color,pos);
		this.radius=radius;
	}
	public void draw() {
		if(super.getColor() == Color.BLACK) {
			System.out.println(" ".repeat(pos));
			System.out.println("()");
		}
		if(super.getColor()==Color.RED) {
			System.err.println(" ".repeat(pos));
			System.err.println("()");
		}
	}
	
	public void setRadius(int radius) {
	    this.radius = radius;
	}

	public double getRadius() {
	    return radius;
	}
	public String Area() {
	    return "The Area of Circle "+ Math.PI * Math.pow(radius, 2);
	}
}