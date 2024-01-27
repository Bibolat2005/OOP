package problem4;

public class Course {
	 private String name;
	 private String description;
	 private int credits;
	 private String prerequsites;
	 public Course(String name,String description,int credits,String prerequsites) {
		 this.name = name;
		 this.description = description;
		 this.credits = credits;
		 this.prerequsites = prerequsites;
	 }
	 public Course() {
		 
	 }
	 public String getName() {
		    return name;
		  }

	 public void setName(String name) {
		    this.name = name;
		  }
		  
		  
	 public String getDescription() {
			    return description;
			  }

	 public void setDescription(String description) {
			    this.description = description;
			  }
	 
	 
	 public int getCredits() {
		    return credits;
		  }

	 public void setCredits(int credits) {
		    this.credits = credits;
		  }
	 
	 
	 public String getPrerequsites() {
		    return prerequsites;
		  }

	 public void setPrerequsites(String prerequsites) {
		    this.prerequsites = prerequsites;
		  }
}
