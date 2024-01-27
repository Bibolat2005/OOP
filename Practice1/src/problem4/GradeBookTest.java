package problem4;

import java.util.Scanner;
import java.util.Vector;

import problems.Student;
public class GradeBookTest {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		Course course=new Course("OOP","Excelent",5,"CSCI2104");
		Vector<Student>student=new Vector<Student>();
		GradeBook mygrade=new GradeBook();
		  Student stud1 = new Student("A", 1);
		  Student stud2 = new Student("B", 2);
		  Student stud3 = new Student("C", 3);
		  student.add(stud1);
		  student.add(stud2);
		  student.add(stud3);
		  System.out.println(mygrade.displayMessages()+course.getPrerequsites()+" "+course.getName()+"!");
		  System.out.println("Please,input grades for students:");
		  for(int i=0;i<student.size();i++) {
			  System.out.println("Student "+student.elementAt(i).getName()+":");
			  mygrade.addGrade(in.nextInt(),student.elementAt(i).getName(),student.elementAt(i).getId());
		  }
		  mygrade.displayGradeReport();
		  System.out.println(mygrade.outputDistribution());
		  in.close();
	}

}
