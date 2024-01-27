package problem4;
import java.util.Comparator;
public class ComparatorByDate implements Comparator<Employee>{
	public int compare(Employee a, Employee b) {
		return a.hireDate.compareTo(b.hireDate);
	}
}
