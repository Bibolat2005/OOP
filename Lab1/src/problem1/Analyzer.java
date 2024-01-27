package problem1;
import java.util.Scanner;
public class Analyzer {

	public static void main(String[] args) {
		Data d=new Data();
		Scanner input=new Scanner(System.in);
		int a;
		while(true) {
			System.out.println("Enter number (Q to quit): ");
			String s=input.nextLine();
			if(s.equals("Q")) {
				break;
			}
			a=Integer.parseInt(s);
			d.AddVal(a);
		}
		System.out.println("Average = "+d.Average());
		System.out.println("Maximum = "+d.MaxVal());
	}
}