package student_aleksandrs_lezhennikovs.lesson_3.level_3;

class RobotDemo {
    public static void main(String[] args) {

        Robot myFirstRobot = new Robot("WALL-E");
        Robot mySecondRobot = new Robot("EVE");

        myFirstRobot.sayHello();
        myFirstRobot.sayYourName();

        mySecondRobot.sayYourName();
        mySecondRobot.sayHello();

    }
}
