package student_vladislav_romanov.lesson_8.level_4;

class CircleTest {

    private int succeedTests;
    private int failedTests;

    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.calculateAreaTestSucceed();
        circleTest.calculateAreaTestFailed();
        circleTest.calculatePerimeterTestSucceed();
        circleTest.calculatePerimeterTestFailed();
        circleTest.printStat();
    }

    public void calculateAreaTestSucceed() {
        Circle circle = new Circle(3);
        double expected = 28.274333882308138;
        double current = circle.calculateArea();
        printResult(current == expected, "calculateAreaTestSucceed");
    }

    public void calculateAreaTestFailed() {
        Circle circle = new Circle(3);
        double expected = 28;
        double current = circle.calculateArea();
        printResult(current != expected, "calculateAreaTestFailed");
    }

    public void calculatePerimeterTestSucceed() {
        Circle circle = new Circle(3);
        double expected = 18.84955592153876;
        double current = circle.calculatePerimeter();
        printResult(current == expected, "calculatePerimeterTestSucceed");
    }

    public void calculatePerimeterTestFailed() {
        Circle circle = new Circle(3);
        double expected = 18;
        double current = circle.calculatePerimeter();
        printResult(current != expected, "calculatePerimeterTestFailed");
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
            succeedTests++;
        } else {
            System.out.println(test + " test FAILED");
            failedTests++;
        }
        System.out.println("----------------------------------------------------------");
    }

    public void printStat() {
        System.out.println(succeedTests + " tests SUCCEED.");
        System.out.println(failedTests + " tests FAILED.");
    }

}
