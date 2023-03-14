package student_aleksandrs_lezhennikovs.lesson_8.level_5;

import student_aleksandrs_lezhennikovs.lesson_8.level_4.Shape;

class ShapeUtilTest {
    public static void main(String[] args) {
        checkCalculateArea();
        checkCalculatePerimeter();
    }

    public static void checkCalculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double firstShapeArea = shape[0].calculateArea();
        double secondShapeArea = shape[1].calculateArea();
        double thirdShapeArea = shape[2].calculateArea();
        double fourthShapeArea = shape[3].calculateArea();
        double expectedResult = firstShapeArea + secondShapeArea + thirdShapeArea + fourthShapeArea;
        double calculatedArea = shapeUtil.calculateArea(shape);
        check("Check calculated total random shapes area ", expectedResult, calculatedArea);
    }

    public static void checkCalculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double firstShapePerimeter = shape[0].calculatePerimeter();
        double secondShapePerimeter = shape[1].calculatePerimeter();
        double thirdShapePerimeter = shape[2].calculatePerimeter();
        double fourtShapePerimeter = shape[3].calculatePerimeter();
        double expectedResult = firstShapePerimeter + secondShapePerimeter + thirdShapePerimeter + fourtShapePerimeter;
        double calculatedResult = shapeUtil.calculatePerimeter(shape);
        check("Check calculated total random shapes perimeter ", expectedResult, calculatedResult);
    }

    private static void check(String actionCheck, double expected, double actual) {
        if (expected == actual) {
            System.out.println(actionCheck + " test has PASSED");
        } else {
            System.out.println(actionCheck + " test has FAILED");
        }
    }

}
