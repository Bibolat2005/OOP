package problem2;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Vector<Person> v = new Vector<Person>();
		Person p1 = new Student("a","excelent","oop",12,2.3);
		Person p2 = new Student("b","good","ads",10,4.3);
		Person p3=new Staff("c","F","P",12.3);
		v.add(p1);
		v.add(p2);
		v.add(p3);
		for(Person person : v) {
			//person.toString();
			System.out.println(person);
		}
	}

}
