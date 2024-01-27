package practice2;

public class Person implements Cloneable{
	public String personName;

	
	public Person(String personName) {
		this.personName=personName;
	}
	
	public boolean equals(Object o) {
		if(this==o) return true;
		if(this==null || this.getClass()!=o.getClass()) return false;
		Person p =(Person)o;
		return this.personName.equals(p.personName);
	}
	
	public String toString() {
		return this.personName;
	}
}
