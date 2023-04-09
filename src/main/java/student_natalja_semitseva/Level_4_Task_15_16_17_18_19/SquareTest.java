package student_natalja_semitseva.Level_4_Task_15_16_17_18_19;

public class SquareTest {


    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.TestCalculateArea();
        squareTest.TestCalculateAreaFailed();
        squareTest.TestCalculatePerimeter();
        squareTest.TestCalculatePerimeterFailed();

    }

    public void TestCalculateArea() {
        Circle circle = new Circle("Area",5);
        double expected =78.53981633974483;
        double realResult = circle.calculateArea();
        checkResult(realResult == expected, "TestCalculateArea");
    }

    public void TestCalculateAreaFailed() {
        Circle circle = new Circle("Area",5);
        double expected = 77.53981633974483;
        double realResult = circle.calculateArea();
        checkResult(realResult != expected, "TestCalculateAreaFailed");
    }

    public void TestCalculatePerimeter() {
        Circle circle = new Circle("Area",5);
        double expected = 31.41592653589793;
        double realResult = circle.calculatePerimeter();
        checkResult(realResult == expected, "TestCalculatePerimeter");
    }

    public void TestCalculatePerimeterFailed() {
        Circle circle = new Circle("Area",5);
        double expected = 31;
        double realResult = circle.calculatePerimeter();
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
