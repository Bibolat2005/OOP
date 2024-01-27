package problem2;
import java.util.Objects;
public class ContactFriends extends Contact{
	private int year;
	
	public ContactFriends() {
		
	}
	public ContactFriends(int id, String firstName, String phoneNumber, int year){
		super(id, firstName, phoneNumber);
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int hashCode() {
		//return Objects.hash(id, firstName, phoneNumber, year);
		 //return Objects.hash(super.hashCode(), year);
		 return Objects.hash(super.hashCode() , year);
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		ContactFriends f = (ContactFriends)o;
		return f.year == this.year;
	}
	
	public String toString() {
		return super.toString() + " " + year;
	}
}

