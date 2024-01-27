package problem2;
import java.util.Objects;
public class Contact {
	// use modifiers
	private int id;
	private String firstName;
	private String phoneNumber;
	
	// empty constructor
	
	public Contact() {
		
	}
	
	Contact(int id, String firstName, String phoneNumber){
		this.id = id;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
	}
	
	
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if(this.getClass()!=o.getClass()) return false;
		Contact c= (Contact)o;
		return this.id==c.id && this.firstName.equals(c.firstName) && this.phoneNumber.equals(c.phoneNumber);
	}
	
	
	public int hashCode() {
		return Objects.hash(id, firstName, phoneNumber);
	}
	
	public String toString() {
		return "Contact: " + " id: " + this.id + ", name = " + this.firstName + ", phoneNumber = " + this.phoneNumber;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
