package practice;
import java.util.Scanner;
public class MoveableTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		Bird bird = new Bird(x,y,z);
		Bird b = new Bird(true);
		MoveableDirections md = new MoveableDirections(x,y);
		md.moveDown();
		System.out.println()
	}

}
