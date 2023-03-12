package student_vladislav_romanov.lesson_8.level_4_5;

class TriangleTest {

    private int succeedTests;
    private int failedTests;

    public static void main(String[] args) {
        TriangleTest TriangleTest = new TriangleTest();
        TriangleTest.calculateAreaTestSucceed();
        TriangleTest.calculateAreaTestFailed();
        TriangleTest.calculatePerimeterTestSucceed();
        TriangleTest.calculatePerimeterTestFailed();
        TriangleTest.printStat();
    }

    public void calculateAreaTestSucceed() {
        Triangle triangle = new Triangle("Triangle", 3, 4, 5, 4, 3);
        double expected = 6;
        double current = triangle.calculateArea();
        printResult(current == expected, "calculateAreaTestSucceed");
    }

    public void calculateAreaTestFailed() {
        Triangle triangle = new Triangle("Triangle", 3, 4, 5, 4, 3);
        double expected = 10;
        double current = triangle.calculateArea();
        printResult(current != expected, "calculateAreaTestFailed");
    }

    public void calculatePerimeterTestSucceed() {
        Triangle triangle = new Triangle("Triangle", 3, 4, 5, 4, 3);
        double expected = 12;
        double current = triangle.calculatePerimeter();
        printResult(current == expected, "calculatePerimeterTestSucceed");
    }

    public void calculatePerimeterTestFailed() {
        Triangle triangle = new Triangle("Triangle", 3, 4, 5, 4, 3);
        double expected = 13;
        double current = triangle.calculatePerimeter();
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
