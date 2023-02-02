package student_nikita_visnakovs.lesson_3.level_5;

public class Dog {

    private String name;
    private int age;
    private String colour;


    public Dog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;


    }

    public void voice() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name);
        }

    }

    public void age() {
        System.out.println("Dog age is - " + age);
    }

    public void happyBirthday() {
        System.out.println("Happy Birthday ," + name);

    }

    public int setAge() {
        this.age = age +1;
        return this.age;
    }

    public String colour() {
        System.out.println("Dog colour is - " + colour);
        return this.colour;
    }

    public String setNewColour(String colour) {
        this.colour = colour;
        return this.colour();
    }


}
