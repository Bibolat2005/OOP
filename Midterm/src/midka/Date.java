package midka;
import java.util.Objects;
public class Date {
	private int year;
	private int month;
	private int day;
	public Date() {
		
	}
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public boolean equals(Object o) {
		if(this==o) return false;
		if(o==null) return false;
		if(this.getClass() != o.getClass()) return false;
		Date d = (Date)o;
		return this.year == d.year && this.day == d.day && this.month == d.month;
	}
	public int hashCode() {
		return Objects.hash(year, month, day);
	}
	public String toString() {
		return "Year " + year + "Month " + month + "Day " + day;
	}
	public int getDay(){
		return day;
	}
	public void setDay(int day) {
		this.day=day;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth(){
		return month;
	}
	public void setMonth(int month) {
		this.month = month ;
	}

}
