package student_natalja_semitseva.Level_4_Task_15_16_17_18_19;

public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.testCalculateArea();
        test.testCalculateAreaFailed();
        test.testCalculatePerimeter();
        test.testCalculatePerimeterFailed();

    }

    public void testCalculateArea() {
        Triangle triangle = new Triangle("Triangle", 2, 3, 5, 2, 3);
        double expected = 3;
        double realResult = triangle.calculateArea();
        checkResult(realResult == expected, "testCalculateArea");
    }

    public void testCalculateAreaFailed() {
        Triangle triangle = new Triangle("Triangle", 2, 3, 5, 2, 3);
        double expected = 4;
        double realResult = triangle.calculateArea();
        checkResult(realResult != expected, "testCalculateAreaFailed");
    }

    public void testCalculatePerimeter() {
        Triangle triangle = new Triangle("Triangle", 2, 3, 5, 2, 3);
        double expected = 10;
        double realResult = triangle.calculatePerimeter();
        checkResult(realResult == expected, "testCalculatePerimeter");
    }

    public void testCalculatePerimeterFailed() {
        Triangle triangle = new Triangle("Triangle", 2, 3, 5, 2, 3);
        double expected = 5;
        double realResult = triangle.calculatePerimeter();
        checkResult(realResult != expected, "testCalculatePerimeterFailed");
    }

    public void checkResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test OK");

        } else {
            System.out.println(test + " test FAILED");
        }
    }
}
