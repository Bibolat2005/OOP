package problem1b;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		/*
		Book book = new Book("Harry Potter", "J.K.Rowling", 2011, 657);
		System.out.println(book.toString());
		System.out.println(book.getAuthor());
		book.open();
		*/
		 Vector<LibraryItem> library = new Vector<>();
		    Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180);
	        Dvd dvd = new Dvd("Inception", "Christopher Nolan", 2010, "Old");
	        Magazine magazine = new Magazine("National Geographic", "Zuhra", 2022, 209);
	        
	        library.add(book);
	        library.add(dvd);
	        library.add(magazine);
	        
	        for (LibraryItem item : library) {
	            System.out.println(item.toString());
		 
	}
	}
}
