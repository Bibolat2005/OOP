package problem1;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Animal h=new Horse();
		Horse bob=new Horse("Horse",2,"S");
		System.out.println(h.voice("bbbb"));
		bob.setBreed("Kazakh");
		System.out.println(h.voice("hehehe"));
		System.out.println(h.move(4));
		System.out.println(bob.toString());
		System.out.println(h.toString());
		bob.jump();
		
		//Animal.isRegional(bob);
		
		Vector<Animal> animals = new Vector<Animal>();
		
		animals.add(h);
		animals.add(bob);
		
		if (h instanceof Animal) {
            ((Horse)h).jump();
        } else {
            System.out.println("h is not an instance of Horse.");
        }
	}
	
}
