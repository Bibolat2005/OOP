package problem5;
import problems.Time;
public class Chocolate implements Comparable<Chocolate>{
	int weight;
	String name;
	Chocolate(){
		
	}
	
	Chocolate(String name,int weight){
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {
		return this.name + "'s weight is " + this.weight;
	}
	
	public int compareTo(Chocolate o) {
		if(this.weight > o.weight) return 1;
		if(this.weight < o.weight) return -1;
		return 0;
	}
	
	Time t = new Time(12,3,2);
}
