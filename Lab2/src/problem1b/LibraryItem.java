package problem1b;

public abstract class LibraryItem {
	private String title;
    private String author;
    private int publicationYear;
    
    public LibraryItem() {
    	
    }
    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
    	this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public void setPublicationYear(int publicationYear) {
    	this.publicationYear = publicationYear;
    }
    
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublication Year: " + publicationYear;
    }
}