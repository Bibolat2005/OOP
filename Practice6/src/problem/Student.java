package problem;

public class Student extends Person implements CanHavePizza, CanHaveRetake{
	
	 public void eatPizza() {
	        System.out.println("Student is eating pizza!");
	    }
	 
	 public void retakeExam() {
	        System.out.println("Student is not able to pass exam");
	    }
	 
	 void study() {
	        System.out.println("Student is studying");
	    }
}
