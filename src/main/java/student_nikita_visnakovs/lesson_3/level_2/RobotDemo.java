package student_nikita_visnakovs.lesson_3.level_2;

import student_nikita_visnakovs.lesson_3.level_2.Robot;

public class RobotDemo {

    public static void main(String[] args) {

        Robot myRobot = new Robot("R2D2");
        Robot mySecondRobot = new Robot("R2D2V2");

        myRobot.sayHello();
        myRobot.sayYourName();

        mySecondRobot.sayHello();
        mySecondRobot.sayYourName();
    }
}
