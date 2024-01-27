package practice2;
import java.util.Vector;
import java.util.Date;

public class Manager extends Employee implements Cloneable{
	public double bonus;
	
	public Manager(String personName, double salary, Date hireDate, String insuranceNumber, double bonus) {
		super(personName, salary, hireDate, insuranceNumber);
		this.bonus = bonus;
	}
	Vector<Employee>v=new Vector<Employee>();
	public void add(Employee e) {
		v.add(e);
	}
	
	public String toString() {
		return "bonus"+this.bonus;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Manager e = (Manager)o;
		return this.bonus==e.bonus;
	}
	
	public int compareTo(Manager m) {
		if(super.compareTo(m)==0) {
			if(this.bonus>m.bonus) return 1;
			if(this.bonus<m.bonus) return -1;
		}
		return 0;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Manager m = (Manager) super.clone();
		return m;
	}
}
