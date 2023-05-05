package student_natalija_rasponomarjova.lesson_8.level_4;

class SquareTests {
    public static void main(String[] args) {
        testSquareArea();
        testSquarePerimeter();
    }

    public static void testSquareArea() {
        Square square = new Square("Square", 100);
        double expected = 10000;
        double real = square.calculateArea();
        checkResult(expected, real, "Square area test");

    }

    public static void testSquarePerimeter() {
        Square square = new Square("Square", 10);
        double expected = 40;
        double real = square.calculatePerimeter();
        checkResult(expected, real, "Square perimeter test");
    }

    private static void checkResult(double expected, double real, String testName) {
        if (expected == real) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
