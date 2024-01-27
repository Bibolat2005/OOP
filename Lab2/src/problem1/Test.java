package problem1;
import java.util.Vector;
public class Test {

	public static void main(String[] args) {
		Vector<Shape>v = new Vector<Shape>();
		Shape s1 = new Sphere(2);
		v.add(s1);
		for(Shape shape : v) {
			System.out.println(shape.surfaceArea());
			System.out.println(shape.volume());
			System.out.println(shape.toString());
		}
	}

}
