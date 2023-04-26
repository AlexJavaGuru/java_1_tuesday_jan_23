package student_daniels_belejuns.lesson_8.level_4;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.testCalculateArea();
        rectangleTest.testCalculateAreaFailed();
        rectangleTest.testCalculatePerimeter();
        rectangleTest.testCalculatePerimeterFailed();
    }

    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 4);
        double expected = 8;
        double realResult = rectangle.calculateArea();
        checkResult(realResult == expected, "TestCalculateArea");
    }

    public void testCalculateAreaFailed() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 4);
        double expected = 10;
        double realResult = rectangle.calculateArea();
        checkResult(realResult != expected, "TestCalculateAreaFailed");
    }

    public void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 4);
        double expected = 16;
        double realResult = rectangle.calculatePerimeter();
        checkResult(realResult == expected, "TestCalculatePerimeter");
    }

    public void testCalculatePerimeterFailed() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 4);
        double expected = 13;
        double realResult = rectangle.calculatePerimeter();
        checkResult(realResult != expected, "TestCalculatePerimeterFailed");
    }

    public void checkResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test OK");

        } else {
            System.out.println(test + " test FAILED");
        }
    }
}
