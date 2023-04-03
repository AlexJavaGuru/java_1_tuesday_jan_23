package student_oksana_tarasova.lesson_8.level_4;

class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        Triangle triangle = new Triangle("triangle", 3);
        double expectedResult = 4.0;
        double realResult = triangle.calculateArea();
        check(expectedResult == realResult, "triangle area");
    }

    public void calculatePerimeterTest() {
        Triangle triangle = new Triangle("triangle", 3);
        double expectedResult = 9.0;
        double realResult = triangle.calculatePerimeter();
        check(expectedResult == realResult, "triangle perimeter");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
