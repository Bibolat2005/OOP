package problems;
import java.util.Scanner;
public class Tsk_2 {
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int a=in.nextInt();
		int area=a*a;
		int perimeter=4*a;
		double diagonal=a*Math.sqrt(2);
		System.out.println("The area of square is " + area);
		System.out.println("The perimeter of square is " + perimeter);
		System.out.println("The diagonal of square is " + diagonal);
		in.close();
	}

}
