
package problem5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnappedPeople = new Vector<>();

    public void kidnap(Person p) {
        kidnappedPeople.add(p);
    }

    public boolean willDragonEatOrNot() {
        while (true) {
            Vector<Person> newLine = new Vector<>();
            boolean pairVanished = false;
            int i = 0;

            while (i < kidnappedPeople.size()) {
                if (i < kidnappedPeople.size() - 1 && kidnappedPeople.get(i).toString().equals("B") &&
                    kidnappedPeople.get(i + 1).toString().equals("G")) {
                    pairVanished = true;
                    i++;
                } else {
                    newLine.add(kidnappedPeople.get(i));
                }
                i++;
            }

            if (!pairVanished) {
                return false;
            }

            kidnappedPeople = newLine;

            if (kidnappedPeople.size() == 0) {
                return true; 
            }
        }
    }

    public static void main(String[] args) {
        DragonLaunch dragonLaunch = new DragonLaunch();

        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.GIRL));
        dragonLaunch.kidnap(new Person(Gender.GIRL));
        

        if (dragonLaunch.willDragonEatOrNot()) {
            System.out.println("no launch");
        } else {
            System.out.println("launch");
        }
    }
}



/*
package problem5;
import java.util.Vector;
class DragonLaunch{
    private Vector<Person> kap = new Vector<>();
    public void kidnap(Person p){
        kap.add(p);
    }
    public boolean willDragonEatOrNot(){
        int b = 0;
        int g = 0;
        for(Person p: kap){
            if(p.getGender() == Gender.Boy){
                b ++;
            }
            else{
                g ++;
            }
        }
        if(b == g){
            return false;
        }
        return true;
    }
}
*/