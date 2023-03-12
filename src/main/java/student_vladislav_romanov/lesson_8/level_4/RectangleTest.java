package student_vladislav_romanov.lesson_8.level_4;

public class RectangleTest {

    private int succeedTests;
    private int failedTests;

    public static void main(String[] args) {
        RectangleTest RectangleTest = new RectangleTest();
        RectangleTest.calculateAreaTestSucceed();
        RectangleTest.calculateAreaTestFailed();
        RectangleTest.calculatePerimeterTestSucceed();
        RectangleTest.calculatePerimeterTestFailed();
        RectangleTest.printStat();
    }

    public void calculateAreaTestSucceed() {
        Rectangle rectangle = new Rectangle("Rectangle", 3, 4);
        double expected = 12;
        double current = rectangle.calculateArea();
        printResult(current == expected, "calculateAreaTestSucceed");
    }

    public void calculateAreaTestFailed() {
        Rectangle rectangle = new Rectangle("Rectangle", 3, 4);
        double expected = 10;
        double current = rectangle.calculateArea();
        printResult(current != expected, "calculateAreaTestFailed");
    }

    public void calculatePerimeterTestSucceed() {
        Rectangle rectangle = new Rectangle("Rectangle", 3, 4);
        double expected = 14;
        double current = rectangle.calculatePerimeter();
        printResult(current == expected, "calculatePerimeterTestSucceed");
    }

    public void calculatePerimeterTestFailed() {
        Rectangle rectangle = new Rectangle("Rectangle", 3, 4);
        double expected = 13;
        double current = rectangle.calculatePerimeter();
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
