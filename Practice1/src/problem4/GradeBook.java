package problem4;
import java.util.Vector;
public class GradeBook {
	Vector<Integer>grades=new Vector<Integer>();
	int grade;
	int sum=0;
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	String minName;
	String maxName;
	int minId;
	int maxId;
	
	
	public GradeBook(){
		
	}
	
	
	public void addGrade(int grade,String name,int id) {
		this.grade=grade;
		grades.add(this.grade);
		sum+=this.grade;
		
		
		if(this.grade>this.max) {
			this.max=this.grade;
			this.maxName=name;
			this.maxId=id;
		}
		
		
		if(this.grade < this.min) {
		      this.min = this.grade;
		      this.minName = name;
		      this.minId = id;
		    }
	}
	public String displayMessages() {
		return "Welcome to grade book for ";
	}
	
	public double averageGrade() {
		return sum/grades.size();
	}
	
	
	public String maximumGrade() {
		return ""+this.max+"("+"Student:"+this.maxName+",id:"+this.maxId+")";
	}
	
	 public String minimumGrade() {
	      return "" + this.min + "(" + "Student: " + this.minName + ", id: " + this.minId + ")";
	    }
	 
	 public void displayGradeReport() {
		    System.out.println("Class average is " + averageGrade());
		    System.out.println("Lowest grade is " + minimumGrade());
		    System.out.println("Highest grade is " + maximumGrade());
		  }


	 
	 public String outputDistribution() {
		    int[] gradeCounts = new int[11];
		    String res = "Grade distribution:\n";

		    for (Integer grade : grades) { 
		        
		        if (grade >= 0 && grade <= 9) {
		            gradeCounts[0]++;
		        } else if (grade >= 10 && grade <= 19) {
		            gradeCounts[1]++;
		        } else if (grade >= 20 && grade <= 29) {
		            gradeCounts[2]++;
		        } else if (grade >= 30 && grade <= 39) {
		            gradeCounts[3]++;
		        } else if (grade >= 40 && grade <= 49) {
		            gradeCounts[4]++;
		        } else if (grade >= 50 && grade <= 59) {
		            gradeCounts[5]++;
		        } else if (grade >= 60 && grade <= 69) {
		            gradeCounts[6]++;
		        } else if (grade >= 70 && grade <= 79) {
		            gradeCounts[7]++;
		        } else if (grade >= 80 && grade <= 89) {
		            gradeCounts[8]++;
		        } else if (grade >= 90 && grade <= 99) {
		            gradeCounts[9]++;
		        }
		        else if(grade==100) {
		        	gradeCounts[10]++;
		        }
		    }

		    res += "00 - 09 : " + "*".repeat(gradeCounts[0]) + "\n";
		    res += "10 - 19 : " + "*".repeat(gradeCounts[1]) + "\n";
		    res += "20 - 29 : " + "*".repeat(gradeCounts[2]) + "\n";
		    res += "30 - 39 : " + "*".repeat(gradeCounts[3]) + "\n";
		    res += "40 - 49 : " + "*".repeat(gradeCounts[4]) + "\n";
		    res += "50 - 59 : " + "*".repeat(gradeCounts[5]) + "\n";
		    res += "60 - 69 : " + "*".repeat(gradeCounts[6]) + "\n";
		    res += "70 - 79 : " + "*".repeat(gradeCounts[7]) + "\n";
		    res += "80 - 89 : " + "*".repeat(gradeCounts[8]) + "\n";
		    res += "90 - 99 : " + "*".repeat(gradeCounts[9]) + "\n";
		    res+="100: " + "*".repeat(gradeCounts[10])+"\n";

		    return res;
		}
	 

}
