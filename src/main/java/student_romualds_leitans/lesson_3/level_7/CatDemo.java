package student_romualds_leitans.lesson_3.level_7;

public class CatDemo {
    public static void main(String[] args) {
        Cat Vasjka = new Cat("Vasjak",10,"Black");
        System.out.println("My name is: " + Vasjka.name);
        System.out.println("Age: " + Vasjka.age);
        System.out.println("color: " + Vasjka.color);

        Vasjka.eat();
        Vasjka.play();
        Vasjka.sleep();
    }
}
