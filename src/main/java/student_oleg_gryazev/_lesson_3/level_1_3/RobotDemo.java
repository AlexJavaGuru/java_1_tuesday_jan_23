package student_oleg_gryazev._lesson_3.level_1_3;

public class RobotDemo {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.sayHello();
        robot.sayYourName();
        Robot robot1 = new Robot("Bobrik");
        robot.sayHello();
        System.out.println("My name is " + robot1.name);
        Robot robot2 = new Robot("Robin", 7);
        robot2.sayHello();
        System.out.println("My name is " + robot2.name + " and I'am " + robot2.age);

    }
}
