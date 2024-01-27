package part;
import java.util.Objects;
public class Person {
	private String name;
	private int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null || getClass()!=obj.getClass()){
			return false;
		}
		Person person=(Person)obj;
		return age==person.age && Objects.equals(name, person.name);
	}
	
	
	public int hashCode() {
		return Objects.hash(this.name, this.age);
	}
	
}
