package student_julija_raudive.lesson_8.level_4;

class RectangleTest {

    Rectangle rectangle = new Rectangle("Rectangle", 15, 35);

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();

    }


    public void calculateAreaTest() {
        double expectedResult = 525;
        double result = rectangle.calculateArea();
        checkResults(result == expectedResult, "Rectangle area test");

    }

    public void calculatePerimeterTest() {
        double expectedResult = 100;
        double result = rectangle.calculatePerimeter();
        checkResults(result == expectedResult, "Rectangle perimeter test");

    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
