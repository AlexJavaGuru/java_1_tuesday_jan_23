package student_ilya_tihonov.lesson_8.level_4_5;

public class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.testCalculateArea();
        test.testPerimeterCount();
    }

    public void testCalculateArea() {
        Triangle triangle = new Triangle(5, 10, "Test Triangle");
        double expected = 25.0;
        double actual = triangle.calculateArea();
        if (expected == actual) {
            System.out.println("testCalculateArea PASSED");
        } else {
            System.out.println("testCalculateArea FAILED");
        }
    }

    public void testPerimeterCount() {
        Triangle triangle = new Triangle(5, 10, "Test Triangle");
        double expected = 15.0;
        double actual = triangle.perimeterCount();
        if (expected == actual) {
            System.out.println("testPerimeterCount PASSED");
        } else {
            System.out.println("testPerimeterCount FAILED");
        }
    }

}
