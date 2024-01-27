package problem1;

public abstract class Animal {
	String name;
	int age;
	int x=5;
	Animal(){
		//this.name="without name ";
		//this.age=0;
	}
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int move(int dx) {
		return x+=dx;
	}
	public String voice(String s) {
		return s;
	}
	public char voice(char c) {
		return c;
	}
	
	public int distance(int v,int t) {
		return v*t;
	}
	public double  distance(double v,double t) {
		return v*t;
	}
	public String toString() {
		return name+" Bob age is: "+age;
	}
}
//	public static boolean isRegional(Animal a) {
//		return true;
//	}
//	
//	public boolean equals(Object o) {
//		if (o == null || !(o instanceof Animal))
//			return false;
//		Animal a = (Animal) o;
//		return this.age == a.age;
//	}
//}
