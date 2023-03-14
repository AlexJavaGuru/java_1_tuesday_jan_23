package student_aleksandrs_lezhennikovs.lesson_8.level_4;

class CircleTests {
    public static void main(String[] args) {
        checkCircleArea();
        checkCirclePerimeter();
    }

    public static void checkCircleArea() {
        Circle circle = new Circle("Area", 5);
        double expectedResult = 79;
        double calculatedResult = circle.calculateArea();
        check("Check circle area calculation ",expectedResult, calculatedResult);
    }

    public static void checkCirclePerimeter() {
        Circle circle = new Circle("Perimeter", 5);
        double expectedResult = 31;
        double calculatedResult = circle.calculatePerimeter();
        check("Check circle perimeter calculation ",expectedResult, calculatedResult);
    }

    private static void check(String actionCheck, double expected, double actual) {
        if (expected == actual) {
            System.out.println(actionCheck + " test has PASSED");
        } else {
            System.out.println(actionCheck + " test has FAILED");
        }
    }
}
