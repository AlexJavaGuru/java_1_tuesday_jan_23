package student_daniels_belejuns.lesson_3.level_7;

public class PersonDemo {
    public static void main(String[] args) {

        Person bob = new Person();
        bob.displayInfo();

        Person tom = new Person("Bob");
        tom.displayInfo();

        Person sam = new Person("Danik", 20);
        sam.displayInfo();
    }
}
