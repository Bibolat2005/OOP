package problem4;
import java.util.Date;
public class Employee extends Person implements Comparable<Employee>,Cloneable{
	public double salary;
	public Date hireDate;
	public String insuranceNumber;
	
	public Employee() {
		
	}
	
	public Employee(String personName, double salary, Date hireDate, String insuranceNumber) {
		super(personName);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public String toString() {
		return super.toString() + ". I started my new job in " + hireDate + " and my salary is " + salary + " with insurance number " + insuranceNumber + "\n"; 
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Employee p = (Employee) o;
		return this.getPersonName().equals(p.getPersonName()) && this.insuranceNumber.equals(p.insuranceNumber) && this.hireDate == p.hireDate && this.salary == p.salary;
	}
	
	public int compareTo(Employee e) {
		if(this.salary > e.salary) return 1;
		else if(this.salary < e.salary) return -1;
		return 0;
	}
	
	public Employee clone() throws CloneNotSupportedException{
		Employee p = (Employee) super.clone();
		p.hireDate = (Date) hireDate.clone();
		return p;
		
	}
	

}
