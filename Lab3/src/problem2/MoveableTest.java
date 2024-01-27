package problem2;
import java.util.Scanner;
public class MoveableTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		Bird bird = new Bird(x, y, z);
		Bird b = new Bird(true);
		MoveableDirections md = new MoveableDirections(x, y);
		md.moveDown();
		System.out.println(md);
		md.moveRight();
		System.out.println(md);
		md.moveLeft();
		System.out.println(md);
		md.moveUp();
		System.out.println(md);
		
		
//		 bird.moveDown();
//	        System.out.println(bird);
//
//	        bird.moveRight();
//	        System.out.println(bird);

	        bird.moveLeft();
	        System.out.println(bird);

	        bird.moveUp();
	        System.out.println(bird);
	        
	        bird.flyUp();
	        System.out.println(bird);

	        bird.flyDown();
	        System.out.println(bird);
	        
	        System.out.println(b.canMove());
			System.out.println(b.canFly());
	        
		in.close();
	}
	}

