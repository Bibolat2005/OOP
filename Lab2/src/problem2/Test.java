package problem2;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.println("ID number: ");
		int id = input.nextInt();
		System.out.println("firstName: ");
		String firstName = input.next();
		System.out.println("phoneNumber: ");
		String phoneNumber = input.next();
		*/
		
		
		Contact c1 = new Contact(1, "Bibolat", "8-771-776-13-96");
		Contact c2 = new Contact(2, "Dias", "8-700-007-01-01");
		Contact c3 = new Contact(3, "Ilias", "8-707-005-01-05");
		Contact c4 = new Contact(1, "Bibolat", "8-771-776-13-96");
		Contact c5 = new ContactFriends(5, "Bibolat", "8-771-776-13-96", 2005);
		Contact c6 = new ContactFriends(3, "Ilias", "8-707-005-01-05", 2005);
		
		
		HashSet<Contact> hs = new HashSet<Contact>();
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		hs.add(c5);
		hs.add(c6);
		
		// narrowing convention
		//ContactFriends cf3 = (ContactFriends) c5;
		
		// widening convention
		//Contact c5Dublicate = (Contact) cf3;
		
		if(c1.equals(c4)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		System.out.println(c1.hashCode());
		System.out.println(c4.hashCode());
		
		System.out.println("Contacts: ");
		for(Contact c : hs) {
			System.out.println(c);
			System.out.println(c.hashCode());
		}
		
	}

}
