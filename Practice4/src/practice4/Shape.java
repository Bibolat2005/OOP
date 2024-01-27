package practice4;

public abstract class Shape {
	
	// modifier
	Color color;
	int pos;
	Shape(Color color,int pos){
		this.color=color;
		this.pos=pos;
	}
	public abstract void draw();
	
	public Color getColor() {
		return color;
	}
	public int getPos() {
		return pos;
	}
	
	// camelCase
	public String Area() {
		return "The area"; 
	}
}
