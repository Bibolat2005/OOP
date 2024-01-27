package problem1b;

public class Dvd extends LibraryItem{
	private String style;
	
	public Dvd() {
		
	}

    public Dvd(String title, String author, int publicationYear, String style) {
        super(title, author,  publicationYear);
        this.style = style;
    }

    public String getDirector() {
        return style;
    }
    
    public void setDirector(String style) {
    	this.style = style;
    }
    
    public String toString() {
        return super.toString() + "\nStyle: " + style;
    }
    
    public void play() {
        System.out.println("Playing the DVD...");
    }
}
