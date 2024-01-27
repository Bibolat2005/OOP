package problem;

public class Person implements CanHaveParty, Movable{
	
	public void dance() {
        System.out.println("Person is dancing!");
    }
	
	 public void move() {
	    System.out.println("Person is moving!");
	}
	
	 public void organizeParty() {
	    System.out.println("Person is organizing a party!");
	}
}
