package problem1;

public class shapeFactory {
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
	}
}
