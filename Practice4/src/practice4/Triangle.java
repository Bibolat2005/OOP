package practice4;

public class Triangle extends Shape {
	int a,h;
	Triangle(Color color,int pos,int a,int h){
		super(color,pos);
		this.a=a;
		this.h=h;
	}
	public void draw() {
		System.out.println(" ".repeat(pos));
		if(super.getColor()==Color.BLACK) {
			System.out.println("^");
		}
		if(super.getColor()==Color.RED) {
			System.err.println("^");
		}
	}
	public String Area() {
	    return "The Area of Triangle "+ (a*h)/2;
	}
}
