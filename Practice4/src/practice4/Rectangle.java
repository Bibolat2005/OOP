package practice4;

public class Rectangle extends Shape{
	int size_a;
	int size_b;
	Rectangle(Color color,int pos,int size_a,int size_b){
		super(color,pos);
		this.size_a=size_a;
		this.size_b=size_b;
	}
	
	public void draw() {
		System.out.println(" ".repeat(pos));
		if(super.getColor()==Color.BLACK) {
			System.out.println("[]");
		}
		if(super.getColor()==Color.RED) {
			System.err.println("[]");
		}
	}
	public String Area() {
		
	   return "The Area of Rectangle " + size_a*size_b;
	}
}
