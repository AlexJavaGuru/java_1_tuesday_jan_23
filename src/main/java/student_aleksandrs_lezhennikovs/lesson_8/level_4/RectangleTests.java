package student_aleksandrs_lezhennikovs.lesson_8.level_4;

class RectangleTests {
    public static void main(String[] args) {
        checkRectangleArea();
        checkRectanglePerimeter();
    }

    public static void checkRectangleArea() {
        Rectangle rectangle = new Rectangle("Area", 5, 7);
        double expectedResult = 35;
        double calculatedResult = rectangle.calculateArea();
        check("Check rectangle area calculation ",expectedResult, calculatedResult);
    }

    public static void checkRectanglePerimeter() {
        Rectangle rectangle = new Rectangle("Perimeter", 5, 7);
        double expectedResult = 24;
        double calculatedResult = rectangle.calculatePerimeter();
        check("Check rectangle perimeter calculation ",expectedResult, calculatedResult);
    }

    private static void check(String actionCheck, double expected, double actual) {
        if (expected == actual) {
            System.out.println(actionCheck + " test has PASSED");
        } else {
            System.out.println(actionCheck + " test has FAILED");
        }
    }
}
