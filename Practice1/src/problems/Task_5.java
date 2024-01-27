package problems;
import java.util.Scanner;
public class Task_5 {

	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		double money=input1.nextDouble();
		double percentage=input2.nextDouble();
		double result=(money+(percentage*money)/100);
		System.out.print(result);
	}

}
