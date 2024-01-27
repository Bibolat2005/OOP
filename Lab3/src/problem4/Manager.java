package problem4;
import java.util.Date;
import java.util.Vector;
public class Manager extends Employee implements Cloneable{
	public double bonus;
	public Manager() {
		
	}
	
	public Manager(String personName, double salary, Date hireDate, String insuranceNumber, double bonus) {
		super(personName, salary, hireDate, insuranceNumber);
		this.bonus = bonus;
	}
	
	Vector<Employee> v = new Vector<Employee>();
	//Employee e = new Employee("Bob",2.5,new Date(02-02-2022),"480");
	public void add(Employee e) {
		v.add(e);
	}
	
	public String toString() {
		return super.toString() + "bonus is " + bonus;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Manager m = (Manager) o;
		return this.bonus == m.bonus;
	}
	
	
	public int compareTo(Manager e) {
		if(super.compareTo(e)==0) {
			if(this.bonus>e.bonus) return 1;
			if(this.bonus<e.bonus) return -1;
			return 0;
		}
		
		return super.compareTo(e);
	}
	
	
	public Manager clone() throws CloneNotSupportedException{
		 Manager clonedManager = (Manager) super.clone();
	        clonedManager.v = new Vector<>(v.size());
	        for(Employee employee : v) {
	            clonedManager.v.add(employee.clone());
	        }
	        return clonedManager;
	}
	
	
}
