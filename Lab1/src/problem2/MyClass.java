package problem2;

public class MyClass {
	 final String name ="Bibolat";
	 private int year;
	 static Month m;
	 {
	  year++;
	 }
	 MyClass(int year,Month m){
		
	  this.year=year;
	  MyClass.m=m;
	 }
	 public String toString() {
	  return "My name is "+name+".I'm "+year+".My birthday month is in "+m+".";
	 }
	 public String toString(int monthNumber) {
	  return "My name is "+name+".I'm "+year+".My birthday month is in "+monthNumber+".";
	 }

}
