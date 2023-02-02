package student_oleg_gryazev._lesson_3.level_1;

 class RobotDemo {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.sayHello();
        robot.sayYourName("Rob.");
        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName("Bor.");
        Robot robot2 = new Robot("Bober");
        robot2.sayHello();
        System.out.println("Hello my name is " + robot2.name1);
    }
}
