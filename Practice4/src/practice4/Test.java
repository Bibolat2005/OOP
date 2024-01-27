package practice4;
import java.util.Vector;
public class Test {

	public static void main(String[] args) {
		Vector<Shape>v=new Vector<Shape>();
		Shape rec=new Rectangle(Color.BLACK,14,5,7);
		Shape tri=new Triangle(Color.RED,10,5,6);
		Shape cir=new Circle(Color.BLACK,4,5);
		v.add(rec);
		v.add(tri);
		v.add(cir);
		for(Shape s:v) {
			s.draw();
		}
		for(Shape i:v) {
			System.out.println(i.Area());
		}
		//System.out.println(rec.Area());
		//System.out.println(cir.Area());
		//System.out.println(tri.Area());
	}
	
}
