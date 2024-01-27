package problem1;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s1 = new Triangle(2, 5, 7, 4);
		System.out.println(s1);
		Shape s2 = new Cube(5);
		System.out.println(s2);
		sc.close();
	}

}
