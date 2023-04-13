package student_ilya_tihonov.lesson_8.level_4_5;

public class RectangleTest {

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.testCalculateArea();
        test.testPerimeterCount();
    }

    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle(5, 10, "Test Rectangle");
        double expected = 50.0;
        double actual = rectangle.calculateArea();
        if (expected == actual) {
            System.out.println("testCalculateArea PASSED");
        } else {
            System.out.println("testCalculateArea FAILED");
        }
    }

    public void testPerimeterCount() {
        Rectangle rectangle = new Rectangle(5, 10, "Test Rectangle");
        double expected = 30.0;
        double actual = rectangle.perimeterCount();
        if (expected == actual) {
            System.out.println("testPerimeterCount PASSED");
        } else {
            System.out.println("testPerimeterCount FAILED");
        }
    }

}
