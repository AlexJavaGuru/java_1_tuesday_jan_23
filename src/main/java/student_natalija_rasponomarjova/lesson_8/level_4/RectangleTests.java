package student_natalija_rasponomarjova.lesson_8.level_4;

class RectangleTests {
    public static void main(String[] args) {
        testRectangleArea();
        testRectanglePerimeter();

    }

    public static void testRectangleArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 10, 20);
        double expected = 200;
        double real = rectangle.calculateArea();
        checkResult(expected, real, "Rectangle area test");

    }

    public static void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 10, 20);
        double expected = 60;
        double real = rectangle.calculatePerimeter();
        checkResult(expected, real, "Rectangle perimeter test");

    }

    private static void checkResult(double expected, double real, String testName) {
        if (expected == real) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }

}
