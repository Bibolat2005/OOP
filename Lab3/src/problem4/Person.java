package problem4;
public class Person implements Cloneable{
	private String personName;
	
	public Person() {
		
	}
	
	public Person(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || this.getClass() != obj.getClass()) return false;
		Person other = (Person)obj;
		return this.personName.equals(other.personName);
	}
	
	public String toString() {
		return "My name is " + this.personName;
	}
	
	
}
