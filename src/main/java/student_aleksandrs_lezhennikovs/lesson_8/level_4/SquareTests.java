package student_aleksandrs_lezhennikovs.lesson_8.level_4;

class SquareTests {
    public static void main(String[] args) {
        checkSquareArea();
        checkSquarePerimeter();
    }

    public static void checkSquareArea() {
        Square square = new Square("Area", 5);
        double expectedResult = 25;
        double calculatedResult = square.calculateArea();
        check("Check square area calculation ",expectedResult, calculatedResult);
    }

    public static void checkSquarePerimeter() {
        Square square = new Square("Perimeter", 5);
        double expectedResult = 20;
        double calculatedResult = square.calculatePerimeter();
        check("Check square perimeter calculation ",expectedResult, calculatedResult);
    }

    private static void check(String actionCheck, double expected, double actual) {
        if (expected == actual) {
            System.out.println(actionCheck + " test has PASSED");
        } else {
            System.out.println(actionCheck + " test has FAILED");
        }
    }


}
