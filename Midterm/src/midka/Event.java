package midka;
import java.util.Vector;
public class Event {
	private String name;
	private Date date;

	public Event(int year, int month, int day, String name, Date date, String Name) {
		super();
		this.name = name;
		this.date = date;
		
	}
	Vector<Event>v = new Vector<Event>();
	
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate(){
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
