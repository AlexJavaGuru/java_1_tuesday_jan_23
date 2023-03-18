package student_aleksandrs_lezhennikovs.lesson_8.level_4;

class TriangleTests {
    public static void main(String[] args) {
        checkTriangleArea();
        checkTrianglePerimeter();
    }

    public static void checkTriangleArea() {
        Triangle triangle = new Triangle("Area", 5);
        double expectedResult = 11;
        double calculatedResult = triangle.calculateArea();
        check("Check triangle area calculation ",expectedResult, calculatedResult);
    }

    public static void checkTrianglePerimeter() {
        Triangle triangle = new Triangle("Perimeter", 5);
        double expectedResult = 15;
        double calculatedResult = triangle.calculatePerimeter();
        check("Check triangle perimeter calculation ",expectedResult, calculatedResult);
    }

    private static void check(String actionCheck, double expected, double actual) {
        if (expected == actual) {
            System.out.println(actionCheck + " test has PASSED");
        } else {
            System.out.println(actionCheck + " test has FAILED");
        }
    }
}
