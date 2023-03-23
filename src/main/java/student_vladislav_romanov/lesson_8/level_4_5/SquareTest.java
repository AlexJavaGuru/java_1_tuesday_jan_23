package student_vladislav_romanov.lesson_8.level_4_5;

class SquareTest {

    private int succeedTests;
    private int failedTests;

    public static void main(String[] args) {
        SquareTest SquareTest = new SquareTest();
        SquareTest.calculateAreaTestSucceed();
        SquareTest.calculateAreaTestFailed();
        SquareTest.calculatePerimeterTestSucceed();
        SquareTest.calculatePerimeterTestFailed();
        SquareTest.printStat();
    }

    public void calculateAreaTestSucceed() {
        Square square = new Square("Square", 3);
        double expected = 9;
        double current = square.calculateArea();
        printResult(current == expected, "calculateAreaTestSucceed");
    }

    public void calculateAreaTestFailed() {
        Square square = new Square("Square", 3);
        double expected = 10;
        double current = square.calculateArea();
        printResult(current != expected, "calculateAreaTestFailed");
    }

    public void calculatePerimeterTestSucceed() {
        Square square = new Square("Square", 3);
        double expected = 12;
        double current = square.calculatePerimeter();
        printResult(current == expected, "calculatePerimeterTestSucceed");
    }

    public void calculatePerimeterTestFailed() {
        Square square = new Square("Square", 3);
        double expected = 18;
        double current = square.calculatePerimeter();
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
