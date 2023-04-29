package student_nikita_visnakovs.lesson_8.level_4;

public class RectangleTest {

    public static void main(String[] args) {
        RectangleTest tester = new RectangleTest();
        tester.calculateAreaTest();
        tester.calculatePerimeterTest();

    }

    public void calculateAreaTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 10, 3);
        double expectedResult = 30;
        double actualResult = rectangle.calculateArea();
        checkResult(expectedResult, actualResult, "Calculate area test");

    }

    public void calculatePerimeterTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 10, 3);
        double expectedResult = 60;
        double actualResult = rectangle.calculatePerimeter();
        checkResult(expectedResult, actualResult, "Calculate perimeter test");

    }

    public void checkResult(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!!!");
        } else {
            System.out.println(testName + " filed!!!");
        }
    }
}
