package problem5;


public class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public String toString() {
        return (gender == Gender.BOY) ? "B" : "G";
    }
}




/*
class Person {
    private Gender gender;
    public Person(Gender gender){
        this.gender = gender;
    }
    public Gender getGender(){
        return gender;
    }

    public static void main(String[] args){
        DragonLaunch dl = new DragonLaunch();

        dl.kidnap(new Person(Gender.Girl));
        dl.kidnap(new Person(Gender.Girl));
        dl.kidnap(new Person(Gender.Boy));
        dl.kidnap(new Person(Gender.Boy));

        boolean willEat = dl.willDragonEatOrNot();
        if (willEat) {
            System.out.println("Will Dragon Eat.");
        } else {
            System.out.println("Will Dragon not Eat.");
        }

    }
}
*/