package teacher.lesson_3_oop_first_look.lessoncode;

public class Demo {

    public static void main(String[] args) {
        Dog tuzik = new Dog("Tuzik", 1);
        Dog sharik = new Dog("Sharik", 5, true);
        Dog bobik = new Dog("Bobik", 10);
        String sharikName = sharik.getName();
        System.out.println("Name: " + sharikName);
        System.out.println("Age: " + sharik.getAge());
        System.out.println("Is Hungry: " + sharik.isHungry());
        sharik.eat();
        sharik.bark();
        sharik.sleep();
        System.out.println("Is Hungry: " + sharik.isHungry());

        System.out.println("Name: " + bobik.getName());
        System.out.println("Age: " + bobik.getAge());
        System.out.println("Is Hungry: " + bobik.isHungry());

        bobik.setName("Rex");
        System.out.println("Name: " + bobik.getName());
    }
}
