package problem1b;

public class Magazine extends LibraryItem {
	private int number;
	
	public Magazine() {
		
	}
	
	public Magazine(String title, String author, int publicationYear, int number) {
        super(title, author,  publicationYear);
        this.number = number;
    }
	
	 public int getNumber() {
	        return number;
	    }
	
	 public void setNumber(int number) {
		 this.number = number;
	 }
	 
	 public String toString() {
	        return super.toString() + "\nNumber: " + number;
	    }
	
	 public void browse() {
	        System.out.println("Browsing the magazine...");
	    }
}
