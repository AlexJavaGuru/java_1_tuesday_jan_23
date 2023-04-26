package student_nikita_visnakovs.lesson_8.level_4;

public class SquareTest {

    public static void main(String[] args) {
        SquareTest tester = new SquareTest();
        tester.calculateAreaTest();
        tester.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        Square square = new Square("Square", 3);
        double expectedResult = 9;
        double actualResult = square.calculateArea();
        checkResult(expectedResult, actualResult, "Calculate area test");
    }

    void calculatePerimeterTest() {
        Square square = new Square("Square", 4);
        double expectedResult = 16;
        double actualResult = square.calculatePerimeter();
        checkResult(expectedResult, actualResult, "Calculate perimeter test");
    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!!!");
        } else {
            System.out.println(testName + " failed!!!");
        }
    }
}
