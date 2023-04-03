package student_oksana_tarasova.lesson_8.level_4;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }
    public void calculateAreaTest () {
        Rectangle rectangle = new Rectangle ("rectangle", 3, 2);
        double expectedResult = 6.0;
        double realResult = rectangle.calculateArea();
        check(expectedResult == realResult, "rectangle area");
    }
    public void calculatePerimeterTest () {
        Rectangle rectangle = new Rectangle ("rectangle", 3, 2);
        double expectedResult = 10.0;
        double realResult = rectangle.calculatePerimeter();
        check(expectedResult == realResult, "rectangle perimeter");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
