package problems;
import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		if(n>=95 && n<=100) {
			System.out.print("A");
		}
		else if(n>=90 && n<95) {
			System.out.print("A-");
		}
		else if(n>=85 && n<90) {
			System.out.print("B+");
		}
		else if(n>=80 && n<85) {
			System.out.print("B");
		}
		else if(n>=75 && n<80) {
			System.out.print("B-");
		}
		else if(n>=70 && n<75) {
			System.out.print("C+");
		}
		else if(n>=65 && n<70) {
			System.out.print("C");
		}
		else if(n>=60 && n<65) {
			System.out.print("C-");
		}
		else if(n>=55 && n<=60) {
			System.out.print("D+");
		}
		else if(n>=50 && n<55) {
			System.out.print("B-");
		}
		if(n<50) {
			System.out.print("F");
		}
		in.close();
	}

}
