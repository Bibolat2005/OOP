package problems;
public class MainStudent {

	public static void main(String[] args) {
		Student s=new Student("Bibolat",2023);
		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getYear());
		s.Increment_of_year(5);
		s.print();
	}

}
