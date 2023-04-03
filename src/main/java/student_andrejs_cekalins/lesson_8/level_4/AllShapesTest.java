package student_andrejs_cekalins.lesson_8.level_4;


class AllShapesTest {
    public static void main(String[] args) {
        testCalculateCircleArea();
        testCalculateCirclePerimeter();
        testCalculateSquareArea();
        testCalculateSquarePerimeter();
        testCalculateRectangleArea();
        testCalculateRectanglePerimeter();
        testCalculateTriangleArea();
        testCalculateTrianglePerimeter();
    }
   public static void testCalculateCircleArea() {
        Circle circle = new Circle("Area", 3);
        double expectedResult =28;
        double realResult = circle.calculateArea();
       checkResult(expectedResult, realResult, "Calculate circle area test");
   }
    public static void testCalculateCirclePerimeter() {
        Circle circle = new Circle("Perimeter", 3);
        double expectedResult =19;
        double realResult = circle.calculatePerimeter();
        checkResult(expectedResult, realResult, "Calculate circle perimeter test");
    }
    public static void testCalculateSquareArea() {
       Square square = new Square("Area",6);
        double expectedResult =36;
        double realResult = square.calculateArea();
        checkResult(expectedResult, realResult, "Calculate square area test");
    }
    public static void testCalculateSquarePerimeter() {
        Square square = new Square("Perimeter", 6);
        double expectedResult =24;
        double realResult = square.calculatePerimeter();
        checkResult(expectedResult, realResult, "Calculate square perimeter test");
    }
    public static void testCalculateRectangleArea() {
        Rectangle rectangle = new Rectangle("Area", 7,4);
        double expectedResult =28;
        double realResult = rectangle.calculateArea();
        checkResult(expectedResult, realResult, "Calculate rectangle area test");
    }
    public static void testCalculateRectanglePerimeter() {
        Rectangle rectangle = new Rectangle("Perimeter", 7,4);
        double expectedResult =22;
        double realResult = rectangle.calculatePerimeter();
        checkResult(expectedResult, realResult, "Calculate rectangle perimeter test");
    }
    public static void testCalculateTriangleArea() {
        Triangle triangle = new Triangle("Area",8);
        double expectedResult =7;
        double realResult = triangle.calculateArea();
        checkResult(expectedResult, realResult, "Calculate triangle area test");
    }
    public static void testCalculateTrianglePerimeter() {
        Triangle triangle = new Triangle("Perimeter",10);
        double expectedResult =30;
        double realResult = triangle.calculatePerimeter();
        checkResult(expectedResult, realResult, "Calculate triangle area test");
    }
    private static void checkResult(double expectedResult, double realResult, String testName) {
        if (expectedResult==realResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
