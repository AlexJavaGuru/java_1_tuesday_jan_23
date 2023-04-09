package student_julija_raudive.lesson_8.level_4;

class SquareTest {

    Square square = new Square("Square", 8);

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();

    }


    public void calculateAreaTest() {
        double expectedResult = 64;
        double result = square.calculateArea();
        checkResults(result == expectedResult, "Square area test");

    }

    public void calculatePerimeterTest() {
        double expectedResult = 32;
        double result = square.calculatePerimeter();
        checkResults(result == expectedResult, "Square perimeter test");

    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
