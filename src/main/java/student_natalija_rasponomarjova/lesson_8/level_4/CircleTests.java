package student_natalija_rasponomarjova.lesson_8.level_4;

class CircleTests {
    public static void main(String[] args) {
        testCircleArea();
        testCirclePerimeter();
    }

    public static void testCircleArea() {
        Circle circle = new Circle("Circle", 10);
        double expected = 314;
        double real = circle.calculateArea();
        checkResult(expected, real, "Test circle area");
    }

    public static void testCirclePerimeter() {
        Circle circle = new Circle("Circle", 10);
        double expected = 63;
        double real = circle.calculatePerimeter();
        checkResult(expected, real, "Test circle perimeter");
    }


    private static void checkResult(double expected, double real, String testName) {
        if (expected == real) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}