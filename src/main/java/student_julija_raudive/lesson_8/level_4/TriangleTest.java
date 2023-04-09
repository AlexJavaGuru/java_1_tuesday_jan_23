package student_julija_raudive.lesson_8.level_4;

class TriangleTest {

    Triangle triangle = new Triangle("Triangle", 4);

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();

    }


    public void calculateAreaTest() {
        double expectedResult = 6.928203230275509;
        double result = triangle.calculateArea();
        checkResults(result == expectedResult, "Square area test");

    }

    public void calculatePerimeterTest() {
        double expectedResult = 12;
        double result = triangle.calculatePerimeter();
        checkResults(result == expectedResult, "Square perimeter test");

    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
