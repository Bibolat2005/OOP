package practice3;
import java.util.Comparator;
public class ComparatorByName implements Comparator<Chocolate>{
	public int compare(Chocolate a,Chocolate b) {
		return a.name.compareTo(b.name);
	}
}
