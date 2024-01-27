package practice3;

public class Test {

	public static void main(String[] args) {
		Chocolate arr[] = new Chocolate[6];
		Chocolate c1 = new Chocolate(16,"Bounty");
		arr[0]=c1;
		Sort.quickSort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	Time [] t = new Time[3];
	t[0]=new Time(12,09,98);
	
	
}
