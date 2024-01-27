package problem4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Vector;
public class Test {

	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
		Employee p = new Employee("Bibolat",1000000,new SimpleDateFormat("dd/MM/yyyy").parse("07/07/2007"),"121");
		Employee p2=(Employee)p.clone();
		System.out.println(p);
		System.out.println(p2);
		
		Employee p3 = new Employee("Ilias",1000000,new SimpleDateFormat("dd/MM/yyyy").parse("08/08/2008"),"123");
		Employee p4 = new Employee("Dias",3000000,new SimpleDateFormat("dd/MM/yyyy").parse("09/09/2009"),"125");
		Employee p5 = new Employee("Shynngys",4000000,new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2010"),"127");
		Manager m = new Manager("Botagoz",5000000,new SimpleDateFormat("dd/MM/yyyy").parse("11/11/2011"),"12",10000);
		m.v.add(p);
		m.v.add(p2);
		m.v.add(p3);
		m.v.add(p4);
		m.v.add(p5);
//		Manager m2=(Manager)m.clone();
		System.out.println(m.v);
//		System.out.println(m2);
	
		Vector<Employee> v2 = new Vector<Employee>();
		v2.add(p);
		v2.add(p2);
		v2.add(p3);
		v2.add(p4);
		v2.add(p5);
	//	Collections.sort(v2,new ComparatorByName());
		Collections.sort(v2,new ComparatorByDate());
		System.out.println(v2);
//		System.out.println(p5.compareTo(p4));
//		

		
		 Employee clonedEmployee = p3.clone();
         Manager clonedManager = m.clone();
       System.out.println("\nCloned Employee: " + clonedEmployee);
       System.out.println("Cloned Manager: " + clonedManager);
}

}
