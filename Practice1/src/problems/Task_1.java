package problems;

import java.util.Scanner;

public class Task_1 {
	
	public static void printSymbols(int length, char firstSign, char secondSign) {
		for(int i=0; i < length + 2; ++i) {
			if (i == 0) {
				System.out.print(firstSign);
			} else if (i == length + 1) {
				System.out.print(firstSign + "\n");
			} else {
				System.out.print(secondSign);
			}
		}
	}
	
	public static void PrintMyName(String myName) {
		printSymbols(myName.length(), '+', '-');
		
		System.out.println("|" + myName + "|");
		
		printSymbols(myName.length(), '+', '-');
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String myName = in.nextLine();
		
		PrintMyName(myName);
		
		in.close();
	}

}
