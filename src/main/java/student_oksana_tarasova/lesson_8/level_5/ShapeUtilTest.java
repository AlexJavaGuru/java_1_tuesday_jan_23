package student_oksana_tarasova.lesson_8.level_5;

import student_oksana_tarasova.lesson_8.level_4.*;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double realResult = shapeUtil.calculateArea(shapes);
        double countArea = 0;
        for (Shape shape : shapes) {
            countArea += shape.calculateArea();
        }
        double expectedResult = countArea;
        check(expectedResult == realResult, "Total area");
    }

    void calculatePerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double realResult = shapeUtil.calculatePerimeter(shapes);
        double countPerimeter = 0;
        for (Shape shape : shapes) {
            countPerimeter += shape.calculatePerimeter();
        }
        double expectedResult = countPerimeter;
        check(expectedResult == realResult, "Total perimeter");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
