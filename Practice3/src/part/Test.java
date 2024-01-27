package part;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1=new Person("Bibolat",18);
		Person person2=new Person("Bibolat",18);
		if(person1.equals(person2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not");
		}
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
	}

}
