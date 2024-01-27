package problem;

public class Restaurant {
	 boolean servePizza(CanHavePizza eater, int pizzaSize) {
	        eater.eatPizza();
	        if (eater instanceof Person) {
	            processPayments((Person) eater);
	        }
	        printPizzaInformation(pizzaSize);
	        return true;
	    }
	 
	 void processPayments(Person person) {
	        System.out.println("Processing payments for a person.");
	    }
	 
	 void printPizzaInformation(int pizzaSize) {
	        System.out.println("Pizza served with size: " + pizzaSize);
	 }

}
