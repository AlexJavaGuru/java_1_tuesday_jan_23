package student_nikita_visnakovs.lesson_3.level_2;

public class Robot {

    String robotName;

    public Robot(String robotName) {
        this.robotName = robotName;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayYourName(){
        System.out.println("My name is " + robotName);
    }

}
