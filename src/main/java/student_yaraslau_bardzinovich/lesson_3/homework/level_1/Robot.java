package student_yaraslau_bardzinovich.lesson_3.homework.level_1;

public class Robot {
    String name;
    Robot(String name) {
        this.name = name;
    }
    void sayHello() {
        System.out.println("Hello!");
    }
    void sayYourName() {
        System.out.println("My name is " + name + ".");
    }
}
