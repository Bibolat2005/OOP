package problems;
import java.util.Scanner;
public class MainTime {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Time t1=new Time(in.nextInt(),in.nextInt(),in.nextInt());
		t1.changeTime();
		//System.out.println(t1.Universal());
		//System.out.println(t1.Standard());
		Time t2= new Time(18, 57, 43);
		t2.changeTime();
		System.out.println(t1.Standard());
		System.out.println(t2.Universal());
		t1.add(t2);
		t1.changeTime();
		System.out.println(t1.Universal());
	}

}
