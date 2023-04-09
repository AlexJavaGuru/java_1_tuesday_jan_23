package student_julija_raudive.lesson_8.level_4;

class ShapeUtilTest {

    ShapeUtil shapeUtil = new ShapeUtil();
    Shape[] shapes = new Shape[4];


    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.calculateAreaSumTest();
        test.calculatePerimeterSumTest();

    }

    public void calculateAreaSumTest() {
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double areaOfCircle = shapes[0].calculateArea();
        double areaOfSquare = shapes[1].calculateArea();
        double areaOfRectangle = shapes[2].calculateArea();
        double areaOfTriangle = shapes[3].calculateArea();
        double expectedResult = areaOfCircle + areaOfSquare + areaOfRectangle + areaOfTriangle;
        double result = shapeUtil.calculateArea(shapes);
        checkResults(expectedResult==result, "Calculate area sum test");


    }

    public void calculatePerimeterSumTest() {
        double perimeterOfCircle = shapes[0].calculatePerimeter();
        double perimeterOfSquare = shapes[1].calculatePerimeter();
        double perimeterOfRectangle = shapes[2].calculatePerimeter();
        double perimeterOfTriangle = shapes[3].calculatePerimeter();
        double expectedResult = perimeterOfCircle + perimeterOfSquare + perimeterOfRectangle + perimeterOfTriangle;
        double result = shapeUtil.calculatePerimeter(shapes);
        checkResults(expectedResult==result, "Calculate perimeter sum test");
    }


    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
