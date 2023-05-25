package student_natalija_rasponomarjova.lesson_8.level_5;

import student_natalija_rasponomarjova.lesson_8.level_4.Shape;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.calculateArea();
        test.calculatePerimeter();

    }

    public void calculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double sum = 0;
        for (int i = 0; i < shape.length; i++) {
            sum = sum + shape[i].calculatePerimeter();
        }
        double expectedResult = sum;
        double realResult = shapeUtil.calculatePerimeter(shape);
        checkResult(expectedResult, realResult, "Calculate perimeter test");
    }

    public void calculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        double sum = 0;
        for (int i = 0; i < shape.length; i++) {
            sum = sum +  shape[i].calculateArea();
        }
        double expected = sum;
        double real = shapeUtil.calculateArea(shape);
        checkResult(expected, real, "Calculate area test");
    }

    public static void checkResult(double expected, double real, String testName) {
        if (expected == real) {
            System.out.println(testName + " -  OK");
        } else {
            System.out.println(testName + " - Failed");
        }
    }
}