package teacher.lesson_3_oop_first_look.lessoncode;

public class Dog {

    private String name;
    private int age;
    private boolean isHungry;

    public Dog(String name, int age, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("Wof");
    }

    public void eat() {
        isHungry = false;
        System.out.println("I'm eating");
    }

    public void sleep() {
        System.out.println("Zzz...Zzz");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return isHungry;
    }

}
