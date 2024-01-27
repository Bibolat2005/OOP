package problems;

public class Student {
	private String name;
	private int id;
	private int study_year;
	public Student(){
	}
	Student(String name){
		this();
		this.name=name;
	}
	
	
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public int getYear() {
		return this.study_year;
	}
	public void Increment_of_year(int year) {
		this.study_year+=year;
	}
	public void print() {
		System.out.println(this.getName()+" "+this.getId()+" "+this.getYear());
	}
}
