package problems;
import java.util.Scanner;
public class tsk_1_myself {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		System.out.print("+");
		for(int i=0;i<name.length();i++) {
			System.out.print("-");
		}
		System.out.println("+");
		System.out.print("|");
		System.out.print(name);
		System.out.println("|");
		System.out.print("+");
		for(int i=0;i<name.length();i++) {
			System.out.print("-");
		}
		System.out.print("+");
		in.close();
	}

}
