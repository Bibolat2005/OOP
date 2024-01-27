package problem4;
import java.util.Comparator;
public class ComparatorByName implements Comparator<Employee>{
	public int compare(Employee a, Employee b) {
		return a.getPersonName().compareTo(b.getPersonName());
	}
}

