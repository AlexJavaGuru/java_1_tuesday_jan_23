package student_romualds_leitans.lesson_3.level_1;

public class Robot {
    String name;

    public Robot(String RobotName){
        this.name = RobotName;
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    public void sayYourName() {
        System.out.println("My Name is:" + this.name );
    }
}

