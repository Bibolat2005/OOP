package problem1b;

public class Book extends LibraryItem{
	private int pageCount;
	
	public Book() {
		
	}
	public Book(String title, String author, int publicationYear, int pageCount) {
		super(title, author, publicationYear);
		this.pageCount = pageCount;
	}
	
	 public int getPageCount() {
	        return pageCount;
	    }
	 
	 public void setPageCount(int pageCount) {
		 this.pageCount = pageCount;
	 }
	 
	 public String toString() {
	        return super.toString() + "\nPage Count: " + pageCount;
	    }
	 
	 public void open() {
	        System.out.println("Opening the book...");
	    }
}
