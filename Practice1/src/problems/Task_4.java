package problems;

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		double x1;
		double x2;
		int D=b*b-4*a*c;

		if(D<0) {
			System.out.println("Error,D is negative");
		}
		else if(D>0) {
			x1=(-b-Math.sqrt(D))/(2*a);
		    x2=(-b+Math.sqrt(D))/(2*a);
			System.out.println("The square roots are "+x1+" and "+x2);
		}
		else if(D==0) {
			x1=x2=(-b)/(2*a);
			System.out.println("x1 is "+x1);
			System.out.println("x2 is "+x2);
		}
		in.close();
	}

}
