package problems;
import java.util.Scanner;
public class Task_6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		boolean check=true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				check=false;
			}
		}
		
		if(check) {
			System.out.println(str+" is a palindrome");
		}
		else {
			System.out.println(str+" is not a palindrome");
		}
		in.close();
	}

}
