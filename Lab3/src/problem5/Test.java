package problem5;
import problems.Time;
public class Test {

	public static void main(String[] args) {
		
		Chocolate arr[] = new Chocolate[6];
		
		Chocolate c1 = new Chocolate("KitKat",12);
		Chocolate c2 = new Chocolate("Twix",18);
		Chocolate c3 = new Chocolate("ALbeni",13);
		Chocolate c4 = new Chocolate("Mars",21);
		Chocolate c5 = new Chocolate("Snickers",5);
		Chocolate c6 = new Chocolate("Kazakhstan",30);
		
		arr[0]=c1;
		arr[1]=c2;
		arr[2]=c3;
		arr[3]=c4;
		arr[4]=c5;
		arr[5]=c6;
		Sort.quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	
	
	
	Time[] t = new Time[3];
	t[0] = new Time(21,21,12);
	t[1] = new Time(12,21,12);
	t[2] = new Time(9,21,12);
	Sort.quickSort(t, 0, t.length - 1);
	for (int i = 0; i < t.length; i++)
		System.out.println(t[i].toString());
}
}
