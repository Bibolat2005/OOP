package practice3;

public class Chocolate implements Comparable<Chocolate>{
	public int height;
	public String name;
	
	public Chocolate() {
		
	}
	
	public Chocolate(int height, String name) {
		this.height=height;
		this.name=name;
	}
	
	public String toString() {
		return "Height"+this.height;
	}
	
	public int compareTo(Chocolate o) {
		if(this.height>o.height) return 1;
		if(this.height>o.height) return -1;
		return 0;
	}
}