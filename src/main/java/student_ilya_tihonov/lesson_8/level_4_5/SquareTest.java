package student_ilya_tihonov.lesson_8.level_4_5;

public class SquareTest {

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.testCalculateArea();
        test.testPerimeterCount();
    }

    public void testCalculateArea() {
        Square square = new Square(5, "Test Square");
        double expected = 25.0;
        double actual = square.calculateArea();
        if (expected == actual) {
            System.out.println("testCalculateArea PASSED");
        } else {
            System.out.println("testCalculateArea FAILED");
        }
    }

    public void testPerimeterCount() {
        Square square = new Square(5,"Test Square");
        double expected = 20.0;
        double actual = square.perimeterCount();
        if (expected == actual) {
            System.out.println("testPerimeterCount PASSED");
        } else {
            System.out.println("testPerimeterCount FAILED");
        }
    }

}
