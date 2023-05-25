package student_natalija_rasponomarjova.lesson_8.level_4;

class TriangleTests {
    public static void main(String[] args) {
        testTriangleArea();
        testTrianglePerimeter();

    }

    public static void testTriangleArea() {
        Triangle triangle = new Triangle("Triangle", 10);
        double expected = 43.301270189221924;
        double real = triangle.calculateArea();
        checkResult(expected, real, "Triangle area test");
    }

    public static void testTrianglePerimeter() {
        Triangle triangle = new Triangle("Triangle", 10);
        double expected = 30;
        double real = triangle.calculatePerimeter();
        checkResult(expected, real, "Triangle perimeter test");
    }

    private static void checkResult(double expected, double real, String testName) {
        if (expected == real) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }


}
